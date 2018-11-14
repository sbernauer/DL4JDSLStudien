package nodes.function;

import com.oracle.truffle.api.nodes.Node;
import nodes.SymbolTable;
import nodes.statement.StatementListNode;
import variables.Variable;

import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends Node {
    private final String name;
    protected final List<ParameterDefinition> parameterDefinitions;

    @Child
    protected StatementListNode statementListNode;

    public FunctionNode(String name, List<ParameterDefinition> parameterDefinitions, StatementListNode statementListNode) {
        this.name = name;
        if (parameterDefinitions == null) {
            this.parameterDefinitions = new ArrayList<>();
        } else {
            this.parameterDefinitions = parameterDefinitions;
        }
        this.statementListNode = statementListNode;
    }

    public String getName() {
        return name;
    }

    public void execute(Arguments arguments) {
        if (parameterDefinitions.size() != arguments.getValues().length) {
            throw new RuntimeException("Number of Argument for the function \"" + name + "\" differs.");
        }
        SymbolTable symbolTable = new SymbolTable();
        for (int i = 0; i < parameterDefinitions.size(); i++) {

            Variable value = arguments.getValues()[i];

            if (value.getClass() != parameterDefinitions.get(i).getVariableType()) {
                throw new RuntimeException("Wrong type of parameter " + parameterDefinitions.get(i).getVariableName() + ".");
            }

            symbolTable.setValue(parameterDefinitions.get(i).getVariableName(), value);
        }
        statementListNode.execute(symbolTable);
    }
}
