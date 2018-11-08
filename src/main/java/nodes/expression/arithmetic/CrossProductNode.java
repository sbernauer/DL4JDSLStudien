package nodes.expression.arithmetic;

import nodes.SymbolTable;
import nodes.expression.ExpressionNode;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import variables.Variable;
import variables.Vector3;

public class CrossProductNode extends ExpressionNode {

    private ExpressionNode left;
    private ExpressionNode right;

    public CrossProductNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Variable execute(SymbolTable symbolTable) {
        Variable leftValue = left.execute(symbolTable);
        Variable rightValue = right.execute(symbolTable);

        if (leftValue instanceof Vector3 && rightValue instanceof Vector3) {
            return crossProduct((Vector3) leftValue, (Vector3) rightValue);
        } else {
            throw new RuntimeException("Cant cross product because of wrong types");
        }
    }

    private Vector3 crossProduct(Vector3 left, Vector3 right) {
        INDArray a = left.getNdArray();
        INDArray b = right.getNdArray();

        int size = a.shape()[1];
        double[] result = new double[size * 3];

        for (int i = 0; i < size; i++) {
            result[i * 3 + 0] = a.getDouble(i, 1) * b.getDouble(i, 2) - a.getDouble(i, 2) * b.getDouble(i, 1);
            result[i * 3 + 1] = a.getDouble(i, 2) * b.getDouble(i, 0) - a.getDouble(i, 0) * b.getDouble(i, 2);
            result[i * 3 + 2] = a.getDouble(i, 0) * b.getDouble(i, 1) - a.getDouble(i, 1) * b.getDouble(i, 0);
        }
        return new Vector3(Nd4j.create(result, new int[]{size, 3}));
    }
}

