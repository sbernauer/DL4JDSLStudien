package main;

import nodes.MainNode;
import nodes.function.Arguments;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.nd4j.linalg.factory.Nd4j;
import parser.PreProLexer;
import parser.PreProParser;
import variables.Variable;
import variables.Vector3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PreProLexer lexer = new PreProLexer(CharStreams.fromFileName("src/test/java/test.prepro"));
        MainNode main = new PreProParser(new CommonTokenStream(lexer)).prepro().result;

        Nd4j.ENFORCE_NUMERICAL_STABILITY = true;

        Vector3 p1 = new Vector3(Nd4j.create(new double[]{42, 0, 0,  1, 0, 0,   5, 0, 0,   6, 0, 0},   new int[]{4,3}));
        Vector3 p2 = new Vector3(Nd4j.create(new double[]{43, 0, 0,  44662, 0, 0,   6, 0, 0,   7, 0, 0},   new int[]{4,3}));
        Vector3 p3 = new Vector3(Nd4j.create(new double[]{42, 0, Double.POSITIVE_INFINITY,  1, 0, 1,   5, 0, 1,   6, 0, 1},   new int[]{4,3}));

        Arguments arguments = new Arguments(new Variable[]{p1, p2, p3});
        main.execute(arguments);


//        INDArray p1 = Nd4j.create(new double[]{1, 2, 3}, new int[]{3});
//        INDArray p2 = Nd4j.create(new double[]{-7, 8, 9}, new int[]{3});
//
//        System.out.println(Transforms.tanh(p1));
//
//        p1 = p1.transpose();
//        System.out.println("Shape of p1: " + p1.shape()[0] + ", " + p1.shape()[1]);
//        System.out.println("Shape of p2: " + p2.shape()[0] + ", " + p2.shape()[1]);
//
//        INDArray foo = p1.mmul(p2);
//        System.out.println(foo);
//
//
//        System.out.println(p1.isVector());
//        System.out.println(p2.isVector());
//
//        System.out.println();
//
////                Nd4j.getExecutioner().execAndReturn(new AggregateDot(p1, p2).getFinalResult().doubleValue());
//        Nd4j.getExecutioner().exec(new AggregateDot(p1, p2));
//        System.out.println(p1);
//        System.out.println(p2);
    }
}