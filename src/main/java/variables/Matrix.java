package variables;

import org.nd4j.linalg.api.ndarray.INDArray;

public class Matrix implements Variable {
    private final INDArray ndArray;

    public Matrix(INDArray ndArray) {
        this.ndArray = ndArray;
    }

    public INDArray getNdArray() {
        return ndArray;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "ndArray=" + ndArray +
                '}';
    }
}
