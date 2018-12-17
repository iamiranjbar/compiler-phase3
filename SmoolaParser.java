// Generated from Smoola.g4 by ANTLR 4.7.1

		import ast.*;
		import ast.node.Program;
		import ast.node.declaration.*;
		import ast.node.expression.*;
		import ast.node.expression.Value.*;
		import ast.node.statement.*;
		import ast.Type.*;
		import ast.Type.ArrayType.*;
		import ast.Type.PrimitiveType.*;
		import ast.Type.UserDefinedType.*;
		import symbolTable.*;
		import java.util.Map;
		import java.util.Iterator;
		import java.util.Set;
		import java.util.HashMap;
		import java.util.ArrayList;
	
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmoolaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, CONST_NUM=41, CONST_STR=42, NL=43, ID=44, COMMENT=45, 
		WS=46;
	public static final int
		RULE_program = 0, RULE_program1 = 1, RULE_mainClass = 2, RULE_classDeclaration = 3, 
		RULE_varDeclaration = 4, RULE_methodDeclaration = 5, RULE_statements = 6, 
		RULE_statement = 7, RULE_statementBlock = 8, RULE_statementCondition = 9, 
		RULE_statementLoop = 10, RULE_statementWrite = 11, RULE_statementAssignment = 12, 
		RULE_expression = 13, RULE_expressionAssignment = 14, RULE_expressionOr = 15, 
		RULE_expressionOrTemp = 16, RULE_expressionAnd = 17, RULE_expressionAndTemp = 18, 
		RULE_expressionEq = 19, RULE_expressionEqTemp = 20, RULE_expressionCmp = 21, 
		RULE_expressionCmpTemp = 22, RULE_expressionAdd = 23, RULE_expressionAddTemp = 24, 
		RULE_expressionMult = 25, RULE_expressionMultTemp = 26, RULE_expressionUnary = 27, 
		RULE_expressionMem = 28, RULE_expressionMemTemp = 29, RULE_expressionMethods = 30, 
		RULE_expressionMethodsTemp = 31, RULE_expressionOther = 32, RULE_type = 33;
	public static final String[] ruleNames = {
		"program", "program1", "mainClass", "classDeclaration", "varDeclaration", 
		"methodDeclaration", "statements", "statement", "statementBlock", "statementCondition", 
		"statementLoop", "statementWrite", "statementAssignment", "expression", 
		"expressionAssignment", "expressionOr", "expressionOrTemp", "expressionAnd", 
		"expressionAndTemp", "expressionEq", "expressionEqTemp", "expressionCmp", 
		"expressionCmpTemp", "expressionAdd", "expressionAddTemp", "expressionMult", 
		"expressionMultTemp", "expressionUnary", "expressionMem", "expressionMemTemp", 
		"expressionMethods", "expressionMethodsTemp", "expressionOther", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'def'", "'('", "')'", "':'", "'int'", "'return'", 
		"';'", "'}'", "'extends'", "'var'", "','", "'if'", "'then'", "'else'", 
		"'while'", "'writeln('", "'='", "'||'", "'&&'", "'=='", "'<>'", "'<'", 
		"'>'", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'.'", "'length'", 
		"'new '", "'this'", "'true'", "'false'", "'boolean'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "CONST_NUM", "CONST_STR", "NL", "ID", "COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Smoola.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


			void printArr(ArrayList<UserDefinedType> l){
				for (int i = 0; i < l.size(); i++)
					print(l.get(i).getName().getName());
			}

			class ErrorItem {
			   	public Integer line;
			   	public String error;
			   	ErrorItem(Integer line, String error) {
			   		this.line = line;
			   		this.error = error;
			   	}

			   	public Integer getLine(){return line;}
			}

			void print(Object obj){
		        System.out.println(obj);
			}

			void printSymbols(HashMap<String, SymbolTableItem> items){
		   		Iterator it = items.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pair = (Map.Entry)it.next();
		        	System.out.println(pair.getKey());
		         	Iterator it2 =
		         		((SymbolTableClassItem)(pair.getValue())).getSymbolTable().getItems().entrySet().iterator();
				    while (it2.hasNext()) {
				        Map.Entry pair2 = (Map.Entry)it2.next();
				        System.out.printf("\t%s\n", pair2.getKey());
				        if (pair2.getValue() != null && pair2.getValue() instanceof SymbolTableMethodItem) {
				        	if (((SymbolTableMethodItem)(pair2.getValue())).getScope() != null) {
				        		Iterator it3 =
				        		((SymbolTableMethodItem)(pair2.getValue())).getScope().getItems().entrySet().iterator();
					    		while (it3.hasNext()) {
					        		Map.Entry pair3 = (Map.Entry)it3.next();
					        		System.out.printf("\t\t%s\n", pair3.getKey());
					        	}	
				        	}
				        }
				    }
				}
			}

			void printErrors(ArrayList<ErrorItem> items){
				items.sort((o1, o2) -> o1.getLine().compareTo(o2.getLine()));
		   		for(ErrorItem item : items) {
		   			System.out.print(item.error);
		   		}
			}
		
	public SmoolaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public int error_count;
		public Program p;
		public SymbolTable synthesized_table;
		public Program1Context program1;
		public Program1Context program1() {
			return getRuleContext(Program1Context.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{

						ArrayList<ErrorItem> errors = new ArrayList<>();
						SymbolTable symbolTable = new SymbolTable();
						SymbolTableClassItem objectSymbloTable = new SymbolTableClassItem("Object", "", new SymbolTable(), 0);
						try{
							objectSymbloTable.putItem(new SymbolTableMethodItem("toString", new ArrayList<>(), 0, null, new StringType()));
						} catch(Exception e) {}
						try{
							symbolTable.put(objectSymbloTable);
						}catch(Exception e){
							// System.out.println("hjhjh");
						}
						//printSymbols(symbolTable.getItems());
					
			setState(69);
			((ProgramContext)_localctx).program1 = program1(symbolTable, 0, errors);

						// printArr(((ProgramContext)_localctx).program1.synthesized_unres);
						for (int i =0; i < ((ProgramContext)_localctx).program1.synthesized_unres.size(); i++){
							boolean filled = false;
							// System.out.println(">>>>>> " + ((ProgramContext)_localctx).program1.synthesized_unres.get(i).getName().getName());
							for (int j = 0; j < ((ProgramContext)_localctx).program1.synthesized_type.getClasses().size(); j++){
								if (((ProgramContext)_localctx).program1.synthesized_unres.get(i).getName().getName().equals(((ProgramContext)_localctx).program1.synthesized_type.getClasses().get(j).getName().getName())){
									((ProgramContext)_localctx).program1.synthesized_unres.get(i).setClassDeclaration(((ProgramContext)_localctx).program1.synthesized_type.getClasses().get(j));
									filled = true;
								}
							}
							if (filled == false) {
								// System.out.printf("Line:%d:class %s does not exist in the program.\n",
								// 	((ProgramContext)_localctx).program1.synthesized_unres.get(i).getLine(),
								// 	((ProgramContext)_localctx).program1.synthesized_unres.get(i).getName().getName());
								// ((ProgramContext)_localctx).program1.error_count++;
							}
						}
						((ProgramContext)_localctx).synthesized_table =  ((ProgramContext)_localctx).program1.synthesized_table;
						errors = ((ProgramContext)_localctx).program1.errors_;
						((ProgramContext)_localctx).error_count =  ((ProgramContext)_localctx).program1.error_count;
						// print(((ProgramContext)_localctx).program1.error_count);
						if (((ProgramContext)_localctx).program1.synthesized_table.getItemsSize() == 0 || ((ProgramContext)_localctx).program1.error_count > 0) {
							if (((ProgramContext)_localctx).program1.synthesized_table.getItemsSize() == 0) {
								// System.out.printf("Line:%d:No class exists in the program\n", (((ProgramContext)_localctx).program1!=null?(((ProgramContext)_localctx).program1.start):null).getLine());
								errors.add(new ErrorItem(new Integer((((ProgramContext)_localctx).program1!=null?(((ProgramContext)_localctx).program1.start):null).getLine()),
									String.format("Line:%d:No class exists in the program\n", (((ProgramContext)_localctx).program1!=null?(((ProgramContext)_localctx).program1.start):null).getLine())));
							}
							printErrors(errors);
						} else {
							// VisitorImpl visitor = new VisitorImpl();
							//((ProgramContext)_localctx).program1.synthesized_type.accept(visitor);
							VisitorType visitorType = new VisitorType(((ProgramContext)_localctx).program1.synthesized_table);
							((ProgramContext)_localctx).program1.synthesized_type.accept(visitorType);
							((ProgramContext)_localctx).p =  ((ProgramContext)_localctx).program1.synthesized_type;
						}
						// VisitorImpl visitor = new VisitorImpl();
						// ((ProgramContext)_localctx).program1.synthesized_type.accept(visitor);
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Program1Context extends ParserRuleContext {
		public SymbolTable inherited_table;
		public int inherited_error_count;
		public ArrayList<ErrorItem> errors;
		public ArrayList<ErrorItem> errors_;
		public Program synthesized_type;
		public int error_count;
		public SymbolTable synthesized_table;
		public ArrayList<UserDefinedType> synthesized_unres;
		public MainClassContext mainClass;
		public ClassDeclarationContext classDeclaration;
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SmoolaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public Program1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Program1Context(ParserRuleContext parent, int invokingState, SymbolTable inherited_table, int inherited_error_count, ArrayList<ErrorItem> errors) {
			super(parent, invokingState);
			this.inherited_table = inherited_table;
			this.inherited_error_count = inherited_error_count;
			this.errors = errors;
		}
		@Override public int getRuleIndex() { return RULE_program1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterProgram1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitProgram1(this);
		}
	}

	public final Program1Context program1(SymbolTable inherited_table,int inherited_error_count,ArrayList<ErrorItem> errors) throws RecognitionException {
		Program1Context _localctx = new Program1Context(_ctx, getState(), inherited_table, inherited_error_count, errors);
		enterRule(_localctx, 2, RULE_program1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        	// printSymbols(_localctx.inherited_table.getItems());
						int index = 0; 
						((Program1Context)_localctx).synthesized_type =  new Program();
						ArrayList<UserDefinedType> unres = new ArrayList<UserDefinedType>();
					
			setState(73);
			((Program1Context)_localctx).mainClass = mainClass(new SymbolTable(inherited_table), _localctx.inherited_error_count);

						_localctx.synthesized_type.setMainClass(((Program1Context)_localctx).mainClass.synthesized_type);
						try {
			        		if (((Program1Context)_localctx).mainClass.synthesized_type == null) {
			        			throw new Exception();
			        		}
			        		_localctx.inherited_table.put(new SymbolTableClassItem(((Program1Context)_localctx).mainClass.synthesized_type.getName().getName(), null,
			        			((Program1Context)_localctx).mainClass.synthesized_table, (((Program1Context)_localctx).mainClass!=null?(((Program1Context)_localctx).mainClass.start):null).getLine()));
			        	}
			        	catch(Exception e) {
			        			
						}
						((Program1Context)_localctx).inherited_error_count =  ((Program1Context)_localctx).mainClass.synthesized_error_cnt;
					
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(75);
				((Program1Context)_localctx).classDeclaration = classDeclaration(_localctx.inherited_error_count ,index , new SymbolTable(inherited_table), _localctx.errors, unres);

						 	((Program1Context)_localctx).errors =  ((Program1Context)_localctx).classDeclaration.errors_; 
						 	index = ((Program1Context)_localctx).classDeclaration.synthesized_index;
							_localctx.synthesized_type.addClass(((Program1Context)_localctx).classDeclaration.synthesized_type);
							 
				    		((Program1Context)_localctx).inherited_error_count =  ((Program1Context)_localctx).classDeclaration.error_count;
				    		try{
				    			_localctx.inherited_table.put(new SymbolTableClassItem(((Program1Context)_localctx).classDeclaration.synthesized_type.getName().getName(), 
									((((Program1Context)_localctx).classDeclaration.synthesized_type.getParentName() != null) ?
										((Program1Context)_localctx).classDeclaration.synthesized_type.getParentName().getName() : null),
										((Program1Context)_localctx).classDeclaration.synthesized_table, (((Program1Context)_localctx).classDeclaration!=null?(((Program1Context)_localctx).classDeclaration.start):null).getLine()));
				    		}catch(ItemAlreadyExistsException e){
				    			// add class with new name
				    			try{
				    				// print("temp_" + ((Program1Context)_localctx).classDeclaration.synthesized_type.getName().getName() + Integer.toString(index++));
				    				_localctx.inherited_table.put(new SymbolTableClassItem("#temp_" +
				    					((Program1Context)_localctx).classDeclaration.synthesized_type.getName().getName() + Integer.toString(index++), 
										((((Program1Context)_localctx).classDeclaration.synthesized_type.getParentName() != null) ?
										((Program1Context)_localctx).classDeclaration.synthesized_type.getParentName().getName() : null),
										((Program1Context)_localctx).classDeclaration.synthesized_table, (((Program1Context)_localctx).classDeclaration!=null?(((Program1Context)_localctx).classDeclaration.start):null).getLine()));
				    			} catch(ItemAlreadyExistsException e2){

				    			}
				    			_localctx.inherited_error_count++;
				    			_localctx.errors.add(new ErrorItem(new Integer((((Program1Context)_localctx).classDeclaration!=null?(((Program1Context)_localctx).classDeclaration.start):null).getLine()),
				    				String.format("Line:%d:Redefinition of class %s\n", (((Program1Context)_localctx).classDeclaration!=null?(((Program1Context)_localctx).classDeclaration.start):null).getLine(),
				    				((Program1Context)_localctx).classDeclaration.synthesized_type.getName().getName())));
				    			// System.out.printf("Line:%d:Redefinition of class %s\n", (((Program1Context)_localctx).classDeclaration!=null?(((Program1Context)_localctx).classDeclaration.start):null).getLine(), ((Program1Context)_localctx).classDeclaration.synthesized_type.getName().getName());
				    		}
						 {
							unres = ((Program1Context)_localctx).classDeclaration.synthesized_unres;
							// printArr(((Program1Context)_localctx).classDeclaration.synthesized_unres);
						 }
						 
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

						((Program1Context)_localctx).synthesized_table =  _localctx.inherited_table; 
						((Program1Context)_localctx).error_count =  _localctx.inherited_error_count;
					

			        	Iterator it = _localctx.synthesized_table.getItems().entrySet().iterator();
					    while (it.hasNext()) {
					        Map.Entry pair = (Map.Entry)it.next();
					        if (((SymbolTableClassItem)(pair.getValue())).getParentName() != null && !((SymbolTableClassItem)(pair.getValue())).getParentName().equals("")) {
					        	if (((SymbolTableClassItem)(_localctx.synthesized_table.getInCurrentScope(((SymbolTableClassItem)(pair.getValue())).getParentName()))) != null) {
					        		((SymbolTableClassItem)(pair.getValue())).setParent(((SymbolTableClassItem)(_localctx.synthesized_table.getInCurrentScope(((SymbolTableClassItem)(pair.getValue())).getParentName()))).getSymbolTable());
								}
								
					         	//((SymbolTableClassItem)(pair.getValue())).setParent();
					         	Iterator it2 = ((SymbolTableClassItem)(pair.getValue())).getSymbolTable().getItems().entrySet().iterator();
					         	ArrayList<SymbolTableItem> items = new ArrayList<>();
							    while (it2.hasNext()) {
							        Map.Entry pair2 = (Map.Entry)it2.next();
							        SymbolTableClassItem current = (SymbolTableClassItem)(pair.getValue());
							        while(current != null && current.getParentName() != null && !(current).getParentName().equals("")) {
							        	// System.out.println(">>>>"+(current).getParentName());
							        	if ((current).getParentSymbolTable() != null && (current).getParentSymbolTable().getItems().containsKey(pair2.getKey())) {
								        	if (pair2.getValue() instanceof SymbolTableMethodItem) {
								        		_localctx.error_count++;
								        		_localctx.errors.add(new ErrorItem(new Integer(((SymbolTableMethodItem)(pair2.getValue())).getLine()), String.format("Line:%d:Redefinition of method %s\n",
				    								((SymbolTableMethodItem)(pair2.getValue())).getLine(), ((SymbolTableMethodItem)(pair2.getValue())).getName())));
								        		// System.out.printf("Line:%d:Redefinition of method ‬‬%s\n", ((SymbolTableMethodItem)(pair2.getValue())).getLine(), ((SymbolTableMethodItem)(pair2.getValue())).getName());
								        		items.add((SymbolTableMethodItem)(pair2.getValue()));
								        	} else {
								        		_localctx.error_count++;
								        		_localctx.errors.add(new ErrorItem(new Integer(((SymbolTableVariableItemBase)(pair2.getValue())).getLine()), String.format("Line:%d:Redefinition of variable %s\n",
				    								((SymbolTableVariableItemBase)(pair2.getValue())).getLine(), ((SymbolTableVariableItemBase)(pair2.getValue())).getName())));
								        		// System.out.printf("Line:%d:Redefinition of variable ‬‬%s\n", ((SymbolTableVariableItemBase)(pair2.getValue())).getLine(), ((SymbolTableVariableItemBase)(pair2.getValue())).getName());
								        		items.add((SymbolTableVariableItemBase)(pair2.getValue()));
								        	}
								        	break;
								        } else {
								        	current = ((SymbolTableClassItem)(_localctx.synthesized_table.getInCurrentScope((current).getParentName())));
								        	// System.out.println(current.getKey());
								        }	
							        }
								}
								for(SymbolTableItem element : items) {
									if (element instanceof SymbolTableMethodItem) {
						        		try{
						        			((SymbolTableClassItem)(pair.getValue())).putItem(new SymbolTableMethodItem("#temp_" + ((SymbolTableMethodItem)element).getName() + Integer.toString(index++),
						        				((SymbolTableMethodItem)element).getArgTypes(), ((SymbolTableMethodItem)element).getLine(),
						        				((SymbolTableMethodItem)element).getScope(), ((SymbolTableMethodItem)element).getReturnType()));
						        		}catch(ItemAlreadyExistsException e3){

						        		}
						        		((SymbolTableClassItem)(pair.getValue())).removeItem(((SymbolTableMethodItem)element).getKey());
					        		} else {
					        			try{
						        			((SymbolTableClassItem)(pair.getValue())).putItem(new SymbolTableVariableItemBase("#temp_" + ((SymbolTableVariableItemBase)element).getName() + Integer.toString(index++),
						        				((SymbolTableVariableItemBase)element).getType(), index++, ((SymbolTableVariableItemBase)element).getLine()));
						        		}catch(ItemAlreadyExistsException e3){
						        			
						        		}
						        		((SymbolTableClassItem)(pair.getValue())).removeItem(((SymbolTableVariableItemBase)element).getKey());
					        		}
								}
								// printSymbols(_localctx.synthesized_table.getItems());
					    	} else {
					    		if (!pair.getKey().equals("Object")) {
					    			// System.out.println(">>.." + pair.getKey());
					    			((SymbolTableClassItem)(pair.getValue())).setParent(((SymbolTableClassItem)(_localctx.synthesized_table.getInCurrentScope("Object"))).getSymbolTable());
					    			((SymbolTableClassItem)(pair.getValue())).setParentName("Object");
					    		}
					    	}
			        	}
			        
			setState(85);
			match(EOF);
			((Program1Context)_localctx).errors_ =  _localctx.errors; printSymbols(_localctx.synthesized_table.getItems());((Program1Context)_localctx).synthesized_unres =  unres;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public SymbolTable inherited_table;
		public int inherited_error_count;
		public ClassDeclaration synthesized_type;
		public SymbolTable synthesized_table;
		public int synthesized_error_cnt;
		public Token name;
		public Token mainMethod;
		public StatementsContext statements;
		public ExpressionContext expression;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SmoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SmoolaParser.ID, i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MainClassContext(ParserRuleContext parent, int invokingState, SymbolTable inherited_table, int inherited_error_count) {
			super(parent, invokingState);
			this.inherited_table = inherited_table;
			this.inherited_error_count = inherited_error_count;
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass(SymbolTable inherited_table,int inherited_error_count) throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState(), inherited_table, inherited_error_count);
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(89);
			((MainClassContext)_localctx).name = match(ID);

						((MainClassContext)_localctx).synthesized_type =  new ClassDeclaration(new Identifier(((MainClassContext)_localctx).name.getText()), null);
						_localctx.synthesized_type.setLine(((MainClassContext)_localctx).name.getLine());
					
			setState(91);
			match(T__1);
			setState(92);
			match(T__2);
			setState(93);
			((MainClassContext)_localctx).mainMethod = match(ID);
			setState(94);
			match(T__3);
			setState(95);
			match(T__4);
			setState(96);
			match(T__5);
			setState(97);
			match(T__6);
			setState(98);
			match(T__1);
			setState(99);
			((MainClassContext)_localctx).statements = statements();
			setState(100);
			match(T__7);
			setState(101);
			((MainClassContext)_localctx).expression = expression();
			setState(102);
			match(T__8);
			setState(103);
			match(T__9);
			setState(104);
			match(T__9);

						if (!((MainClassContext)_localctx).mainMethod.getText().equals("main")){
							System.out.printf("Line:%d:there is no method main in main class\n",((MainClassContext)_localctx).mainMethod.getLine());
							_localctx.inherited_error_count++;
						}
			        	try {
			        		if (((MainClassContext)_localctx).mainMethod.getText() != null) {
			        			_localctx.inherited_table.put(new SymbolTableMethodItem(((MainClassContext)_localctx).mainMethod.getText(),null,(((MainClassContext)_localctx).mainMethod!=null?((MainClassContext)_localctx).mainMethod.getLine():0),null, new IntType()));	
			        		}	
			        	}
			        	catch(Exception e) {
			        		
			        	}
						MethodDeclaration b = new MethodDeclaration(new Identifier(((MainClassContext)_localctx).mainMethod.getText()));
						b.setReturnType(new IntType());
						for (int i =0 ; i < ((MainClassContext)_localctx).statements.synthesized_type.size(); ++i){
							b.addStatement(((MainClassContext)_localctx).statements.synthesized_type.get(i));
						}
						b.setReturnValue(((MainClassContext)_localctx).expression.synthesized_type);
						_localctx.synthesized_type.addMethodDeclaration(b);
						((MainClassContext)_localctx).synthesized_table =  _localctx.inherited_table;
						((MainClassContext)_localctx).synthesized_error_cnt =  _localctx.inherited_error_count;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public int inherited_error_count;
		public int inherited_index;
		public SymbolTable inherited_table;
		public ArrayList<ErrorItem> errors;
		public ArrayList<UserDefinedType> inherited_unres;
		public ArrayList<ErrorItem> errors_;
		public int synthesized_index;
		public int error_count;
		public ClassDeclaration synthesized_type;
		public SymbolTable synthesized_table;
		public ArrayList<UserDefinedType> synthesized_unres;
		public Token name;
		public Token father_name;
		public VarDeclarationContext varDeclaration;
		public MethodDeclarationContext methodDeclaration;
		public List<TerminalNode> ID() { return getTokens(SmoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SmoolaParser.ID, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState, int inherited_error_count, int inherited_index, SymbolTable inherited_table, ArrayList<ErrorItem> errors, ArrayList<UserDefinedType> inherited_unres) {
			super(parent, invokingState);
			this.inherited_error_count = inherited_error_count;
			this.inherited_index = inherited_index;
			this.inherited_table = inherited_table;
			this.errors = errors;
			this.inherited_unres = inherited_unres;
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration(int inherited_error_count,int inherited_index,SymbolTable inherited_table,ArrayList<ErrorItem> errors,ArrayList<UserDefinedType> inherited_unres) throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState(), inherited_error_count, inherited_index, inherited_table, errors, inherited_unres);
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__0);
			setState(108);
			((ClassDeclarationContext)_localctx).name = match(ID);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(109);
				match(T__10);
				setState(110);
				((ClassDeclarationContext)_localctx).father_name = match(ID);
				}
			}


						((ClassDeclarationContext)_localctx).synthesized_type =  new ClassDeclaration(new Identifier(((ClassDeclarationContext)_localctx).name.getText()), ((((ClassDeclarationContext)_localctx).father_name != null) ? new Identifier(((ClassDeclarationContext)_localctx).father_name.getText()) : null));
						_localctx.synthesized_type.setLine(((ClassDeclarationContext)_localctx).name.getLine());
						// printArr(_localctx.inherited_unres);
					
			setState(114);
			match(T__1);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(115);
				((ClassDeclarationContext)_localctx).varDeclaration = varDeclaration(_localctx.inherited_unres);

							try {
								if (((ClassDeclarationContext)_localctx).varDeclaration.synthesized_type != null) {
									_localctx.synthesized_type.addVarDeclaration(((ClassDeclarationContext)_localctx).varDeclaration.synthesized_type);
									_localctx.inherited_table.put(new SymbolTableVariableItemBase(((ClassDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName(), ((ClassDeclarationContext)_localctx).varDeclaration.synthesized_type.getType(), _localctx.inherited_index++, (((ClassDeclarationContext)_localctx).varDeclaration!=null?(((ClassDeclarationContext)_localctx).varDeclaration.start):null).getLine()));
								}
							}
							catch(ItemAlreadyExistsException e) {
								_localctx.inherited_error_count++;
								try{
									//print("temp_" + ((ClassDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName() + Integer.toString(_localctx.inherited_index++));
									_localctx.inherited_table.put(new SymbolTableVariableItemBase("#temp_" + ((ClassDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName() + Integer.toString(_localctx.inherited_index++), ((ClassDeclarationContext)_localctx).varDeclaration.synthesized_type.getType(), _localctx.inherited_index++, (((ClassDeclarationContext)_localctx).varDeclaration!=null?(((ClassDeclarationContext)_localctx).varDeclaration.start):null).getLine()));
								} catch(ItemAlreadyExistsException e2){

								}
								// System.out.printf("Line:%d:Redefinition of variable ‬‬%s\n", (((ClassDeclarationContext)_localctx).varDeclaration!=null?(((ClassDeclarationContext)_localctx).varDeclaration.start):null).getLine(), ((ClassDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName());	
								_localctx.errors.add(new ErrorItem(new Integer((((ClassDeclarationContext)_localctx).varDeclaration!=null?(((ClassDeclarationContext)_localctx).varDeclaration.start):null).getLine()), String.format("Line:%d:Redefinition of variable %s\n",
				    								(((ClassDeclarationContext)_localctx).varDeclaration!=null?(((ClassDeclarationContext)_localctx).varDeclaration.start):null).getLine(), ((ClassDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName())));
							}
							{
								((ClassDeclarationContext)_localctx).inherited_unres =  ((ClassDeclarationContext)_localctx).varDeclaration.synthesized_unres;
							}
						
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(123);
				((ClassDeclarationContext)_localctx).methodDeclaration = methodDeclaration(_localctx.inherited_error_count, _localctx.inherited_index, _localctx.inherited_table, _localctx.errors,_localctx.inherited_unres);

							((ClassDeclarationContext)_localctx).errors =  ((ClassDeclarationContext)_localctx).methodDeclaration.errors_;
							((ClassDeclarationContext)_localctx).inherited_index =  ((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_index;
							((ClassDeclarationContext)_localctx).inherited_error_count =  ((ClassDeclarationContext)_localctx).methodDeclaration.error_count;
							try {
								if (((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type != null) {
									_localctx.synthesized_type.addMethodDeclaration(((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type);
									_localctx.inherited_table.put(new SymbolTableMethodItem(((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type.getName().getName(),
										((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type.getArgTypes(), (((ClassDeclarationContext)_localctx).methodDeclaration!=null?(((ClassDeclarationContext)_localctx).methodDeclaration.start):null).getLine(),
										((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_table, ((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type.getReturnType()));	
								}	
							}
							catch(ItemAlreadyExistsException e) {
								_localctx.inherited_error_count++;
								try{
									// print("temp_" + ((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type.getName().getName() + Integer.toString(_localctx.inherited_index++));
									_localctx.inherited_table.put(
										new SymbolTableMethodItem("#temp_" + ((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type.getName().getName() + Integer.toString(_localctx.inherited_index++),
											((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type.getArgTypes(), (((ClassDeclarationContext)_localctx).methodDeclaration!=null?(((ClassDeclarationContext)_localctx).methodDeclaration.start):null).getLine(),
											((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_table, ((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type.getReturnType()));
								}catch(ItemAlreadyExistsException e2){

								}
								// System.out.printf("Line:%d:Redefinition of method ‬‬%s\n", (((ClassDeclarationContext)_localctx).methodDeclaration!=null?(((ClassDeclarationContext)_localctx).methodDeclaration.start):null).getLine(), ((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type.getName().getName());	
								_localctx.errors.add(new ErrorItem(new Integer((((ClassDeclarationContext)_localctx).methodDeclaration!=null?(((ClassDeclarationContext)_localctx).methodDeclaration.start):null).getLine()), String.format("Line:%d:Redefinition of method %s\n",
				    								(((ClassDeclarationContext)_localctx).methodDeclaration!=null?(((ClassDeclarationContext)_localctx).methodDeclaration.start):null).getLine(), ((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_type.getName().getName())));
							}
							{
								((ClassDeclarationContext)_localctx).inherited_unres =  ((ClassDeclarationContext)_localctx).methodDeclaration.synthesized_unres;
							}
						
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__9);

						((ClassDeclarationContext)_localctx).synthesized_unres =  _localctx.inherited_unres;
						((ClassDeclarationContext)_localctx).synthesized_table =  _localctx.inherited_table;
						((ClassDeclarationContext)_localctx).error_count =  _localctx.inherited_error_count;
						((ClassDeclarationContext)_localctx).synthesized_index =  _localctx.inherited_index;
						((ClassDeclarationContext)_localctx).errors_ =  _localctx.errors;
						Iterator it2 = _localctx.synthesized_table.getItems().entrySet().iterator();
					    while (it2.hasNext()) {
					        Map.Entry pair2 = (Map.Entry)it2.next();
				        	if (pair2.getValue() instanceof SymbolTableMethodItem) {
				        		((SymbolTableMethodItem)(pair2.getValue())).setSymbolTable(_localctx.synthesized_table);
				        	}
				        }
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public ArrayList<UserDefinedType> inherited_unres;
		public VarDeclaration synthesized_type;
		public ArrayList<UserDefinedType> synthesized_unres;
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState, ArrayList<UserDefinedType> inherited_unres) {
			super(parent, invokingState);
			this.inherited_unres = inherited_unres;
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration(ArrayList<UserDefinedType> inherited_unres) throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState(), inherited_unres);
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__11);
			setState(135);
			((VarDeclarationContext)_localctx).ID = match(ID);
			setState(136);
			match(T__5);
			setState(137);
			((VarDeclarationContext)_localctx).type = type(_localctx.inherited_unres);
			setState(138);
			match(T__8);

						((VarDeclarationContext)_localctx).synthesized_type =  new VarDeclaration(new Identifier(((VarDeclarationContext)_localctx).ID.getText()),((VarDeclarationContext)_localctx).type.synthesized_type);
						_localctx.synthesized_type.setLine(((VarDeclarationContext)_localctx).ID.getLine());
						((VarDeclarationContext)_localctx).synthesized_unres =  ((VarDeclarationContext)_localctx).type.synthesized_unres;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public int inherited_error_count;
		public int inherited_index;
		public SymbolTable inherited_table;
		public ArrayList<ErrorItem> errors;
		public ArrayList<UserDefinedType> inherited_unres;
		public ArrayList<ErrorItem> errors_;
		public int synthesized_index;
		public int error_count;
		public SymbolTable synthesized_table;
		public MethodDeclaration synthesized_type;
		public ArrayList<UserDefinedType> synthesized_unres;
		public Token name;
		public Token n1;
		public TypeContext t1;
		public TypeContext type;
		public Token n2;
		public TypeContext t2;
		public TypeContext t3;
		public VarDeclarationContext varDeclaration;
		public StatementsContext statements;
		public ExpressionContext expression;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SmoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SmoolaParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState, int inherited_error_count, int inherited_index, SymbolTable inherited_table, ArrayList<ErrorItem> errors, ArrayList<UserDefinedType> inherited_unres) {
			super(parent, invokingState);
			this.inherited_error_count = inherited_error_count;
			this.inherited_index = inherited_index;
			this.inherited_table = inherited_table;
			this.errors = errors;
			this.inherited_unres = inherited_unres;
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(int inherited_error_count,int inherited_index,SymbolTable inherited_table,ArrayList<ErrorItem> errors,ArrayList<UserDefinedType> inherited_unres) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), inherited_error_count, inherited_index, inherited_table, errors, inherited_unres);
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodDeclarationContext)_localctx).synthesized_table =  new SymbolTable();
			setState(142);
			match(T__2);
			setState(143);
			((MethodDeclarationContext)_localctx).name = match(ID);

						((MethodDeclarationContext)_localctx).synthesized_type =  new MethodDeclaration(new Identifier(((MethodDeclarationContext)_localctx).name.getText()));
						_localctx.synthesized_type.setLine(((MethodDeclarationContext)_localctx).name.getLine());
					
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(145);
				match(T__3);
				setState(146);
				match(T__4);
				}
				break;
			case 2:
				{
				{
				setState(147);
				match(T__3);
				setState(148);
				((MethodDeclarationContext)_localctx).n1 = match(ID);
				setState(149);
				match(T__5);
				setState(150);
				((MethodDeclarationContext)_localctx).t1 = ((MethodDeclarationContext)_localctx).type = type(_localctx.inherited_unres);

							_localctx.synthesized_type.addArg(new VarDeclaration(new Identifier(((MethodDeclarationContext)_localctx).n1.getText()),((MethodDeclarationContext)_localctx).type.synthesized_type));
							try{
								_localctx.synthesized_table.put(new SymbolTableVariableItemBase(((MethodDeclarationContext)_localctx).n1.getText(), ((MethodDeclarationContext)_localctx).type.synthesized_type, _localctx.inherited_index++, (((MethodDeclarationContext)_localctx).n1!=null?((MethodDeclarationContext)_localctx).n1.getLine():0)));
							}catch(ItemAlreadyExistsException ew){
								_localctx.inherited_error_count++;
				    			try{
				    				// print("temp_" + ((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName() + Integer.toString(_localctx.inherited_index++));
				    				_localctx.synthesized_table.put(new SymbolTableVariableItemBase("#temp_" + ((MethodDeclarationContext)_localctx).n1.getText() + Integer.toString(_localctx.inherited_index++),
				    					((MethodDeclarationContext)_localctx).type.synthesized_type, _localctx.inherited_index++, (((MethodDeclarationContext)_localctx).n1!=null?((MethodDeclarationContext)_localctx).n1.getLine():0)));
				    			}catch(ItemAlreadyExistsException e2){

				    			}
				    			// System.out.printf("Line:%d:Redefinition of variable ‬‬%s\n", (((MethodDeclarationContext)_localctx).n1!=null?((MethodDeclarationContext)_localctx).n1.getLine():0), ((MethodDeclarationContext)_localctx).n1.getText());
				    			_localctx.errors.add(new ErrorItem((((MethodDeclarationContext)_localctx).n1!=null?((MethodDeclarationContext)_localctx).n1.getLine():0), String.format("Line:%d:Redefinition of variable %s\n", (((MethodDeclarationContext)_localctx).n1!=null?((MethodDeclarationContext)_localctx).n1.getLine():0), ((MethodDeclarationContext)_localctx).n1.getText())));
							}
							((MethodDeclarationContext)_localctx).inherited_unres =  ((MethodDeclarationContext)_localctx).t1.synthesized_unres;
						
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(152);
					match(T__12);
					setState(153);
					((MethodDeclarationContext)_localctx).n2 = match(ID);
					setState(154);
					match(T__5);
					setState(155);
					((MethodDeclarationContext)_localctx).t2 = ((MethodDeclarationContext)_localctx).type = type(_localctx.inherited_unres);

								_localctx.synthesized_type.addArg(new VarDeclaration(new Identifier(((MethodDeclarationContext)_localctx).n2.getText()),((MethodDeclarationContext)_localctx).type.synthesized_type));
								try{
									_localctx.synthesized_table.put(new SymbolTableVariableItemBase(((MethodDeclarationContext)_localctx).n2.getText(), ((MethodDeclarationContext)_localctx).type.synthesized_type, _localctx.inherited_index++, (((MethodDeclarationContext)_localctx).n2!=null?((MethodDeclarationContext)_localctx).n2.getLine():0)));
								}catch(ItemAlreadyExistsException ew){
									_localctx.inherited_error_count++;
					    			try{
					    				// print("temp_" + ((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName() + Integer.toString(_localctx.inherited_index++));
					    				_localctx.synthesized_table.put(new SymbolTableVariableItemBase("#temp_" + ((MethodDeclarationContext)_localctx).n2.getText() + Integer.toString(_localctx.inherited_index++),
					    					((MethodDeclarationContext)_localctx).type.synthesized_type, _localctx.inherited_index++, (((MethodDeclarationContext)_localctx).n2!=null?((MethodDeclarationContext)_localctx).n2.getLine():0)));
					    			}catch(ItemAlreadyExistsException e2){

					    			}
					    			// System.out.printf("Line:%d:Redefinition of variable ‬‬%s\n", (((MethodDeclarationContext)_localctx).n2!=null?((MethodDeclarationContext)_localctx).n2.getLine():0), ((MethodDeclarationContext)_localctx).n2.getText());
					    			_localctx.errors.add(new ErrorItem((((MethodDeclarationContext)_localctx).n2!=null?((MethodDeclarationContext)_localctx).n2.getLine():0), String.format("Line:%d:Redefinition of variable %s\n", (((MethodDeclarationContext)_localctx).n2!=null?((MethodDeclarationContext)_localctx).n2.getLine():0), ((MethodDeclarationContext)_localctx).n2.getText())));
								}
								((MethodDeclarationContext)_localctx).inherited_unres =  ((MethodDeclarationContext)_localctx).t2.synthesized_unres;
							
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(T__4);
				}
				}
				break;
			}
			setState(167);
			match(T__5);
			setState(168);
			((MethodDeclarationContext)_localctx).t3 = ((MethodDeclarationContext)_localctx).type = type(_localctx.inherited_unres);
			_localctx.synthesized_type.setReturnType(((MethodDeclarationContext)_localctx).type.synthesized_type); ((MethodDeclarationContext)_localctx).inherited_unres =  ((MethodDeclarationContext)_localctx).t3.synthesized_unres;
			setState(170);
			match(T__1);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(171);
				((MethodDeclarationContext)_localctx).varDeclaration = varDeclaration(_localctx.inherited_unres);
					
							try {
				    			if (((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type != null) {
									_localctx.synthesized_type.addLocalVar(((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type);
				    				_localctx.synthesized_table.put(new SymbolTableVariableItemBase(((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName(), ((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type.getType(), _localctx.inherited_index++, (((MethodDeclarationContext)_localctx).varDeclaration!=null?(((MethodDeclarationContext)_localctx).varDeclaration.start):null).getLine()));
				    			}
				    		}
				    		catch(Exception e) {
				    			_localctx.inherited_error_count++;
				    			try{
				    				// print("temp_" + ((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName() + Integer.toString(_localctx.inherited_index++));
				    				_localctx.synthesized_table.put(new SymbolTableVariableItemBase("#temp_" + ((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName() + Integer.toString(_localctx.inherited_index++), ((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type.getType(), _localctx.inherited_index++, (((MethodDeclarationContext)_localctx).varDeclaration!=null?(((MethodDeclarationContext)_localctx).varDeclaration.start):null).getLine()));
				    			}catch(ItemAlreadyExistsException e2){

				    			}
				    			// System.out.printf("Line:%d:Redefinition of variable ‬‬%s\n", (((MethodDeclarationContext)_localctx).varDeclaration!=null?(((MethodDeclarationContext)_localctx).varDeclaration.start):null).getLine(), ((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName());	
				    			_localctx.errors.add(new ErrorItem((((MethodDeclarationContext)_localctx).varDeclaration!=null?(((MethodDeclarationContext)_localctx).varDeclaration.start):null).getLine(), String.format("Line:%d:Redefinition of variable %s\n",
				    				(((MethodDeclarationContext)_localctx).varDeclaration!=null?(((MethodDeclarationContext)_localctx).varDeclaration.start):null).getLine(), ((MethodDeclarationContext)_localctx).varDeclaration.synthesized_type.getIdentifier().getName())));
							}
							((MethodDeclarationContext)_localctx).inherited_unres =  ((MethodDeclarationContext)_localctx).varDeclaration.synthesized_unres;
						
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((MethodDeclarationContext)_localctx).synthesized_unres =  _localctx.inherited_unres;
			setState(180);
			((MethodDeclarationContext)_localctx).statements = statements();

						for (int i =0 ; i < ((MethodDeclarationContext)_localctx).statements.synthesized_type.size(); ++i){
							_localctx.synthesized_type.addStatement(((MethodDeclarationContext)_localctx).statements.synthesized_type.get(i));
						}
						_localctx.inherited_error_count += ((MethodDeclarationContext)_localctx).statements.error_count;
						for(ErrorItem it : ((MethodDeclarationContext)_localctx).statements.errors){
							if(it != null)
								_localctx.errors.add(it);
						}
					
			setState(182);
			match(T__7);
			setState(183);
			((MethodDeclarationContext)_localctx).expression = expression();

						_localctx.synthesized_type.setReturnValue(((MethodDeclarationContext)_localctx).expression.synthesized_type);
						_localctx.synthesized_table.pop();
					
			setState(185);
			match(T__8);
			setState(186);
			match(T__9);
			((MethodDeclarationContext)_localctx).error_count =  _localctx.inherited_error_count; ((MethodDeclarationContext)_localctx).synthesized_index =  _localctx.inherited_index; ((MethodDeclarationContext)_localctx).errors_ =  _localctx.errors;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public ArrayList<Statement> synthesized_type;
		public int error_count;
		public ArrayList<ErrorItem> errors;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

						((StatementsContext)_localctx).error_count =  0;
						((StatementsContext)_localctx).errors =  new ArrayList<ErrorItem>();
						((StatementsContext)_localctx).synthesized_type =  new ArrayList<Statement>();
					
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << T__29) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(190);
				((StatementsContext)_localctx).statement = statement();

							_localctx.synthesized_type.add(((StatementsContext)_localctx).statement.synthesized_type);
							_localctx.error_count += ((StatementsContext)_localctx).statement.error_count;
							_localctx.errors.add(((StatementsContext)_localctx).statement.error_item);
						
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public StatementBlockContext statementBlock;
		public StatementConditionContext statementCondition;
		public StatementLoopContext statementLoop;
		public StatementWriteContext statementWrite;
		public StatementAssignmentContext statementAssignment;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementConditionContext statementCondition() {
			return getRuleContext(StatementConditionContext.class,0);
		}
		public StatementLoopContext statementLoop() {
			return getRuleContext(StatementLoopContext.class,0);
		}
		public StatementWriteContext statementWrite() {
			return getRuleContext(StatementWriteContext.class,0);
		}
		public StatementAssignmentContext statementAssignment() {
			return getRuleContext(StatementAssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StatementContext)_localctx).error_count =  0;
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(199);
				((StatementContext)_localctx).statementBlock = statementBlock();

							((StatementContext)_localctx).synthesized_type =  ((StatementContext)_localctx).statementBlock.synthesized_type;
							_localctx.synthesized_type.setLine(((StatementContext)_localctx).statementBlock.synthesized_type.getLine());
						
				}
				break;
			case T__13:
				{
				setState(202);
				((StatementContext)_localctx).statementCondition = statementCondition();

							((StatementContext)_localctx).synthesized_type =  ((StatementContext)_localctx).statementCondition.synthesized_type;
							_localctx.synthesized_type.setLine(((StatementContext)_localctx).statementCondition.synthesized_type.getLine());
						
				}
				break;
			case T__16:
				{
				setState(205);
				((StatementContext)_localctx).statementLoop = statementLoop();

							((StatementContext)_localctx).synthesized_type =  ((StatementContext)_localctx).statementLoop.synthesized_type;
							_localctx.synthesized_type.setLine(((StatementContext)_localctx).statementLoop.synthesized_type.getLine());
						
				}
				break;
			case T__17:
				{
				setState(208);
				((StatementContext)_localctx).statementWrite = statementWrite();

							((StatementContext)_localctx).synthesized_type =  ((StatementContext)_localctx).statementWrite.synthesized_type;
							_localctx.synthesized_type.setLine(((StatementContext)_localctx).statementWrite.synthesized_type.getLine());
						
				}
				break;
			case T__3:
			case T__26:
			case T__29:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case CONST_NUM:
			case CONST_STR:
			case ID:
				{
				setState(211);
				((StatementContext)_localctx).statementAssignment = statementAssignment();

							((StatementContext)_localctx).synthesized_type =  ((StatementContext)_localctx).statementAssignment.synthesized_type;
							((StatementContext)_localctx).error_count =  ((StatementContext)_localctx).statementAssignment.error_count;
							((StatementContext)_localctx).error_item =  ((StatementContext)_localctx).statementAssignment.error_item;
							_localctx.synthesized_type.setLine(((StatementContext)_localctx).statementAssignment.synthesized_type.getLine());
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementBlockContext extends ParserRuleContext {
		public Block synthesized_type;
		public Token temp;
		public StatementsContext statements;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementBlock(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((StatementBlockContext)_localctx).temp = match(T__1);

						((StatementBlockContext)_localctx).synthesized_type =  new Block();
						_localctx.synthesized_type.setLine((((StatementBlockContext)_localctx).temp!=null?((StatementBlockContext)_localctx).temp.getLine():0));
					
			setState(218);
			((StatementBlockContext)_localctx).statements = statements();

						for (int i =0 ; i < ((StatementBlockContext)_localctx).statements.synthesized_type.size(); ++i){
							_localctx.synthesized_type.addStatement(((StatementBlockContext)_localctx).statements.synthesized_type.get(i));
						}
					
			setState(220);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementConditionContext extends ParserRuleContext {
		public Conditional synthesized_type;
		public Token temp;
		public ExpressionContext expression;
		public StatementContext s1;
		public StatementContext statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementCondition(this);
		}
	}

	public final StatementConditionContext statementCondition() throws RecognitionException {
		StatementConditionContext _localctx = new StatementConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((StatementConditionContext)_localctx).temp = match(T__13);
			setState(223);
			match(T__3);
			setState(224);
			((StatementConditionContext)_localctx).expression = expression();
			setState(225);
			match(T__4);
			setState(226);
			match(T__14);
			setState(227);
			((StatementConditionContext)_localctx).s1 = ((StatementConditionContext)_localctx).statement = statement();

						((StatementConditionContext)_localctx).synthesized_type =  new Conditional(((StatementConditionContext)_localctx).expression.synthesized_type, ((StatementConditionContext)_localctx).s1.synthesized_type);
						_localctx.synthesized_type.setLine((((StatementConditionContext)_localctx).temp!=null?((StatementConditionContext)_localctx).temp.getLine():0));
					
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(229);
				match(T__15);
				setState(230);
				((StatementConditionContext)_localctx).statement = statement();
				_localctx.synthesized_type.setAlternativeBody(((StatementConditionContext)_localctx).statement.synthesized_type);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementLoopContext extends ParserRuleContext {
		public While synthesized_type;
		public Token temp;
		public ExpressionContext expression;
		public StatementContext statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementLoop(this);
		}
	}

	public final StatementLoopContext statementLoop() throws RecognitionException {
		StatementLoopContext _localctx = new StatementLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statementLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			((StatementLoopContext)_localctx).temp = match(T__16);
			setState(236);
			match(T__3);
			setState(237);
			((StatementLoopContext)_localctx).expression = expression();
			setState(238);
			match(T__4);
			setState(239);
			((StatementLoopContext)_localctx).statement = statement();

						((StatementLoopContext)_localctx).synthesized_type =  new While(((StatementLoopContext)_localctx).expression.synthesized_type,((StatementLoopContext)_localctx).statement.synthesized_type);
						_localctx.synthesized_type.setLine((((StatementLoopContext)_localctx).temp!=null?((StatementLoopContext)_localctx).temp.getLine():0));
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWriteContext extends ParserRuleContext {
		public Write synthesized_type;
		public Token temp;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementWrite(this);
		}
	}

	public final StatementWriteContext statementWrite() throws RecognitionException {
		StatementWriteContext _localctx = new StatementWriteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			((StatementWriteContext)_localctx).temp = match(T__17);
			setState(243);
			((StatementWriteContext)_localctx).expression = expression();
			setState(244);
			match(T__4);
			setState(245);
			match(T__8);

						((StatementWriteContext)_localctx).synthesized_type =  new Write(((StatementWriteContext)_localctx).expression.synthesized_type);
						_localctx.synthesized_type.setLine((((StatementWriteContext)_localctx).temp!=null?((StatementWriteContext)_localctx).temp.getLine():0));
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignmentContext extends ParserRuleContext {
		public Assign synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementAssignment(this);
		}
	}

	public final StatementAssignmentContext statementAssignment() throws RecognitionException {
		StatementAssignmentContext _localctx = new StatementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((StatementAssignmentContext)_localctx).expression = expression();
			setState(249);
			match(T__8);

						((StatementAssignmentContext)_localctx).synthesized_type =  new Assign(((BinaryExpression)((StatementAssignmentContext)_localctx).expression.synthesized_type).getLeft(),((BinaryExpression)((StatementAssignmentContext)_localctx).expression.synthesized_type).getRight());
						_localctx.synthesized_type.setLine(((StatementAssignmentContext)_localctx).expression.synthesized_type.getLine());
						((StatementAssignmentContext)_localctx).error_count =  ((StatementAssignmentContext)_localctx).expression.error_count;
						((StatementAssignmentContext)_localctx).error_item =  ((StatementAssignmentContext)_localctx).expression.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionAssignmentContext expressionAssignment;
		public ExpressionAssignmentContext expressionAssignment() {
			return getRuleContext(ExpressionAssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((ExpressionContext)_localctx).expressionAssignment = expressionAssignment();

						((ExpressionContext)_localctx).synthesized_type =  ((ExpressionContext)_localctx).expressionAssignment.synthesized_type;
						_localctx.synthesized_type.setLine(((ExpressionContext)_localctx).expressionAssignment.synthesized_type.getLine());
						((ExpressionContext)_localctx).error_count =  ((ExpressionContext)_localctx).expressionAssignment.error_count;
						((ExpressionContext)_localctx).error_item =  ((ExpressionContext)_localctx).expressionAssignment.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAssignmentContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionOrContext expressionOr;
		public ExpressionAssignmentContext expressionAssignment;
		public ExpressionOrContext expressionOr() {
			return getRuleContext(ExpressionOrContext.class,0);
		}
		public ExpressionAssignmentContext expressionAssignment() {
			return getRuleContext(ExpressionAssignmentContext.class,0);
		}
		public ExpressionAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAssignment(this);
		}
	}

	public final ExpressionAssignmentContext expressionAssignment() throws RecognitionException {
		ExpressionAssignmentContext _localctx = new ExpressionAssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionAssignment);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				((ExpressionAssignmentContext)_localctx).expressionOr = expressionOr();
				setState(256);
				match(T__18);
				setState(257);
				((ExpressionAssignmentContext)_localctx).expressionAssignment = expressionAssignment();

							((ExpressionAssignmentContext)_localctx).synthesized_type =  new BinaryExpression(((ExpressionAssignmentContext)_localctx).expressionOr.synthesized_type,((ExpressionAssignmentContext)_localctx).expressionAssignment.synthesized_type,BinaryOperator.assign);
							_localctx.synthesized_type.setLine(((ExpressionAssignmentContext)_localctx).expressionOr.synthesized_type.getLine());
							((ExpressionAssignmentContext)_localctx).error_count =  ((ExpressionAssignmentContext)_localctx).expressionAssignment.error_count;
							((ExpressionAssignmentContext)_localctx).error_item =  ((ExpressionAssignmentContext)_localctx).expressionAssignment.error_item;

						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				((ExpressionAssignmentContext)_localctx).expressionOr = expressionOr();

							((ExpressionAssignmentContext)_localctx).synthesized_type =  ((ExpressionAssignmentContext)_localctx).expressionOr.synthesized_type;
							_localctx.synthesized_type.setLine(((ExpressionAssignmentContext)_localctx).expressionOr.synthesized_type.getLine());
							((ExpressionAssignmentContext)_localctx).error_count =  ((ExpressionAssignmentContext)_localctx).expressionOr.error_count;
							((ExpressionAssignmentContext)_localctx).error_item =  ((ExpressionAssignmentContext)_localctx).expressionOr.error_item;
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOrContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionAndContext expressionAnd;
		public ExpressionOrTempContext expressionOrTemp;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionOr(this);
		}
	}

	public final ExpressionOrContext expressionOr() throws RecognitionException {
		ExpressionOrContext _localctx = new ExpressionOrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((ExpressionOrContext)_localctx).expressionAnd = expressionAnd();
			setState(266);
			((ExpressionOrContext)_localctx).expressionOrTemp = expressionOrTemp(((ExpressionOrContext)_localctx).expressionAnd.synthesized_type);

						((ExpressionOrContext)_localctx).synthesized_type =  ((ExpressionOrContext)_localctx).expressionOrTemp.synthesized_type;
						_localctx.synthesized_type.setLine(((ExpressionOrContext)_localctx).expressionAnd.synthesized_type.getLine());
						((ExpressionOrContext)_localctx).error_count =  ((ExpressionOrContext)_localctx).expressionAnd.error_count;
						((ExpressionOrContext)_localctx).error_item =  ((ExpressionOrContext)_localctx).expressionAnd.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOrTempContext extends ParserRuleContext {
		public Expression inherited_type;
		public Expression synthesized_type;
		public Token temp;
		public ExpressionAndContext expressionAnd;
		public ExpressionOrTempContext expressionOrTemp;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState, Expression inherited_type) {
			super(parent, invokingState);
			this.inherited_type = inherited_type;
		}
		@Override public int getRuleIndex() { return RULE_expressionOrTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionOrTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionOrTemp(this);
		}
	}

	public final ExpressionOrTempContext expressionOrTemp(Expression inherited_type) throws RecognitionException {
		ExpressionOrTempContext _localctx = new ExpressionOrTempContext(_ctx, getState(), inherited_type);
		enterRule(_localctx, 32, RULE_expressionOrTemp);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				((ExpressionOrTempContext)_localctx).temp = match(T__19);
				setState(270);
				((ExpressionOrTempContext)_localctx).expressionAnd = expressionAnd();
				setState(271);
				((ExpressionOrTempContext)_localctx).expressionOrTemp = expressionOrTemp(((ExpressionOrTempContext)_localctx).expressionAnd.synthesized_type);

							((ExpressionOrTempContext)_localctx).synthesized_type =  new BinaryExpression(_localctx.inherited_type,((ExpressionOrTempContext)_localctx).expressionOrTemp.synthesized_type,BinaryOperator.or);
							_localctx.synthesized_type.setLine((((ExpressionOrTempContext)_localctx).temp!=null?((ExpressionOrTempContext)_localctx).temp.getLine():0));
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{

							((ExpressionOrTempContext)_localctx).synthesized_type =  _localctx.inherited_type;
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAndContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionEqContext expressionEq;
		public ExpressionAndTempContext expressionAndTemp;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAnd(this);
		}
	}

	public final ExpressionAndContext expressionAnd() throws RecognitionException {
		ExpressionAndContext _localctx = new ExpressionAndContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((ExpressionAndContext)_localctx).expressionEq = expressionEq();
			setState(278);
			((ExpressionAndContext)_localctx).expressionAndTemp = expressionAndTemp(((ExpressionAndContext)_localctx).expressionEq.synthesized_type);

						((ExpressionAndContext)_localctx).synthesized_type =  ((ExpressionAndContext)_localctx).expressionAndTemp.synthesized_type;
						_localctx.synthesized_type.setLine(((ExpressionAndContext)_localctx).expressionEq.synthesized_type.getLine());
						((ExpressionAndContext)_localctx).error_count =  ((ExpressionAndContext)_localctx).expressionEq.error_count;
						((ExpressionAndContext)_localctx).error_item =  ((ExpressionAndContext)_localctx).expressionEq.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAndTempContext extends ParserRuleContext {
		public Expression inherited_type;
		public Expression synthesized_type;
		public Token temp;
		public ExpressionEqContext expressionEq;
		public ExpressionAndTempContext expressionAndTemp;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState, Expression inherited_type) {
			super(parent, invokingState);
			this.inherited_type = inherited_type;
		}
		@Override public int getRuleIndex() { return RULE_expressionAndTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAndTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAndTemp(this);
		}
	}

	public final ExpressionAndTempContext expressionAndTemp(Expression inherited_type) throws RecognitionException {
		ExpressionAndTempContext _localctx = new ExpressionAndTempContext(_ctx, getState(), inherited_type);
		enterRule(_localctx, 36, RULE_expressionAndTemp);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((ExpressionAndTempContext)_localctx).temp = match(T__20);
				setState(282);
				((ExpressionAndTempContext)_localctx).expressionEq = expressionEq();
				setState(283);
				((ExpressionAndTempContext)_localctx).expressionAndTemp = expressionAndTemp(((ExpressionAndTempContext)_localctx).expressionEq.synthesized_type);

							((ExpressionAndTempContext)_localctx).synthesized_type =  new BinaryExpression(_localctx.inherited_type,((ExpressionAndTempContext)_localctx).expressionAndTemp.synthesized_type,BinaryOperator.and);
							_localctx.synthesized_type.setLine((((ExpressionAndTempContext)_localctx).temp!=null?((ExpressionAndTempContext)_localctx).temp.getLine():0));
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionAndTempContext)_localctx).synthesized_type =  _localctx.inherited_type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionEqContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionCmpContext expressionCmp;
		public ExpressionEqTempContext expressionEqTemp;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionEq(this);
		}
	}

	public final ExpressionEqContext expressionEq() throws RecognitionException {
		ExpressionEqContext _localctx = new ExpressionEqContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			((ExpressionEqContext)_localctx).expressionCmp = expressionCmp();
			setState(290);
			((ExpressionEqContext)_localctx).expressionEqTemp = expressionEqTemp(((ExpressionEqContext)_localctx).expressionCmp.synthesized_type);

						((ExpressionEqContext)_localctx).synthesized_type =  ((ExpressionEqContext)_localctx).expressionEqTemp.synthesized_type;
						_localctx.synthesized_type.setLine(((ExpressionEqContext)_localctx).expressionCmp.synthesized_type.getLine());
						((ExpressionEqContext)_localctx).error_count =  ((ExpressionEqContext)_localctx).expressionCmp.error_count;
						((ExpressionEqContext)_localctx).error_item =  ((ExpressionEqContext)_localctx).expressionCmp.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionEqTempContext extends ParserRuleContext {
		public Expression inherited_type;
		public Expression synthesized_type;
		public Token temp;
		public ExpressionCmpContext expressionCmp;
		public ExpressionEqTempContext expressionEqTemp;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState, Expression inherited_type) {
			super(parent, invokingState);
			this.inherited_type = inherited_type;
		}
		@Override public int getRuleIndex() { return RULE_expressionEqTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionEqTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionEqTemp(this);
		}
	}

	public final ExpressionEqTempContext expressionEqTemp(Expression inherited_type) throws RecognitionException {
		ExpressionEqTempContext _localctx = new ExpressionEqTempContext(_ctx, getState(), inherited_type);
		enterRule(_localctx, 40, RULE_expressionEqTemp);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{

							BinaryOperator b;
							int l;
						
				setState(298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(294);
					((ExpressionEqTempContext)_localctx).temp = match(T__21);
					b = BinaryOperator.eq; l = (((ExpressionEqTempContext)_localctx).temp!=null?((ExpressionEqTempContext)_localctx).temp.getLine():0);
					}
					break;
				case T__22:
					{
					setState(296);
					((ExpressionEqTempContext)_localctx).temp = match(T__22);
					b = BinaryOperator.neq; l = (((ExpressionEqTempContext)_localctx).temp!=null?((ExpressionEqTempContext)_localctx).temp.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300);
				((ExpressionEqTempContext)_localctx).expressionCmp = expressionCmp();
				setState(301);
				((ExpressionEqTempContext)_localctx).expressionEqTemp = expressionEqTemp(((ExpressionEqTempContext)_localctx).expressionCmp.synthesized_type);

							((ExpressionEqTempContext)_localctx).synthesized_type =  new BinaryExpression(_localctx.inherited_type,((ExpressionEqTempContext)_localctx).expressionEqTemp.synthesized_type,b);
							_localctx.synthesized_type.setLine(l);
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionEqTempContext)_localctx).synthesized_type =  _localctx.inherited_type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionCmpContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionAddContext expressionAdd;
		public ExpressionCmpTempContext expressionCmpTemp;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionCmp(this);
		}
	}

	public final ExpressionCmpContext expressionCmp() throws RecognitionException {
		ExpressionCmpContext _localctx = new ExpressionCmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionCmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((ExpressionCmpContext)_localctx).expressionAdd = expressionAdd();
			setState(308);
			((ExpressionCmpContext)_localctx).expressionCmpTemp = expressionCmpTemp(((ExpressionCmpContext)_localctx).expressionAdd.synthesized_type);

						((ExpressionCmpContext)_localctx).synthesized_type =  ((ExpressionCmpContext)_localctx).expressionCmpTemp.synthesized_type;
						_localctx.synthesized_type.setLine(((ExpressionCmpContext)_localctx).expressionAdd.synthesized_type.getLine());
						((ExpressionCmpContext)_localctx).error_count =  ((ExpressionCmpContext)_localctx).expressionAdd.error_count;
						((ExpressionCmpContext)_localctx).error_item =  ((ExpressionCmpContext)_localctx).expressionAdd.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionCmpTempContext extends ParserRuleContext {
		public Expression inherited_type;
		public Expression synthesized_type;
		public Token temp;
		public ExpressionAddContext expressionAdd;
		public ExpressionCmpTempContext expressionCmpTemp;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState, Expression inherited_type) {
			super(parent, invokingState);
			this.inherited_type = inherited_type;
		}
		@Override public int getRuleIndex() { return RULE_expressionCmpTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionCmpTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionCmpTemp(this);
		}
	}

	public final ExpressionCmpTempContext expressionCmpTemp(Expression inherited_type) throws RecognitionException {
		ExpressionCmpTempContext _localctx = new ExpressionCmpTempContext(_ctx, getState(), inherited_type);
		enterRule(_localctx, 44, RULE_expressionCmpTemp);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{

							BinaryOperator b;
							int l;
						
				setState(316);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(312);
					((ExpressionCmpTempContext)_localctx).temp = match(T__23);
					b = BinaryOperator.lt; l = (((ExpressionCmpTempContext)_localctx).temp!=null?((ExpressionCmpTempContext)_localctx).temp.getLine():0);
					}
					break;
				case T__24:
					{
					setState(314);
					((ExpressionCmpTempContext)_localctx).temp = match(T__24);
					b = BinaryOperator.gt; l = (((ExpressionCmpTempContext)_localctx).temp!=null?((ExpressionCmpTempContext)_localctx).temp.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(318);
				((ExpressionCmpTempContext)_localctx).expressionAdd = expressionAdd();
				setState(319);
				((ExpressionCmpTempContext)_localctx).expressionCmpTemp = expressionCmpTemp(((ExpressionCmpTempContext)_localctx).expressionAdd.synthesized_type);

							((ExpressionCmpTempContext)_localctx).synthesized_type =  new BinaryExpression(_localctx.inherited_type,((ExpressionCmpTempContext)_localctx).expressionCmpTemp.synthesized_type,b);
							_localctx.synthesized_type.setLine(l);
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionCmpTempContext)_localctx).synthesized_type =  _localctx.inherited_type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAddContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionMultContext expressionMult;
		public ExpressionAddTempContext expressionAddTemp;
		public ExpressionMultContext expressionMult() {
			return getRuleContext(ExpressionMultContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAdd(this);
		}
	}

	public final ExpressionAddContext expressionAdd() throws RecognitionException {
		ExpressionAddContext _localctx = new ExpressionAddContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			((ExpressionAddContext)_localctx).expressionMult = expressionMult();
			setState(326);
			((ExpressionAddContext)_localctx).expressionAddTemp = expressionAddTemp(((ExpressionAddContext)_localctx).expressionMult.synthesized_type);

						((ExpressionAddContext)_localctx).synthesized_type =  ((ExpressionAddContext)_localctx).expressionAddTemp.synthesized_type;
						_localctx.synthesized_type.setLine(((ExpressionAddContext)_localctx).expressionMult.synthesized_type.getLine());
						((ExpressionAddContext)_localctx).error_count =  ((ExpressionAddContext)_localctx).expressionMult.error_count;
						((ExpressionAddContext)_localctx).error_item =  ((ExpressionAddContext)_localctx).expressionMult.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAddTempContext extends ParserRuleContext {
		public Expression inherited_type;
		public Expression synthesized_type;
		public Token temp;
		public ExpressionMultContext expressionMult;
		public ExpressionAddTempContext expressionAddTemp;
		public ExpressionMultContext expressionMult() {
			return getRuleContext(ExpressionMultContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState, Expression inherited_type) {
			super(parent, invokingState);
			this.inherited_type = inherited_type;
		}
		@Override public int getRuleIndex() { return RULE_expressionAddTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAddTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAddTemp(this);
		}
	}

	public final ExpressionAddTempContext expressionAddTemp(Expression inherited_type) throws RecognitionException {
		ExpressionAddTempContext _localctx = new ExpressionAddTempContext(_ctx, getState(), inherited_type);
		enterRule(_localctx, 48, RULE_expressionAddTemp);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{

							BinaryOperator b;
							int l;
						
				setState(334);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(330);
					((ExpressionAddTempContext)_localctx).temp = match(T__25);
					b = BinaryOperator.add; l = (((ExpressionAddTempContext)_localctx).temp!=null?((ExpressionAddTempContext)_localctx).temp.getLine():0);
					}
					break;
				case T__26:
					{
					setState(332);
					((ExpressionAddTempContext)_localctx).temp = match(T__26);
					b = BinaryOperator.sub; l = (((ExpressionAddTempContext)_localctx).temp!=null?((ExpressionAddTempContext)_localctx).temp.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(336);
				((ExpressionAddTempContext)_localctx).expressionMult = expressionMult();
				setState(337);
				((ExpressionAddTempContext)_localctx).expressionAddTemp = expressionAddTemp(((ExpressionAddTempContext)_localctx).expressionMult.synthesized_type);

							((ExpressionAddTempContext)_localctx).synthesized_type =  new BinaryExpression(_localctx.inherited_type,((ExpressionAddTempContext)_localctx).expressionAddTemp.synthesized_type,b);
							_localctx.synthesized_type.setLine(l);
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionAddTempContext)_localctx).synthesized_type =  _localctx.inherited_type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMultContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionUnaryContext expressionUnary;
		public ExpressionMultTempContext expressionMultTemp;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultTempContext expressionMultTemp() {
			return getRuleContext(ExpressionMultTempContext.class,0);
		}
		public ExpressionMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMult(this);
		}
	}

	public final ExpressionMultContext expressionMult() throws RecognitionException {
		ExpressionMultContext _localctx = new ExpressionMultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			((ExpressionMultContext)_localctx).expressionUnary = expressionUnary();
			setState(344);
			((ExpressionMultContext)_localctx).expressionMultTemp = expressionMultTemp(((ExpressionMultContext)_localctx).expressionUnary.synthesized_type);

						((ExpressionMultContext)_localctx).synthesized_type =  ((ExpressionMultContext)_localctx).expressionMultTemp.synthesized_type;
						_localctx.synthesized_type.setLine(((ExpressionMultContext)_localctx).expressionUnary.synthesized_type.getLine());
						((ExpressionMultContext)_localctx).error_count =  ((ExpressionMultContext)_localctx).expressionUnary.error_count;
						((ExpressionMultContext)_localctx).error_item =  ((ExpressionMultContext)_localctx).expressionUnary.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMultTempContext extends ParserRuleContext {
		public Expression inherited_type;
		public Expression synthesized_type;
		public Token temp;
		public ExpressionUnaryContext expressionUnary;
		public ExpressionMultTempContext expressionMultTemp;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultTempContext expressionMultTemp() {
			return getRuleContext(ExpressionMultTempContext.class,0);
		}
		public ExpressionMultTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMultTempContext(ParserRuleContext parent, int invokingState, Expression inherited_type) {
			super(parent, invokingState);
			this.inherited_type = inherited_type;
		}
		@Override public int getRuleIndex() { return RULE_expressionMultTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMultTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMultTemp(this);
		}
	}

	public final ExpressionMultTempContext expressionMultTemp(Expression inherited_type) throws RecognitionException {
		ExpressionMultTempContext _localctx = new ExpressionMultTempContext(_ctx, getState(), inherited_type);
		enterRule(_localctx, 52, RULE_expressionMultTemp);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{

							BinaryOperator b;
							int l;
						
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(348);
					((ExpressionMultTempContext)_localctx).temp = match(T__27);
					b = BinaryOperator.mult; l = (((ExpressionMultTempContext)_localctx).temp!=null?((ExpressionMultTempContext)_localctx).temp.getLine():0);
					}
					break;
				case T__28:
					{
					setState(350);
					((ExpressionMultTempContext)_localctx).temp = match(T__28);
					b = BinaryOperator.div; l = (((ExpressionMultTempContext)_localctx).temp!=null?((ExpressionMultTempContext)_localctx).temp.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(354);
				((ExpressionMultTempContext)_localctx).expressionUnary = expressionUnary();
				setState(355);
				((ExpressionMultTempContext)_localctx).expressionMultTemp = expressionMultTemp(((ExpressionMultTempContext)_localctx).expressionUnary.synthesized_type);

							((ExpressionMultTempContext)_localctx).synthesized_type =  new BinaryExpression(_localctx.inherited_type,((ExpressionMultTempContext)_localctx).expressionMultTemp.synthesized_type,b);
							_localctx.synthesized_type.setLine(l);
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionMultTempContext)_localctx).synthesized_type =  _localctx.inherited_type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionUnaryContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public Token temp;
		public ExpressionUnaryContext expressionUnary;
		public ExpressionMemContext expressionMem;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMemContext expressionMem() {
			return getRuleContext(ExpressionMemContext.class,0);
		}
		public ExpressionUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionUnary(this);
		}
	}

	public final ExpressionUnaryContext expressionUnary() throws RecognitionException {
		ExpressionUnaryContext _localctx = new ExpressionUnaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionUnary);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{

							UnaryOperator u;
							int l;
						
				setState(366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(362);
					((ExpressionUnaryContext)_localctx).temp = match(T__29);
					u = UnaryOperator.not; l = (((ExpressionUnaryContext)_localctx).temp!=null?((ExpressionUnaryContext)_localctx).temp.getLine():0);
					}
					break;
				case T__26:
					{
					setState(364);
					((ExpressionUnaryContext)_localctx).temp = match(T__26);
					u = UnaryOperator.minus; l = (((ExpressionUnaryContext)_localctx).temp!=null?((ExpressionUnaryContext)_localctx).temp.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(368);
				((ExpressionUnaryContext)_localctx).expressionUnary = expressionUnary();
				 
							((ExpressionUnaryContext)_localctx).synthesized_type =  new UnaryExpression(u,((ExpressionUnaryContext)_localctx).expressionUnary.synthesized_type);
							_localctx.synthesized_type.setLine(l);
							((ExpressionUnaryContext)_localctx).error_count =  0;
							((ExpressionUnaryContext)_localctx).error_item =  null;
						
				}
				break;
			case T__3:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case CONST_NUM:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				((ExpressionUnaryContext)_localctx).expressionMem = expressionMem();

							((ExpressionUnaryContext)_localctx).synthesized_type =  ((ExpressionUnaryContext)_localctx).expressionMem.synthesized_type;
							_localctx.synthesized_type.setLine(((ExpressionUnaryContext)_localctx).expressionMem.synthesized_type.getLine());
							((ExpressionUnaryContext)_localctx).error_count =  ((ExpressionUnaryContext)_localctx).expressionMem.error_count;
							((ExpressionUnaryContext)_localctx).error_item =  ((ExpressionUnaryContext)_localctx).expressionMem.error_item;
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMemContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionMethodsContext expressionMethods;
		public ExpressionMemTempContext expressionMemTemp;
		public ExpressionMethodsContext expressionMethods() {
			return getRuleContext(ExpressionMethodsContext.class,0);
		}
		public ExpressionMemTempContext expressionMemTemp() {
			return getRuleContext(ExpressionMemTempContext.class,0);
		}
		public ExpressionMemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMem(this);
		}
	}

	public final ExpressionMemContext expressionMem() throws RecognitionException {
		ExpressionMemContext _localctx = new ExpressionMemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionMem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			((ExpressionMemContext)_localctx).expressionMethods = expressionMethods();
			setState(377);
			((ExpressionMemContext)_localctx).expressionMemTemp = expressionMemTemp(((ExpressionMemContext)_localctx).expressionMethods.synthesized_type);

						((ExpressionMemContext)_localctx).synthesized_type =  ((ExpressionMemContext)_localctx).expressionMemTemp.synthesized_type;
						_localctx.synthesized_type.setLine(((ExpressionMemContext)_localctx).expressionMethods.synthesized_type.getLine());
						((ExpressionMemContext)_localctx).error_count =  ((ExpressionMemContext)_localctx).expressionMethods.error_count;
						((ExpressionMemContext)_localctx).error_item =  ((ExpressionMemContext)_localctx).expressionMethods.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMemTempContext extends ParserRuleContext {
		public Expression inherited_type;
		public Expression synthesized_type;
		public Token temp;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionMemTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMemTempContext(ParserRuleContext parent, int invokingState, Expression inherited_type) {
			super(parent, invokingState);
			this.inherited_type = inherited_type;
		}
		@Override public int getRuleIndex() { return RULE_expressionMemTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMemTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMemTemp(this);
		}
	}

	public final ExpressionMemTempContext expressionMemTemp(Expression inherited_type) throws RecognitionException {
		ExpressionMemTempContext _localctx = new ExpressionMemTempContext(_ctx, getState(), inherited_type);
		enterRule(_localctx, 58, RULE_expressionMemTemp);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				((ExpressionMemTempContext)_localctx).temp = match(T__30);
				setState(381);
				((ExpressionMemTempContext)_localctx).expression = expression();
				setState(382);
				match(T__31);

							((ExpressionMemTempContext)_localctx).synthesized_type =  new ArrayCall(_localctx.inherited_type,((ExpressionMemTempContext)_localctx).expression.synthesized_type);
							_localctx.synthesized_type.setLine((((ExpressionMemTempContext)_localctx).temp!=null?((ExpressionMemTempContext)_localctx).temp.getLine():0));
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionMemTempContext)_localctx).synthesized_type =  _localctx.inherited_type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMethodsContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public ExpressionOtherContext expressionOther;
		public ExpressionMethodsTempContext expressionMethodsTemp;
		public ExpressionOtherContext expressionOther() {
			return getRuleContext(ExpressionOtherContext.class,0);
		}
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public ExpressionMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMethods(this);
		}
	}

	public final ExpressionMethodsContext expressionMethods() throws RecognitionException {
		ExpressionMethodsContext _localctx = new ExpressionMethodsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((ExpressionMethodsContext)_localctx).expressionOther = expressionOther();
			setState(389);
			((ExpressionMethodsContext)_localctx).expressionMethodsTemp = expressionMethodsTemp(((ExpressionMethodsContext)_localctx).expressionOther.synthesized_type);

						((ExpressionMethodsContext)_localctx).synthesized_type =  ((ExpressionMethodsContext)_localctx).expressionMethodsTemp.synthesized_type;
						_localctx.synthesized_type.setLine(((ExpressionMethodsContext)_localctx).expressionOther.synthesized_type.getLine());
						((ExpressionMethodsContext)_localctx).error_count =  ((ExpressionMethodsContext)_localctx).expressionOther.error_count;
						((ExpressionMethodsContext)_localctx).error_item =  ((ExpressionMethodsContext)_localctx).expressionOther.error_item;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMethodsTempContext extends ParserRuleContext {
		public Expression inherited_type;
		public Expression synthesized_type;
		public Token temp;
		public Token ID;
		public ExpressionContext expression;
		public ExpressionMethodsTempContext expressionMethodsTemp;
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState, Expression inherited_type) {
			super(parent, invokingState);
			this.inherited_type = inherited_type;
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodsTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMethodsTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMethodsTemp(this);
		}
	}

	public final ExpressionMethodsTempContext expressionMethodsTemp(Expression inherited_type) throws RecognitionException {
		ExpressionMethodsTempContext _localctx = new ExpressionMethodsTempContext(_ctx, getState(), inherited_type);
		enterRule(_localctx, 62, RULE_expressionMethodsTemp);
		int _la;
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				((ExpressionMethodsTempContext)_localctx).temp = match(T__32);
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(393);
					((ExpressionMethodsTempContext)_localctx).ID = match(ID);
					setState(394);
					match(T__3);
					setState(395);
					match(T__4);

								((ExpressionMethodsTempContext)_localctx).synthesized_type =  new MethodCall(_localctx.inherited_type,new Identifier(((ExpressionMethodsTempContext)_localctx).ID.getText()));
								_localctx.synthesized_type.setLine((((ExpressionMethodsTempContext)_localctx).temp!=null?((ExpressionMethodsTempContext)_localctx).temp.getLine():0));
							
					}
					break;
				case 2:
					{
					setState(397);
					((ExpressionMethodsTempContext)_localctx).ID = match(ID);

								((ExpressionMethodsTempContext)_localctx).synthesized_type =  new MethodCall(_localctx.inherited_type,new Identifier(((ExpressionMethodsTempContext)_localctx).ID.getText()));
								_localctx.synthesized_type.setLine((((ExpressionMethodsTempContext)_localctx).temp!=null?((ExpressionMethodsTempContext)_localctx).temp.getLine():0));
							
					setState(399);
					match(T__3);
					{
					setState(400);
					((ExpressionMethodsTempContext)_localctx).expression = expression();

								((MethodCall)_localctx.synthesized_type).addArg(((ExpressionMethodsTempContext)_localctx).expression.synthesized_type);
							
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(402);
						match(T__12);
						setState(403);
						((ExpressionMethodsTempContext)_localctx).expression = expression();

									((MethodCall)_localctx.synthesized_type).addArg(((ExpressionMethodsTempContext)_localctx).expression.synthesized_type);
								
						}
						}
						setState(410);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(411);
					match(T__4);
					}
					break;
				case 3:
					{
					setState(413);
					match(T__33);

								((ExpressionMethodsTempContext)_localctx).synthesized_type =  new Length(_localctx.inherited_type);
								_localctx.synthesized_type.setLine((((ExpressionMethodsTempContext)_localctx).temp!=null?((ExpressionMethodsTempContext)_localctx).temp.getLine():0));
							
					}
					break;
				}
				setState(417);
				((ExpressionMethodsTempContext)_localctx).expressionMethodsTemp = expressionMethodsTemp(_localctx.synthesized_type);

							((ExpressionMethodsTempContext)_localctx).synthesized_type =  ((ExpressionMethodsTempContext)_localctx).expressionMethodsTemp.synthesized_type;
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionMethodsTempContext)_localctx).synthesized_type =  _localctx.inherited_type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOtherContext extends ParserRuleContext {
		public Expression synthesized_type;
		public int error_count;
		public ErrorItem error_item;
		public Token CONST_NUM;
		public Token CONST_STR;
		public Token temp;
		public Token index;
		public Token ID;
		public Token t;
		public Token f;
		public ExpressionContext expression;
		public TerminalNode CONST_NUM() { return getToken(SmoolaParser.CONST_NUM, 0); }
		public TerminalNode CONST_STR() { return getToken(SmoolaParser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionOtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOther; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionOther(this);
		}
	}

	public final ExpressionOtherContext expressionOther() throws RecognitionException {
		ExpressionOtherContext _localctx = new ExpressionOtherContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionOther);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionOtherContext)_localctx).error_count =  0; ((ExpressionOtherContext)_localctx).error_item =  null;
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(424);
				((ExpressionOtherContext)_localctx).CONST_NUM = match(CONST_NUM);

								((ExpressionOtherContext)_localctx).synthesized_type =  new IntValue(Integer.parseInt(((ExpressionOtherContext)_localctx).CONST_NUM.getText()), new IntType());
								_localctx.synthesized_type.setLine(((ExpressionOtherContext)_localctx).CONST_NUM.getLine());
							
				}
				break;
			case 2:
				{
				setState(426);
				((ExpressionOtherContext)_localctx).CONST_STR = match(CONST_STR);

							((ExpressionOtherContext)_localctx).synthesized_type =  new StringValue(((ExpressionOtherContext)_localctx).CONST_STR.getText(),new StringType());
							_localctx.synthesized_type.setLine(((ExpressionOtherContext)_localctx).CONST_STR.getLine());
						
				}
				break;
			case 3:
				{
				setState(428);
				((ExpressionOtherContext)_localctx).temp = match(T__34);
				setState(429);
				match(T__6);
				setState(430);
				match(T__30);
				setState(431);
				((ExpressionOtherContext)_localctx).index = match(CONST_NUM);
				setState(432);
				match(T__31);

							((ExpressionOtherContext)_localctx).synthesized_type =  new NewArray();
							_localctx.synthesized_type.setLine((((ExpressionOtherContext)_localctx).temp!=null?((ExpressionOtherContext)_localctx).temp.getLine():0));
							((NewArray)_localctx.synthesized_type).setExpression(new IntValue(Integer.parseInt((((ExpressionOtherContext)_localctx).index!=null?((ExpressionOtherContext)_localctx).index.getText():null)),new IntType()));
							if (Integer.parseInt((((ExpressionOtherContext)_localctx).index!=null?((ExpressionOtherContext)_localctx).index.getText():null)) <= 0) {
				        		((ExpressionOtherContext)_localctx).error_count =  1;
				        		((ExpressionOtherContext)_localctx).error_item =  new ErrorItem(((ExpressionOtherContext)_localctx).index.getLine(), String.format("Line:%d:Array length should not be zero or negative\n", ((ExpressionOtherContext)_localctx).index.getLine()));
				        		// System.out.printf("Line:%d:Array length should not be zero or negative\n", ((ExpressionOtherContext)_localctx).index.getLine());
				        	}
						
				}
				break;
			case 4:
				{
				setState(434);
				((ExpressionOtherContext)_localctx).temp = match(T__34);
				setState(435);
				((ExpressionOtherContext)_localctx).ID = match(ID);
				setState(436);
				match(T__3);
				setState(437);
				match(T__4);

							((ExpressionOtherContext)_localctx).synthesized_type =  new NewClass(new Identifier(((ExpressionOtherContext)_localctx).ID.getText()));
							_localctx.synthesized_type.setLine((((ExpressionOtherContext)_localctx).temp!=null?((ExpressionOtherContext)_localctx).temp.getLine():0));
						
				}
				break;
			case 5:
				{
				setState(439);
				((ExpressionOtherContext)_localctx).temp = match(T__35);

							((ExpressionOtherContext)_localctx).synthesized_type =  new This();
							_localctx.synthesized_type.setLine((((ExpressionOtherContext)_localctx).temp!=null?((ExpressionOtherContext)_localctx).temp.getLine():0));
						
				}
				break;
			case 6:
				{
				setState(441);
				((ExpressionOtherContext)_localctx).t = match(T__36);

							((ExpressionOtherContext)_localctx).synthesized_type =  new BooleanValue(Boolean.parseBoolean(((ExpressionOtherContext)_localctx).t.getText()),new BooleanType());
							_localctx.synthesized_type.setLine((((ExpressionOtherContext)_localctx).t!=null?((ExpressionOtherContext)_localctx).t.getLine():0));
						
				}
				break;
			case 7:
				{
				setState(443);
				((ExpressionOtherContext)_localctx).f = match(T__37);

							((ExpressionOtherContext)_localctx).synthesized_type =  new BooleanValue(Boolean.parseBoolean(((ExpressionOtherContext)_localctx).f.getText()),new BooleanType());
							_localctx.synthesized_type.setLine((((ExpressionOtherContext)_localctx).f!=null?((ExpressionOtherContext)_localctx).f.getLine():0));
						
				}
				break;
			case 8:
				{
				setState(445);
				((ExpressionOtherContext)_localctx).ID = match(ID);

							((ExpressionOtherContext)_localctx).synthesized_type =  new Identifier(((ExpressionOtherContext)_localctx).ID.getText());
							_localctx.synthesized_type.setLine(((ExpressionOtherContext)_localctx).ID.getLine());
						
				}
				break;
			case 9:
				{
				setState(447);
				((ExpressionOtherContext)_localctx).ID = match(ID);
				setState(448);
				match(T__30);
				setState(449);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(450);
				match(T__31);

							((ExpressionOtherContext)_localctx).synthesized_type =  new ArrayCall(new Identifier(((ExpressionOtherContext)_localctx).ID.getText()),((ExpressionOtherContext)_localctx).expression.synthesized_type);
							_localctx.synthesized_type.setLine(((ExpressionOtherContext)_localctx).ID.getLine());
						
				}
				break;
			case 10:
				{
				setState(453);
				((ExpressionOtherContext)_localctx).temp = match(T__3);
				setState(454);
				((ExpressionOtherContext)_localctx).expression = expression();
				setState(455);
				match(T__4);

							((ExpressionOtherContext)_localctx).synthesized_type =  ((ExpressionOtherContext)_localctx).expression.synthesized_type;
							_localctx.synthesized_type.setLine((((ExpressionOtherContext)_localctx).temp!=null?((ExpressionOtherContext)_localctx).temp.getLine():0));
						
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ArrayList<UserDefinedType> inherited_unres;
		public Type synthesized_type;
		public ArrayList<UserDefinedType> synthesized_unres;
		public Token temp;
		public Token ID;
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeContext(ParserRuleContext parent, int invokingState, ArrayList<UserDefinedType> inherited_unres) {
			super(parent, invokingState);
			this.inherited_unres = inherited_unres;
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitType(this);
		}
	}

	public final TypeContext type(ArrayList<UserDefinedType> inherited_unres) throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState(), inherited_unres);
		enterRule(_localctx, 66, RULE_type);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				((TypeContext)_localctx).temp = match(T__6);

							((TypeContext)_localctx).synthesized_type =  new IntType();
							((TypeContext)_localctx).synthesized_unres =  _localctx.inherited_unres;
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				((TypeContext)_localctx).temp = match(T__38);

							((TypeContext)_localctx).synthesized_type =  new BooleanType();
							((TypeContext)_localctx).synthesized_unres =  _localctx.inherited_unres;
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				((TypeContext)_localctx).temp = match(T__39);

							((TypeContext)_localctx).synthesized_type =  new StringType();
							((TypeContext)_localctx).synthesized_unres =  _localctx.inherited_unres;
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				((TypeContext)_localctx).temp = match(T__6);
				setState(467);
				match(T__30);
				setState(468);
				match(T__31);

							((TypeContext)_localctx).synthesized_type =  new ArrayType();
							((TypeContext)_localctx).synthesized_unres =  _localctx.inherited_unres;
						
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				((TypeContext)_localctx).ID = match(ID);

							((TypeContext)_localctx).synthesized_type =  new UserDefinedType();
							((UserDefinedType)_localctx.synthesized_type).setName(new Identifier(((TypeContext)_localctx).ID.getText()));
							((UserDefinedType)_localctx.synthesized_type).setLine(((TypeContext)_localctx).ID.getLine());
							_localctx.inherited_unres.add((UserDefinedType)_localctx.synthesized_type);
							((TypeContext)_localctx).synthesized_unres =  _localctx.inherited_unres;
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01dd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3Q\n\3\f\3"+
		"\16\3T\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\3\5\7\5\u0081\n\5\f\5\16"+
		"\5\u0084\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a1\n\7\f\7"+
		"\16\7\u00a4\13\7\3\7\3\7\5\7\u00a8\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00b1\n\7\f\7\16\7\u00b4\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\7\b\u00c4\n\b\f\b\16\b\u00c7\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00ec\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u010a\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0116\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0122"+
		"\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u012d\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0134\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u013f\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0146\n\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u0151\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0158\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0163\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u016a\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u0171\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0179\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0185"+
		"\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0199\n"+
		"!\f!\16!\u019c\13!\3!\3!\3!\3!\5!\u01a2\n!\3!\3!\3!\3!\5!\u01a8\n!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u01cd\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01db\n#\3#\2\2$\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\2\2"+
		"\u01e6\2F\3\2\2\2\4J\3\2\2\2\6Z\3\2\2\2\bm\3\2\2\2\n\u0088\3\2\2\2\f\u008f"+
		"\3\2\2\2\16\u00bf\3\2\2\2\20\u00c8\3\2\2\2\22\u00da\3\2\2\2\24\u00e0\3"+
		"\2\2\2\26\u00ed\3\2\2\2\30\u00f4\3\2\2\2\32\u00fa\3\2\2\2\34\u00fe\3\2"+
		"\2\2\36\u0109\3\2\2\2 \u010b\3\2\2\2\"\u0115\3\2\2\2$\u0117\3\2\2\2&\u0121"+
		"\3\2\2\2(\u0123\3\2\2\2*\u0133\3\2\2\2,\u0135\3\2\2\2.\u0145\3\2\2\2\60"+
		"\u0147\3\2\2\2\62\u0157\3\2\2\2\64\u0159\3\2\2\2\66\u0169\3\2\2\28\u0178"+
		"\3\2\2\2:\u017a\3\2\2\2<\u0184\3\2\2\2>\u0186\3\2\2\2@\u01a7\3\2\2\2B"+
		"\u01a9\3\2\2\2D\u01da\3\2\2\2FG\b\2\1\2GH\5\4\3\2HI\b\2\1\2I\3\3\2\2\2"+
		"JK\b\3\1\2KL\5\6\4\2LR\b\3\1\2MN\5\b\5\2NO\b\3\1\2OQ\3\2\2\2PM\3\2\2\2"+
		"QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\b\3\1\2VW\b\3\1\2"+
		"WX\7\2\2\3XY\b\3\1\2Y\5\3\2\2\2Z[\7\3\2\2[\\\7.\2\2\\]\b\4\1\2]^\7\4\2"+
		"\2^_\7\5\2\2_`\7.\2\2`a\7\6\2\2ab\7\7\2\2bc\7\b\2\2cd\7\t\2\2de\7\4\2"+
		"\2ef\5\16\b\2fg\7\n\2\2gh\5\34\17\2hi\7\13\2\2ij\7\f\2\2jk\7\f\2\2kl\b"+
		"\4\1\2l\7\3\2\2\2mn\7\3\2\2nq\7.\2\2op\7\r\2\2pr\7.\2\2qo\3\2\2\2qr\3"+
		"\2\2\2rs\3\2\2\2st\b\5\1\2tz\7\4\2\2uv\5\n\6\2vw\b\5\1\2wy\3\2\2\2xu\3"+
		"\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|z\3\2\2\2}~\5\f\7"+
		"\2~\177\b\5\1\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\7\f\2\2\u0086\u0087\b\5\1\2\u0087\t\3\2\2\2\u0088\u0089"+
		"\7\16\2\2\u0089\u008a\7.\2\2\u008a\u008b\7\b\2\2\u008b\u008c\5D#\2\u008c"+
		"\u008d\7\13\2\2\u008d\u008e\b\6\1\2\u008e\13\3\2\2\2\u008f\u0090\b\7\1"+
		"\2\u0090\u0091\7\5\2\2\u0091\u0092\7.\2\2\u0092\u00a7\b\7\1\2\u0093\u0094"+
		"\7\6\2\2\u0094\u00a8\7\7\2\2\u0095\u0096\7\6\2\2\u0096\u0097\7.\2\2\u0097"+
		"\u0098\7\b\2\2\u0098\u0099\5D#\2\u0099\u00a2\b\7\1\2\u009a\u009b\7\17"+
		"\2\2\u009b\u009c\7.\2\2\u009c\u009d\7\b\2\2\u009d\u009e\5D#\2\u009e\u009f"+
		"\b\7\1\2\u009f\u00a1\3\2\2\2\u00a0\u009a\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a8\3\2\2\2\u00a7\u0093\3\2\2\2\u00a7"+
		"\u0095\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\5D"+
		"#\2\u00ab\u00ac\b\7\1\2\u00ac\u00b2\7\4\2\2\u00ad\u00ae\5\n\6\2\u00ae"+
		"\u00af\b\7\1\2\u00af\u00b1\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b4\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\b\7\1\2\u00b6\u00b7\5\16\b\2\u00b7\u00b8\b"+
		"\7\1\2\u00b8\u00b9\7\n\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\b\7\1\2\u00bb"+
		"\u00bc\7\13\2\2\u00bc\u00bd\7\f\2\2\u00bd\u00be\b\7\1\2\u00be\r\3\2\2"+
		"\2\u00bf\u00c5\b\b\1\2\u00c0\u00c1\5\20\t\2\u00c1\u00c2\b\b\1\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\17\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00d8"+
		"\b\t\1\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb\b\t\1\2\u00cb\u00d9\3\2\2\2"+
		"\u00cc\u00cd\5\24\13\2\u00cd\u00ce\b\t\1\2\u00ce\u00d9\3\2\2\2\u00cf\u00d0"+
		"\5\26\f\2\u00d0\u00d1\b\t\1\2\u00d1\u00d9\3\2\2\2\u00d2\u00d3\5\30\r\2"+
		"\u00d3\u00d4\b\t\1\2\u00d4\u00d9\3\2\2\2\u00d5\u00d6\5\32\16\2\u00d6\u00d7"+
		"\b\t\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8"+
		"\u00cf\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\21\3\2\2"+
		"\2\u00da\u00db\7\4\2\2\u00db\u00dc\b\n\1\2\u00dc\u00dd\5\16\b\2\u00dd"+
		"\u00de\b\n\1\2\u00de\u00df\7\f\2\2\u00df\23\3\2\2\2\u00e0\u00e1\7\20\2"+
		"\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5\34\17\2\u00e3\u00e4\7\7\2\2\u00e4"+
		"\u00e5\7\21\2\2\u00e5\u00e6\5\20\t\2\u00e6\u00eb\b\13\1\2\u00e7\u00e8"+
		"\7\22\2\2\u00e8\u00e9\5\20\t\2\u00e9\u00ea\b\13\1\2\u00ea\u00ec\3\2\2"+
		"\2\u00eb\u00e7\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\25\3\2\2\2\u00ed\u00ee"+
		"\7\23\2\2\u00ee\u00ef\7\6\2\2\u00ef\u00f0\5\34\17\2\u00f0\u00f1\7\7\2"+
		"\2\u00f1\u00f2\5\20\t\2\u00f2\u00f3\b\f\1\2\u00f3\27\3\2\2\2\u00f4\u00f5"+
		"\7\24\2\2\u00f5\u00f6\5\34\17\2\u00f6\u00f7\7\7\2\2\u00f7\u00f8\7\13\2"+
		"\2\u00f8\u00f9\b\r\1\2\u00f9\31\3\2\2\2\u00fa\u00fb\5\34\17\2\u00fb\u00fc"+
		"\7\13\2\2\u00fc\u00fd\b\16\1\2\u00fd\33\3\2\2\2\u00fe\u00ff\5\36\20\2"+
		"\u00ff\u0100\b\17\1\2\u0100\35\3\2\2\2\u0101\u0102\5 \21\2\u0102\u0103"+
		"\7\25\2\2\u0103\u0104\5\36\20\2\u0104\u0105\b\20\1\2\u0105\u010a\3\2\2"+
		"\2\u0106\u0107\5 \21\2\u0107\u0108\b\20\1\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0101\3\2\2\2\u0109\u0106\3\2\2\2\u010a\37\3\2\2\2\u010b\u010c\5$\23"+
		"\2\u010c\u010d\5\"\22\2\u010d\u010e\b\21\1\2\u010e!\3\2\2\2\u010f\u0110"+
		"\7\26\2\2\u0110\u0111\5$\23\2\u0111\u0112\5\"\22\2\u0112\u0113\b\22\1"+
		"\2\u0113\u0116\3\2\2\2\u0114\u0116\b\22\1\2\u0115\u010f\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116#\3\2\2\2\u0117\u0118\5(\25\2\u0118\u0119\5&\24\2"+
		"\u0119\u011a\b\23\1\2\u011a%\3\2\2\2\u011b\u011c\7\27\2\2\u011c\u011d"+
		"\5(\25\2\u011d\u011e\5&\24\2\u011e\u011f\b\24\1\2\u011f\u0122\3\2\2\2"+
		"\u0120\u0122\b\24\1\2\u0121\u011b\3\2\2\2\u0121\u0120\3\2\2\2\u0122\'"+
		"\3\2\2\2\u0123\u0124\5,\27\2\u0124\u0125\5*\26\2\u0125\u0126\b\25\1\2"+
		"\u0126)\3\2\2\2\u0127\u012c\b\26\1\2\u0128\u0129\7\30\2\2\u0129\u012d"+
		"\b\26\1\2\u012a\u012b\7\31\2\2\u012b\u012d\b\26\1\2\u012c\u0128\3\2\2"+
		"\2\u012c\u012a\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5,\27\2\u012f\u0130"+
		"\5*\26\2\u0130\u0131\b\26\1\2\u0131\u0134\3\2\2\2\u0132\u0134\b\26\1\2"+
		"\u0133\u0127\3\2\2\2\u0133\u0132\3\2\2\2\u0134+\3\2\2\2\u0135\u0136\5"+
		"\60\31\2\u0136\u0137\5.\30\2\u0137\u0138\b\27\1\2\u0138-\3\2\2\2\u0139"+
		"\u013e\b\30\1\2\u013a\u013b\7\32\2\2\u013b\u013f\b\30\1\2\u013c\u013d"+
		"\7\33\2\2\u013d\u013f\b\30\1\2\u013e\u013a\3\2\2\2\u013e\u013c\3\2\2\2"+
		"\u013f\u0140\3\2\2\2\u0140\u0141\5\60\31\2\u0141\u0142\5.\30\2\u0142\u0143"+
		"\b\30\1\2\u0143\u0146\3\2\2\2\u0144\u0146\b\30\1\2\u0145\u0139\3\2\2\2"+
		"\u0145\u0144\3\2\2\2\u0146/\3\2\2\2\u0147\u0148\5\64\33\2\u0148\u0149"+
		"\5\62\32\2\u0149\u014a\b\31\1\2\u014a\61\3\2\2\2\u014b\u0150\b\32\1\2"+
		"\u014c\u014d\7\34\2\2\u014d\u0151\b\32\1\2\u014e\u014f\7\35\2\2\u014f"+
		"\u0151\b\32\1\2\u0150\u014c\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0152\u0153\5\64\33\2\u0153\u0154\5\62\32\2\u0154\u0155\b\32\1"+
		"\2\u0155\u0158\3\2\2\2\u0156\u0158\b\32\1\2\u0157\u014b\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\63\3\2\2\2\u0159\u015a\58\35\2\u015a\u015b\5\66\34"+
		"\2\u015b\u015c\b\33\1\2\u015c\65\3\2\2\2\u015d\u0162\b\34\1\2\u015e\u015f"+
		"\7\36\2\2\u015f\u0163\b\34\1\2\u0160\u0161\7\37\2\2\u0161\u0163\b\34\1"+
		"\2\u0162\u015e\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165"+
		"\58\35\2\u0165\u0166\5\66\34\2\u0166\u0167\b\34\1\2\u0167\u016a\3\2\2"+
		"\2\u0168\u016a\b\34\1\2\u0169\u015d\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		"\67\3\2\2\2\u016b\u0170\b\35\1\2\u016c\u016d\7 \2\2\u016d\u0171\b\35\1"+
		"\2\u016e\u016f\7\35\2\2\u016f\u0171\b\35\1\2\u0170\u016c\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\58\35\2\u0173\u0174\b\35"+
		"\1\2\u0174\u0179\3\2\2\2\u0175\u0176\5:\36\2\u0176\u0177\b\35\1\2\u0177"+
		"\u0179\3\2\2\2\u0178\u016b\3\2\2\2\u0178\u0175\3\2\2\2\u01799\3\2\2\2"+
		"\u017a\u017b\5> \2\u017b\u017c\5<\37\2\u017c\u017d\b\36\1\2\u017d;\3\2"+
		"\2\2\u017e\u017f\7!\2\2\u017f\u0180\5\34\17\2\u0180\u0181\7\"\2\2\u0181"+
		"\u0182\b\37\1\2\u0182\u0185\3\2\2\2\u0183\u0185\b\37\1\2\u0184\u017e\3"+
		"\2\2\2\u0184\u0183\3\2\2\2\u0185=\3\2\2\2\u0186\u0187\5B\"\2\u0187\u0188"+
		"\5@!\2\u0188\u0189\b \1\2\u0189?\3\2\2\2\u018a\u01a1\7#\2\2\u018b\u018c"+
		"\7.\2\2\u018c\u018d\7\6\2\2\u018d\u018e\7\7\2\2\u018e\u01a2\b!\1\2\u018f"+
		"\u0190\7.\2\2\u0190\u0191\b!\1\2\u0191\u0192\7\6\2\2\u0192\u0193\5\34"+
		"\17\2\u0193\u019a\b!\1\2\u0194\u0195\7\17\2\2\u0195\u0196\5\34\17\2\u0196"+
		"\u0197\b!\1\2\u0197\u0199\3\2\2\2\u0198\u0194\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019e\7\7\2\2\u019e\u01a2\3\2\2\2\u019f\u01a0\7$"+
		"\2\2\u01a0\u01a2\b!\1\2\u01a1\u018b\3\2\2\2\u01a1\u018f\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\5@!\2\u01a4\u01a5\b!\1"+
		"\2\u01a5\u01a8\3\2\2\2\u01a6\u01a8\b!\1\2\u01a7\u018a\3\2\2\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8A\3\2\2\2\u01a9\u01cc\b\"\1\2\u01aa\u01ab\7+\2\2\u01ab\u01cd"+
		"\b\"\1\2\u01ac\u01ad\7,\2\2\u01ad\u01cd\b\"\1\2\u01ae\u01af\7%\2\2\u01af"+
		"\u01b0\7\t\2\2\u01b0\u01b1\7!\2\2\u01b1\u01b2\7+\2\2\u01b2\u01b3\7\"\2"+
		"\2\u01b3\u01cd\b\"\1\2\u01b4\u01b5\7%\2\2\u01b5\u01b6\7.\2\2\u01b6\u01b7"+
		"\7\6\2\2\u01b7\u01b8\7\7\2\2\u01b8\u01cd\b\"\1\2\u01b9\u01ba\7&\2\2\u01ba"+
		"\u01cd\b\"\1\2\u01bb\u01bc\7\'\2\2\u01bc\u01cd\b\"\1\2\u01bd\u01be\7("+
		"\2\2\u01be\u01cd\b\"\1\2\u01bf\u01c0\7.\2\2\u01c0\u01cd\b\"\1\2\u01c1"+
		"\u01c2\7.\2\2\u01c2\u01c3\7!\2\2\u01c3\u01c4\5\34\17\2\u01c4\u01c5\7\""+
		"\2\2\u01c5\u01c6\b\"\1\2\u01c6\u01cd\3\2\2\2\u01c7\u01c8\7\6\2\2\u01c8"+
		"\u01c9\5\34\17\2\u01c9\u01ca\7\7\2\2\u01ca\u01cb\b\"\1\2\u01cb\u01cd\3"+
		"\2\2\2\u01cc\u01aa\3\2\2\2\u01cc\u01ac\3\2\2\2\u01cc\u01ae\3\2\2\2\u01cc"+
		"\u01b4\3\2\2\2\u01cc\u01b9\3\2\2\2\u01cc\u01bb\3\2\2\2\u01cc\u01bd\3\2"+
		"\2\2\u01cc\u01bf\3\2\2\2\u01cc\u01c1\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cd"+
		"C\3\2\2\2\u01ce\u01cf\7\t\2\2\u01cf\u01db\b#\1\2\u01d0\u01d1\7)\2\2\u01d1"+
		"\u01db\b#\1\2\u01d2\u01d3\7*\2\2\u01d3\u01db\b#\1\2\u01d4\u01d5\7\t\2"+
		"\2\u01d5\u01d6\7!\2\2\u01d6\u01d7\7\"\2\2\u01d7\u01db\b#\1\2\u01d8\u01d9"+
		"\7.\2\2\u01d9\u01db\b#\1\2\u01da\u01ce\3\2\2\2\u01da\u01d0\3\2\2\2\u01da"+
		"\u01d2\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01d8\3\2\2\2\u01dbE\3\2\2\2"+
		"\37Rqz\u0082\u00a2\u00a7\u00b2\u00c5\u00d8\u00eb\u0109\u0115\u0121\u012c"+
		"\u0133\u013e\u0145\u0150\u0157\u0162\u0169\u0170\u0178\u0184\u019a\u01a1"+
		"\u01a7\u01cc\u01da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}