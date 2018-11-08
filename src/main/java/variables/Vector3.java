package variables;

import org.nd4j.linalg.api.ndarray.INDArray;

public class Vector3 implements Variable {
    private final INDArray ndArray;

    public Vector3(INDArray ndArray) {
        int size = ndArray.shape()[1];
        if (size != 3) {
            throw new RuntimeException("The given Vector3 has the size " + size + ", must be 3.");
        }
        this.ndArray = ndArray;
    }

    public INDArray getNdArray() {
        return ndArray;
    }

    @Override
    public String toString() {
        return "Vector3{" +
                "ndArray=" + ndArray +
                '}';
    }
}
