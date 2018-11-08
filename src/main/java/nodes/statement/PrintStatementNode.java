package nodes.statement;

import nodes.SymbolTable;
import nodes.expression.ExpressionNode;

import java.io.PrintStream;

public class PrintStatementNode extends StatementNode {
    private static final PrintStream OUTPUT_STREAM = System.out;

    @Child
    private ExpressionNode expressionNode;

    private boolean printExpressionAndNotText;
    private String text;

    public PrintStatementNode(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
        this.printExpressionAndNotText = true;
    }

    public PrintStatementNode(String text) {
        this.printExpressionAndNotText = false;
        this.text = text;
    }

    public void execute(SymbolTable symbolTable) {
        if (printExpressionAndNotText) {
            OUTPUT_STREAM.println(expressionNode.execute(symbolTable));
        } else {
            OUTPUT_STREAM.println(text);
        }
    }
}
