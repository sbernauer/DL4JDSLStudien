package nodes.expression.arithmetic;

import nodes.SymbolTable;
import nodes.expression.ExpressionNode;
import variables.Variable;
import variables.Vector3;

public class SubNode extends ExpressionNode {

    private ExpressionNode left;
    private ExpressionNode right;

    public SubNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Variable execute(SymbolTable symbolTable) {
        Variable leftValue = left.execute(symbolTable);
        Variable rightValue = right.execute(symbolTable);

        if (leftValue instanceof Vector3 && rightValue instanceof Vector3) {
            return new Vector3(((Vector3) leftValue).getNdArray().sub(((Vector3) rightValue).getNdArray()));
        } else {
            throw new RuntimeException("Cant subtract because of wrong types");
        }
    }
}
