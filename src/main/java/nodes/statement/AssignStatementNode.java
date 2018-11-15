package nodes.statement;

import nodes.SymbolTable;
import nodes.expression.ExpressionNode;
import variables.Matrix;
import variables.Variable;
import variables.Vector3;

public class AssignStatementNode extends StatementNode {
    private final String variableName;
    private final Class variableType;

    @Child
    private ExpressionNode expressionNode;

    /**
     * @param variableType ether "vec3" oder "mat" oder null if the variable is reassinged.
     *                     If variable is not defined and type is null, execption is thrown, because the type isn't known
     */
    public AssignStatementNode(String variableName, String variableType, ExpressionNode expressionNode) {
        this.variableName = variableName;
        this.expressionNode = expressionNode;
        if (variableType == null) { // Null is allowed, if no type is given and the variable already exists
            this.variableType = null;
        } else {
            switch (variableType) {
                case "mat":
                    this.variableType = Matrix.class;
                    break;
                case "vec3":
                    this.variableType = Vector3.class;
                    break;
                default:
                    throw new RuntimeException();
            }
        }
    }

    @Override
    public void execute(SymbolTable symbolTable) {
        Variable value = expressionNode.execute(symbolTable);
        ;
        if (variableType == null) {
            if (!symbolTable.variableExists(variableName)) {
                reportError("Type of variable " + variableName + " not defined");
            }
            if (symbolTable.getValueOrThrowExceptionIfNotDefined(variableName).getClass() != value.getClass()) {
                reportError("Cannot assign the Type " + value.getClass().getSimpleName()
                        + " to the variable " + variableName + " with the Type "
                        + symbolTable.getValueOrThrowExceptionIfNotDefined(variableName).getClass().getSimpleName());
            }
        } else {
            if (variableType != value.getClass()) {
                reportError("Cannot assign the Type " + value.getClass().getSimpleName()
                        + " to the variable " + variableName + " with the Type " + variableType.getSimpleName());
            }
        }

        symbolTable.setValue(variableName, value);
    }
}
