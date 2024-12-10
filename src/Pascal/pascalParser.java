// Generated from C:/Users/miria/IdeaProjects/Compilador/src/Grammar/pascal.g4 by ANTLR 4.13.2
package Pascal;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, WRITE=2, BRACKET_LEFT=3, BRACKET_RIGHT=4, SQBRACKET_LEFT=5, SQBRACKET_RIGHT=6, 
		PROGRAM=7, BEGIN=8, END=9, INT_TYPE=10, STR_TYPE=11, BOOL_TYPE=12, CHAR_TYPE=13, 
		VAR=14, ARRAY=15, OF=16, CONST=17, CONST_CHAR=18, CONST_STRING=19, ARRAY_OF=20, 
		ASSIGN=21, NUMBER=22, TEXTCHAR=23, TEXT=24, COLON=25, SEMI_COLON=26, COMA=27, 
		DOBLEDOTS=28, QUATATION_MARK=29, DOUBLE_QUOTATION_MARK=30, DOT=31, TRUE=32, 
		FALSE=33, BOOLEANE=34, EQUAL=35, FUNCTION=36, C_WHILE=37, C_DO=38, C_to=39, 
		C_FOR=40, C_REPEAT=41, C_UNTIL=42, C_IF=43, C_THEN=44, C_ELSE=45, PLUS=46, 
		MINUS=47, MULT=48, DIV=49, MOD=50, ID=51, WS=52, COMMENT=53;
	public static final int
		RULE_main = 0, RULE_statements = 1, RULE_typesstatemes = 2, RULE_sentence = 3, 
		RULE_assign = 4, RULE_expression = 5, RULE_assingId = 6, RULE_optional_values = 7, 
		RULE_varBlock = 8, RULE_varDecl = 9, RULE_varID = 10, RULE_typeDef = 11, 
		RULE_typeName = 12, RULE_arrDecl = 13, RULE_arr1D = 14, RULE_arr2D = 15, 
		RULE_typearray = 16, RULE_range = 17, RULE_constBlock = 18, RULE_constDecl = 19, 
		RULE_constCharDecl = 20, RULE_constStrDecl = 21, RULE_functionBlock = 22, 
		RULE_functionDecl = 23, RULE_params = 24, RULE_returnType = 25, RULE_varParamBlock = 26, 
		RULE_varParamDecl = 27, RULE_varParamID = 28, RULE_typeParamDef = 29, 
		RULE_typeParamName = 30, RULE_fuctionUsage = 31, RULE_whileBlock = 32, 
		RULE_whileDecla = 33, RULE_condition = 34, RULE_forBlock = 35, RULE_forDecla = 36, 
		RULE_forcondition = 37, RULE_repeatBlock = 38, RULE_repeatDecla = 39, 
		RULE_repeatcondition = 40, RULE_ifBlock = 41, RULE_ifDecla = 42, RULE_ifcondition = 43, 
		RULE_conditionvali = 44, RULE_array_call = 45, RULE_arraybi_call = 46, 
		RULE_read_function = 47, RULE_readId = 48, RULE_write_function = 49, RULE_writeId = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "statements", "typesstatemes", "sentence", "assign", "expression", 
			"assingId", "optional_values", "varBlock", "varDecl", "varID", "typeDef", 
			"typeName", "arrDecl", "arr1D", "arr2D", "typearray", "range", "constBlock", 
			"constDecl", "constCharDecl", "constStrDecl", "functionBlock", "functionDecl", 
			"params", "returnType", "varParamBlock", "varParamDecl", "varParamID", 
			"typeParamDef", "typeParamName", "fuctionUsage", "whileBlock", "whileDecla", 
			"condition", "forBlock", "forDecla", "forcondition", "repeatBlock", "repeatDecla", 
			"repeatcondition", "ifBlock", "ifDecla", "ifcondition", "conditionvali", 
			"array_call", "arraybi_call", "read_function", "readId", "write_function", 
			"writeId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", null, "'('", "')'", "'['", "']'", "'program'", "'begin'", 
			"'end'", "'integer'", "'string'", "'boolean'", "'char'", "'var'", "'array'", 
			"'of'", "'const'", "'constchar'", "'conststr'", "'array of'", "':='", 
			null, null, null, "':'", "';'", "','", "'..'", "'''", "'\"'", "'.'", 
			"'true'", "'false'", null, "'='", "'function'", "'while'", "'do'", null, 
			"'for'", "'repeat'", "'until'", "'if'", "'then'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READ", "WRITE", "BRACKET_LEFT", "BRACKET_RIGHT", "SQBRACKET_LEFT", 
			"SQBRACKET_RIGHT", "PROGRAM", "BEGIN", "END", "INT_TYPE", "STR_TYPE", 
			"BOOL_TYPE", "CHAR_TYPE", "VAR", "ARRAY", "OF", "CONST", "CONST_CHAR", 
			"CONST_STRING", "ARRAY_OF", "ASSIGN", "NUMBER", "TEXTCHAR", "TEXT", "COLON", 
			"SEMI_COLON", "COMA", "DOBLEDOTS", "QUATATION_MARK", "DOUBLE_QUOTATION_MARK", 
			"DOT", "TRUE", "FALSE", "BOOLEANE", "EQUAL", "FUNCTION", "C_WHILE", "C_DO", 
			"C_to", "C_FOR", "C_REPEAT", "C_UNTIL", "C_IF", "C_THEN", "C_ELSE", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "ID", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(pascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode DOT() { return getToken(pascalParser.DOT, 0); }
		public TerminalNode EOF() { return getToken(pascalParser.EOF, 0); }
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public ConstBlockContext constBlock() {
			return getRuleContext(ConstBlockContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PROGRAM);
			setState(103);
			match(ID);
			setState(104);
			match(SEMI_COLON);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(105);
				varBlock();
				}
			}

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(108);
				constBlock();
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(111);
				functionBlock();
				}
			}

			setState(114);
			match(BEGIN);
			setState(115);
			statements();
			setState(116);
			match(END);
			setState(117);
			match(DOT);
			setState(118);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<TypesstatemesContext> typesstatemes() {
			return getRuleContexts(TypesstatemesContext.class);
		}
		public TypesstatemesContext typesstatemes(int i) {
			return getRuleContext(TypesstatemesContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2264044794806286L) != 0)) {
				{
				{
				setState(120);
				typesstatemes();
				}
				}
				setState(125);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypesstatemesContext extends ParserRuleContext {
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public RepeatBlockContext repeatBlock() {
			return getRuleContext(RepeatBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public FuctionUsageContext fuctionUsage() {
			return getRuleContext(FuctionUsageContext.class,0);
		}
		public Write_functionContext write_function() {
			return getRuleContext(Write_functionContext.class,0);
		}
		public Read_functionContext read_function() {
			return getRuleContext(Read_functionContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TypesstatemesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesstatemes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypesstatemes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypesstatemes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypesstatemes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesstatemesContext typesstatemes() throws RecognitionException {
		TypesstatemesContext _localctx = new TypesstatemesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typesstatemes);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				whileBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				forBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				repeatBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				ifBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				fuctionUsage();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				write_function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				read_function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(133);
				sentence();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(134);
				match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public AssingIdContext assingId() {
			return getRuleContext(AssingIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141);
			assingId();
			}
			setState(142);
			match(ASSIGN);
			{
			setState(143);
			expression(0);
			}
			setState(144);
			match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(pascalParser.MOD, 0); }
		public ModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCallExpressionContext extends ExpressionContext {
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public ArrayCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrayCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrayCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrayCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBiCallExpressionContext extends ExpressionContext {
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public ArrayBiCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrayBiCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrayBiCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrayBiCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(pascalParser.DIV, 0); }
		public DivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValuesExpressionContext extends ExpressionContext {
		public Optional_valuesContext optional_values() {
			return getRuleContext(Optional_valuesContext.class,0);
		}
		public ValuesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterValuesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitValuesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitValuesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(pascalParser.MULT, 0); }
		public MultExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(147);
				match(BRACKET_LEFT);
				setState(148);
				expression(0);
				setState(149);
				match(BRACKET_RIGHT);
				}
				break;
			case 2:
				{
				_localctx = new ValuesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				optional_values();
				}
				break;
			case 3:
				{
				_localctx = new ArrayCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				array_call();
				}
				break;
			case 4:
				{
				_localctx = new ArrayBiCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				arraybi_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(157);
						match(MULT);
						setState(158);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(160);
						match(DIV);
						setState(161);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(163);
						match(MOD);
						setState(164);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(166);
						match(PLUS);
						setState(167);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(169);
						match(MINUS);
						setState(170);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssingIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public AssingIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterAssingId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitAssingId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitAssingId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssingIdContext assingId() throws RecognitionException {
		AssingIdContext _localctx = new AssingIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assingId);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				array_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				arraybi_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Optional_valuesContext extends ParserRuleContext {
		public FuctionUsageContext fuctionUsage() {
			return getRuleContext(FuctionUsageContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode TEXTCHAR() { return getToken(pascalParser.TEXTCHAR, 0); }
		public TerminalNode TRUE() { return getToken(pascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pascalParser.FALSE, 0); }
		public Optional_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterOptional_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitOptional_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitOptional_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_valuesContext optional_values() throws RecognitionException {
		Optional_valuesContext _localctx = new Optional_valuesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optional_values);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				fuctionUsage();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(TEXTCHAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(FALSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarBlockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(pascalParser.VAR, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public VarBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarBlockContext varBlock() throws RecognitionException {
		VarBlockContext _localctx = new VarBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(VAR);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				varDecl();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			varID();
			setState(197);
			match(COLON);
			setState(198);
			typeDef();
			setState(199);
			match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarIDContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(pascalParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pascalParser.COMA, i);
		}
		public VarIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIDContext varID() throws RecognitionException {
		VarIDContext _localctx = new VarIDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			match(ID);
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(202);
				match(COMA);
				{
				setState(203);
				match(ID);
				}
				}
				}
				setState(208);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			typeName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(pascalParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(pascalParser.BOOL_TYPE, 0); }
		public TerminalNode STR_TYPE() { return getToken(pascalParser.STR_TYPE, 0); }
		public ArrDeclContext arrDecl() {
			return getRuleContext(ArrDeclContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeName);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(INT_TYPE);
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(CHAR_TYPE);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(BOOL_TYPE);
				}
				break;
			case STR_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(STR_TYPE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				arrDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrDeclContext extends ParserRuleContext {
		public Arr1DContext arr1D() {
			return getRuleContext(Arr1DContext.class,0);
		}
		public Arr2DContext arr2D() {
			return getRuleContext(Arr2DContext.class,0);
		}
		public ArrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrDeclContext arrDecl() throws RecognitionException {
		ArrDeclContext _localctx = new ArrDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrDecl);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				arr1D();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				arr2D();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arr1DContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(pascalParser.ARRAY, 0); }
		public TerminalNode SQBRACKET_LEFT() { return getToken(pascalParser.SQBRACKET_LEFT, 0); }
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public TerminalNode DOBLEDOTS() { return getToken(pascalParser.DOBLEDOTS, 0); }
		public TerminalNode SQBRACKET_RIGHT() { return getToken(pascalParser.SQBRACKET_RIGHT, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public TypearrayContext typearray() {
			return getRuleContext(TypearrayContext.class,0);
		}
		public Arr1DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr1D; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArr1D(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArr1D(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArr1D(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr1DContext arr1D() throws RecognitionException {
		Arr1DContext _localctx = new Arr1DContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arr1D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ARRAY);
			setState(223);
			match(SQBRACKET_LEFT);
			setState(224);
			range();
			setState(225);
			match(DOBLEDOTS);
			setState(226);
			range();
			setState(227);
			match(SQBRACKET_RIGHT);
			setState(228);
			match(OF);
			setState(229);
			typearray();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arr2DContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(pascalParser.ARRAY, 0); }
		public TerminalNode SQBRACKET_LEFT() { return getToken(pascalParser.SQBRACKET_LEFT, 0); }
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<TerminalNode> DOBLEDOTS() { return getTokens(pascalParser.DOBLEDOTS); }
		public TerminalNode DOBLEDOTS(int i) {
			return getToken(pascalParser.DOBLEDOTS, i);
		}
		public TerminalNode COMA() { return getToken(pascalParser.COMA, 0); }
		public TerminalNode SQBRACKET_RIGHT() { return getToken(pascalParser.SQBRACKET_RIGHT, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public TypearrayContext typearray() {
			return getRuleContext(TypearrayContext.class,0);
		}
		public Arr2DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr2D; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArr2D(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArr2D(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArr2D(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr2DContext arr2D() throws RecognitionException {
		Arr2DContext _localctx = new Arr2DContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arr2D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ARRAY);
			setState(232);
			match(SQBRACKET_LEFT);
			setState(233);
			range();
			setState(234);
			match(DOBLEDOTS);
			setState(235);
			range();
			setState(236);
			match(COMA);
			setState(237);
			range();
			setState(238);
			match(DOBLEDOTS);
			setState(239);
			range();
			setState(240);
			match(SQBRACKET_RIGHT);
			setState(241);
			match(OF);
			setState(242);
			typearray();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypearrayContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(pascalParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(pascalParser.BOOL_TYPE, 0); }
		public TerminalNode STR_TYPE() { return getToken(pascalParser.STR_TYPE, 0); }
		public TypearrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typearray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypearray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypearray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypearray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypearrayContext typearray() throws RecognitionException {
		TypearrayContext _localctx = new TypearrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typearray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstBlockContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(pascalParser.CONST, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public ConstBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstBlockContext constBlock() throws RecognitionException {
		ConstBlockContext _localctx = new ConstBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(CONST);
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				constDecl();
				}
				}
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONST_CHAR || _la==CONST_STRING );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclContext extends ParserRuleContext {
		public ConstCharDeclContext constCharDecl() {
			return getRuleContext(ConstCharDeclContext.class,0);
		}
		public ConstStrDeclContext constStrDecl() {
			return getRuleContext(ConstStrDeclContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constDecl);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				constCharDecl();
				}
				break;
			case CONST_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				constStrDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstCharDeclContext extends ParserRuleContext {
		public TerminalNode CONST_CHAR() { return getToken(pascalParser.CONST_CHAR, 0); }
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public TerminalNode TEXTCHAR() { return getToken(pascalParser.TEXTCHAR, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public ConstCharDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constCharDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstCharDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstCharDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstCharDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstCharDeclContext constCharDecl() throws RecognitionException {
		ConstCharDeclContext _localctx = new ConstCharDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constCharDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(CONST_CHAR);
			setState(259);
			match(COLON);
			setState(260);
			match(ID);
			setState(261);
			match(EQUAL);
			setState(262);
			match(TEXTCHAR);
			setState(263);
			match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstStrDeclContext extends ParserRuleContext {
		public TerminalNode CONST_STRING() { return getToken(pascalParser.CONST_STRING, 0); }
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public ConstStrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constStrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstStrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstStrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstStrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstStrDeclContext constStrDecl() throws RecognitionException {
		ConstStrDeclContext _localctx = new ConstStrDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constStrDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(CONST_STRING);
			setState(266);
			match(COLON);
			setState(267);
			match(ID);
			setState(268);
			match(EQUAL);
			setState(269);
			match(TEXT);
			setState(270);
			match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBlockContext extends ParserRuleContext {
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				functionDecl();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(pascalParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(pascalParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(pascalParser.SEMI_COLON, i);
		}
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<ForBlockContext> forBlock() {
			return getRuleContexts(ForBlockContext.class);
		}
		public ForBlockContext forBlock(int i) {
			return getRuleContext(ForBlockContext.class,i);
		}
		public List<RepeatBlockContext> repeatBlock() {
			return getRuleContexts(RepeatBlockContext.class);
		}
		public RepeatBlockContext repeatBlock(int i) {
			return getRuleContext(RepeatBlockContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<FuctionUsageContext> fuctionUsage() {
			return getRuleContexts(FuctionUsageContext.class);
		}
		public FuctionUsageContext fuctionUsage(int i) {
			return getRuleContext(FuctionUsageContext.class,i);
		}
		public List<Write_functionContext> write_function() {
			return getRuleContexts(Write_functionContext.class);
		}
		public Write_functionContext write_function(int i) {
			return getRuleContext(Write_functionContext.class,i);
		}
		public List<Read_functionContext> read_function() {
			return getRuleContexts(Read_functionContext.class);
		}
		public Read_functionContext read_function(int i) {
			return getRuleContext(Read_functionContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(pascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(pascalParser.NUMBER, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(pascalParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(pascalParser.TEXT, i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(FUNCTION);
			setState(278);
			match(ID);
			setState(279);
			params();
			setState(280);
			match(COLON);
			setState(281);
			returnType();
			setState(282);
			match(SEMI_COLON);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(283);
				varBlock();
				}
			}

			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(286);
				functionBlock();
				}
			}

			setState(289);
			match(BEGIN);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(290);
						whileBlock();
						}
						break;
					case 2:
						{
						setState(291);
						forBlock();
						}
						break;
					case 3:
						{
						setState(292);
						repeatBlock();
						}
						break;
					case 4:
						{
						setState(293);
						ifBlock();
						}
						break;
					case 5:
						{
						setState(294);
						assign();
						}
						break;
					case 6:
						{
						setState(295);
						fuctionUsage();
						}
						break;
					case 7:
						{
						setState(296);
						write_function();
						}
						break;
					case 8:
						{
						setState(297);
						read_function();
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799834656768L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(309);
				assign();
				}
			}

			setState(312);
			match(END);
			setState(313);
			match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public VarParamBlockContext varParamBlock() {
			return getRuleContext(VarParamBlockContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(BRACKET_LEFT);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(316);
				varParamBlock();
				}
			}

			}
			setState(319);
			match(BRACKET_RIGHT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(pascalParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(pascalParser.BOOL_TYPE, 0); }
		public TerminalNode STR_TYPE() { return getToken(pascalParser.STR_TYPE, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarParamBlockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(pascalParser.VAR, 0); }
		public List<VarParamDeclContext> varParamDecl() {
			return getRuleContexts(VarParamDeclContext.class);
		}
		public VarParamDeclContext varParamDecl(int i) {
			return getRuleContext(VarParamDeclContext.class,i);
		}
		public VarParamBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varParamBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarParamBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarParamBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarParamBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarParamBlockContext varParamBlock() throws RecognitionException {
		VarParamBlockContext _localctx = new VarParamBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_varParamBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(VAR);
			setState(325); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(324);
				varParamDecl();
				}
				}
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarParamDeclContext extends ParserRuleContext {
		public VarParamIDContext varParamID() {
			return getRuleContext(VarParamIDContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TypeParamDefContext typeParamDef() {
			return getRuleContext(TypeParamDefContext.class,0);
		}
		public VarParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varParamDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarParamDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarParamDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarParamDeclContext varParamDecl() throws RecognitionException {
		VarParamDeclContext _localctx = new VarParamDeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_varParamDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			varParamID();
			setState(330);
			match(COLON);
			setState(331);
			typeParamDef();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarParamIDContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(pascalParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pascalParser.COMA, i);
		}
		public VarParamIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varParamID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarParamID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarParamID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarParamID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarParamIDContext varParamID() throws RecognitionException {
		VarParamIDContext _localctx = new VarParamIDContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varParamID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(333);
			match(ID);
			}
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(334);
				match(COMA);
				{
				setState(335);
				match(ID);
				}
				}
				}
				setState(340);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamDefContext extends ParserRuleContext {
		public TypeParamNameContext typeParamName() {
			return getRuleContext(TypeParamNameContext.class,0);
		}
		public TypeParamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeParamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeParamDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeParamDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamDefContext typeParamDef() throws RecognitionException {
		TypeParamDefContext _localctx = new TypeParamDefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeParamDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			typeParamName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamNameContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(pascalParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(pascalParser.BOOL_TYPE, 0); }
		public TerminalNode STR_TYPE() { return getToken(pascalParser.STR_TYPE, 0); }
		public TypeParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeParamName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeParamName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamNameContext typeParamName() throws RecognitionException {
		TypeParamNameContext _localctx = new TypeParamNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeParamName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuctionUsageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(pascalParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pascalParser.COMA, i);
		}
		public FuctionUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuctionUsage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFuctionUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFuctionUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFuctionUsage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuctionUsageContext fuctionUsage() throws RecognitionException {
		FuctionUsageContext _localctx = new FuctionUsageContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fuctionUsage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(ID);
			setState(346);
			match(BRACKET_LEFT);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251812727947272L) != 0)) {
				{
				{
				setState(347);
				expression(0);
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(348);
					match(COMA);
					{
					setState(349);
					expression(0);
					}
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(357);
			match(BRACKET_RIGHT);
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(358);
				match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileBlockContext extends ParserRuleContext {
		public List<WhileDeclaContext> whileDecla() {
			return getRuleContexts(WhileDeclaContext.class);
		}
		public WhileDeclaContext whileDecla(int i) {
			return getRuleContext(WhileDeclaContext.class,i);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whileBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(361);
					whileDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(364); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileDeclaContext extends ParserRuleContext {
		public TerminalNode C_WHILE() { return getToken(pascalParser.C_WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode C_DO() { return getToken(pascalParser.C_DO, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<ForBlockContext> forBlock() {
			return getRuleContexts(ForBlockContext.class);
		}
		public ForBlockContext forBlock(int i) {
			return getRuleContext(ForBlockContext.class,i);
		}
		public List<RepeatBlockContext> repeatBlock() {
			return getRuleContexts(RepeatBlockContext.class);
		}
		public RepeatBlockContext repeatBlock(int i) {
			return getRuleContext(RepeatBlockContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<FuctionUsageContext> fuctionUsage() {
			return getRuleContexts(FuctionUsageContext.class);
		}
		public FuctionUsageContext fuctionUsage(int i) {
			return getRuleContext(FuctionUsageContext.class,i);
		}
		public List<Write_functionContext> write_function() {
			return getRuleContexts(Write_functionContext.class);
		}
		public Write_functionContext write_function(int i) {
			return getRuleContext(Write_functionContext.class,i);
		}
		public List<Read_functionContext> read_function() {
			return getRuleContexts(Read_functionContext.class);
		}
		public Read_functionContext read_function(int i) {
			return getRuleContext(Read_functionContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public WhileDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterWhileDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitWhileDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitWhileDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileDeclaContext whileDecla() throws RecognitionException {
		WhileDeclaContext _localctx = new WhileDeclaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(C_WHILE);
			setState(367);
			condition();
			setState(368);
			match(C_DO);
			setState(369);
			match(BEGIN);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2264044794806286L) != 0)) {
				{
				setState(378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(370);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(371);
					forBlock();
					}
					break;
				case 3:
					{
					setState(372);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(373);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(374);
					fuctionUsage();
					}
					break;
				case 6:
					{
					setState(375);
					write_function();
					}
					break;
				case 7:
					{
					setState(376);
					read_function();
					}
					break;
				case 8:
					{
					setState(377);
					sentence();
					}
					break;
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(END);
			setState(384);
			match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public ConditionvaliContext conditionvali() {
			return getRuleContext(ConditionvaliContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(BRACKET_LEFT);
			{
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(387);
				match(ID);
				}
				break;
			case 2:
				{
				setState(388);
				sentence();
				}
				break;
			}
			setState(391);
			conditionvali();
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(392);
				match(ID);
				}
				break;
			case 2:
				{
				setState(393);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(394);
				sentence();
				}
				break;
			}
			}
			setState(397);
			match(BRACKET_RIGHT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForBlockContext extends ParserRuleContext {
		public List<ForDeclaContext> forDecla() {
			return getRuleContexts(ForDeclaContext.class);
		}
		public ForDeclaContext forDecla(int i) {
			return getRuleContext(ForDeclaContext.class,i);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(399);
					forDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(402); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclaContext extends ParserRuleContext {
		public TerminalNode C_FOR() { return getToken(pascalParser.C_FOR, 0); }
		public ForconditionContext forcondition() {
			return getRuleContext(ForconditionContext.class,0);
		}
		public TerminalNode C_to() { return getToken(pascalParser.C_to, 0); }
		public TerminalNode C_DO() { return getToken(pascalParser.C_DO, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public WhileDeclaContext whileDecla() {
			return getRuleContext(WhileDeclaContext.class,0);
		}
		public ForDeclaContext forDecla() {
			return getRuleContext(ForDeclaContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<ForBlockContext> forBlock() {
			return getRuleContexts(ForBlockContext.class);
		}
		public ForBlockContext forBlock(int i) {
			return getRuleContext(ForBlockContext.class,i);
		}
		public List<RepeatBlockContext> repeatBlock() {
			return getRuleContexts(RepeatBlockContext.class);
		}
		public RepeatBlockContext repeatBlock(int i) {
			return getRuleContext(RepeatBlockContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<FuctionUsageContext> fuctionUsage() {
			return getRuleContexts(FuctionUsageContext.class);
		}
		public FuctionUsageContext fuctionUsage(int i) {
			return getRuleContext(FuctionUsageContext.class,i);
		}
		public List<Write_functionContext> write_function() {
			return getRuleContexts(Write_functionContext.class);
		}
		public Write_functionContext write_function(int i) {
			return getRuleContext(Write_functionContext.class,i);
		}
		public List<Read_functionContext> read_function() {
			return getRuleContexts(Read_functionContext.class);
		}
		public Read_functionContext read_function(int i) {
			return getRuleContext(Read_functionContext.class,i);
		}
		public ForDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterForDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitForDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitForDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclaContext forDecla() throws RecognitionException {
		ForDeclaContext _localctx = new ForDeclaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(C_FOR);
			setState(405);
			forcondition();
			setState(406);
			match(C_to);
			setState(407);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(408);
			match(C_DO);
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				{
				setState(409);
				match(BEGIN);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2264044794806286L) != 0)) {
					{
					setState(418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(410);
						whileBlock();
						}
						break;
					case 2:
						{
						setState(411);
						forBlock();
						}
						break;
					case 3:
						{
						setState(412);
						repeatBlock();
						}
						break;
					case 4:
						{
						setState(413);
						ifBlock();
						}
						break;
					case 5:
						{
						setState(414);
						fuctionUsage();
						}
						break;
					case 6:
						{
						setState(415);
						write_function();
						}
						break;
					case 7:
						{
						setState(416);
						read_function();
						}
						break;
					case 8:
						{
						setState(417);
						sentence();
						}
						break;
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				match(END);
				setState(424);
				match(SEMI_COLON);
				}
				}
				break;
			case 2:
				{
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case C_WHILE:
					{
					setState(425);
					whileDecla();
					}
					break;
				case C_FOR:
					{
					setState(426);
					forDecla();
					}
					break;
				case BRACKET_LEFT:
				case NUMBER:
				case TEXTCHAR:
				case TEXT:
				case TRUE:
				case FALSE:
				case ID:
					{
					setState(427);
					sentence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForconditionContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public ForconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterForcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitForcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitForcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForconditionContext forcondition() throws RecognitionException {
		ForconditionContext _localctx = new ForconditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(432);
			match(ID);
			}
			setState(433);
			match(ASSIGN);
			setState(434);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatBlockContext extends ParserRuleContext {
		public List<RepeatDeclaContext> repeatDecla() {
			return getRuleContexts(RepeatDeclaContext.class);
		}
		public RepeatDeclaContext repeatDecla(int i) {
			return getRuleContext(RepeatDeclaContext.class,i);
		}
		public RepeatBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRepeatBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRepeatBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRepeatBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatBlockContext repeatBlock() throws RecognitionException {
		RepeatBlockContext _localctx = new RepeatBlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_repeatBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(436);
					repeatDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(439); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatDeclaContext extends ParserRuleContext {
		public TerminalNode C_REPEAT() { return getToken(pascalParser.C_REPEAT, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public RepeatconditionContext repeatcondition() {
			return getRuleContext(RepeatconditionContext.class,0);
		}
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<ForBlockContext> forBlock() {
			return getRuleContexts(ForBlockContext.class);
		}
		public ForBlockContext forBlock(int i) {
			return getRuleContext(ForBlockContext.class,i);
		}
		public List<RepeatBlockContext> repeatBlock() {
			return getRuleContexts(RepeatBlockContext.class);
		}
		public RepeatBlockContext repeatBlock(int i) {
			return getRuleContext(RepeatBlockContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<FuctionUsageContext> fuctionUsage() {
			return getRuleContexts(FuctionUsageContext.class);
		}
		public FuctionUsageContext fuctionUsage(int i) {
			return getRuleContext(FuctionUsageContext.class,i);
		}
		public List<Write_functionContext> write_function() {
			return getRuleContexts(Write_functionContext.class);
		}
		public Write_functionContext write_function(int i) {
			return getRuleContext(Write_functionContext.class,i);
		}
		public List<Read_functionContext> read_function() {
			return getRuleContexts(Read_functionContext.class);
		}
		public Read_functionContext read_function(int i) {
			return getRuleContext(Read_functionContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public RepeatDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRepeatDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRepeatDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRepeatDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatDeclaContext repeatDecla() throws RecognitionException {
		RepeatDeclaContext _localctx = new RepeatDeclaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_repeatDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(C_REPEAT);
			setState(442);
			match(BEGIN);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2264044794806286L) != 0)) {
				{
				setState(451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(443);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(444);
					forBlock();
					}
					break;
				case 3:
					{
					setState(445);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(446);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(447);
					fuctionUsage();
					}
					break;
				case 6:
					{
					setState(448);
					write_function();
					}
					break;
				case 7:
					{
					setState(449);
					read_function();
					}
					break;
				case 8:
					{
					setState(450);
					sentence();
					}
					break;
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(END);
			setState(457);
			repeatcondition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatconditionContext extends ParserRuleContext {
		public TerminalNode C_UNTIL() { return getToken(pascalParser.C_UNTIL, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public ConditionvaliContext conditionvali() {
			return getRuleContext(ConditionvaliContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public RepeatconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRepeatcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRepeatcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRepeatcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatconditionContext repeatcondition() throws RecognitionException {
		RepeatconditionContext _localctx = new RepeatconditionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_repeatcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(C_UNTIL);
			{
			{
			setState(460);
			match(ID);
			}
			setState(461);
			conditionvali();
			{
			setState(462);
			match(ID);
			}
			}
			setState(464);
			match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public List<IfDeclaContext> ifDecla() {
			return getRuleContexts(IfDeclaContext.class);
		}
		public IfDeclaContext ifDecla(int i) {
			return getRuleContext(IfDeclaContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(466);
					ifDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(469); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfDeclaContext extends ParserRuleContext {
		public TerminalNode C_IF() { return getToken(pascalParser.C_IF, 0); }
		public IfconditionContext ifcondition() {
			return getRuleContext(IfconditionContext.class,0);
		}
		public TerminalNode C_THEN() { return getToken(pascalParser.C_THEN, 0); }
		public TerminalNode C_ELSE() { return getToken(pascalParser.C_ELSE, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<ForBlockContext> forBlock() {
			return getRuleContexts(ForBlockContext.class);
		}
		public ForBlockContext forBlock(int i) {
			return getRuleContext(ForBlockContext.class,i);
		}
		public List<RepeatBlockContext> repeatBlock() {
			return getRuleContexts(RepeatBlockContext.class);
		}
		public RepeatBlockContext repeatBlock(int i) {
			return getRuleContext(RepeatBlockContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<FuctionUsageContext> fuctionUsage() {
			return getRuleContexts(FuctionUsageContext.class);
		}
		public FuctionUsageContext fuctionUsage(int i) {
			return getRuleContext(FuctionUsageContext.class,i);
		}
		public List<Write_functionContext> write_function() {
			return getRuleContexts(Write_functionContext.class);
		}
		public Write_functionContext write_function(int i) {
			return getRuleContext(Write_functionContext.class,i);
		}
		public List<Read_functionContext> read_function() {
			return getRuleContexts(Read_functionContext.class);
		}
		public Read_functionContext read_function(int i) {
			return getRuleContext(Read_functionContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public IfDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIfDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIfDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIfDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDeclaContext ifDecla() throws RecognitionException {
		IfDeclaContext _localctx = new IfDeclaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ifDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(C_IF);
			setState(472);
			ifcondition();
			setState(473);
			match(C_THEN);
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				{
				setState(474);
				match(BEGIN);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2264044794806286L) != 0)) {
					{
					setState(483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(475);
						whileBlock();
						}
						break;
					case 2:
						{
						setState(476);
						forBlock();
						}
						break;
					case 3:
						{
						setState(477);
						repeatBlock();
						}
						break;
					case 4:
						{
						setState(478);
						ifBlock();
						}
						break;
					case 5:
						{
						setState(479);
						fuctionUsage();
						}
						break;
					case 6:
						{
						setState(480);
						write_function();
						}
						break;
					case 7:
						{
						setState(481);
						read_function();
						}
						break;
					case 8:
						{
						setState(482);
						sentence();
						}
						break;
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				match(END);
				setState(489);
				match(SEMI_COLON);
				}
				}
				break;
			case 2:
				{
				{
				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(490);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(491);
					forBlock();
					}
					break;
				case 3:
					{
					setState(492);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(493);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(494);
					fuctionUsage();
					}
					break;
				case 6:
					{
					setState(495);
					write_function();
					}
					break;
				case 7:
					{
					setState(496);
					read_function();
					}
					break;
				case 8:
					{
					setState(497);
					sentence();
					}
					break;
				}
				}
				}
				break;
			}
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(502);
				match(C_ELSE);
				setState(511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(503);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(504);
					forBlock();
					}
					break;
				case 3:
					{
					setState(505);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(506);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(507);
					fuctionUsage();
					}
					break;
				case 6:
					{
					setState(508);
					write_function();
					}
					break;
				case 7:
					{
					setState(509);
					read_function();
					}
					break;
				case 8:
					{
					setState(510);
					sentence();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfconditionContext extends ParserRuleContext {
		public ConditionvaliContext conditionvali() {
			return getRuleContext(ConditionvaliContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public IfconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIfcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIfcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIfcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfconditionContext ifcondition() throws RecognitionException {
		IfconditionContext _localctx = new IfconditionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ifcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(515);
			match(ID);
			}
			setState(516);
			conditionvali();
			setState(517);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799834656768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionvaliContext extends ParserRuleContext {
		public TerminalNode BOOLEANE() { return getToken(pascalParser.BOOLEANE, 0); }
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public ConditionvaliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionvali; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConditionvali(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConditionvali(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConditionvali(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionvaliContext conditionvali() throws RecognitionException {
		ConditionvaliContext _localctx = new ConditionvaliContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_conditionvali);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if ( !(_la==BOOLEANE || _la==EQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public TerminalNode SQBRACKET_LEFT() { return getToken(pascalParser.SQBRACKET_LEFT, 0); }
		public TerminalNode SQBRACKET_RIGHT() { return getToken(pascalParser.SQBRACKET_RIGHT, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public Array_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArray_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArray_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArray_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_callContext array_call() throws RecognitionException {
		Array_callContext _localctx = new Array_callContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_array_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ID);
			setState(522);
			match(SQBRACKET_LEFT);
			setState(523);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(524);
			match(SQBRACKET_RIGHT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arraybi_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public TerminalNode SQBRACKET_LEFT() { return getToken(pascalParser.SQBRACKET_LEFT, 0); }
		public TerminalNode COMA() { return getToken(pascalParser.COMA, 0); }
		public TerminalNode SQBRACKET_RIGHT() { return getToken(pascalParser.SQBRACKET_RIGHT, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(pascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(pascalParser.NUMBER, i);
		}
		public Arraybi_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybi_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArraybi_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArraybi_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArraybi_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybi_callContext arraybi_call() throws RecognitionException {
		Arraybi_callContext _localctx = new Arraybi_callContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arraybi_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(ID);
			setState(527);
			match(SQBRACKET_LEFT);
			setState(528);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(529);
			match(COMA);
			setState(530);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(531);
			match(SQBRACKET_RIGHT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Read_functionContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(pascalParser.READ, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public ReadIdContext readId() {
			return getRuleContext(ReadIdContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public Read_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRead_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRead_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRead_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_functionContext read_function() throws RecognitionException {
		Read_functionContext _localctx = new Read_functionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_read_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(READ);
			setState(534);
			match(BRACKET_LEFT);
			setState(535);
			readId();
			setState(536);
			match(BRACKET_RIGHT);
			setState(537);
			match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReadIdContext extends ParserRuleContext {
		public ReadIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readId; }
	 
		public ReadIdContext() { }
		public void copyFrom(ReadIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraybiReadContext extends ReadIdContext {
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public ArraybiReadContext(ReadIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArraybiRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArraybiRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArraybiRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdReadContext extends ReadIdContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public IdReadContext(ReadIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIdRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIdRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayReadContext extends ReadIdContext {
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public ArrayReadContext(ReadIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrayRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrayRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrayRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadIdContext readId() throws RecognitionException {
		ReadIdContext _localctx = new ReadIdContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_readId);
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new IdReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				array_call();
				}
				break;
			case 3:
				_localctx = new ArraybiReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				arraybi_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Write_functionContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(pascalParser.WRITE, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public WriteIdContext writeId() {
			return getRuleContext(WriteIdContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public Write_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterWrite_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitWrite_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitWrite_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_functionContext write_function() throws RecognitionException {
		Write_functionContext _localctx = new Write_functionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_write_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(WRITE);
			setState(545);
			match(BRACKET_LEFT);
			setState(546);
			writeId();
			setState(547);
			match(BRACKET_RIGHT);
			setState(548);
			match(SEMI_COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteIdContext extends ParserRuleContext {
		public WriteIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeId; }
	 
		public WriteIdContext() { }
		public void copyFrom(WriteIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdWriteContext extends WriteIdContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TerminalNode COMA() { return getToken(pascalParser.COMA, 0); }
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public IdWriteContext(WriteIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIdWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIdWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraybiWriteContext extends WriteIdContext {
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public ArraybiWriteContext(WriteIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArraybiWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArraybiWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArraybiWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdTextContext extends WriteIdContext {
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public IdTextContext(WriteIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIdText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIdText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIdText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayWriteContext extends WriteIdContext {
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public ArrayWriteContext(WriteIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrayWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrayWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrayWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteIdContext writeId() throws RecognitionException {
		WriteIdContext _localctx = new WriteIdContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_writeId);
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new IdWriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IdWriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(TEXT);
				setState(552);
				match(COMA);
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(553);
					match(ID);
					}
					break;
				case 2:
					{
					setState(554);
					array_call();
					}
					break;
				case 3:
					{
					setState(555);
					arraybi_call();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ArrayWriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				array_call();
				}
				break;
			case 4:
				_localctx = new ArraybiWriteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(559);
				arraybi_call();
				}
				break;
			case 5:
				_localctx = new IdTextContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(560);
				match(TEXT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0234\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000k"+
		"\b\u0000\u0001\u0000\u0003\u0000n\b\u0000\u0001\u0000\u0003\u0000q\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001z\b\u0001\n\u0001\f\u0001}\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0088\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u008c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009b\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00ac\b\u0005\n\u0005\f\u0005\u00af"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b4\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00bd\b\u0007\u0001\b\u0001\b\u0004\b\u00c1\b"+
		"\b\u000b\b\f\b\u00c2\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00cd\b\n\n\n\f\n\u00d0\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d9\b\f\u0001\r\u0001"+
		"\r\u0003\r\u00dd\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0004"+
		"\u0012\u00fb\b\u0012\u000b\u0012\f\u0012\u00fc\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0101\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016"+
		"\u0112\b\u0016\u000b\u0016\f\u0016\u0113\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u011d"+
		"\b\u0017\u0001\u0017\u0003\u0017\u0120\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u012b\b\u0017\n\u0017\f\u0017\u012e\t\u0017\u0001"+
		"\u0017\u0005\u0017\u0131\b\u0017\n\u0017\f\u0017\u0134\t\u0017\u0001\u0017"+
		"\u0003\u0017\u0137\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u013e\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0004\u001a\u0146\b\u001a\u000b\u001a"+
		"\f\u001a\u0147\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0151\b\u001c\n\u001c\f\u001c\u0154"+
		"\t\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u015f\b\u001f\n"+
		"\u001f\f\u001f\u0162\t\u001f\u0003\u001f\u0164\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0168\b\u001f\u0001 \u0004 \u016b\b \u000b \f \u016c"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0005!\u017b\b!\n!\f!\u017e\t!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u0186\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u018c\b\"\u0001\"\u0001\"\u0001#\u0004#\u0191\b#\u000b#\f#\u0192\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u01a3\b$\n$\f$\u01a6\t$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u01ad\b$\u0003$\u01af\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0004&\u01b6\b&\u000b&\f&\u01b7\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01c4\b\'\n"+
		"\'\f\'\u01c7\t\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0004)\u01d4\b)\u000b)\f)\u01d5\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005"+
		"*\u01e4\b*\n*\f*\u01e7\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u01f3\b*\u0003*\u01f5\b*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0200\b*\u0003*\u0202"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00030\u021f\b0\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00032\u022d\b2\u00012\u00012\u00012\u00032\u0232\b2\u00012\u0000"+
		"\u0001\n3\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0004"+
		"\u0001\u0000\n\r\u0003\u0000\u0016\u0016\u0018\u001833\u0002\u0000\u0016"+
		"\u001633\u0001\u0000\"#\u027d\u0000f\u0001\u0000\u0000\u0000\u0002{\u0001"+
		"\u0000\u0000\u0000\u0004\u0087\u0001\u0000\u0000\u0000\u0006\u008b\u0001"+
		"\u0000\u0000\u0000\b\u008d\u0001\u0000\u0000\u0000\n\u009a\u0001\u0000"+
		"\u0000\u0000\f\u00b3\u0001\u0000\u0000\u0000\u000e\u00bc\u0001\u0000\u0000"+
		"\u0000\u0010\u00be\u0001\u0000\u0000\u0000\u0012\u00c4\u0001\u0000\u0000"+
		"\u0000\u0014\u00c9\u0001\u0000\u0000\u0000\u0016\u00d1\u0001\u0000\u0000"+
		"\u0000\u0018\u00d8\u0001\u0000\u0000\u0000\u001a\u00dc\u0001\u0000\u0000"+
		"\u0000\u001c\u00de\u0001\u0000\u0000\u0000\u001e\u00e7\u0001\u0000\u0000"+
		"\u0000 \u00f4\u0001\u0000\u0000\u0000\"\u00f6\u0001\u0000\u0000\u0000"+
		"$\u00f8\u0001\u0000\u0000\u0000&\u0100\u0001\u0000\u0000\u0000(\u0102"+
		"\u0001\u0000\u0000\u0000*\u0109\u0001\u0000\u0000\u0000,\u0111\u0001\u0000"+
		"\u0000\u0000.\u0115\u0001\u0000\u0000\u00000\u013b\u0001\u0000\u0000\u0000"+
		"2\u0141\u0001\u0000\u0000\u00004\u0143\u0001\u0000\u0000\u00006\u0149"+
		"\u0001\u0000\u0000\u00008\u014d\u0001\u0000\u0000\u0000:\u0155\u0001\u0000"+
		"\u0000\u0000<\u0157\u0001\u0000\u0000\u0000>\u0159\u0001\u0000\u0000\u0000"+
		"@\u016a\u0001\u0000\u0000\u0000B\u016e\u0001\u0000\u0000\u0000D\u0182"+
		"\u0001\u0000\u0000\u0000F\u0190\u0001\u0000\u0000\u0000H\u0194\u0001\u0000"+
		"\u0000\u0000J\u01b0\u0001\u0000\u0000\u0000L\u01b5\u0001\u0000\u0000\u0000"+
		"N\u01b9\u0001\u0000\u0000\u0000P\u01cb\u0001\u0000\u0000\u0000R\u01d3"+
		"\u0001\u0000\u0000\u0000T\u01d7\u0001\u0000\u0000\u0000V\u0203\u0001\u0000"+
		"\u0000\u0000X\u0207\u0001\u0000\u0000\u0000Z\u0209\u0001\u0000\u0000\u0000"+
		"\\\u020e\u0001\u0000\u0000\u0000^\u0215\u0001\u0000\u0000\u0000`\u021e"+
		"\u0001\u0000\u0000\u0000b\u0220\u0001\u0000\u0000\u0000d\u0231\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0007\u0000\u0000gh\u00053\u0000\u0000hj\u0005\u001a"+
		"\u0000\u0000ik\u0003\u0010\b\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000km\u0001\u0000\u0000\u0000ln\u0003$\u0012\u0000ml\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000oq\u0003"+
		",\u0016\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0005\b\u0000\u0000st\u0003\u0002\u0001\u0000tu\u0005"+
		"\t\u0000\u0000uv\u0005\u001f\u0000\u0000vw\u0005\u0000\u0000\u0001w\u0001"+
		"\u0001\u0000\u0000\u0000xz\u0003\u0004\u0002\u0000yx\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|\u0003\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"~\u0088\u0003@ \u0000\u007f\u0088\u0003F#\u0000\u0080\u0088\u0003L&\u0000"+
		"\u0081\u0088\u0003R)\u0000\u0082\u0088\u0003>\u001f\u0000\u0083\u0088"+
		"\u0003b1\u0000\u0084\u0088\u0003^/\u0000\u0085\u0088\u0003\u0006\u0003"+
		"\u0000\u0086\u0088\u0005\u0018\u0000\u0000\u0087~\u0001\u0000\u0000\u0000"+
		"\u0087\u007f\u0001\u0000\u0000\u0000\u0087\u0080\u0001\u0000\u0000\u0000"+
		"\u0087\u0081\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000"+
		"\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0005\u0001\u0000\u0000\u0000\u0089\u008c\u0003\b\u0004\u0000\u008a"+
		"\u008c\u0003\n\u0005\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u0007\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0003\f\u0006\u0000\u008e\u008f\u0005\u0015\u0000\u0000\u008f\u0090\u0003"+
		"\n\u0005\u0000\u0090\u0091\u0005\u001a\u0000\u0000\u0091\t\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0006\u0005\uffff\uffff\u0000\u0093\u0094\u0005"+
		"\u0003\u0000\u0000\u0094\u0095\u0003\n\u0005\u0000\u0095\u0096\u0005\u0004"+
		"\u0000\u0000\u0096\u009b\u0001\u0000\u0000\u0000\u0097\u009b\u0003\u000e"+
		"\u0007\u0000\u0098\u009b\u0003Z-\u0000\u0099\u009b\u0003\\.\u0000\u009a"+
		"\u0092\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u00ad\u0001\u0000\u0000\u0000\u009c\u009d\n\b\u0000\u0000\u009d\u009e"+
		"\u00050\u0000\u0000\u009e\u00ac\u0003\n\u0005\t\u009f\u00a0\n\u0007\u0000"+
		"\u0000\u00a0\u00a1\u00051\u0000\u0000\u00a1\u00ac\u0003\n\u0005\b\u00a2"+
		"\u00a3\n\u0006\u0000\u0000\u00a3\u00a4\u00052\u0000\u0000\u00a4\u00ac"+
		"\u0003\n\u0005\u0007\u00a5\u00a6\n\u0005\u0000\u0000\u00a6\u00a7\u0005"+
		".\u0000\u0000\u00a7\u00ac\u0003\n\u0005\u0006\u00a8\u00a9\n\u0004\u0000"+
		"\u0000\u00a9\u00aa\u0005/\u0000\u0000\u00aa\u00ac\u0003\n\u0005\u0005"+
		"\u00ab\u009c\u0001\u0000\u0000\u0000\u00ab\u009f\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a2\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u000b\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b4\u00053\u0000\u0000\u00b1\u00b4\u0003Z-\u0000\u00b2\u00b4"+
		"\u0003\\.\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\r\u0001\u0000"+
		"\u0000\u0000\u00b5\u00bd\u0003>\u001f\u0000\u00b6\u00bd\u0005\u0018\u0000"+
		"\u0000\u00b7\u00bd\u0005\u0016\u0000\u0000\u00b8\u00bd\u00053\u0000\u0000"+
		"\u00b9\u00bd\u0005\u0017\u0000\u0000\u00ba\u00bd\u0005 \u0000\u0000\u00bb"+
		"\u00bd\u0005!\u0000\u0000\u00bc\u00b5\u0001\u0000\u0000\u0000\u00bc\u00b6"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bc\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u000f"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\u0005\u000e\u0000\u0000\u00bf\u00c1"+
		"\u0003\u0012\t\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u0011\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003"+
		"\u0014\n\u0000\u00c5\u00c6\u0005\u0019\u0000\u0000\u00c6\u00c7\u0003\u0016"+
		"\u000b\u0000\u00c7\u00c8\u0005\u001a\u0000\u0000\u00c8\u0013\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ce\u00053\u0000\u0000\u00ca\u00cb\u0005\u001b\u0000"+
		"\u0000\u00cb\u00cd\u00053\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u0015\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003\u0018\f\u0000\u00d2"+
		"\u0017\u0001\u0000\u0000\u0000\u00d3\u00d9\u0005\n\u0000\u0000\u00d4\u00d9"+
		"\u0005\r\u0000\u0000\u00d5\u00d9\u0005\f\u0000\u0000\u00d6\u00d9\u0005"+
		"\u000b\u0000\u0000\u00d7\u00d9\u0003\u001a\r\u0000\u00d8\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u0019\u0001\u0000\u0000\u0000\u00da\u00dd\u0003\u001c"+
		"\u000e\u0000\u00db\u00dd\u0003\u001e\u000f\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u001b\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005\u000f\u0000\u0000\u00df\u00e0\u0005\u0005"+
		"\u0000\u0000\u00e0\u00e1\u0003\"\u0011\u0000\u00e1\u00e2\u0005\u001c\u0000"+
		"\u0000\u00e2\u00e3\u0003\"\u0011\u0000\u00e3\u00e4\u0005\u0006\u0000\u0000"+
		"\u00e4\u00e5\u0005\u0010\u0000\u0000\u00e5\u00e6\u0003 \u0010\u0000\u00e6"+
		"\u001d\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u000f\u0000\u0000\u00e8"+
		"\u00e9\u0005\u0005\u0000\u0000\u00e9\u00ea\u0003\"\u0011\u0000\u00ea\u00eb"+
		"\u0005\u001c\u0000\u0000\u00eb\u00ec\u0003\"\u0011\u0000\u00ec\u00ed\u0005"+
		"\u001b\u0000\u0000\u00ed\u00ee\u0003\"\u0011\u0000\u00ee\u00ef\u0005\u001c"+
		"\u0000\u0000\u00ef\u00f0\u0003\"\u0011\u0000\u00f0\u00f1\u0005\u0006\u0000"+
		"\u0000\u00f1\u00f2\u0005\u0010\u0000\u0000\u00f2\u00f3\u0003 \u0010\u0000"+
		"\u00f3\u001f\u0001\u0000\u0000\u0000\u00f4\u00f5\u0007\u0000\u0000\u0000"+
		"\u00f5!\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0016\u0000\u0000\u00f7"+
		"#\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005\u0011\u0000\u0000\u00f9\u00fb"+
		"\u0003&\u0013\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd%\u0001\u0000\u0000\u0000\u00fe\u0101\u0003(\u0014"+
		"\u0000\u00ff\u0101\u0003*\u0015\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\'\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005\u0012\u0000\u0000\u0103\u0104\u0005\u0019\u0000\u0000\u0104"+
		"\u0105\u00053\u0000\u0000\u0105\u0106\u0005#\u0000\u0000\u0106\u0107\u0005"+
		"\u0017\u0000\u0000\u0107\u0108\u0005\u001a\u0000\u0000\u0108)\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\u0013\u0000\u0000\u010a\u010b\u0005\u0019"+
		"\u0000\u0000\u010b\u010c\u00053\u0000\u0000\u010c\u010d\u0005#\u0000\u0000"+
		"\u010d\u010e\u0005\u0018\u0000\u0000\u010e\u010f\u0005\u001a\u0000\u0000"+
		"\u010f+\u0001\u0000\u0000\u0000\u0110\u0112\u0003.\u0017\u0000\u0111\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114-\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0005$\u0000\u0000\u0116\u0117\u00053\u0000"+
		"\u0000\u0117\u0118\u00030\u0018\u0000\u0118\u0119\u0005\u0019\u0000\u0000"+
		"\u0119\u011a\u00032\u0019\u0000\u011a\u011c\u0005\u001a\u0000\u0000\u011b"+
		"\u011d\u0003\u0010\b\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0120"+
		"\u0003,\u0016\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u012c\u0005"+
		"\b\u0000\u0000\u0122\u012b\u0003@ \u0000\u0123\u012b\u0003F#\u0000\u0124"+
		"\u012b\u0003L&\u0000\u0125\u012b\u0003R)\u0000\u0126\u012b\u0003\b\u0004"+
		"\u0000\u0127\u012b\u0003>\u001f\u0000\u0128\u012b\u0003b1\u0000\u0129"+
		"\u012b\u0003^/\u0000\u012a\u0122\u0001\u0000\u0000\u0000\u012a\u0123\u0001"+
		"\u0000\u0000\u0000\u012a\u0124\u0001\u0000\u0000\u0000\u012a\u0125\u0001"+
		"\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0127\u0001"+
		"\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0132\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0131\u0007"+
		"\u0001\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0135\u0137\u0003\b\u0004\u0000\u0136\u0135\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005\t\u0000\u0000\u0139\u013a\u0005\u001a\u0000"+
		"\u0000\u013a/\u0001\u0000\u0000\u0000\u013b\u013d\u0005\u0003\u0000\u0000"+
		"\u013c\u013e\u00034\u001a\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005\u0004\u0000\u0000\u01401\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0007\u0000\u0000\u0000\u01423\u0001\u0000\u0000\u0000\u0143\u0145\u0005"+
		"\u000e\u0000\u0000\u0144\u0146\u00036\u001b\u0000\u0145\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u01485\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u00038\u001c\u0000\u014a\u014b\u0005\u0019\u0000\u0000"+
		"\u014b\u014c\u0003:\u001d\u0000\u014c7\u0001\u0000\u0000\u0000\u014d\u0152"+
		"\u00053\u0000\u0000\u014e\u014f\u0005\u001b\u0000\u0000\u014f\u0151\u0005"+
		"3\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u01539\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0003<\u001e\u0000\u0156;\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0007\u0000\u0000\u0000\u0158=\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u00053\u0000\u0000\u015a\u0163\u0005\u0003\u0000\u0000\u015b\u0160\u0003"+
		"\n\u0005\u0000\u015c\u015d\u0005\u001b\u0000\u0000\u015d\u015f\u0003\n"+
		"\u0005\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000"+
		"\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0163\u015b\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0005\u0004"+
		"\u0000\u0000\u0166\u0168\u0005\u001a\u0000\u0000\u0167\u0166\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168?\u0001\u0000\u0000"+
		"\u0000\u0169\u016b\u0003B!\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0001\u0000\u0000\u0000\u016dA\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005%\u0000\u0000\u016f\u0170\u0003D\"\u0000\u0170\u0171\u0005&\u0000"+
		"\u0000\u0171\u017c\u0005\b\u0000\u0000\u0172\u017b\u0003@ \u0000\u0173"+
		"\u017b\u0003F#\u0000\u0174\u017b\u0003L&\u0000\u0175\u017b\u0003R)\u0000"+
		"\u0176\u017b\u0003>\u001f\u0000\u0177\u017b\u0003b1\u0000\u0178\u017b"+
		"\u0003^/\u0000\u0179\u017b\u0003\u0006\u0003\u0000\u017a\u0172\u0001\u0000"+
		"\u0000\u0000\u017a\u0173\u0001\u0000\u0000\u0000\u017a\u0174\u0001\u0000"+
		"\u0000\u0000\u017a\u0175\u0001\u0000\u0000\u0000\u017a\u0176\u0001\u0000"+
		"\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000"+
		"\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0005\t\u0000\u0000\u0180\u0181\u0005\u001a\u0000"+
		"\u0000\u0181C\u0001\u0000\u0000\u0000\u0182\u0185\u0005\u0003\u0000\u0000"+
		"\u0183\u0186\u00053\u0000\u0000\u0184\u0186\u0003\u0006\u0003\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u018b\u0003X,\u0000\u0188\u018c\u0005"+
		"3\u0000\u0000\u0189\u018c\u0005\u0016\u0000\u0000\u018a\u018c\u0003\u0006"+
		"\u0003\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000"+
		"\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0005\u0004\u0000\u0000\u018eE\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0003H$\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193G\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0005(\u0000\u0000\u0195\u0196\u0003J%\u0000\u0196\u0197\u0005\'\u0000"+
		"\u0000\u0197\u0198\u0007\u0002\u0000\u0000\u0198\u01ae\u0005&\u0000\u0000"+
		"\u0199\u01a4\u0005\b\u0000\u0000\u019a\u01a3\u0003@ \u0000\u019b\u01a3"+
		"\u0003F#\u0000\u019c\u01a3\u0003L&\u0000\u019d\u01a3\u0003R)\u0000\u019e"+
		"\u01a3\u0003>\u001f\u0000\u019f\u01a3\u0003b1\u0000\u01a0\u01a3\u0003"+
		"^/\u0000\u01a1\u01a3\u0003\u0006\u0003\u0000\u01a2\u019a\u0001\u0000\u0000"+
		"\u0000\u01a2\u019b\u0001\u0000\u0000\u0000\u01a2\u019c\u0001\u0000\u0000"+
		"\u0000\u01a2\u019d\u0001\u0000\u0000\u0000\u01a2\u019e\u0001\u0000\u0000"+
		"\u0000\u01a2\u019f\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005\t\u0000\u0000\u01a8\u01af\u0005\u001a\u0000\u0000"+
		"\u01a9\u01ad\u0003B!\u0000\u01aa\u01ad\u0003H$\u0000\u01ab\u01ad\u0003"+
		"\u0006\u0003\u0000\u01ac\u01a9\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01af\u0001"+
		"\u0000\u0000\u0000\u01ae\u0199\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01afI\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u00053\u0000\u0000\u01b1\u01b2\u0005\u0015\u0000"+
		"\u0000\u01b2\u01b3\u0007\u0002\u0000\u0000\u01b3K\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0003N\'\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8M\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u0005)\u0000\u0000\u01ba\u01c5\u0005\b\u0000\u0000\u01bb\u01c4\u0003"+
		"@ \u0000\u01bc\u01c4\u0003F#\u0000\u01bd\u01c4\u0003L&\u0000\u01be\u01c4"+
		"\u0003R)\u0000\u01bf\u01c4\u0003>\u001f\u0000\u01c0\u01c4\u0003b1\u0000"+
		"\u01c1\u01c4\u0003^/\u0000\u01c2\u01c4\u0003\u0006\u0003\u0000\u01c3\u01bb"+
		"\u0001\u0000\u0000\u0000\u01c3\u01bc\u0001\u0000\u0000\u0000\u01c3\u01bd"+
		"\u0001\u0000\u0000\u0000\u01c3\u01be\u0001\u0000\u0000\u0000\u01c3\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\t\u0000\u0000\u01c9\u01ca\u0003"+
		"P(\u0000\u01caO\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005*\u0000\u0000"+
		"\u01cc\u01cd\u00053\u0000\u0000\u01cd\u01ce\u0003X,\u0000\u01ce\u01cf"+
		"\u00053\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005"+
		"\u001a\u0000\u0000\u01d1Q\u0001\u0000\u0000\u0000\u01d2\u01d4\u0003T*"+
		"\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d6S\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005+\u0000\u0000\u01d8"+
		"\u01d9\u0003V+\u0000\u01d9\u01f4\u0005,\u0000\u0000\u01da\u01e5\u0005"+
		"\b\u0000\u0000\u01db\u01e4\u0003@ \u0000\u01dc\u01e4\u0003F#\u0000\u01dd"+
		"\u01e4\u0003L&\u0000\u01de\u01e4\u0003R)\u0000\u01df\u01e4\u0003>\u001f"+
		"\u0000\u01e0\u01e4\u0003b1\u0000\u01e1\u01e4\u0003^/\u0000\u01e2\u01e4"+
		"\u0003\u0006\u0003\u0000\u01e3\u01db\u0001\u0000\u0000\u0000\u01e3\u01dc"+
		"\u0001\u0000\u0000\u0000\u01e3\u01dd\u0001\u0000\u0000\u0000\u01e3\u01de"+
		"\u0001\u0000\u0000\u0000\u01e3\u01df\u0001\u0000\u0000\u0000\u01e3\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0005\t\u0000\u0000\u01e9\u01f5\u0005\u001a\u0000\u0000\u01ea\u01f3\u0003"+
		"@ \u0000\u01eb\u01f3\u0003F#\u0000\u01ec\u01f3\u0003L&\u0000\u01ed\u01f3"+
		"\u0003R)\u0000\u01ee\u01f3\u0003>\u001f\u0000\u01ef\u01f3\u0003b1\u0000"+
		"\u01f0\u01f3\u0003^/\u0000\u01f1\u01f3\u0003\u0006\u0003\u0000\u01f2\u01ea"+
		"\u0001\u0000\u0000\u0000\u01f2\u01eb\u0001\u0000\u0000\u0000\u01f2\u01ec"+
		"\u0001\u0000\u0000\u0000\u01f2\u01ed\u0001\u0000\u0000\u0000\u01f2\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f2\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f4\u01da\u0001\u0000\u0000\u0000\u01f4\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u0201"+
		"\u0001\u0000\u0000\u0000\u01f6\u01ff\u0005-\u0000\u0000\u01f7\u0200\u0003"+
		"@ \u0000\u01f8\u0200\u0003F#\u0000\u01f9\u0200\u0003L&\u0000\u01fa\u0200"+
		"\u0003R)\u0000\u01fb\u0200\u0003>\u001f\u0000\u01fc\u0200\u0003b1\u0000"+
		"\u01fd\u0200\u0003^/\u0000\u01fe\u0200\u0003\u0006\u0003\u0000\u01ff\u01f7"+
		"\u0001\u0000\u0000\u0000\u01ff\u01f8\u0001\u0000\u0000\u0000\u01ff\u01f9"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fa\u0001\u0000\u0000\u0000\u01ff\u01fb"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fc\u0001\u0000\u0000\u0000\u01ff\u01fd"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0202"+
		"\u0001\u0000\u0000\u0000\u0201\u01f6\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0001\u0000\u0000\u0000\u0202U\u0001\u0000\u0000\u0000\u0203\u0204\u0005"+
		"3\u0000\u0000\u0204\u0205\u0003X,\u0000\u0205\u0206\u0007\u0001\u0000"+
		"\u0000\u0206W\u0001\u0000\u0000\u0000\u0207\u0208\u0007\u0003\u0000\u0000"+
		"\u0208Y\u0001\u0000\u0000\u0000\u0209\u020a\u00053\u0000\u0000\u020a\u020b"+
		"\u0005\u0005\u0000\u0000\u020b\u020c\u0007\u0002\u0000\u0000\u020c\u020d"+
		"\u0005\u0006\u0000\u0000\u020d[\u0001\u0000\u0000\u0000\u020e\u020f\u0005"+
		"3\u0000\u0000\u020f\u0210\u0005\u0005\u0000\u0000\u0210\u0211\u0007\u0002"+
		"\u0000\u0000\u0211\u0212\u0005\u001b\u0000\u0000\u0212\u0213\u0007\u0002"+
		"\u0000\u0000\u0213\u0214\u0005\u0006\u0000\u0000\u0214]\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0005\u0001\u0000\u0000\u0216\u0217\u0005\u0003\u0000"+
		"\u0000\u0217\u0218\u0003`0\u0000\u0218\u0219\u0005\u0004\u0000\u0000\u0219"+
		"\u021a\u0005\u001a\u0000\u0000\u021a_\u0001\u0000\u0000\u0000\u021b\u021f"+
		"\u00053\u0000\u0000\u021c\u021f\u0003Z-\u0000\u021d\u021f\u0003\\.\u0000"+
		"\u021e\u021b\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u021d\u0001\u0000\u0000\u0000\u021fa\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0005\u0002\u0000\u0000\u0221\u0222\u0005\u0003\u0000\u0000\u0222"+
		"\u0223\u0003d2\u0000\u0223\u0224\u0005\u0004\u0000\u0000\u0224\u0225\u0005"+
		"\u001a\u0000\u0000\u0225c\u0001\u0000\u0000\u0000\u0226\u0232\u00053\u0000"+
		"\u0000\u0227\u0228\u0005\u0018\u0000\u0000\u0228\u022c\u0005\u001b\u0000"+
		"\u0000\u0229\u022d\u00053\u0000\u0000\u022a\u022d\u0003Z-\u0000\u022b"+
		"\u022d\u0003\\.\u0000\u022c\u0229\u0001\u0000\u0000\u0000\u022c\u022a"+
		"\u0001\u0000\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0232"+
		"\u0001\u0000\u0000\u0000\u022e\u0232\u0003Z-\u0000\u022f\u0232\u0003\\"+
		".\u0000\u0230\u0232\u0005\u0018\u0000\u0000\u0231\u0226\u0001\u0000\u0000"+
		"\u0000\u0231\u0227\u0001\u0000\u0000\u0000\u0231\u022e\u0001\u0000\u0000"+
		"\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0230\u0001\u0000\u0000"+
		"\u0000\u0232e\u0001\u0000\u0000\u00005jmp{\u0087\u008b\u009a\u00ab\u00ad"+
		"\u00b3\u00bc\u00c2\u00ce\u00d8\u00dc\u00fc\u0100\u0113\u011c\u011f\u012a"+
		"\u012c\u0132\u0136\u013d\u0147\u0152\u0160\u0163\u0167\u016c\u017a\u017c"+
		"\u0185\u018b\u0192\u01a2\u01a4\u01ac\u01ae\u01b7\u01c3\u01c5\u01d5\u01e3"+
		"\u01e5\u01f2\u01f4\u01ff\u0201\u021e\u022c\u0231";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}