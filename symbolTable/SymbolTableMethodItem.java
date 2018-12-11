package symbolTable;

import ast.Type.Type;

import java.util.ArrayList;

public class SymbolTableMethodItem extends SymbolTableItem {

    SymbolTable symbolTable;
    SymbolTable scope;
    ArrayList<Type> argTypes = new ArrayList<>();

    public SymbolTableMethodItem(String name, ArrayList<Type> argTypes, int line, SymbolTable scope) {
        this.name = name;
        this.argTypes = argTypes;
        this.line = line;
	this.scope = scope;
    }

    public SymbolTable getScope() {
	return scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSymbolTable(SymbolTable classTable) {
        this.symbolTable = classTable;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public ArrayList<Type> getArgTypes() {
        return argTypes;
    }

    @Override
    public String getKey() {
        //todo
        return name;
    }
}
