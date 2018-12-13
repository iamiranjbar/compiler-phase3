package ast;

import ast.node.Program;
import ast.node.declaration.ClassDeclaration;
import ast.node.declaration.MethodDeclaration;
import ast.node.declaration.VarDeclaration;
import ast.node.expression.*;
import ast.node.expression.Value.BooleanValue;
import ast.node.expression.Value.IntValue;
import ast.node.expression.Value.StringValue;
import ast.node.statement.*;
import symbolTable.*;
import ast.Type.*;
import ast.Type.PrimitiveType.*;
import ast.Type.ArrayType.*;
import ast.Type.UserDefinedType.*;
import java.util.ArrayList;


public class VisitorType implements Visitor {

	SymbolTable symbolTable;
	SymbolTable current;
	SymbolTable scope;

	String currentName;

	private Type findIdType(String id) {
		try{
			Type res = ((scope.get(id) != null && scope.get(id) instanceof SymbolTableVariableItemBase) ?
				((SymbolTableVariableItemBase)(scope.get(id))).getType() : null);
			if (res == null) {
				throw new Exception();
			}
			return res;
		} catch (Exception e) {
			try{
				// System.out.println(((SymbolTableVariableItemBase)(current.get(id))).getType());
				Type res = ((current.get(id) != null && current.get(id) instanceof SymbolTableVariableItemBase) ?
					((SymbolTableVariableItemBase)(current.get(id))).getType() : null);
				if (res == null) {
					throw new Exception();
				}
				return res;
			} catch (Exception e1) {
				//System.out.println(currentName);
				String ans = currentName;
				while (!findFather(ans).equals("") && !findFather(ans).equals(currentName)) {
					Type res;
					//System.out.printf("fff : %s\n",findFather(ans));
					try{
						SymbolTable temp = ((SymbolTableClassItem)(
							symbolTable.get(findFather(ans)))).getSymbolTable();
						res = ((temp.get(id) != null && temp.get(id) instanceof SymbolTableVariableItemBase) ?
							((SymbolTableVariableItemBase)(temp.get(id))).getType() : null);
					} catch (Exception e2) {
						ans = findFather(ans);
						continue;
					}
					if (res == null) {
						ans = findFather(ans);
						continue;
					}
					return res;
				}
				return null;
			}
		}
	}

	private boolean findId(String id) {
		try{
			return (scope != null && scope.get(id) != null
				&& scope.get(id) instanceof SymbolTableVariableItemBase) ? true : false;
		} catch (ItemNotFoundException e) {
			try{
				return (current != null && current.get(id) != null
					&& current.get(id) instanceof SymbolTableVariableItemBase) ? true : false;
			} catch (ItemNotFoundException e1) {
				//System.out.println(currentName);
				String ans = currentName;
				while (!findFather(ans).equals("") && !findFather(ans).equals(currentName)) {
					boolean res;
					//System.out.printf("fff : %s\n",findFather(ans));
					try{
						SymbolTable temp = ((SymbolTableClassItem)(
							symbolTable.get(findFather(ans)))).getSymbolTable();
						res = ((temp.get(id) != null && temp.get(id) instanceof SymbolTableVariableItemBase) ?
							true : false);
					} catch (Exception e2) {
						ans = findFather(ans);
						continue;
					}
					if (res == false) {
						ans = findFather(ans);
						continue;
					}
					return res;
				}
				return false;
			}
		}
	}

