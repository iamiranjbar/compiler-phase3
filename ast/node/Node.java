package ast.node;

import ast.Visitor;
import ast.Type.Type;

public abstract class Node {
    Type type;
    int line;
    public void accept(Visitor visitor) {}
    public void setType(Type type) {
	this.type = type;
    }
    public Type getType() {
	return type;
    }
    public int getLine() {
	return line;
    }
    public void setLine(int line) {
	this.line = line;
    } 
}
