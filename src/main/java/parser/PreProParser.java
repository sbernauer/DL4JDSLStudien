// Generated from src/main/java/parser/PrePro.g4 by ANTLR 4.7.1

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



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreProParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, WS=16, BLOCK_COMMENT=17, 
		LINE_COMMENT=18, TYPE=19, IDENTIFIER=20, STRING_LITERAL=21, NUMERIC_LITERAL=22;
	public static final int
		RULE_prepro = 0, RULE_function = 1, RULE_functionArguments = 2, RULE_statement = 3, 
		RULE_assignStatement = 4, RULE_functionCallStatement = 5, RULE_printStatement = 6, 
		RULE_debugStatement = 7, RULE_expression = 8, RULE_term = 9, RULE_factor = 10;
	public static final String[] ruleNames = {
		"prepro", "function", "functionArguments", "statement", "assignStatement", 
		"functionCallStatement", "printStatement", "debugStatement", "expression", 
		"term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'('", "')'", "'{'", "'}'", "','", "';'", "'='", "'print'", 
		"'debug'", "'+'", "'-'", "'*'", "'crossproduct'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "WS", "BLOCK_COMMENT", "LINE_COMMENT", "TYPE", 
		"IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PrePro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private NodeFactory nodeFactory = new NodeFactory();

	public PreProParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PreproContext extends ParserRuleContext {
		public MainNode result;
		public FunctionContext function;
		public TerminalNode EOF() { return getToken(PreProParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public PreproContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterPrepro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitPrepro(this);
		}
	}

	public final PreproContext prepro() throws RecognitionException {
		PreproContext _localctx = new PreproContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prepro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 nodeFactory.startFunctionList(); 
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(23);
				((PreproContext)_localctx).function = function();
				 nodeFactory.addFunction(((PreproContext)_localctx).function.result); 
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(EOF);
			 ((PreproContext)_localctx).result =  new MainNode(nodeFactory.getFunctionsAsArray()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionNode result;
		public Token IDENTIFIER;
		public FunctionArgumentsContext functionArguments;
		public StatementContext statement;
		public TerminalNode IDENTIFIER() { return getToken(PreProParser.IDENTIFIER, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			 nodeFactory.startStatementList(); 
			setState(36);
			((FunctionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(37);
			match(T__1);
			setState(38);
			((FunctionContext)_localctx).functionArguments = functionArguments();
			setState(39);
			match(T__2);
			setState(40);
			match(T__3);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(41);
				((FunctionContext)_localctx).statement = statement();
				 nodeFactory.addStatement(((FunctionContext)_localctx).statement.result, (((FunctionContext)_localctx).statement!=null?(((FunctionContext)_localctx).statement.start):null).getLine()); 
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((FunctionContext)_localctx).result =  new FunctionNode((((FunctionContext)_localctx).IDENTIFIER!=null?((FunctionContext)_localctx).IDENTIFIER.getText():null), ((FunctionContext)_localctx).functionArguments.result, new StatementListNode(nodeFactory.getStatementsAsArray())); 
			setState(50);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public List<ParameterDefinition> result;
		public Token TYPE;
		public Token IDENTIFIER;
		public List<TerminalNode> TYPE() { return getTokens(PreProParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(PreProParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PreProParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PreProParser.IDENTIFIER, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitFunctionArguments(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionArgumentsContext)_localctx).result =  new ArrayList<>(); 
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(53);
				((FunctionArgumentsContext)_localctx).TYPE = match(TYPE);
				setState(54);
				((FunctionArgumentsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 _localctx.result.add(nodeFactory.createParameterDefiniton((((FunctionArgumentsContext)_localctx).TYPE!=null?((FunctionArgumentsContext)_localctx).TYPE.getText():null), (((FunctionArgumentsContext)_localctx).IDENTIFIER!=null?((FunctionArgumentsContext)_localctx).IDENTIFIER.getText():null))); 
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(56);
					match(T__5);
					setState(57);
					((FunctionArgumentsContext)_localctx).TYPE = match(TYPE);
					setState(58);
					((FunctionArgumentsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					 _localctx.result.add(nodeFactory.createParameterDefiniton((((FunctionArgumentsContext)_localctx).TYPE!=null?((FunctionArgumentsContext)_localctx).TYPE.getText():null), (((FunctionArgumentsContext)_localctx).IDENTIFIER!=null?((FunctionArgumentsContext)_localctx).IDENTIFIER.getText():null))); 
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementNode result;
		public AssignStatementContext assignStatement;
		public FunctionCallStatementContext functionCallStatement;
		public PrintStatementContext printStatement;
		public DebugStatementContext debugStatement;
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public DebugStatementContext debugStatement() {
			return getRuleContext(DebugStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(67);
				((StatementContext)_localctx).assignStatement = assignStatement();
				 ((StatementContext)_localctx).result =  ((StatementContext)_localctx).assignStatement.result; 
				}
				break;
			case 2:
				{
				setState(70);
				((StatementContext)_localctx).functionCallStatement = functionCallStatement();
				 ((StatementContext)_localctx).result =  ((StatementContext)_localctx).functionCallStatement.result; 
				}
				break;
			case 3:
				{
				setState(73);
				((StatementContext)_localctx).printStatement = printStatement();
				 ((StatementContext)_localctx).result =  ((StatementContext)_localctx).printStatement.result; 
				}
				break;
			case 4:
				{
				setState(76);
				((StatementContext)_localctx).debugStatement = debugStatement();
				 ((StatementContext)_localctx).result =  new DebugNode((((StatementContext)_localctx).debugStatement!=null?(((StatementContext)_localctx).debugStatement.start):null).getLine()); 
				}
				break;
			}
			setState(81);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStatementNode result;
		public Token TYPE;
		public Token i;
		public ExpressionContext e;
		public TerminalNode IDENTIFIER() { return getToken(PreProParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PreProParser.TYPE, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(83);
				((AssignStatementContext)_localctx).TYPE = match(TYPE);
				}
			}

			setState(86);
			((AssignStatementContext)_localctx).i = match(IDENTIFIER);
			setState(87);
			match(T__7);
			setState(88);
			((AssignStatementContext)_localctx).e = expression();
			 ((AssignStatementContext)_localctx).result =  new AssignStatementNode((((AssignStatementContext)_localctx).i!=null?((AssignStatementContext)_localctx).i.getText():null), (((AssignStatementContext)_localctx).TYPE!=null?((AssignStatementContext)_localctx).TYPE.getText():null), ((AssignStatementContext)_localctx).e.result); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallNode result;
		public Token IDENTIFIER;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIER() { return getToken(PreProParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitFunctionCallStatement(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((FunctionCallStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(92);
			match(T__1);
			 nodeFactory.startExpressionList(); 
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==IDENTIFIER) {
				{
				setState(94);
				((FunctionCallStatementContext)_localctx).expression = expression();
				 nodeFactory.addExpression(((FunctionCallStatementContext)_localctx).expression.result); 
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(96);
					match(T__5);
					setState(97);
					((FunctionCallStatementContext)_localctx).expression = expression();
					 nodeFactory.addExpression(((FunctionCallStatementContext)_localctx).expression.result); 
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(107);
			match(T__2);
			 ((FunctionCallStatementContext)_localctx).result =  new FunctionCallNode((((FunctionCallStatementContext)_localctx).IDENTIFIER!=null?((FunctionCallStatementContext)_localctx).IDENTIFIER.getText():null), nodeFactory.getExpressionsAsList()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementNode result;
		public ExpressionContext expression;
		public Token STRING_LITERAL;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(PreProParser.STRING_LITERAL, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__8);
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case IDENTIFIER:
				{
				setState(111);
				((PrintStatementContext)_localctx).expression = expression();
				 ((PrintStatementContext)_localctx).result =  new PrintStatementNode(((PrintStatementContext)_localctx).expression.result); 
				}
				break;
			case STRING_LITERAL:
				{
				setState(114);
				((PrintStatementContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((PrintStatementContext)_localctx).result =  new PrintStatementNode((((PrintStatementContext)_localctx).STRING_LITERAL!=null?((PrintStatementContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((PrintStatementContext)_localctx).STRING_LITERAL!=null?((PrintStatementContext)_localctx).STRING_LITERAL.getText():null).length() - 1)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebugStatementContext extends ParserRuleContext {
		public Token d;
		public DebugStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterDebugStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitDebugStatement(this);
		}
	}

	public final DebugStatementContext debugStatement() throws RecognitionException {
		DebugStatementContext _localctx = new DebugStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_debugStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((DebugStatementContext)_localctx).d = match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionNode result;
		public TermContext term;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((ExpressionContext)_localctx).term = term();
			 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).term.result; 
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					{
					setState(122);
					match(T__10);
					setState(123);
					((ExpressionContext)_localctx).term = term();
					}
					 ((ExpressionContext)_localctx).result =  new AddNode(_localctx.result, ((ExpressionContext)_localctx).term.result); 
					}
					break;
				case T__11:
					{
					{
					setState(127);
					match(T__11);
					setState(128);
					((ExpressionContext)_localctx).term = term();
					}
					 ((ExpressionContext)_localctx).result =  new SubNode(_localctx.result, ((ExpressionContext)_localctx).term.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public ExpressionNode result;
		public FactorContext factor;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((TermContext)_localctx).factor = factor();
			 ((TermContext)_localctx).result =  ((TermContext)_localctx).factor.result; 
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					{
					setState(139);
					match(T__12);
					setState(140);
					((TermContext)_localctx).factor = factor();
					}
					 ((TermContext)_localctx).result =  new MulNode(_localctx.result, ((TermContext)_localctx).factor.result); 
					}
					break;
				case T__13:
					{
					{
					setState(144);
					match(T__13);
					setState(145);
					((TermContext)_localctx).factor = factor();
					}
					 ((TermContext)_localctx).result =  new CrossProductNode(_localctx.result, ((TermContext)_localctx).factor.result); 
					}
					break;
				case T__14:
					{
					{
					setState(149);
					match(T__14);
					setState(150);
					((TermContext)_localctx).factor = factor();
					}
					 ((TermContext)_localctx).result =  new DivNode(_localctx.result, ((TermContext)_localctx).factor.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public ExpressionNode result;
		public Token IDENTIFIER;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIER() { return getToken(PreProParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				((FactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((FactorContext)_localctx).result =  new VariableConstantNode((((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__1);
				setState(162);
				((FactorContext)_localctx).expression = expression();
				setState(163);
				match(T__2);
				 ((FactorContext)_localctx).result =  ((FactorContext)_localctx).expression.result; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\5\4D\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\5\3\5\3"+
		"\6\5\6W\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7g\n\7\f\7\16\7j\13\7\5\7l\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bw\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0087"+
		"\n\n\f\n\16\n\u008a\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009d\n\13\f\13\16\13\u00a0"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a9\n\f\3\f\2\2\r\2\4\6\b\n\f"+
		"\16\20\22\24\26\2\2\2\u00b0\2\30\3\2\2\2\4$\3\2\2\2\6\66\3\2\2\2\bQ\3"+
		"\2\2\2\nV\3\2\2\2\f]\3\2\2\2\16p\3\2\2\2\20x\3\2\2\2\22z\3\2\2\2\24\u008b"+
		"\3\2\2\2\26\u00a8\3\2\2\2\30\36\b\2\1\2\31\32\5\4\3\2\32\33\b\2\1\2\33"+
		"\35\3\2\2\2\34\31\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!"+
		"\3\2\2\2 \36\3\2\2\2!\"\7\2\2\3\"#\b\2\1\2#\3\3\2\2\2$%\7\3\2\2%&\b\3"+
		"\1\2&\'\7\26\2\2\'(\7\4\2\2()\5\6\4\2)*\7\5\2\2*\60\7\6\2\2+,\5\b\5\2"+
		",-\b\3\1\2-/\3\2\2\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\63\3\2\2\2\62\60\3\2\2\2\63\64\b\3\1\2\64\65\7\7\2\2\65\5\3\2\2\2\66"+
		"C\b\4\1\2\678\7\25\2\289\7\26\2\29@\b\4\1\2:;\7\b\2\2;<\7\25\2\2<=\7\26"+
		"\2\2=?\b\4\1\2>:\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2"+
		"\2\2C\67\3\2\2\2CD\3\2\2\2D\7\3\2\2\2EF\5\n\6\2FG\b\5\1\2GR\3\2\2\2HI"+
		"\5\f\7\2IJ\b\5\1\2JR\3\2\2\2KL\5\16\b\2LM\b\5\1\2MR\3\2\2\2NO\5\20\t\2"+
		"OP\b\5\1\2PR\3\2\2\2QE\3\2\2\2QH\3\2\2\2QK\3\2\2\2QN\3\2\2\2RS\3\2\2\2"+
		"ST\7\t\2\2T\t\3\2\2\2UW\7\25\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\26"+
		"\2\2YZ\7\n\2\2Z[\5\22\n\2[\\\b\6\1\2\\\13\3\2\2\2]^\7\26\2\2^_\7\4\2\2"+
		"_k\b\7\1\2`a\5\22\n\2ah\b\7\1\2bc\7\b\2\2cd\5\22\n\2de\b\7\1\2eg\3\2\2"+
		"\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2k`\3\2\2"+
		"\2kl\3\2\2\2lm\3\2\2\2mn\7\5\2\2no\b\7\1\2o\r\3\2\2\2pv\7\13\2\2qr\5\22"+
		"\n\2rs\b\b\1\2sw\3\2\2\2tu\7\27\2\2uw\b\b\1\2vq\3\2\2\2vt\3\2\2\2w\17"+
		"\3\2\2\2xy\7\f\2\2y\21\3\2\2\2z{\5\24\13\2{\u0088\b\n\1\2|}\7\r\2\2}~"+
		"\5\24\13\2~\177\3\2\2\2\177\u0080\b\n\1\2\u0080\u0087\3\2\2\2\u0081\u0082"+
		"\7\16\2\2\u0082\u0083\5\24\13\2\u0083\u0084\3\2\2\2\u0084\u0085\b\n\1"+
		"\2\u0085\u0087\3\2\2\2\u0086|\3\2\2\2\u0086\u0081\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\23\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\5\26\f\2\u008c\u009e\b\13\1\2\u008d\u008e\7"+
		"\17\2\2\u008e\u008f\5\26\f\2\u008f\u0090\3\2\2\2\u0090\u0091\b\13\1\2"+
		"\u0091\u009d\3\2\2\2\u0092\u0093\7\20\2\2\u0093\u0094\5\26\f\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\b\13\1\2\u0096\u009d\3\2\2\2\u0097\u0098\7\21\2\2"+
		"\u0098\u0099\5\26\f\2\u0099\u009a\3\2\2\2\u009a\u009b\b\13\1\2\u009b\u009d"+
		"\3\2\2\2\u009c\u008d\3\2\2\2\u009c\u0092\3\2\2\2\u009c\u0097\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\25\3\2\2"+
		"\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a9\b\f\1\2\u00a3"+
		"\u00a4\7\4\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\b"+
		"\f\1\2\u00a7\u00a9\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9"+
		"\27\3\2\2\2\20\36\60@CQVhkv\u0086\u0088\u009c\u009e\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}