	private boolean findMethodName(String id, String className) {

		System.out.println(className);
		String ans = className;
		try{
			SymbolTable temp = ((SymbolTableClassItem)(
				symbolTable.get(className))).getSymbolTable();
			return ((temp.get(id) != null && temp.get(id) instanceof SymbolTableMethodItem) ?
				true : false);
		} catch (Exception e) {
			while (!findFather(ans).equals("") && !findFather(ans).equals(className)) {
				boolean res;
				System.out.printf("fff : %s\n",findFather(ans));
				try{
					SymbolTable temp = ((SymbolTableClassItem)(
						symbolTable.get(findFather(ans)))).getSymbolTable();
					res = ((temp.get(id) != null && temp.get(id) instanceof SymbolTableMethodItem) ?
						true : false);
				} catch (Exception e2) {
					ans = findFather(ans);
					continue;
				}
				if (res == false) {
					ans = findFather(ans);
					continue;
				}
				return res;
			}
		}
		return false;
	}

	private ArrayList<Type> findMethodArgs(String name) {
		try{
			return ((scope.get(name) != null && scope.get(name) instanceof SymbolTableMethodItem) ?
				((SymbolTableMethodItem)(scope.get(name))).getArgTypes() : new ArrayList<Type>());
		} catch (Exception e) {
			try{
				// System.out.println(((SymbolTableVariableItemBase)(current.get(id))).getType());
				return ((current.get(name) != null && current.get(name) instanceof SymbolTableMethodItem) ?
				((SymbolTableMethodItem)(current.get(name))).getArgTypes() : new ArrayList<Type>());
			} catch (Exception e1) {
				//System.out.println(currentName);
				String ans = currentName;
				while (!findFather(ans).equals("") && !findFather(ans).equals(currentName)) {
					ArrayList<Type> res;
					//System.out.printf("fff : %s\n",findFather(ans));
					try{
						SymbolTable temp = ((SymbolTableClassItem)(
							symbolTable.get(findFather(ans)))).getSymbolTable();
						res = ((temp.get(name) != null && temp.get(name) instanceof SymbolTableMethodItem) ?
							((SymbolTableMethodItem)(temp.get(name))).getArgTypes() : new ArrayList<Type>());
					} catch (Exception e2) {
						ans = findFather(ans);
						continue;
					}
					return res;
				}
				return new ArrayList<Type>();
			}
		}	
	}

	private boolean hasLoop(String name) {
		String ans = name;
		//System.out.printf(">> %s\n",ans);
		while (!findFather(ans).equals("")) {
			//System.out.printf(">>>> %s , %s\n",ans, currentName);
			if (findFather(ans).equals(currentName)) {
				// System.out.println("ali");
				return true;
			}
			ans = findFather(ans);
			//System.out.printf(">>> %s\n",ans);
		}
		return false;
	}

	private boolean undefinedFather(String child) {
		try{
			String fatherName = ((SymbolTableClassItem)(symbolTable.get(child))).getParentName();
			// System.out.printf(">>%s<<\n", fatherName);
			if (fatherName != null) {
				if (!fatherName.equals("")) {
					symbolTable.get(fatherName);	
				} else {
					return false;
				}
			} else {
				return false;
			}
			return false;
		} catch(ItemNotFoundException e) {
			return true;
		}
	}

	private String findFather(String child) {
		try{
			if (((SymbolTableClassItem)(symbolTable.get(child))).getParentName() != null) {
				return ((SymbolTableClassItem)(symbolTable.get(child))).getParentName();
			} else {
				return "";
			}
		} catch(ItemNotFoundException e) {
			return "";
		}
	}

	private boolean findClassName(String name) {
		try{
			if (((SymbolTableClassItem)(symbolTable.get(name))).getKey() != null) {
				return true;
			} else {
				return false;
			}
		} catch(ItemNotFoundException e) {
			return false;
		}	
	}

