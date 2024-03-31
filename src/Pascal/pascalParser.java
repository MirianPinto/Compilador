// Generated from C:/Users/miria/IdeaProjects/Compilador/src/Grammar/pascal.g4 by ANTLR 4.13.1
package Pascal;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, WRITE=2, BRACKET_LEFT=3, BRACKET_RIGHT=4, SQBRACKET_LEFT=5, SQBRACKET_RIGHT=6, 
		PROGRAM=7, BEGIN=8, END=9, INT_TYPE=10, STR_TYPE=11, BOOL_TYPE=12, CHAR_TYPE=13, 
		VAR=14, ARRAY=15, OF=16, CONST=17, CONST_CHAR=18, CONST_STRING=19, ARRAY_OF=20, 
		EQUAL=21, ASSIGN=22, NUMBER=23, TEXT=24, COLON=25, SEMI_COLON=26, COMA=27, 
		DOBLEDOTS=28, QUATATION_MARK=29, DOUBLE_QUOTATION_MARK=30, DOT=31, TRUE=32, 
		FALSE=33, BOOLEANE=34, FUNCTION=35, C_WHILE=36, C_DO=37, C_to=38, C_FOR=39, 
		C_REPEAT=40, C_UNTIL=41, C_IF=42, C_THEN=43, ID=44, WS=45, COMMENT=46, 
		PLUS=47, MINUS=48, MULT=49, DIV=50, MOD=51;
	public static final int
		RULE_main = 0, RULE_sentence = 1, RULE_assign = 2, RULE_expression = 3, 
		RULE_varBlock = 4, RULE_varDecl = 5, RULE_varID = 6, RULE_typeDef = 7, 
		RULE_typeName = 8, RULE_arrDecl = 9, RULE_arr1D = 10, RULE_arr2D = 11, 
		RULE_typearray = 12, RULE_constBlock = 13, RULE_constDecl = 14, RULE_constCharDecl = 15, 
		RULE_constStrDecl = 16, RULE_functionBlock = 17, RULE_functionDecl = 18, 
		RULE_params = 19, RULE_returnType = 20, RULE_varParamBlock = 21, RULE_varParamDecl = 22, 
		RULE_varParamID = 23, RULE_typeParamDef = 24, RULE_typeParamName = 25, 
		RULE_fuctionUsage = 26, RULE_whileBlock = 27, RULE_whileDecla = 28, RULE_condition = 29, 
		RULE_forBlock = 30, RULE_forDecla = 31, RULE_forcondition = 32, RULE_repeatBlock = 33, 
		RULE_repeatDecla = 34, RULE_repeatcondition = 35, RULE_ifBlock = 36, RULE_ifDecla = 37, 
		RULE_ifcondition = 38, RULE_array_call = 39, RULE_arraybi_call = 40, RULE_read_function = 41, 
		RULE_readId = 42, RULE_write_function = 43, RULE_writeId = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentence", "assign", "expression", "varBlock", "varDecl", "varID", 
			"typeDef", "typeName", "arrDecl", "arr1D", "arr2D", "typearray", "constBlock", 
			"constDecl", "constCharDecl", "constStrDecl", "functionBlock", "functionDecl", 
			"params", "returnType", "varParamBlock", "varParamDecl", "varParamID", 
			"typeParamDef", "typeParamName", "fuctionUsage", "whileBlock", "whileDecla", 
			"condition", "forBlock", "forDecla", "forcondition", "repeatBlock", "repeatDecla", 
			"repeatcondition", "ifBlock", "ifDecla", "ifcondition", "array_call", 
			"arraybi_call", "read_function", "readId", "write_function", "writeId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", null, "'('", "')'", "'['", "']'", "'program'", "'begin'", 
			"'end'", "'integer'", "'string'", "'boolean'", "'char'", "'var'", "'array'", 
			"'of'", "'const'", "'constchar'", "'conststr'", "'array of'", "'='", 
			"':='", null, null, "':'", "';'", "','", "'..'", "'''", "'\"'", "'.'", 
			"'true'", "'false'", null, "'function'", "'while'", "'do'", null, "'for'", 
			"'repeat'", "'until'", "'if'", "'then'", null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READ", "WRITE", "BRACKET_LEFT", "BRACKET_RIGHT", "SQBRACKET_LEFT", 
			"SQBRACKET_RIGHT", "PROGRAM", "BEGIN", "END", "INT_TYPE", "STR_TYPE", 
			"BOOL_TYPE", "CHAR_TYPE", "VAR", "ARRAY", "OF", "CONST", "CONST_CHAR", 
			"CONST_STRING", "ARRAY_OF", "EQUAL", "ASSIGN", "NUMBER", "TEXT", "COLON", 
			"SEMI_COLON", "COMA", "DOBLEDOTS", "QUATATION_MARK", "DOUBLE_QUOTATION_MARK", 
			"DOT", "TRUE", "FALSE", "BOOLEANE", "FUNCTION", "C_WHILE", "C_DO", "C_to", 
			"C_FOR", "C_REPEAT", "C_UNTIL", "C_IF", "C_THEN", "ID", "WS", "COMMENT", 
			"PLUS", "MINUS", "MULT", "DIV", "MOD"
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
		public List<TerminalNode> TEXT() { return getTokens(pascalParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(pascalParser.TEXT, i);
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
			setState(90);
			match(PROGRAM);
			setState(91);
			match(ID);
			setState(92);
			match(SEMI_COLON);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(93);
				varBlock();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(96);
				constBlock();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(99);
				functionBlock();
				}
			}

			setState(102);
			match(BEGIN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23708244639758L) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(103);
					match(TEXT);
					}
					break;
				case 2:
					{
					setState(104);
					whileBlock();
					}
					break;
				case 3:
					{
					setState(105);
					forBlock();
					}
					break;
				case 4:
					{
					setState(106);
					repeatBlock();
					}
					break;
				case 5:
					{
					setState(107);
					ifBlock();
					}
					break;
				case 6:
					{
					setState(108);
					fuctionUsage();
					}
					break;
				case 7:
					{
					setState(109);
					write_function();
					}
					break;
				case 8:
					{
					setState(110);
					read_function();
					}
					break;
				case 9:
					{
					setState(111);
					sentence();
					}
					break;
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(END);
			setState(118);
			match(DOT);
			setState(119);
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
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
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
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(125);
				match(ID);
				}
				break;
			case 2:
				{
				setState(126);
				array_call();
				}
				break;
			case 3:
				{
				setState(127);
				arraybi_call();
				}
				break;
			}
			setState(130);
			match(ASSIGN);
			setState(131);
			expression(0);
			setState(132);
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
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public TerminalNode MULT() { return getToken(pascalParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(pascalParser.DIV, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(pascalParser.MOD, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(135);
				match(BRACKET_LEFT);
				setState(136);
				expression(0);
				setState(137);
				match(PLUS);
				setState(138);
				expression(0);
				setState(139);
				match(BRACKET_RIGHT);
				}
				break;
			case 2:
				{
				setState(141);
				match(BRACKET_LEFT);
				setState(142);
				expression(0);
				setState(143);
				match(MULT);
				setState(144);
				expression(0);
				setState(145);
				match(BRACKET_RIGHT);
				}
				break;
			case 3:
				{
				setState(147);
				match(BRACKET_LEFT);
				setState(148);
				expression(0);
				setState(149);
				match(DIV);
				setState(150);
				expression(0);
				setState(151);
				match(BRACKET_RIGHT);
				}
				break;
			case 4:
				{
				setState(153);
				match(BRACKET_LEFT);
				setState(154);
				expression(0);
				setState(155);
				match(MINUS);
				setState(156);
				expression(0);
				setState(157);
				match(BRACKET_RIGHT);
				}
				break;
			case 5:
				{
				setState(159);
				match(BRACKET_LEFT);
				setState(160);
				expression(0);
				setState(161);
				match(MOD);
				setState(162);
				expression(0);
				setState(163);
				match(BRACKET_RIGHT);
				}
				break;
			case 6:
				{
				setState(165);
				match(NUMBER);
				}
				break;
			case 7:
				{
				setState(166);
				match(ID);
				}
				break;
			case 8:
				{
				setState(167);
				array_call();
				}
				break;
			case 9:
				{
				setState(168);
				arraybi_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(172);
						match(PLUS);
						setState(173);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(175);
						match(MULT);
						setState(176);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(178);
						match(DIV);
						setState(179);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
						match(MINUS);
						setState(182);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(184);
						match(MOD);
						setState(185);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 8, RULE_varBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(VAR);
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(192);
				varDecl();
				}
				}
				setState(195); 
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
		enterRule(_localctx, 10, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			varID();
			setState(198);
			match(COLON);
			setState(199);
			typeDef();
			setState(200);
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
		enterRule(_localctx, 12, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			match(ID);
			}
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(203);
				match(COMA);
				{
				setState(204);
				match(ID);
				}
				}
				}
				setState(209);
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
		enterRule(_localctx, 14, RULE_typeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 16, RULE_typeName);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(INT_TYPE);
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(CHAR_TYPE);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(BOOL_TYPE);
				}
				break;
			case STR_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(STR_TYPE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
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
		enterRule(_localctx, 18, RULE_arrDecl);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				arr1D();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
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
		public List<TerminalNode> NUMBER() { return getTokens(pascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(pascalParser.NUMBER, i);
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
		enterRule(_localctx, 20, RULE_arr1D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ARRAY);
			setState(224);
			match(SQBRACKET_LEFT);
			setState(225);
			match(NUMBER);
			setState(226);
			match(DOBLEDOTS);
			setState(227);
			match(NUMBER);
			setState(228);
			match(SQBRACKET_RIGHT);
			setState(229);
			match(OF);
			setState(230);
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
		public List<TerminalNode> NUMBER() { return getTokens(pascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(pascalParser.NUMBER, i);
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
		enterRule(_localctx, 22, RULE_arr2D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ARRAY);
			setState(233);
			match(SQBRACKET_LEFT);
			setState(234);
			match(NUMBER);
			setState(235);
			match(DOBLEDOTS);
			setState(236);
			match(NUMBER);
			setState(237);
			match(COMA);
			setState(238);
			match(NUMBER);
			setState(239);
			match(DOBLEDOTS);
			setState(240);
			match(NUMBER);
			setState(241);
			match(SQBRACKET_RIGHT);
			setState(242);
			match(OF);
			setState(243);
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
		enterRule(_localctx, 24, RULE_typearray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 26, RULE_constBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(CONST);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				constDecl();
				}
				}
				setState(251); 
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
		enterRule(_localctx, 28, RULE_constDecl);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				constCharDecl();
				}
				break;
			case CONST_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
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
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
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
		enterRule(_localctx, 30, RULE_constCharDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(CONST_CHAR);
			setState(258);
			match(COLON);
			setState(259);
			match(ID);
			setState(260);
			match(EQUAL);
			setState(261);
			match(TEXT);
			setState(262);
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
		enterRule(_localctx, 32, RULE_constStrDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(CONST_STRING);
			setState(265);
			match(COLON);
			setState(266);
			match(ID);
			setState(267);
			match(EQUAL);
			setState(268);
			match(TEXT);
			setState(269);
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
		enterRule(_localctx, 34, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(271);
				functionDecl();
				}
				}
				setState(274); 
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
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
		enterRule(_localctx, 36, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(FUNCTION);
			{
			setState(277);
			match(ID);
			}
			setState(278);
			params();
			setState(279);
			match(COLON);
			setState(280);
			returnType();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(281);
				varBlock();
				}
			}

			setState(284);
			match(BEGIN);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(285);
						whileBlock();
						}
						break;
					case 2:
						{
						setState(286);
						forBlock();
						}
						break;
					case 3:
						{
						setState(287);
						repeatBlock();
						}
						break;
					case 4:
						{
						setState(288);
						ifBlock();
						}
						break;
					case 5:
						{
						setState(289);
						assign();
						}
						break;
					case 6:
						{
						setState(290);
						fuctionUsage();
						}
						break;
					case 7:
						{
						setState(291);
						write_function();
						}
						break;
					case 8:
						{
						setState(292);
						read_function();
						}
						break;
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592211210240L) != 0)) ) {
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
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(304);
			assign();
			setState(305);
			match(END);
			setState(306);
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
		enterRule(_localctx, 38, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(BRACKET_LEFT);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(309);
				varParamBlock();
				}
			}

			}
			setState(312);
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
		enterRule(_localctx, 40, RULE_returnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		enterRule(_localctx, 42, RULE_varParamBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(VAR);
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				varParamDecl();
				}
				}
				setState(320); 
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
		enterRule(_localctx, 44, RULE_varParamDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			varParamID();
			setState(323);
			match(COLON);
			setState(324);
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
		enterRule(_localctx, 46, RULE_varParamID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			match(ID);
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(327);
				match(COMA);
				{
				setState(328);
				match(ID);
				}
				}
				}
				setState(333);
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
		enterRule(_localctx, 48, RULE_typeParamDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 50, RULE_typeParamName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(pascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(pascalParser.NUMBER, i);
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
		enterRule(_localctx, 52, RULE_fuctionUsage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(ID);
			setState(339);
			match(BRACKET_LEFT);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==ID) {
				{
				{
				setState(340);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(341);
					match(COMA);
					setState(342);
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
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(BRACKET_RIGHT);
			setState(354);
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
		enterRule(_localctx, 54, RULE_whileBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(356);
					whileDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(359); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 56, RULE_whileDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(C_WHILE);
			setState(362);
			condition();
			setState(363);
			match(C_DO);
			setState(364);
			match(BEGIN);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23708227862542L) != 0)) {
				{
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(365);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(366);
					forBlock();
					}
					break;
				case 3:
					{
					setState(367);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(368);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(369);
					fuctionUsage();
					}
					break;
				case 6:
					{
					setState(370);
					write_function();
					}
					break;
				case 7:
					{
					setState(371);
					read_function();
					}
					break;
				case 8:
					{
					setState(372);
					sentence();
					}
					break;
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(END);
			setState(379);
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
		public TerminalNode BOOLEANE() { return getToken(pascalParser.BOOLEANE, 0); }
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
		enterRule(_localctx, 58, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(BRACKET_LEFT);
			{
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(382);
				match(ID);
				}
				break;
			case 2:
				{
				setState(383);
				sentence();
				}
				break;
			}
			setState(386);
			match(BOOLEANE);
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(387);
				match(ID);
				}
				break;
			case 2:
				{
				setState(388);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(389);
				sentence();
				}
				break;
			}
			}
			setState(392);
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
		enterRule(_localctx, 60, RULE_forBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(394);
					forDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(397); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
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
		enterRule(_localctx, 62, RULE_forDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(C_FOR);
			setState(400);
			forcondition();
			setState(401);
			match(C_to);
			setState(402);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(403);
			match(C_DO);
			setState(404);
			match(BEGIN);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23708227862542L) != 0)) {
				{
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(405);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(406);
					forBlock();
					}
					break;
				case 3:
					{
					setState(407);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(408);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(409);
					fuctionUsage();
					}
					break;
				case 6:
					{
					setState(410);
					write_function();
					}
					break;
				case 7:
					{
					setState(411);
					read_function();
					}
					break;
				case 8:
					{
					setState(412);
					sentence();
					}
					break;
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(END);
			setState(419);
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
		enterRule(_localctx, 64, RULE_forcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(421);
			match(ID);
			}
			setState(422);
			match(ASSIGN);
			setState(423);
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
		enterRule(_localctx, 66, RULE_repeatBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(425);
					repeatDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(428); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 68, RULE_repeatDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(C_REPEAT);
			setState(431);
			match(BEGIN);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23708227862542L) != 0)) {
				{
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(432);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(433);
					forBlock();
					}
					break;
				case 3:
					{
					setState(434);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(435);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(436);
					fuctionUsage();
					}
					break;
				case 6:
					{
					setState(437);
					write_function();
					}
					break;
				case 7:
					{
					setState(438);
					read_function();
					}
					break;
				case 8:
					{
					setState(439);
					sentence();
					}
					break;
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			match(END);
			setState(446);
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
		public TerminalNode BOOLEANE() { return getToken(pascalParser.BOOLEANE, 0); }
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
		enterRule(_localctx, 70, RULE_repeatcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(C_UNTIL);
			{
			{
			setState(449);
			match(ID);
			}
			setState(450);
			match(BOOLEANE);
			{
			setState(451);
			match(ID);
			}
			}
			setState(453);
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
		enterRule(_localctx, 72, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(455);
					ifDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(458); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 74, RULE_ifDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(C_IF);
			setState(461);
			ifcondition();
			setState(462);
			match(C_THEN);
			setState(463);
			match(BEGIN);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23708227862542L) != 0)) {
				{
				setState(472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(464);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(465);
					forBlock();
					}
					break;
				case 3:
					{
					setState(466);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(467);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(468);
					fuctionUsage();
					}
					break;
				case 6:
					{
					setState(469);
					write_function();
					}
					break;
				case 7:
					{
					setState(470);
					read_function();
					}
					break;
				case 8:
					{
					setState(471);
					sentence();
					}
					break;
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			match(END);
			setState(478);
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
	public static class IfconditionContext extends ParserRuleContext {
		public TerminalNode BOOLEANE() { return getToken(pascalParser.BOOLEANE, 0); }
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
		enterRule(_localctx, 76, RULE_ifcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(480);
			match(ID);
			}
			setState(481);
			match(BOOLEANE);
			setState(482);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592211210240L) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_array_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(ID);
			setState(485);
			match(SQBRACKET_LEFT);
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(487);
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
		public List<TerminalNode> SQBRACKET_LEFT() { return getTokens(pascalParser.SQBRACKET_LEFT); }
		public TerminalNode SQBRACKET_LEFT(int i) {
			return getToken(pascalParser.SQBRACKET_LEFT, i);
		}
		public List<TerminalNode> SQBRACKET_RIGHT() { return getTokens(pascalParser.SQBRACKET_RIGHT); }
		public TerminalNode SQBRACKET_RIGHT(int i) {
			return getToken(pascalParser.SQBRACKET_RIGHT, i);
		}
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
		enterRule(_localctx, 80, RULE_arraybi_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(ID);
			setState(490);
			match(SQBRACKET_LEFT);
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(492);
			match(SQBRACKET_RIGHT);
			setState(493);
			match(SQBRACKET_LEFT);
			setState(494);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(495);
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
		enterRule(_localctx, 82, RULE_read_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(READ);
			setState(498);
			match(BRACKET_LEFT);
			setState(499);
			readId();
			setState(500);
			match(BRACKET_RIGHT);
			setState(501);
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
		enterRule(_localctx, 84, RULE_readId);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new IdReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				array_call();
				}
				break;
			case 3:
				_localctx = new ArraybiReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
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
		enterRule(_localctx, 86, RULE_write_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(WRITE);
			setState(509);
			match(BRACKET_LEFT);
			setState(510);
			writeId();
			setState(511);
			match(BRACKET_RIGHT);
			setState(512);
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
		enterRule(_localctx, 88, RULE_writeId);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new IdWriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IdWriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(TEXT);
				setState(516);
				match(COMA);
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(517);
					match(ID);
					}
					break;
				case 2:
					{
					setState(518);
					array_call();
					}
					break;
				case 3:
					{
					setState(519);
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
				setState(522);
				array_call();
				}
				break;
			case 4:
				_localctx = new ArraybiWriteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
				arraybi_call();
				}
				break;
			case 5:
				_localctx = new IdTextContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(524);
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u0210\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000_\b\u0000\u0001"+
		"\u0000\u0003\u0000b\b\u0000\u0001\u0000\u0003\u0000e\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000q\b\u0000\n\u0000\f\u0000"+
		"t\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001|\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0081\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00aa\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00bb\b\u0003"+
		"\n\u0003\f\u0003\u00be\t\u0003\u0001\u0004\u0001\u0004\u0004\u0004\u00c2"+
		"\b\u0004\u000b\u0004\f\u0004\u00c3\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00ce\b\u0006\n\u0006\f\u0006\u00d1\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00da\b\b\u0001\t\u0001\t\u0003"+
		"\t\u00de\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u00fa"+
		"\b\r\u000b\r\f\r\u00fb\u0001\u000e\u0001\u000e\u0003\u000e\u0100\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u0111\b\u0011\u000b\u0011"+
		"\f\u0011\u0112\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u011b\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0126\b\u0012\n\u0012\f\u0012\u0129\t\u0012\u0001\u0012\u0005"+
		"\u0012\u012c\b\u0012\n\u0012\f\u0012\u012f\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0137\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u013f\b\u0015\u000b\u0015\f\u0015\u0140\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u014a\b\u0017\n\u0017\f\u0017\u014d\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0158\b\u001a\n\u001a\f\u001a\u015b\t\u001a\u0005"+
		"\u001a\u015d\b\u001a\n\u001a\f\u001a\u0160\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0004\u001b\u0166\b\u001b\u000b\u001b\f\u001b"+
		"\u0167\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0176\b\u001c\n\u001c\f\u001c\u0179\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0181\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0187\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0004\u001e\u018c\b"+
		"\u001e\u000b\u001e\f\u001e\u018d\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u019e"+
		"\b\u001f\n\u001f\f\u001f\u01a1\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0004!\u01ab\b!\u000b!\f!\u01ac\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u01b9\b\"\n\"\f\"\u01bc\t\"\u0001\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0004$\u01c9\b$\u000b"+
		"$\f$\u01ca\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0005%\u01d9\b%\n%\f%\u01dc\t%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0003*\u01fb\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u0209\b,\u0001,\u0001,\u0001,\u0003,\u020e\b,\u0001,\u0000"+
		"\u0001\u0006-\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\u0003\u0001"+
		"\u0000\n\r\u0002\u0000\u0017\u0018,,\u0002\u0000\u0017\u0017,,\u0246\u0000"+
		"Z\u0001\u0000\u0000\u0000\u0002{\u0001\u0000\u0000\u0000\u0004\u0080\u0001"+
		"\u0000\u0000\u0000\u0006\u00a9\u0001\u0000\u0000\u0000\b\u00bf\u0001\u0000"+
		"\u0000\u0000\n\u00c5\u0001\u0000\u0000\u0000\f\u00ca\u0001\u0000\u0000"+
		"\u0000\u000e\u00d2\u0001\u0000\u0000\u0000\u0010\u00d9\u0001\u0000\u0000"+
		"\u0000\u0012\u00dd\u0001\u0000\u0000\u0000\u0014\u00df\u0001\u0000\u0000"+
		"\u0000\u0016\u00e8\u0001\u0000\u0000\u0000\u0018\u00f5\u0001\u0000\u0000"+
		"\u0000\u001a\u00f7\u0001\u0000\u0000\u0000\u001c\u00ff\u0001\u0000\u0000"+
		"\u0000\u001e\u0101\u0001\u0000\u0000\u0000 \u0108\u0001\u0000\u0000\u0000"+
		"\"\u0110\u0001\u0000\u0000\u0000$\u0114\u0001\u0000\u0000\u0000&\u0134"+
		"\u0001\u0000\u0000\u0000(\u013a\u0001\u0000\u0000\u0000*\u013c\u0001\u0000"+
		"\u0000\u0000,\u0142\u0001\u0000\u0000\u0000.\u0146\u0001\u0000\u0000\u0000"+
		"0\u014e\u0001\u0000\u0000\u00002\u0150\u0001\u0000\u0000\u00004\u0152"+
		"\u0001\u0000\u0000\u00006\u0165\u0001\u0000\u0000\u00008\u0169\u0001\u0000"+
		"\u0000\u0000:\u017d\u0001\u0000\u0000\u0000<\u018b\u0001\u0000\u0000\u0000"+
		">\u018f\u0001\u0000\u0000\u0000@\u01a5\u0001\u0000\u0000\u0000B\u01aa"+
		"\u0001\u0000\u0000\u0000D\u01ae\u0001\u0000\u0000\u0000F\u01c0\u0001\u0000"+
		"\u0000\u0000H\u01c8\u0001\u0000\u0000\u0000J\u01cc\u0001\u0000\u0000\u0000"+
		"L\u01e0\u0001\u0000\u0000\u0000N\u01e4\u0001\u0000\u0000\u0000P\u01e9"+
		"\u0001\u0000\u0000\u0000R\u01f1\u0001\u0000\u0000\u0000T\u01fa\u0001\u0000"+
		"\u0000\u0000V\u01fc\u0001\u0000\u0000\u0000X\u020d\u0001\u0000\u0000\u0000"+
		"Z[\u0005\u0007\u0000\u0000[\\\u0005,\u0000\u0000\\^\u0005\u001a\u0000"+
		"\u0000]_\u0003\b\u0004\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_a\u0001\u0000\u0000\u0000`b\u0003\u001a\r\u0000a`\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ce\u0003\"\u0011"+
		"\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fr\u0005\b\u0000\u0000gq\u0005\u0018\u0000\u0000hq\u00036"+
		"\u001b\u0000iq\u0003<\u001e\u0000jq\u0003B!\u0000kq\u0003H$\u0000lq\u0003"+
		"4\u001a\u0000mq\u0003V+\u0000nq\u0003R)\u0000oq\u0003\u0002\u0001\u0000"+
		"pg\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000\u0000pi\u0001\u0000\u0000"+
		"\u0000pj\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000pl\u0001\u0000"+
		"\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uv\u0005\t\u0000\u0000vw\u0005\u001f\u0000\u0000wx\u0005\u0000\u0000"+
		"\u0001x\u0001\u0001\u0000\u0000\u0000y|\u0003\u0004\u0002\u0000z|\u0003"+
		"\u0006\u0003\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|\u0003\u0001\u0000\u0000\u0000}\u0081\u0005,\u0000\u0000~\u0081\u0003"+
		"N\'\u0000\u007f\u0081\u0003P(\u0000\u0080}\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0016\u0000\u0000\u0083\u0084"+
		"\u0003\u0006\u0003\u0000\u0084\u0085\u0005\u001a\u0000\u0000\u0085\u0005"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0006\u0003\uffff\uffff\u0000\u0087"+
		"\u0088\u0005\u0003\u0000\u0000\u0088\u0089\u0003\u0006\u0003\u0000\u0089"+
		"\u008a\u0005/\u0000\u0000\u008a\u008b\u0003\u0006\u0003\u0000\u008b\u008c"+
		"\u0005\u0004\u0000\u0000\u008c\u00aa\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u0003\u0000\u0000\u008e\u008f\u0003\u0006\u0003\u0000\u008f\u0090"+
		"\u00051\u0000\u0000\u0090\u0091\u0003\u0006\u0003\u0000\u0091\u0092\u0005"+
		"\u0004\u0000\u0000\u0092\u00aa\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0003\u0000\u0000\u0094\u0095\u0003\u0006\u0003\u0000\u0095\u0096\u0005"+
		"2\u0000\u0000\u0096\u0097\u0003\u0006\u0003\u0000\u0097\u0098\u0005\u0004"+
		"\u0000\u0000\u0098\u00aa\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0003"+
		"\u0000\u0000\u009a\u009b\u0003\u0006\u0003\u0000\u009b\u009c\u00050\u0000"+
		"\u0000\u009c\u009d\u0003\u0006\u0003\u0000\u009d\u009e\u0005\u0004\u0000"+
		"\u0000\u009e\u00aa\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0003\u0000"+
		"\u0000\u00a0\u00a1\u0003\u0006\u0003\u0000\u00a1\u00a2\u00053\u0000\u0000"+
		"\u00a2\u00a3\u0003\u0006\u0003\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000"+
		"\u00a4\u00aa\u0001\u0000\u0000\u0000\u00a5\u00aa\u0005\u0017\u0000\u0000"+
		"\u00a6\u00aa\u0005,\u0000\u0000\u00a7\u00aa\u0003N\'\u0000\u00a8\u00aa"+
		"\u0003P(\u0000\u00a9\u0086\u0001\u0000\u0000\u0000\u00a9\u008d\u0001\u0000"+
		"\u0000\u0000\u00a9\u0093\u0001\u0000\u0000\u0000\u00a9\u0099\u0001\u0000"+
		"\u0000\u0000\u00a9\u009f\u0001\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00bc\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\n\u0005\u0000\u0000\u00ac\u00ad\u0005/\u0000"+
		"\u0000\u00ad\u00bb\u0003\u0006\u0003\u0006\u00ae\u00af\n\u0004\u0000\u0000"+
		"\u00af\u00b0\u00051\u0000\u0000\u00b0\u00bb\u0003\u0006\u0003\u0005\u00b1"+
		"\u00b2\n\u0003\u0000\u0000\u00b2\u00b3\u00052\u0000\u0000\u00b3\u00bb"+
		"\u0003\u0006\u0003\u0004\u00b4\u00b5\n\u0002\u0000\u0000\u00b5\u00b6\u0005"+
		"0\u0000\u0000\u00b6\u00bb\u0003\u0006\u0003\u0003\u00b7\u00b8\n\u0001"+
		"\u0000\u0000\u00b8\u00b9\u00053\u0000\u0000\u00b9\u00bb\u0003\u0006\u0003"+
		"\u0002\u00ba\u00ab\u0001\u0000\u0000\u0000\u00ba\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b1\u0001\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u0007\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c1\u0005\u000e\u0000\u0000\u00c0\u00c2\u0003\n\u0005\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\t\u0001\u0000\u0000\u0000\u00c5\u00c6\u0003\f\u0006\u0000\u00c6"+
		"\u00c7\u0005\u0019\u0000\u0000\u00c7\u00c8\u0003\u000e\u0007\u0000\u00c8"+
		"\u00c9\u0005\u001a\u0000\u0000\u00c9\u000b\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cf\u0005,\u0000\u0000\u00cb\u00cc\u0005\u001b\u0000\u0000\u00cc\u00ce"+
		"\u0005,\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\r\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0003\u0010\b\u0000\u00d3\u000f\u0001\u0000\u0000"+
		"\u0000\u00d4\u00da\u0005\n\u0000\u0000\u00d5\u00da\u0005\r\u0000\u0000"+
		"\u00d6\u00da\u0005\f\u0000\u0000\u00d7\u00da\u0005\u000b\u0000\u0000\u00d8"+
		"\u00da\u0003\u0012\t\u0000\u00d9\u00d4\u0001\u0000\u0000\u0000\u00d9\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u0011"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0003\u0014\n\u0000\u00dc\u00de\u0003"+
		"\u0016\u000b\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u0013\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\u000f\u0000\u0000\u00e0\u00e1\u0005\u0005\u0000\u0000\u00e1\u00e2\u0005"+
		"\u0017\u0000\u0000\u00e2\u00e3\u0005\u001c\u0000\u0000\u00e3\u00e4\u0005"+
		"\u0017\u0000\u0000\u00e4\u00e5\u0005\u0006\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0010\u0000\u0000\u00e6\u00e7\u0003\u0018\f\u0000\u00e7\u0015\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\u000f\u0000\u0000\u00e9\u00ea\u0005\u0005"+
		"\u0000\u0000\u00ea\u00eb\u0005\u0017\u0000\u0000\u00eb\u00ec\u0005\u001c"+
		"\u0000\u0000\u00ec\u00ed\u0005\u0017\u0000\u0000\u00ed\u00ee\u0005\u001b"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0017\u0000\u0000\u00ef\u00f0\u0005\u001c"+
		"\u0000\u0000\u00f0\u00f1\u0005\u0017\u0000\u0000\u00f1\u00f2\u0005\u0006"+
		"\u0000\u0000\u00f2\u00f3\u0005\u0010\u0000\u0000\u00f3\u00f4\u0003\u0018"+
		"\f\u0000\u00f4\u0017\u0001\u0000\u0000\u0000\u00f5\u00f6\u0007\u0000\u0000"+
		"\u0000\u00f6\u0019\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005\u0011\u0000"+
		"\u0000\u00f8\u00fa\u0003\u001c\u000e\u0000\u00f9\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u001b\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0003\u001e\u000f\u0000\u00fe\u0100\u0003 \u0010\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u001d\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0012\u0000\u0000"+
		"\u0102\u0103\u0005\u0019\u0000\u0000\u0103\u0104\u0005,\u0000\u0000\u0104"+
		"\u0105\u0005\u0015\u0000\u0000\u0105\u0106\u0005\u0018\u0000\u0000\u0106"+
		"\u0107\u0005\u001a\u0000\u0000\u0107\u001f\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005\u0013\u0000\u0000\u0109\u010a\u0005\u0019\u0000\u0000\u010a"+
		"\u010b\u0005,\u0000\u0000\u010b\u010c\u0005\u0015\u0000\u0000\u010c\u010d"+
		"\u0005\u0018\u0000\u0000\u010d\u010e\u0005\u001a\u0000\u0000\u010e!\u0001"+
		"\u0000\u0000\u0000\u010f\u0111\u0003$\u0012\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113#\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0005#\u0000\u0000\u0115\u0116\u0005,\u0000\u0000\u0116"+
		"\u0117\u0003&\u0013\u0000\u0117\u0118\u0005\u0019\u0000\u0000\u0118\u011a"+
		"\u0003(\u0014\u0000\u0119\u011b\u0003\b\u0004\u0000\u011a\u0119\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u0127\u0005\b\u0000\u0000\u011d\u0126\u00036"+
		"\u001b\u0000\u011e\u0126\u0003<\u001e\u0000\u011f\u0126\u0003B!\u0000"+
		"\u0120\u0126\u0003H$\u0000\u0121\u0126\u0003\u0004\u0002\u0000\u0122\u0126"+
		"\u00034\u001a\u0000\u0123\u0126\u0003V+\u0000\u0124\u0126\u0003R)\u0000"+
		"\u0125\u011d\u0001\u0000\u0000\u0000\u0125\u011e\u0001\u0000\u0000\u0000"+
		"\u0125\u011f\u0001\u0000\u0000\u0000\u0125\u0120\u0001\u0000\u0000\u0000"+
		"\u0125\u0121\u0001\u0000\u0000\u0000\u0125\u0122\u0001\u0000\u0000\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000"+
		"\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012d\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012c\u0007\u0001\u0000\u0000"+
		"\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0003\u0004\u0002\u0000\u0131\u0132\u0005\t\u0000\u0000\u0132"+
		"\u0133\u0005\u001a\u0000\u0000\u0133%\u0001\u0000\u0000\u0000\u0134\u0136"+
		"\u0005\u0003\u0000\u0000\u0135\u0137\u0003*\u0015\u0000\u0136\u0135\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005\u0004\u0000\u0000\u0139\'\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0007\u0000\u0000\u0000\u013b)\u0001\u0000\u0000"+
		"\u0000\u013c\u013e\u0005\u000e\u0000\u0000\u013d\u013f\u0003,\u0016\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141+\u0001\u0000\u0000\u0000\u0142\u0143\u0003.\u0017\u0000\u0143\u0144"+
		"\u0005\u0019\u0000\u0000\u0144\u0145\u00030\u0018\u0000\u0145-\u0001\u0000"+
		"\u0000\u0000\u0146\u014b\u0005,\u0000\u0000\u0147\u0148\u0005\u001b\u0000"+
		"\u0000\u0148\u014a\u0005,\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c/\u0001\u0000\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014e\u014f\u00032\u0019\u0000\u014f1\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0007\u0000\u0000\u0000\u01513\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005,\u0000\u0000\u0153\u015e\u0005\u0003\u0000"+
		"\u0000\u0154\u0159\u0007\u0002\u0000\u0000\u0155\u0156\u0005\u001b\u0000"+
		"\u0000\u0156\u0158\u0007\u0002\u0000\u0000\u0157\u0155\u0001\u0000\u0000"+
		"\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000"+
		"\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u0154\u0001\u0000\u0000"+
		"\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000"+
		"\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0004\u0000"+
		"\u0000\u0162\u0163\u0005\u001a\u0000\u0000\u01635\u0001\u0000\u0000\u0000"+
		"\u0164\u0166\u00038\u001c\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u01687\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0005$\u0000\u0000\u016a\u016b\u0003:\u001d\u0000\u016b\u016c\u0005%"+
		"\u0000\u0000\u016c\u0177\u0005\b\u0000\u0000\u016d\u0176\u00036\u001b"+
		"\u0000\u016e\u0176\u0003<\u001e\u0000\u016f\u0176\u0003B!\u0000\u0170"+
		"\u0176\u0003H$\u0000\u0171\u0176\u00034\u001a\u0000\u0172\u0176\u0003"+
		"V+\u0000\u0173\u0176\u0003R)\u0000\u0174\u0176\u0003\u0002\u0001\u0000"+
		"\u0175\u016d\u0001\u0000\u0000\u0000\u0175\u016e\u0001\u0000\u0000\u0000"+
		"\u0175\u016f\u0001\u0000\u0000\u0000\u0175\u0170\u0001\u0000\u0000\u0000"+
		"\u0175\u0171\u0001\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000\u0000"+
		"\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000"+
		"\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000"+
		"\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017b\u0005\t\u0000\u0000\u017b"+
		"\u017c\u0005\u001a\u0000\u0000\u017c9\u0001\u0000\u0000\u0000\u017d\u0180"+
		"\u0005\u0003\u0000\u0000\u017e\u0181\u0005,\u0000\u0000\u017f\u0181\u0003"+
		"\u0002\u0001\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u017f\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0186\u0005"+
		"\"\u0000\u0000\u0183\u0187\u0005,\u0000\u0000\u0184\u0187\u0005\u0017"+
		"\u0000\u0000\u0185\u0187\u0003\u0002\u0001\u0000\u0186\u0183\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0004"+
		"\u0000\u0000\u0189;\u0001\u0000\u0000\u0000\u018a\u018c\u0003>\u001f\u0000"+
		"\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000"+
		"\u018e=\u0001\u0000\u0000\u0000\u018f\u0190\u0005\'\u0000\u0000\u0190"+
		"\u0191\u0003@ \u0000\u0191\u0192\u0005&\u0000\u0000\u0192\u0193\u0007"+
		"\u0002\u0000\u0000\u0193\u0194\u0005%\u0000\u0000\u0194\u019f\u0005\b"+
		"\u0000\u0000\u0195\u019e\u00036\u001b\u0000\u0196\u019e\u0003<\u001e\u0000"+
		"\u0197\u019e\u0003B!\u0000\u0198\u019e\u0003H$\u0000\u0199\u019e\u0003"+
		"4\u001a\u0000\u019a\u019e\u0003V+\u0000\u019b\u019e\u0003R)\u0000\u019c"+
		"\u019e\u0003\u0002\u0001\u0000\u019d\u0195\u0001\u0000\u0000\u0000\u019d"+
		"\u0196\u0001\u0000\u0000\u0000\u019d\u0197\u0001\u0000\u0000\u0000\u019d"+
		"\u0198\u0001\u0000\u0000\u0000\u019d\u0199\u0001\u0000\u0000\u0000\u019d"+
		"\u019a\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d"+
		"\u019c\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0005\t\u0000\u0000\u01a3\u01a4\u0005\u001a\u0000\u0000\u01a4?"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005,\u0000\u0000\u01a6\u01a7\u0005"+
		"\u0016\u0000\u0000\u01a7\u01a8\u0007\u0002\u0000\u0000\u01a8A\u0001\u0000"+
		"\u0000\u0000\u01a9\u01ab\u0003D\"\u0000\u01aa\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01adC\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0005(\u0000\u0000\u01af\u01ba\u0005\b\u0000\u0000\u01b0"+
		"\u01b9\u00036\u001b\u0000\u01b1\u01b9\u0003<\u001e\u0000\u01b2\u01b9\u0003"+
		"B!\u0000\u01b3\u01b9\u0003H$\u0000\u01b4\u01b9\u00034\u001a\u0000\u01b5"+
		"\u01b9\u0003V+\u0000\u01b6\u01b9\u0003R)\u0000\u01b7\u01b9\u0003\u0002"+
		"\u0001\u0000\u01b8\u01b0\u0001\u0000\u0000\u0000\u01b8\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b2\u0001\u0000\u0000\u0000\u01b8\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b4\u0001\u0000\u0000\u0000\u01b8\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\t\u0000"+
		"\u0000\u01be\u01bf\u0003F#\u0000\u01bfE\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0005)\u0000\u0000\u01c1\u01c2\u0005,\u0000\u0000\u01c2\u01c3\u0005"+
		"\"\u0000\u0000\u01c3\u01c4\u0005,\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0005\u001a\u0000\u0000\u01c6G\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c9\u0003J%\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cbI\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0005*\u0000\u0000\u01cd\u01ce\u0003L&\u0000\u01ce\u01cf\u0005+\u0000"+
		"\u0000\u01cf\u01da\u0005\b\u0000\u0000\u01d0\u01d9\u00036\u001b\u0000"+
		"\u01d1\u01d9\u0003<\u001e\u0000\u01d2\u01d9\u0003B!\u0000\u01d3\u01d9"+
		"\u0003H$\u0000\u01d4\u01d9\u00034\u001a\u0000\u01d5\u01d9\u0003V+\u0000"+
		"\u01d6\u01d9\u0003R)\u0000\u01d7\u01d9\u0003\u0002\u0001\u0000\u01d8\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d1\u0001\u0000\u0000\u0000\u01d8\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d3\u0001\u0000\u0000\u0000\u01d8\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d5\u0001\u0000\u0000\u0000\u01d8\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01dc"+
		"\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0005\t\u0000\u0000\u01de\u01df\u0005"+
		"\u001a\u0000\u0000\u01dfK\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005,\u0000"+
		"\u0000\u01e1\u01e2\u0005\"\u0000\u0000\u01e2\u01e3\u0007\u0001\u0000\u0000"+
		"\u01e3M\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005,\u0000\u0000\u01e5\u01e6"+
		"\u0005\u0005\u0000\u0000\u01e6\u01e7\u0007\u0002\u0000\u0000\u01e7\u01e8"+
		"\u0005\u0006\u0000\u0000\u01e8O\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005"+
		",\u0000\u0000\u01ea\u01eb\u0005\u0005\u0000\u0000\u01eb\u01ec\u0007\u0002"+
		"\u0000\u0000\u01ec\u01ed\u0005\u0006\u0000\u0000\u01ed\u01ee\u0005\u0005"+
		"\u0000\u0000\u01ee\u01ef\u0007\u0002\u0000\u0000\u01ef\u01f0\u0005\u0006"+
		"\u0000\u0000\u01f0Q\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005\u0001\u0000"+
		"\u0000\u01f2\u01f3\u0005\u0003\u0000\u0000\u01f3\u01f4\u0003T*\u0000\u01f4"+
		"\u01f5\u0005\u0004\u0000\u0000\u01f5\u01f6\u0005\u001a\u0000\u0000\u01f6"+
		"S\u0001\u0000\u0000\u0000\u01f7\u01fb\u0005,\u0000\u0000\u01f8\u01fb\u0003"+
		"N\'\u0000\u01f9\u01fb\u0003P(\u0000\u01fa\u01f7\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fbU\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005\u0002\u0000\u0000\u01fd"+
		"\u01fe\u0005\u0003\u0000\u0000\u01fe\u01ff\u0003X,\u0000\u01ff\u0200\u0005"+
		"\u0004\u0000\u0000\u0200\u0201\u0005\u001a\u0000\u0000\u0201W\u0001\u0000"+
		"\u0000\u0000\u0202\u020e\u0005,\u0000\u0000\u0203\u0204\u0005\u0018\u0000"+
		"\u0000\u0204\u0208\u0005\u001b\u0000\u0000\u0205\u0209\u0005,\u0000\u0000"+
		"\u0206\u0209\u0003N\'\u0000\u0207\u0209\u0003P(\u0000\u0208\u0205\u0001"+
		"\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0207\u0001"+
		"\u0000\u0000\u0000\u0209\u020e\u0001\u0000\u0000\u0000\u020a\u020e\u0003"+
		"N\'\u0000\u020b\u020e\u0003P(\u0000\u020c\u020e\u0005\u0018\u0000\u0000"+
		"\u020d\u0202\u0001\u0000\u0000\u0000\u020d\u0203\u0001\u0000\u0000\u0000"+
		"\u020d\u020a\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000"+
		"\u020d\u020c\u0001\u0000\u0000\u0000\u020eY\u0001\u0000\u0000\u0000+^"+
		"adpr{\u0080\u00a9\u00ba\u00bc\u00c3\u00cf\u00d9\u00dd\u00fb\u00ff\u0112"+
		"\u011a\u0125\u0127\u012d\u0136\u0140\u014b\u0159\u015e\u0167\u0175\u0177"+
		"\u0180\u0186\u018d\u019d\u019f\u01ac\u01b8\u01ba\u01ca\u01d8\u01da\u01fa"+
		"\u0208\u020d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}