package nodes;

import com.oracle.truffle.api.nodes.Node;
import nodes.function.Arguments;
import nodes.function.FunctionNode;

import java.util.Arrays;

public class MainNode extends Node {
    private final FunctionTable functionTable = FunctionTable.getInstance();

    public MainNode(FunctionNode[] functionNodes) {
        Arrays.stream(functionNodes).forEach(
                functionTable::addFunction
        );
    }

    public void execute(Arguments arguments) {
        FunctionNode mainFunctionNode = functionTable.getFunction("main");

        System.out.println("\n\nStarting PrePro-Interpreter...\n\n");

        mainFunctionNode.execute(arguments);
    }
}