	private boolean isSubType(Type a, Type b) {
		if ((a instanceof IntType && b instanceof IntType)
			|| (a instanceof StringType && b instanceof StringType)
			|| (a instanceof ArrayType && b instanceof ArrayType)
			|| (a instanceof BooleanType && b instanceof BooleanType)) {
			return true;
		} else if (a instanceof NoType || b instanceof NoType) {
			return true;
		} else if((a instanceof UserDefinedType) && (b instanceof UserDefinedType)) {
			System.out.println(((UserDefinedType)b).getClassDeclaration());
			if (((UserDefinedType)a).getClassDeclaration() == null
				|| ((UserDefinedType)b).getClassDeclaration() == null) {
				return false;
			}
			String aName = ((UserDefinedType)a).getClassDeclaration().getName().getName();
			String bName = ((UserDefinedType)b).getClassDeclaration().getName().getName();
			while (!findFather(aName).equals(bName)) {
				if (findFather(aName).equals("")
					|| findFather(aName).equals(((UserDefinedType)a).getClassDeclaration().getName().getName())) {
					return false;
				}
				aName = findFather(aName);
			}
			return true;
		}
		return false;
	}

	public VisitorType(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

    @Override
    public void visit(Program program) {
        //TODO: implement appropriate visit functionality
        if (program.getMainClass() != null) {
            program.getMainClass().accept(this);   
        }
        for (int i = 0; i < program.getClasses().size(); ++i) {
        	try{
        		currentName = program.getClasses().get(i).getName().getName();
	   			current =
	   				((SymbolTableClassItem)(symbolTable.get(program.getClasses().get(i).getName().getName()))).getSymbolTable();
	   		} catch(Exception e){}
        	program.getClasses().get(i).accept(this);
        }
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        //TODO: implement appropriate visit functionality
    	if (hasLoop(classDeclaration.getName().getName())) {
    		System.out.printf("Line:%d:inheritance loop for class %s\n",
    			classDeclaration.getLine(), classDeclaration.getName().getName());		
    	} else if (undefinedFather(classDeclaration.getName().getName())) {
    		System.out.printf("Line:%d:undefined father class %s\n",
    			classDeclaration.getLine(), findFather(classDeclaration.getName().getName()));
    	}
        for (int i = 0; i < classDeclaration.getMethodDeclarations().size(); ++i) {
        	// current = 
        	// 	current.get(classDeclaration.getMethodDeclarations().get(i).getName().getName()).getSymbolTable();
        	try{
	        	scope =
	        		((SymbolTableMethodItem)(
	        			current.get(classDeclaration.getMethodDeclarations().get(i).getName().getName()))).getScope();
	        	// System.out.println("hjhjh");	
	        } catch(Exception e){}
        	classDeclaration.getMethodDeclarations().get(i).accept(this);
        }
    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
        //TODO: implement appropriate visit functionality
        // System.out.println("in methodDeclaration?");
        // System.out.println(methodDeclaration.getName().toString());
        // for (int i = 0; i < methodDeclaration.getArgs().size(); ++i) {
        // 	methodDeclaration.getArgs().get(i).accept(this);
        // }

        // for (int i = 0; i < methodDeclaration.getLocalVars().size(); ++i) {
        // 	methodDeclaration.getLocalVars().get(i).accept(this);
        // }

        for (int i = 0; (methodDeclaration.getBody()!=null) && (i < methodDeclaration.getBody().size()); ++i) {
        	methodDeclaration.getBody().get(i).accept(this);
        }
        if (methodDeclaration.getReturnValue() != null) {
            methodDeclaration.getReturnValue().accept(this);
			if (isSubType(methodDeclaration.getReturnValue().getType(), methodDeclaration.getReturnType())) {
              	methodDeclaration.setType(new VoidType());
            } else {
            	System.out.printf("Line:%d:%s return type must be %s\n",
            		methodDeclaration.getLine() ,methodDeclaration.getName().getName(), methodDeclaration.getReturnType());
            	methodDeclaration.setType(new VoidType());
            }               
        }
    }

    @Override
    public void visit(VarDeclaration varDeclaration) {
        //TODO: implement appropriate visit functionality
        //System.out.println(varDeclaration.toString());
        //System.out.println(varDeclaration.getIdentifier().toString());
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        //TODO: implement appropriate visit functionality
        //System.out.println(arrayCall.toString());
        if (arrayCall.getInstance() != null && arrayCall.getIndex() != null) {
            arrayCall.getInstance().accept(this);
            arrayCall.getIndex().accept(this);   
        }
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        //TODO: implement appropriate visit functionality
        //System.out.println(binaryExpression.toString());
        if (binaryExpression.getLeft() != null && binaryExpression.getRight() != null) {
            binaryExpression.getLeft().accept(this);
            binaryExpression.getRight().accept(this);

            if (!(binaryExpression.getBinaryOperator().name().equals("or")
            	|| binaryExpression.getBinaryOperator().name().equals("and"))) {

            	if(binaryExpression.getLeft().getType() instanceof IntType
	            	&& binaryExpression.getRight().getType() instanceof IntType){
            		System.out.println("yess!");
            		System.out.println(binaryExpression.getBinaryOperator().name());
	            	binaryExpression.setType((binaryExpression.getBinaryOperator().name().equals("eq")
	            		|| binaryExpression.getBinaryOperator().name().equals("neq")
	            		|| binaryExpression.getBinaryOperator().name().equals("lt")
	            		|| binaryExpression.getBinaryOperator().name().equals("gt")) ? new BooleanType() : new IntType());
	            } else if(binaryExpression.getLeft().getType() instanceof NoType
	            	|| binaryExpression.getRight().getType() instanceof NoType){
	            	binaryExpression.setType(new NoType());
	            } else {
	            	binaryExpression.setType(new NoType());
	            	System.out.printf("Line:%d:unsupported operand type for %s\n", binaryExpression.getLine(),
	            		binaryExpression.getBinaryOperator().name());
	            }	
            } else {
            	if (!binaryExpression.getBinaryOperator().name().equals("assign")) {
            		if(binaryExpression.getLeft().getType() instanceof BooleanType
		            	&& binaryExpression.getRight().getType() instanceof BooleanType){
		            	binaryExpression.setType(new BooleanType());
		            } else if(binaryExpression.getLeft().getType() instanceof NoType
		            	|| binaryExpression.getRight().getType() instanceof NoType){
		            	binaryExpression.setType(new NoType());
		            } else {
		            	binaryExpression.setType(new NoType());
		            	System.out.printf("Line:%d:unsupported operand type for %s\n", binaryExpression.getLine(),
		            		binaryExpression.getBinaryOperator().name());
		            }	
            	}
            }
            System.out.println(binaryExpression.getType());
        }
    }

    @Override
    public void visit(Identifier identifier) {
        //TODO: implement appropriate visit functionality
        //System.out.println(identifier.toString());
        String id = identifier.getName();
        //System.out.println(id);
        if (findId(id)) {
        	if (findIdType(id) != null) {
	          	identifier.setType(findIdType(id));
	        } else if (findIdType(id) == null) {
	        	System.out.printf("Line:%d:variable %s is not declared\n", identifier.getLine(), id);
	        	identifier.setType(new NoType());
	        }	
        }
    }

    @Override
    public void visit(Length length) {
        //TODO: implement appropriate visit functionality
        //System.out.println(length.toString());
        if (length.getExpression() != null) {
            length.getExpression().accept(this);
            // System.out.println(((Identifier)(length.getExpression())).getName());
            String id = ((Identifier)(length.getExpression())).getName();
            if (findIdType(id) instanceof ArrayType) {
              	length.setType(new IntType());
            } else if (findIdType(id) == null) {
            	System.out.printf("Line:%d:variable %s is not declared\n", length.getLine(), id);
            	length.setType(new NoType());
            }
        }
    }

    @Override
    public void visit(MethodCall methodCall) {
        //TODO: implement appropriate visit functionality
        //System.out.println(methodCall.toString());
        int error = 0;
        if (methodCall.getInstance() != null) {
            methodCall.getInstance().accept(this);
            if (!(methodCall.getInstance().getType() instanceof UserDefinedType)) {
               	error++;
               	System.out.printf("Line:%d:you can not call method %s from primitive type.\n", methodCall.getLine(),
	            		methodCall.getMethodName().getName());
            } else if (!findClassName(
            	((UserDefinedType)methodCall.getInstance().getType()).getClassDeclaration().getName().getName())) {
            	error++;
            	System.out.printf("Line:%d:class %s is not declared\n", methodCall.getLine(),
	            		((UserDefinedType)methodCall.getInstance().getType()).getClassDeclaration().getName().getName());
            }   
        }
        if (methodCall.getMethodName() != null) {
            methodCall.getMethodName().accept(this);
            if (error == 0) {
               	if (!findMethodName(methodCall.getMethodName().getName(),
               		((UserDefinedType)methodCall.getInstance().getType()).getClassDeclaration().getName().getName())) {
               		error++;
               		System.out.printf("Line:%d:there is no method named %s in class %s\n", methodCall.getLine(),
	            		methodCall.getMethodName().getName(), ((UserDefinedType)methodCall.getInstance().getType()).getClassDeclaration().getName().getName());
               	}
            }   
        }
        if (findMethodArgs(methodCall.getMethodName().getName()).size() == methodCall.getArgs().size()) {
	        for (int i = 0; i < methodCall.getArgs().size(); ++i) {
	        	methodCall.getArgs().get(i).accept(this);
	        	if (!isSubType(methodCall.getArgs().get(i).getType(),
	        		findMethodArgs(methodCall.getMethodName().getName()).get(i))) {
	        		error++;
	        		System.out.printf("Line:%d:%dth arg of %s's type must be %s\n",
	        			methodCall.getArgs().get(i).getLine(), i, methodCall.getMethodName().getName(),
	        			findMethodArgs(methodCall.getMethodName().getName()).get(i));
	        	}
	        }
    	} else {
    		error++;
    		if (findMethodArgs(methodCall.getMethodName().getName()).size() > methodCall.getArgs().size()) {
    			System.out.printf("Line:%d:few args pass to method %s\n", methodCall.getLine(),
    				methodCall.getMethodName().getName());
    		} else {
    			System.out.printf("Line:%d:too many args pass to method %s\n",
    				methodCall.getLine(), methodCall.getMethodName().getName());
    		}
    	}
    	if (error == 0) {
    		methodCall.setType(new NoType());
    	} else {
    		methodCall.setType(new NoType());
    	}
    }

    @Override
    public void visit(NewArray newArray) {
        //TODO: implement appropriate visit functionality
        //System.out.println(newArray.toString());
        if (newArray.getExpression() != null) {
            newArray.getExpression().accept(this);
            newArray.setType(new ArrayType());   
        }
    }

    @Override
    public void visit(NewClass newClass) {
        //TODO: implement appropriate visit functionality
        //System.out.println(newClass.toString());
        if (newClass.getClassName() != null) {
            newClass.getClassName().accept(this);
            if (findClassName(newClass.getClassName().getName())) {
            	UserDefinedType temp = new UserDefinedType();
	            temp.setClassDeclaration(new ClassDeclaration(
	            	new Identifier(newClass.getClassName().getName()),
	            	new Identifier(findFather(newClass.getClassName().getName()))));
	            newClass.setType(temp);	
            } else {
            	System.out.printf("Line:%d:class %s is not declared\n", newClass.getLine(),
	            		newClass.getClassName().getName());
	            newClass.setType(new NoType());
            }
        }
    }

    @Override
    public void visit(This instance) {
        //TODO: implement appropriate visit functionality
        //System.out.println(instance.toString());

    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
        //TODO: implement appropriate visit functionality
        //System.out.println(unaryExpression.toString());
        if (unaryExpression.getValue() != null) {
            unaryExpression.getValue().accept(this);
            if (unaryExpression.getUnaryOperator().name().equals("minus")
            	&& unaryExpression.getType() instanceof IntType) {
               	unaryExpression.setType(new IntType());
            } else if (unaryExpression.getUnaryOperator().name().equals("not")
            	&& unaryExpression.getType() instanceof BooleanType) {
            	unaryExpression.setType(new BooleanType());
            } else if (unaryExpression.getType() instanceof NoType) {
            	unaryExpression.setType(new NoType());
            } else {
            	System.out.printf("Line:%d:unsupported operand type for %s\n", unaryExpression.getLine(),
	            		unaryExpression.getUnaryOperator().name());
            }
        }
    }

    @Override
    public void visit(BooleanValue value) {
        //TODO: implement appropriate visit functionality
        //System.out.println(value.toString());
        value.setType(new BooleanType());
    }

    @Override
    public void visit(IntValue value) {
        //TODO: implement appropriate visit functionality
        //System.out.println(value.toString());
        value.setType(new IntType());
    }

    @Override
    public void visit(StringValue value) {
        //TODO: implement appropriate visit functionality
        //System.out.println(value.toString());
        value.setType(new StringType());
    }

    @Override
    public void visit(Assign assign) {
        //TODO: implement appropriate visit functionality
        //System.out.println(assign.toString());
        if (assign.getlValue() != null && assign.getrValue() != null) {
            assign.getlValue().accept(this);
            assign.getrValue().accept(this);
            // System.out.println(assign.getlValue().getType());System.out.println(assign.getrValue().getType());
            if (isSubType(assign.getlValue().getType(), assign.getrValue().getType())) {
              	assign.setType(new VoidType());
            } else {
            	System.out.printf("Line:%d:left side of assignment must be a valid lvalue\n", assign.getLine());
            }
        }
    }

    @Override
    public void visit(Block block) {
        //TODO: implement appropriate visit functionality
        if (block != null){
            //System.out.println(block.toString());
            for (int i = 0; i < block.getBody().size(); ++i) {
                block.getBody().get(i).accept(this);
            }
        }
    }

    @Override
    public void visit(Conditional conditional) {
        //TODO: implement appropriate visit functionality
        System.out.println(conditional.toString());
        if (conditional.getExpression() != null && conditional.getConsequenceBody() != null && conditional.getAlternativeBody() != null) {
            conditional.getExpression().accept(this);
            conditional.getConsequenceBody().accept(this);
            conditional.getAlternativeBody().accept(this);
            /*if ((conditional.getExpression().getType() instanceof BooleanType
            	|| conditional.getExpression().getType() instanceof NoType)
            	&& conditional.getConsequenceBody().getType() instanceof VoidType
            	&& conditional.getAlternativeBody().getType() instanceof VoidType) {
               	
            } else*/ if(!(conditional.getExpression().getType() instanceof BooleanType)){
            	System.out.printf("Line:%d:condition type must be boolean\n", conditional.getLine());
            }
        }
    }

    @Override
    public void visit(While loop) {
        //TODO: implement appropriate visit functionality
        //System.out.println(loop.toString());
        if (loop.getCondition() != null && loop.getBody() != null) {
            loop.getCondition().accept(this);
            loop.getBody().accept(this);
            if(!(loop.getCondition().getType() instanceof BooleanType)){
            	System.out.printf("Line:%d:condition type must be boolean\n", loop.getLine());
            }   
        }
    }

    @Override
    public void visit(Write write) {
        //TODO: implement appropriate visit functionality
        //System.out.println(write.toString());
        if (write.getArg() != null) {
            write.getArg().accept(this);
            if (!(write.getArg().getType() instanceof IntType
            	|| write.getArg().getType() instanceof StringType
            	|| write.getArg().getType() instanceof ArrayType)) {
            	// TODO: add line number in nodes in ast;
            	System.out.printf("Line:%d:unsupported type for writeln\n", write.getLine());
        	}   
        }
    }
}
