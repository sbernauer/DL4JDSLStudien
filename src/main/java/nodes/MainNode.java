package nodes;

import com.oracle.truffle.api.nodes.Node;
import main.PreProDataSet;
import nodes.function.FunctionNode;
import nodes.function.MainFunctionNode;

import java.util.Arrays;

public class MainNode extends Node {
    private final FunctionTable functionTable = FunctionTable.getInstance();

    public MainNode(FunctionNode[] functionNodes) {
        Arrays.stream(functionNodes).forEach(
                functionTable::addFunction
        );
    }

    public PreProDataSet execute(PreProDataSet preProDataSet) {
        MainFunctionNode mainFunctionNode = (MainFunctionNode) functionTable.getFunction("main");

        return mainFunctionNode.executeMainFunction(preProDataSet);
    }
}
