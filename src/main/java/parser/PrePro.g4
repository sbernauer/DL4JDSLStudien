/*
 * Copyright (c) 2012, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
 * The parser and lexer need to be generated using "mx create-sl-parser".
 */

grammar PrePro;

@parser::header
{
package parser;

import java.util.Arrays;

import org.nd4j.linalg.factory.Nd4j;

import nodes.*;
import nodes.statement.*;
import nodes.expression.*;
import nodes.expression.arithmetic.*;
import nodes.function.*;
import nodes.debugging.*;
import variables.*;


}

@lexer::header
{
package parser;

}

@parser::members
{
private NodeFactory nodeFactory = new NodeFactory();
}

// parser

prepro returns [MainNode result]
:                                   { nodeFactory.startFunctionList(); }
(
    function                        { nodeFactory.addFunction($function.result); }
)*
EOF                                 { $result = new MainNode(nodeFactory.getFunctionsAsArray()); }
;

function returns [FunctionNode result]:
'function'                          { nodeFactory.startStatementList(); }
IDENTIFIER
'('
functionArguments
')'
'{'
(
    statement                       { nodeFactory.addStatement($statement.result, $statement.start.getLine()); }
)*                                  { $result = new FunctionNode($IDENTIFIER.text, $functionArguments.result, new StatementListNode(nodeFactory.getStatementsAsArray())); }
'}'
;

functionArguments returns [List<ParameterDefinition> result]:
                                    { $result = new ArrayList<>(); }
(
    TYPE IDENTIFIER                 { $result.add(nodeFactory.createParameterDefiniton($TYPE.text, $IDENTIFIER.text)); }
    (
        ',' TYPE IDENTIFIER         { $result.add(nodeFactory.createParameterDefiniton($TYPE.text, $IDENTIFIER.text)); }
    )*
)?
;

statement returns [StatementNode result]:
( assignStatement                   { $result = $assignStatement.result; }
| functionCallStatement             { $result = $functionCallStatement.result; }
| printStatement                    { $result = $printStatement.result; }
| debugStatement                    { $result = new DebugNode($debugStatement.start.getLine()); }
)
';'
;

assignStatement returns [AssignStatementNode result]:
TYPE?
i=IDENTIFIER
'='
e=expression                        { $result = new AssignStatementNode($i.text, $TYPE.text, $e.result); }
;

functionCallStatement returns [FunctionCallNode result]:
IDENTIFIER
'('                                 { nodeFactory.startExpressionList(); }
(
    expression                      { nodeFactory.addExpression($expression.result); }
    (
        ',' expression              { nodeFactory.addExpression($expression.result); }
    )*
)?
')'                                 { $result = new FunctionCallNode($IDENTIFIER.text, nodeFactory.getExpressionsAsList()); }
;

printStatement returns [PrintStatementNode result]:
'print'
(
    expression                      { $result = new PrintStatementNode($expression.result); }
    | STRING_LITERAL                { $result = new PrintStatementNode($STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1)); } //cut off leading and trailing "
)
;

debugStatement:
d='debug'
;

expression returns [ExpressionNode result]:
term                                { $result = $term.result; }
(
      ('+' term)                    { $result = new AddNode($result, $term.result); }
    | ('-' term)                    { $result = new SubNode($result, $term.result); }
)*
;

term returns [ExpressionNode result]:
factor                              { $result = $factor.result; }
(
      ('*' factor)                  { $result = new MulNode($result, $factor.result); }
    | ('crossproduct' factor)       { $result = new CrossProductNode($result, $factor.result); }
    | ('/' factor)                  { $result = new DivNode($result, $factor.result); }
)*
;

factor returns [ExpressionNode result]:
//array_literal                       { $result = $array_literal.result; }
// | NUMERIC_LITERAL                   { $result = new NumericalConstantNode($NUMERIC_LITERAL.text); }
//| STRING_LITERAL                    { $result = new StringConstantNode($STRING_LITERAL.text); }
IDENTIFIER                          { $result = new VariableConstantNode($IDENTIFIER.text); }
| '(' expression ')'                { $result = $expression.result; }
;

//array_literal returns [ArrayConstantNode result]:
//'['                                 { nodeFactory.startArray(); }
//array_sub_literal
//(
//    ','
//    array_sub_literal
//)*
//']'                                 { $result = new ArrayConstantNode(nodeFactory.finishArray()); }
//;

//array_sub_literal:
//'['
//NUMERIC_LITERAL                     { nodeFactory.addValueToArray($NUMERIC_LITERAL.text); }
//(
//    ','
//    NUMERIC_LITERAL                 { nodeFactory.addValueToArray($NUMERIC_LITERAL.text); }
//)*
//']'                                 { nodeFactory.startNewRowInArray(); }
//;

// lexer

WS : [ \t\r\n\u000C]+ -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;

fragment LETTER : [A-Z] | [a-z] | '_' | '$';
fragment NON_ZERO_DIGIT : [1-9];
fragment DIGIT : [0-9];
// fragment HEX_DIGIT : [0-9] | [a-f] | [A-F];
// fragment OCT_DIGIT : [0-7];
// fragment BINARY_DIGIT : '0' | '1';
// fragment TAB : '\t';
fragment STRING_CHAR : ~('"' | '\\' | '\r' | '\n');

TYPE : 'vec3' | 'mat';

IDENTIFIER : LETTER (LETTER | DIGIT)*;
STRING_LITERAL : '"' STRING_CHAR* '"';
NUMERIC_LITERAL : '-'? ('0' | NON_ZERO_DIGIT DIGIT*);
