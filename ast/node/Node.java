package ast.node;

import ast.Visitor;
import ast.Type.Type;

public abstract class Node {
    Type type;
    public void accept(Visitor visitor) {}
}
