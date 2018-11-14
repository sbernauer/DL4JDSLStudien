// Generated from src/main/java/parser/PrePro.g4 by ANTLR 4.7.1

package parser;

import java.util.Arrays;

import org.nd4j.linalg.factory.Nd4j;

import nodes.*;
import nodes.statement.*;
import nodes.expression.*;
import nodes.expression.arithmetic.*;
import nodes.function.*;
import nodes.debugging.*;
import variables.*;



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreProParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, WS=19, BLOCK_COMMENT=20, LINE_COMMENT=21, TYPE=22, IDENTIFIER=23, 
		STRING_LITERAL=24, NUMERIC_LITERAL=25;
	public static final int
		RULE_prepro = 0, RULE_mainFunction = 1, RULE_exportDefinitions = 2, RULE_function = 3, 
		RULE_functionArguments = 4, RULE_statement = 5, RULE_assignStatement = 6, 
		RULE_functionCallStatement = 7, RULE_printStatement = 8, RULE_debugStatement = 9, 
		RULE_expression = 10, RULE_term = 11, RULE_factor = 12;
	public static final String[] ruleNames = {
		"prepro", "mainFunction", "exportDefinitions", "function", "functionArguments", 
		"statement", "assignStatement", "functionCallStatement", "printStatement", 
		"debugStatement", "expression", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'main'", "'('", "')'", "'{'", "'import'", "';'", 
		"'export'", "'}'", "','", "'='", "'print'", "'debug'", "'+'", "'-'", "'*'", 
		"'X'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "WS", "BLOCK_COMMENT", "LINE_COMMENT", 
		"TYPE", "IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL"
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
	public String getGrammarFileName() { return "PrePro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private NodeFactory nodeFactory = new NodeFactory();

	public PreProParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PreproContext extends ParserRuleContext {
		public MainNode result;
		public MainFunctionContext mainFunction;
		public FunctionContext function;
		public TerminalNode EOF() { return getToken(PreProParser.EOF, 0); }
		public List<MainFunctionContext> mainFunction() {
			return getRuleContexts(MainFunctionContext.class);
		}
		public MainFunctionContext mainFunction(int i) {
			return getRuleContext(MainFunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public PreproContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterPrepro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitPrepro(this);
		}
	}

	public final PreproContext prepro() throws RecognitionException {
		PreproContext _localctx = new PreproContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prepro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 nodeFactory.startFunctionList();
			                                      MainFunctionNode mainFunctionNode;
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(27);
					((PreproContext)_localctx).mainFunction = mainFunction();
					 nodeFactory.addFunction(((PreproContext)_localctx).mainFunction.result); 
					}
					break;
				case 2:
					{
					setState(30);
					((PreproContext)_localctx).function = function();
					 nodeFactory.addFunction(((PreproContext)_localctx).function.result); 
					}
					break;
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(EOF);
			 ((PreproContext)_localctx).result =  new MainNode(nodeFactory.getFunctionsAsArray()); 
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

	public static class MainFunctionContext extends ParserRuleContext {
		public MainFunctionNode result;
		public FunctionArgumentsContext importDefinitions;
		public StatementContext statement;
		public ExportDefinitionsContext exportDefinitions;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExportDefinitionsContext exportDefinitions() {
			return getRuleContext(ExportDefinitionsContext.class,0);
		}
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitMainFunction(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			 nodeFactory.startStatementList(); 
			setState(43);
			match(T__1);
			setState(44);
			match(T__2);
			setState(45);
			match(T__3);
			setState(46);
			match(T__4);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(47);
				match(T__5);
				setState(48);
				((MainFunctionContext)_localctx).importDefinitions = functionArguments();
				setState(49);
				match(T__6);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(53);
				((MainFunctionContext)_localctx).statement = statement();
				 nodeFactory.addStatement(((MainFunctionContext)_localctx).statement.result, (((MainFunctionContext)_localctx).statement!=null?(((MainFunctionContext)_localctx).statement.start):null).getLine()); 
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(61);
				match(T__7);
				setState(62);
				((MainFunctionContext)_localctx).exportDefinitions = exportDefinitions();
				setState(63);
				match(T__6);
				}
			}

			setState(67);
			match(T__8);
			 ((MainFunctionContext)_localctx).result =  new MainFunctionNode("main", ((MainFunctionContext)_localctx).importDefinitions.result, ((MainFunctionContext)_localctx).exportDefinitions.result, new StatementListNode(nodeFactory.getStatementsAsArray())); 
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

	public static class ExportDefinitionsContext extends ParserRuleContext {
		public List<String> result;
		public Token IDENTIFIER;
		public List<TerminalNode> IDENTIFIER() { return getTokens(PreProParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PreProParser.IDENTIFIER, i);
		}
		public ExportDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterExportDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitExportDefinitions(this);
		}
	}

	public final ExportDefinitionsContext exportDefinitions() throws RecognitionException {
		ExportDefinitionsContext _localctx = new ExportDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exportDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ExportDefinitionsContext)_localctx).result =  new ArrayList<>(); 
			setState(71);
			((ExportDefinitionsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 _localctx.result.add((((ExportDefinitionsContext)_localctx).IDENTIFIER!=null?((ExportDefinitionsContext)_localctx).IDENTIFIER.getText():null)); 
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(73);
				match(T__9);
				setState(74);
				((ExportDefinitionsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 _localctx.result.add((((ExportDefinitionsContext)_localctx).IDENTIFIER!=null?((ExportDefinitionsContext)_localctx).IDENTIFIER.getText():null)); 
				}
				}
				setState(80);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionNode result;
		public Token IDENTIFIER;
		public FunctionArgumentsContext functionArguments;
		public StatementContext statement;
		public TerminalNode IDENTIFIER() { return getToken(PreProParser.IDENTIFIER, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			 nodeFactory.startStatementList(); 
			setState(83);
			((FunctionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(84);
			match(T__2);
			setState(85);
			((FunctionContext)_localctx).functionArguments = functionArguments();
			setState(86);
			match(T__3);
			setState(87);
			match(T__4);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(88);
				((FunctionContext)_localctx).statement = statement();
				 nodeFactory.addStatement(((FunctionContext)_localctx).statement.result, (((FunctionContext)_localctx).statement!=null?(((FunctionContext)_localctx).statement.start):null).getLine()); 
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((FunctionContext)_localctx).result =  new FunctionNode((((FunctionContext)_localctx).IDENTIFIER!=null?((FunctionContext)_localctx).IDENTIFIER.getText():null), ((FunctionContext)_localctx).functionArguments.result, new StatementListNode(nodeFactory.getStatementsAsArray())); 
			setState(97);
			match(T__8);
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public List<ParameterDefinition> result;
		public Token TYPE;
		public Token IDENTIFIER;
		public List<TerminalNode> TYPE() { return getTokens(PreProParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(PreProParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PreProParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PreProParser.IDENTIFIER, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitFunctionArguments(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionArgumentsContext)_localctx).result =  new ArrayList<>(); 
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(100);
				((FunctionArgumentsContext)_localctx).TYPE = match(TYPE);
				setState(101);
				((FunctionArgumentsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 _localctx.result.add(nodeFactory.createParameterDefiniton((((FunctionArgumentsContext)_localctx).TYPE!=null?((FunctionArgumentsContext)_localctx).TYPE.getText():null), (((FunctionArgumentsContext)_localctx).IDENTIFIER!=null?((FunctionArgumentsContext)_localctx).IDENTIFIER.getText():null))); 
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(103);
					match(T__9);
					setState(104);
					((FunctionArgumentsContext)_localctx).TYPE = match(TYPE);
					setState(105);
					((FunctionArgumentsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					 _localctx.result.add(nodeFactory.createParameterDefiniton((((FunctionArgumentsContext)_localctx).TYPE!=null?((FunctionArgumentsContext)_localctx).TYPE.getText():null), (((FunctionArgumentsContext)_localctx).IDENTIFIER!=null?((FunctionArgumentsContext)_localctx).IDENTIFIER.getText():null))); 
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public StatementNode result;
		public AssignStatementContext assignStatement;
		public FunctionCallStatementContext functionCallStatement;
		public PrintStatementContext printStatement;
		public DebugStatementContext debugStatement;
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public DebugStatementContext debugStatement() {
			return getRuleContext(DebugStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(114);
				((StatementContext)_localctx).assignStatement = assignStatement();
				 ((StatementContext)_localctx).result =  ((StatementContext)_localctx).assignStatement.result; 
				}
				break;
			case 2:
				{
				setState(117);
				((StatementContext)_localctx).functionCallStatement = functionCallStatement();
				 ((StatementContext)_localctx).result =  ((StatementContext)_localctx).functionCallStatement.result; 
				}
				break;
			case 3:
				{
				setState(120);
				((StatementContext)_localctx).printStatement = printStatement();
				 ((StatementContext)_localctx).result =  ((StatementContext)_localctx).printStatement.result; 
				}
				break;
			case 4:
				{
				setState(123);
				((StatementContext)_localctx).debugStatement = debugStatement();
				 ((StatementContext)_localctx).result =  new DebugNode((((StatementContext)_localctx).debugStatement!=null?(((StatementContext)_localctx).debugStatement.start):null).getLine()); 
				}
				break;
			}
			setState(128);
			match(T__6);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStatementNode result;
		public Token TYPE;
		public Token i;
		public ExpressionContext e;
		public TerminalNode IDENTIFIER() { return getToken(PreProParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PreProParser.TYPE, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(130);
				((AssignStatementContext)_localctx).TYPE = match(TYPE);
				}
			}

			setState(133);
			((AssignStatementContext)_localctx).i = match(IDENTIFIER);
			setState(134);
			match(T__10);
			setState(135);
			((AssignStatementContext)_localctx).e = expression();
			 ((AssignStatementContext)_localctx).result =  new AssignStatementNode((((AssignStatementContext)_localctx).i!=null?((AssignStatementContext)_localctx).i.getText():null), (((AssignStatementContext)_localctx).TYPE!=null?((AssignStatementContext)_localctx).TYPE.getText():null), ((AssignStatementContext)_localctx).e.result); 
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallNode result;
		public Token IDENTIFIER;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIER() { return getToken(PreProParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitFunctionCallStatement(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((FunctionCallStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(139);
			match(T__2);
			 nodeFactory.startExpressionList(); 
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==IDENTIFIER) {
				{
				setState(141);
				((FunctionCallStatementContext)_localctx).expression = expression();
				 nodeFactory.addExpression(((FunctionCallStatementContext)_localctx).expression.result); 
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(143);
					match(T__9);
					setState(144);
					((FunctionCallStatementContext)_localctx).expression = expression();
					 nodeFactory.addExpression(((FunctionCallStatementContext)_localctx).expression.result); 
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(154);
			match(T__3);
			 ((FunctionCallStatementContext)_localctx).result =  new FunctionCallNode((((FunctionCallStatementContext)_localctx).IDENTIFIER!=null?((FunctionCallStatementContext)_localctx).IDENTIFIER.getText():null), nodeFactory.getExpressionsAsList()); 
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementNode result;
		public ExpressionContext expression;
		public Token STRING_LITERAL;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(PreProParser.STRING_LITERAL, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__11);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IDENTIFIER:
				{
				setState(158);
				((PrintStatementContext)_localctx).expression = expression();
				 ((PrintStatementContext)_localctx).result =  new PrintStatementNode(((PrintStatementContext)_localctx).expression.result); 
				}
				break;
			case STRING_LITERAL:
				{
				setState(161);
				((PrintStatementContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((PrintStatementContext)_localctx).result =  new PrintStatementNode((((PrintStatementContext)_localctx).STRING_LITERAL!=null?((PrintStatementContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((PrintStatementContext)_localctx).STRING_LITERAL!=null?((PrintStatementContext)_localctx).STRING_LITERAL.getText():null).length() - 1)); 
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

	public static class DebugStatementContext extends ParserRuleContext {
		public Token d;
		public DebugStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterDebugStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitDebugStatement(this);
		}
	}

	public final DebugStatementContext debugStatement() throws RecognitionException {
		DebugStatementContext _localctx = new DebugStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_debugStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((DebugStatementContext)_localctx).d = match(T__12);
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
		public ExpressionNode result;
		public TermContext term;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((ExpressionContext)_localctx).term = term();
			 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).term.result; 
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					{
					setState(169);
					match(T__13);
					setState(170);
					((ExpressionContext)_localctx).term = term();
					}
					 ((ExpressionContext)_localctx).result =  new AddNode(_localctx.result, ((ExpressionContext)_localctx).term.result); 
					}
					break;
				case T__14:
					{
					{
					setState(174);
					match(T__14);
					setState(175);
					((ExpressionContext)_localctx).term = term();
					}
					 ((ExpressionContext)_localctx).result =  new SubNode(_localctx.result, ((ExpressionContext)_localctx).term.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(183);
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

	public static class TermContext extends ParserRuleContext {
		public ExpressionNode result;
		public FactorContext factor;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((TermContext)_localctx).factor = factor();
			 ((TermContext)_localctx).result =  ((TermContext)_localctx).factor.result; 
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					{
					setState(186);
					match(T__15);
					setState(187);
					((TermContext)_localctx).factor = factor();
					}
					 ((TermContext)_localctx).result =  new MulNode(_localctx.result, ((TermContext)_localctx).factor.result); 
					}
					break;
				case T__16:
					{
					{
					setState(191);
					match(T__16);
					setState(192);
					((TermContext)_localctx).factor = factor();
					}
					 ((TermContext)_localctx).result =  new CrossProductNode(_localctx.result, ((TermContext)_localctx).factor.result); 
					}
					break;
				case T__17:
					{
					{
					setState(196);
					match(T__17);
					setState(197);
					((TermContext)_localctx).factor = factor();
					}
					 ((TermContext)_localctx).result =  new DivNode(_localctx.result, ((TermContext)_localctx).factor.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(205);
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

	public static class FactorContext extends ParserRuleContext {
		public ExpressionNode result;
		public Token IDENTIFIER;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIER() { return getToken(PreProParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProListener ) ((PreProListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				((FactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((FactorContext)_localctx).result =  new VariableConstantNode((((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__2);
				setState(209);
				((FactorContext)_localctx).expression = expression();
				setState(210);
				match(T__3);
				 ((FactorContext)_localctx).result =  ((FactorContext)_localctx).expression.result; 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00da\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2$\n\2\f"+
		"\2\16\2\'\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\66\n\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3\3\3\3\5\3D\n\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4R\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\5\6s\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\7\3\7\3\b\5\b\u0086"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0096"+
		"\n\t\f\t\16\t\u0099\13\t\5\t\u009b\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00a6\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00b6\n\f\f\f\16\f\u00b9\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cc\n\r\f\r\16\r\u00cf\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d8\n\16\3\16\2\2\17\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u00e2\2\34\3\2\2\2\4+\3\2\2\2\6H\3"+
		"\2\2\2\bS\3\2\2\2\ne\3\2\2\2\f\u0080\3\2\2\2\16\u0085\3\2\2\2\20\u008c"+
		"\3\2\2\2\22\u009f\3\2\2\2\24\u00a7\3\2\2\2\26\u00a9\3\2\2\2\30\u00ba\3"+
		"\2\2\2\32\u00d7\3\2\2\2\34%\b\2\1\2\35\36\5\4\3\2\36\37\b\2\1\2\37$\3"+
		"\2\2\2 !\5\b\5\2!\"\b\2\1\2\"$\3\2\2\2#\35\3\2\2\2# \3\2\2\2$\'\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2\3)*\b\2\1\2*\3\3\2"+
		"\2\2+,\7\3\2\2,-\b\3\1\2-.\7\4\2\2./\7\5\2\2/\60\7\6\2\2\60\65\7\7\2\2"+
		"\61\62\7\b\2\2\62\63\5\n\6\2\63\64\7\t\2\2\64\66\3\2\2\2\65\61\3\2\2\2"+
		"\65\66\3\2\2\2\66<\3\2\2\2\678\5\f\7\289\b\3\1\29;\3\2\2\2:\67\3\2\2\2"+
		";>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=C\3\2\2\2><\3\2\2\2?@\7\n\2\2@A\5\6\4\2"+
		"AB\7\t\2\2BD\3\2\2\2C?\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\13\2\2FG\b\3\1"+
		"\2G\5\3\2\2\2HI\b\4\1\2IJ\7\31\2\2JP\b\4\1\2KL\7\f\2\2LM\7\31\2\2MO\b"+
		"\4\1\2NK\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2\2RP\3\2\2\2ST"+
		"\7\3\2\2TU\b\5\1\2UV\7\31\2\2VW\7\5\2\2WX\5\n\6\2XY\7\6\2\2Y_\7\7\2\2"+
		"Z[\5\f\7\2[\\\b\5\1\2\\^\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2"+
		"\2`b\3\2\2\2a_\3\2\2\2bc\b\5\1\2cd\7\13\2\2d\t\3\2\2\2er\b\6\1\2fg\7\30"+
		"\2\2gh\7\31\2\2ho\b\6\1\2ij\7\f\2\2jk\7\30\2\2kl\7\31\2\2ln\b\6\1\2mi"+
		"\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rf\3\2\2\2r"+
		"s\3\2\2\2s\13\3\2\2\2tu\5\16\b\2uv\b\7\1\2v\u0081\3\2\2\2wx\5\20\t\2x"+
		"y\b\7\1\2y\u0081\3\2\2\2z{\5\22\n\2{|\b\7\1\2|\u0081\3\2\2\2}~\5\24\13"+
		"\2~\177\b\7\1\2\177\u0081\3\2\2\2\u0080t\3\2\2\2\u0080w\3\2\2\2\u0080"+
		"z\3\2\2\2\u0080}\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\t\2\2\u0083"+
		"\r\3\2\2\2\u0084\u0086\7\30\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0088\7\31\2\2\u0088\u0089\7\r\2\2\u0089"+
		"\u008a\5\26\f\2\u008a\u008b\b\b\1\2\u008b\17\3\2\2\2\u008c\u008d\7\31"+
		"\2\2\u008d\u008e\7\5\2\2\u008e\u009a\b\t\1\2\u008f\u0090\5\26\f\2\u0090"+
		"\u0097\b\t\1\2\u0091\u0092\7\f\2\2\u0092\u0093\5\26\f\2\u0093\u0094\b"+
		"\t\1\2\u0094\u0096\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u008f\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7\6\2\2\u009d\u009e\b\t\1\2\u009e\21\3\2\2\2\u009f\u00a5\7\16\2"+
		"\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\b\n\1\2\u00a2\u00a6\3\2\2\2\u00a3"+
		"\u00a4\7\32\2\2\u00a4\u00a6\b\n\1\2\u00a5\u00a0\3\2\2\2\u00a5\u00a3\3"+
		"\2\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\7\17\2\2\u00a8\25\3\2\2\2\u00a9\u00aa"+
		"\5\30\r\2\u00aa\u00b7\b\f\1\2\u00ab\u00ac\7\20\2\2\u00ac\u00ad\5\30\r"+
		"\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\f\1\2\u00af\u00b6\3\2\2\2\u00b0\u00b1"+
		"\7\21\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\f\1\2"+
		"\u00b4\u00b6\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\27\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00cd\b\r\1\2\u00bc\u00bd\7"+
		"\22\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\r\1\2"+
		"\u00c0\u00cc\3\2\2\2\u00c1\u00c2\7\23\2\2\u00c2\u00c3\5\32\16\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\b\r\1\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\7\24"+
		"\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\r\1\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00c1\3\2\2\2\u00cb\u00c6\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\31\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\31\2\2\u00d1\u00d8\b\16"+
		"\1\2\u00d2\u00d3\7\5\2\2\u00d3\u00d4\5\26\f\2\u00d4\u00d5\7\6\2\2\u00d5"+
		"\u00d6\b\16\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d2\3"+
		"\2\2\2\u00d8\33\3\2\2\2\25#%\65<CP_or\u0080\u0085\u0097\u009a\u00a5\u00b5"+
		"\u00b7\u00cb\u00cd\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}