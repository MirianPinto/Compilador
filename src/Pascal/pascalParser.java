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
		FALSE=33, CHAR=34, BOOLEANE=35, FUNCTION=36, C_WHILE=37, C_DO=38, C_to=39, 
		C_FOR=40, C_REPEAT=41, C_UNTIL=42, C_IF=43, C_THEN=44, ID=45, WS=46, COMMENT=47, 
		PLUS=48, MINUS=49, MULT=50, DIV=51, MOD=52;
	public static final int
		RULE_main = 0, RULE_sentence = 1, RULE_assign = 2, RULE_expression = 3, 
		RULE_varBlock = 4, RULE_varDecl = 5, RULE_varID = 6, RULE_typeDef = 7, 
		RULE_typeName = 8, RULE_arrDecl = 9, RULE_arr1D = 10, RULE_arr2D = 11, 
		RULE_constBlock = 12, RULE_constDecl = 13, RULE_constCharDecl = 14, RULE_constStrDecl = 15, 
		RULE_functionBlock = 16, RULE_functionDecl = 17, RULE_params = 18, RULE_returnType = 19, 
		RULE_varParamBlock = 20, RULE_varParamDecl = 21, RULE_varParamID = 22, 
		RULE_typeParamDef = 23, RULE_typeParamName = 24, RULE_fuctionUsage = 25, 
		RULE_whileBlock = 26, RULE_whileDecla = 27, RULE_condition = 28, RULE_forBlock = 29, 
		RULE_forDecla = 30, RULE_forcondition = 31, RULE_repeatBlock = 32, RULE_repeatDecla = 33, 
		RULE_repeatcondition = 34, RULE_ifBlock = 35, RULE_ifDecla = 36, RULE_ifcondition = 37, 
		RULE_read_function = 38, RULE_readId = 39, RULE_write_function = 40, RULE_writeId = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentence", "assign", "expression", "varBlock", "varDecl", "varID", 
			"typeDef", "typeName", "arrDecl", "arr1D", "arr2D", "constBlock", "constDecl", 
			"constCharDecl", "constStrDecl", "functionBlock", "functionDecl", "params", 
			"returnType", "varParamBlock", "varParamDecl", "varParamID", "typeParamDef", 
			"typeParamName", "fuctionUsage", "whileBlock", "whileDecla", "condition", 
			"forBlock", "forDecla", "forcondition", "repeatBlock", "repeatDecla", 
			"repeatcondition", "ifBlock", "ifDecla", "ifcondition", "read_function", 
			"readId", "write_function", "writeId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", "'write'", "'('", "')'", "'['", "']'", "'program'", "'begin'", 
			"'end'", "'integer'", "'string'", "'boolean'", "'char'", "'var'", "'array'", 
			"'of'", "'const'", "'constchar'", "'conststr'", "'array of'", "'='", 
			"':='", null, null, "':'", "';'", "','", "'..'", "'''", "'\"'", "'.'", 
			"'true'", "'false'", null, null, "'function'", "'while'", "'do'", "'to'", 
			"'for'", "'repeat'", "'until'", "'if'", "'then'", null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'%'"
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
			"DOT", "TRUE", "FALSE", "CHAR", "BOOLEANE", "FUNCTION", "C_WHILE", "C_DO", 
			"C_to", "C_FOR", "C_REPEAT", "C_UNTIL", "C_IF", "C_THEN", "ID", "WS", 
			"COMMENT", "PLUS", "MINUS", "MULT", "DIV", "MOD"
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
			setState(84);
			match(PROGRAM);
			setState(85);
			match(ID);
			setState(86);
			match(SEMI_COLON);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(87);
				varBlock();
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(90);
				constBlock();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(93);
				functionBlock();
				}
			}

			setState(96);
			match(BEGIN);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47416464113670L) != 0)) {
				{
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(97);
					match(TEXT);
					}
					break;
				case 2:
					{
					setState(98);
					whileBlock();
					}
					break;
				case 3:
					{
					setState(99);
					forBlock();
					}
					break;
				case 4:
					{
					setState(100);
					repeatBlock();
					}
					break;
				case 5:
					{
					setState(101);
					ifBlock();
					}
					break;
				case 6:
					{
					setState(102);
					fuctionUsage();
					}
					break;
				case 7:
					{
					setState(103);
					write_function();
					}
					break;
				case 8:
					{
					setState(104);
					read_function();
					}
					break;
				case 9:
					{
					setState(105);
					sentence();
					}
					break;
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(END);
			setState(112);
			match(DOT);
			setState(113);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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
			{
			setState(119);
			match(ID);
			}
			setState(120);
			match(ASSIGN);
			setState(121);
			expression(0);
			setState(122);
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
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MULT() { return getToken(pascalParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(pascalParser.DIV, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(pascalParser.MOD, 0); }
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
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(125);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(126);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(130);
						match(PLUS);
						setState(131);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(133);
						match(MULT);
						setState(134);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(136);
						match(DIV);
						setState(137);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(139);
						match(MINUS);
						setState(140);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(142);
						match(MOD);
						setState(143);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(148);
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
			setState(149);
			match(VAR);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				varDecl();
				}
				}
				setState(153); 
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
			setState(155);
			varID();
			setState(156);
			match(COLON);
			setState(157);
			typeDef();
			setState(158);
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
			setState(160);
			match(ID);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(161);
				match(COMA);
				{
				setState(162);
				match(ID);
				}
				}
				}
				setState(167);
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
			setState(168);
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(INT_TYPE);
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(CHAR_TYPE);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(BOOL_TYPE);
				}
				break;
			case STR_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(STR_TYPE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				arr1D();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
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
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
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
			setState(181);
			match(ARRAY);
			setState(182);
			match(SQBRACKET_LEFT);
			setState(183);
			match(NUMBER);
			setState(184);
			match(DOBLEDOTS);
			setState(185);
			match(NUMBER);
			setState(186);
			match(SQBRACKET_RIGHT);
			setState(187);
			match(OF);
			setState(188);
			match(INT_TYPE);
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
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
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
			setState(190);
			match(ARRAY);
			setState(191);
			match(SQBRACKET_LEFT);
			setState(192);
			match(NUMBER);
			setState(193);
			match(DOBLEDOTS);
			setState(194);
			match(NUMBER);
			setState(195);
			match(COMA);
			setState(196);
			match(NUMBER);
			setState(197);
			match(DOBLEDOTS);
			setState(198);
			match(NUMBER);
			setState(199);
			match(SQBRACKET_RIGHT);
			setState(200);
			match(OF);
			setState(201);
			match(INT_TYPE);
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
		enterRule(_localctx, 24, RULE_constBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(CONST);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				constDecl();
				}
				}
				setState(207); 
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
		enterRule(_localctx, 26, RULE_constDecl);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				constCharDecl();
				}
				break;
			case CONST_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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
		public List<TerminalNode> QUATATION_MARK() { return getTokens(pascalParser.QUATATION_MARK); }
		public TerminalNode QUATATION_MARK(int i) {
			return getToken(pascalParser.QUATATION_MARK, i);
		}
		public TerminalNode CHAR() { return getToken(pascalParser.CHAR, 0); }
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
		enterRule(_localctx, 28, RULE_constCharDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(CONST_CHAR);
			setState(214);
			match(COLON);
			setState(215);
			match(ID);
			setState(216);
			match(EQUAL);
			setState(217);
			match(QUATATION_MARK);
			setState(218);
			match(CHAR);
			setState(219);
			match(QUATATION_MARK);
			setState(220);
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
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public List<TerminalNode> QUATATION_MARK() { return getTokens(pascalParser.QUATATION_MARK); }
		public TerminalNode QUATATION_MARK(int i) {
			return getToken(pascalParser.QUATATION_MARK, i);
		}
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
		enterRule(_localctx, 30, RULE_constStrDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CONST_STRING);
			setState(223);
			match(COLON);
			setState(224);
			match(ID);
			setState(225);
			match(EQUAL);
			setState(226);
			match(QUATATION_MARK);
			setState(227);
			match(ID);
			setState(228);
			match(QUATATION_MARK);
			setState(229);
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
		enterRule(_localctx, 32, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				functionDecl();
				}
				}
				setState(234); 
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
		enterRule(_localctx, 34, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(FUNCTION);
			{
			setState(237);
			match(ID);
			}
			setState(238);
			params();
			setState(239);
			match(COLON);
			setState(240);
			returnType();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(241);
				varBlock();
				}
			}

			setState(244);
			match(BEGIN);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(245);
						whileBlock();
						}
						break;
					case 2:
						{
						setState(246);
						forBlock();
						}
						break;
					case 3:
						{
						setState(247);
						repeatBlock();
						}
						break;
					case 4:
						{
						setState(248);
						ifBlock();
						}
						break;
					case 5:
						{
						setState(249);
						assign();
						}
						break;
					case 6:
						{
						setState(250);
						fuctionUsage();
						}
						break;
					case 7:
						{
						setState(251);
						write_function();
						}
						break;
					case 8:
						{
						setState(252);
						read_function();
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184397254656L) != 0)) ) {
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
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(264);
			assign();
			setState(265);
			match(END);
			setState(266);
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
		enterRule(_localctx, 36, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(BRACKET_LEFT);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(269);
				varParamBlock();
				}
			}

			}
			setState(272);
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
		enterRule(_localctx, 38, RULE_returnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 40, RULE_varParamBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(VAR);
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				varParamDecl();
				}
				}
				setState(280); 
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
		enterRule(_localctx, 42, RULE_varParamDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			varParamID();
			setState(283);
			match(COLON);
			setState(284);
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
		enterRule(_localctx, 44, RULE_varParamID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286);
			match(ID);
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(287);
				match(COMA);
				{
				setState(288);
				match(ID);
				}
				}
				}
				setState(293);
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
		enterRule(_localctx, 46, RULE_typeParamDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		enterRule(_localctx, 48, RULE_typeParamName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		enterRule(_localctx, 50, RULE_fuctionUsage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ID);
			setState(299);
			match(BRACKET_LEFT);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==ID) {
				{
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(301);
					match(COMA);
					setState(302);
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
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(BRACKET_RIGHT);
			setState(314);
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
		enterRule(_localctx, 52, RULE_whileBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(316);
					whileDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(319); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 54, RULE_whileDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(C_WHILE);
			setState(322);
			condition();
			setState(323);
			match(C_DO);
			setState(324);
			match(BEGIN);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47416438947846L) != 0)) {
				{
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(325);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(326);
					forBlock();
					}
					break;
				case 3:
					{
					setState(327);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(328);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(329);
					assign();
					}
					break;
				case 6:
					{
					setState(330);
					fuctionUsage();
					}
					break;
				case 7:
					{
					setState(331);
					write_function();
					}
					break;
				case 8:
					{
					setState(332);
					read_function();
					}
					break;
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			match(END);
			setState(339);
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
		enterRule(_localctx, 56, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(BRACKET_LEFT);
			{
			{
			setState(342);
			match(ID);
			}
			setState(343);
			match(BOOLEANE);
			setState(344);
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
			setState(346);
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
		enterRule(_localctx, 58, RULE_forBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(348);
					forDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(351); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 60, RULE_forDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(C_FOR);
			setState(354);
			forcondition();
			setState(355);
			match(C_to);
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(357);
			match(C_DO);
			setState(358);
			match(BEGIN);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47416438947846L) != 0)) {
				{
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(359);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(360);
					forBlock();
					}
					break;
				case 3:
					{
					setState(361);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(362);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(363);
					assign();
					}
					break;
				case 6:
					{
					setState(364);
					fuctionUsage();
					}
					break;
				case 7:
					{
					setState(365);
					write_function();
					}
					break;
				case 8:
					{
					setState(366);
					read_function();
					}
					break;
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(END);
			setState(373);
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
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
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
		enterRule(_localctx, 62, RULE_forcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(375);
				match(ID);
				}
				break;
			case ASSIGN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(379);
			match(ASSIGN);
			{
			setState(380);
			match(NUMBER);
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
		enterRule(_localctx, 64, RULE_repeatBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(382);
					repeatDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(385); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 66, RULE_repeatDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(C_REPEAT);
			setState(388);
			match(BEGIN);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47416438947846L) != 0)) {
				{
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(389);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(390);
					forBlock();
					}
					break;
				case 3:
					{
					setState(391);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(392);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(393);
					assign();
					}
					break;
				case 6:
					{
					setState(394);
					fuctionUsage();
					}
					break;
				case 7:
					{
					setState(395);
					write_function();
					}
					break;
				case 8:
					{
					setState(396);
					read_function();
					}
					break;
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(END);
			setState(403);
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
		enterRule(_localctx, 68, RULE_repeatcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(C_UNTIL);
			{
			{
			setState(406);
			match(ID);
			}
			setState(407);
			match(BOOLEANE);
			{
			setState(408);
			match(ID);
			}
			}
			setState(410);
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
		enterRule(_localctx, 70, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(412);
					ifDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(415); 
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
		enterRule(_localctx, 72, RULE_ifDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(C_IF);
			setState(418);
			ifcondition();
			setState(419);
			match(C_THEN);
			setState(420);
			match(BEGIN);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47416438947846L) != 0)) {
				{
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(421);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(422);
					forBlock();
					}
					break;
				case 3:
					{
					setState(423);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(424);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(425);
					assign();
					}
					break;
				case 6:
					{
					setState(426);
					fuctionUsage();
					}
					break;
				case 7:
					{
					setState(427);
					write_function();
					}
					break;
				case 8:
					{
					setState(428);
					read_function();
					}
					break;
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			match(END);
			setState(435);
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
		enterRule(_localctx, 74, RULE_ifcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(437);
			match(ID);
			}
			setState(438);
			match(BOOLEANE);
			setState(439);
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
		enterRule(_localctx, 76, RULE_read_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(READ);
			setState(442);
			match(BRACKET_LEFT);
			setState(443);
			readId();
			setState(444);
			match(BRACKET_RIGHT);
			setState(445);
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

	public final ReadIdContext readId() throws RecognitionException {
		ReadIdContext _localctx = new ReadIdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_readId);
		try {
			_localctx = new IdReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(ID);
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
		enterRule(_localctx, 80, RULE_write_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(WRITE);
			setState(450);
			match(BRACKET_LEFT);
			setState(451);
			writeId();
			setState(452);
			match(BRACKET_RIGHT);
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

	public final WriteIdContext writeId() throws RecognitionException {
		WriteIdContext _localctx = new WriteIdContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_writeId);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdWriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(ID);
				}
				break;
			case TEXT:
				_localctx = new IdWriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(TEXT);
				setState(457);
				match(COMA);
				setState(458);
				match(ID);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u01ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000Y\b\u0000\u0001\u0000\u0003\u0000\\\b\u0000\u0001\u0000\u0003"+
		"\u0000_\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000k\b\u0000\n\u0000\f\u0000n\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001v\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0080\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0091\b\u0003\n\u0003\f\u0003\u0094\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u0098\b\u0004\u000b\u0004\f\u0004\u0099\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00a4\b\u0006\n\u0006\f\u0006\u00a7\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00b0\b\b\u0001\t\u0001\t\u0003\t\u00b4\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0004\f\u00ce\b\f\u000b\f\f\f\u00cf\u0001\r\u0001\r\u0003\r\u00d4\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0004\u0010\u00e9\b\u0010\u000b\u0010\f\u0010\u00ea\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00f3\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00fe"+
		"\b\u0011\n\u0011\f\u0011\u0101\t\u0011\u0001\u0011\u0005\u0011\u0104\b"+
		"\u0011\n\u0011\f\u0011\u0107\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u010f\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0004\u0014"+
		"\u0117\b\u0014\u000b\u0014\f\u0014\u0118\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0122"+
		"\b\u0016\n\u0016\f\u0016\u0125\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u0130\b\u0019\n\u0019\f\u0019\u0133\t\u0019\u0005\u0019\u0135"+
		"\b\u0019\n\u0019\f\u0019\u0138\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0004\u001a\u013e\b\u001a\u000b\u001a\f\u001a\u013f\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u014e\b\u001b\n\u001b\f\u001b\u0151\t\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u015e\b\u001d\u000b\u001d"+
		"\f\u001d\u015f\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0170\b\u001e\n\u001e"+
		"\f\u001e\u0173\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u017a\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0004 \u0180\b \u000b \f \u0181\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u018e\b!\n!\f!\u0191\t!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0004#\u019e\b#\u000b#\f#\u019f\u0001$\u0001$\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u01ae"+
		"\b$\n$\f$\u01b1\t$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0003)\u01cc\b)\u0001"+
		")\u0000\u0001\u0006*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000\u0003"+
		"\u0002\u0000\u0017\u0018--\u0001\u0000\n\r\u0002\u0000\u0017\u0017--\u01f5"+
		"\u0000T\u0001\u0000\u0000\u0000\u0002u\u0001\u0000\u0000\u0000\u0004w"+
		"\u0001\u0000\u0000\u0000\u0006\u007f\u0001\u0000\u0000\u0000\b\u0095\u0001"+
		"\u0000\u0000\u0000\n\u009b\u0001\u0000\u0000\u0000\f\u00a0\u0001\u0000"+
		"\u0000\u0000\u000e\u00a8\u0001\u0000\u0000\u0000\u0010\u00af\u0001\u0000"+
		"\u0000\u0000\u0012\u00b3\u0001\u0000\u0000\u0000\u0014\u00b5\u0001\u0000"+
		"\u0000\u0000\u0016\u00be\u0001\u0000\u0000\u0000\u0018\u00cb\u0001\u0000"+
		"\u0000\u0000\u001a\u00d3\u0001\u0000\u0000\u0000\u001c\u00d5\u0001\u0000"+
		"\u0000\u0000\u001e\u00de\u0001\u0000\u0000\u0000 \u00e8\u0001\u0000\u0000"+
		"\u0000\"\u00ec\u0001\u0000\u0000\u0000$\u010c\u0001\u0000\u0000\u0000"+
		"&\u0112\u0001\u0000\u0000\u0000(\u0114\u0001\u0000\u0000\u0000*\u011a"+
		"\u0001\u0000\u0000\u0000,\u011e\u0001\u0000\u0000\u0000.\u0126\u0001\u0000"+
		"\u0000\u00000\u0128\u0001\u0000\u0000\u00002\u012a\u0001\u0000\u0000\u0000"+
		"4\u013d\u0001\u0000\u0000\u00006\u0141\u0001\u0000\u0000\u00008\u0155"+
		"\u0001\u0000\u0000\u0000:\u015d\u0001\u0000\u0000\u0000<\u0161\u0001\u0000"+
		"\u0000\u0000>\u0179\u0001\u0000\u0000\u0000@\u017f\u0001\u0000\u0000\u0000"+
		"B\u0183\u0001\u0000\u0000\u0000D\u0195\u0001\u0000\u0000\u0000F\u019d"+
		"\u0001\u0000\u0000\u0000H\u01a1\u0001\u0000\u0000\u0000J\u01b5\u0001\u0000"+
		"\u0000\u0000L\u01b9\u0001\u0000\u0000\u0000N\u01bf\u0001\u0000\u0000\u0000"+
		"P\u01c1\u0001\u0000\u0000\u0000R\u01cb\u0001\u0000\u0000\u0000TU\u0005"+
		"\u0007\u0000\u0000UV\u0005-\u0000\u0000VX\u0005\u001a\u0000\u0000WY\u0003"+
		"\b\u0004\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001"+
		"\u0000\u0000\u0000Z\\\u0003\u0018\f\u0000[Z\u0001\u0000\u0000\u0000[\\"+
		"\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]_\u0003 \u0010\u0000"+
		"^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`l\u0005\b\u0000\u0000ak\u0005\u0018\u0000\u0000bk\u00034\u001a"+
		"\u0000ck\u0003:\u001d\u0000dk\u0003@ \u0000ek\u0003F#\u0000fk\u00032\u0019"+
		"\u0000gk\u0003P(\u0000hk\u0003L&\u0000ik\u0003\u0002\u0001\u0000ja\u0001"+
		"\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000jc\u0001\u0000\u0000\u0000"+
		"jd\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000"+
		"\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000"+
		"\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"op\u0005\t\u0000\u0000pq\u0005\u001f\u0000\u0000qr\u0005\u0000\u0000\u0001"+
		"r\u0001\u0001\u0000\u0000\u0000sv\u0003\u0004\u0002\u0000tv\u0003\u0006"+
		"\u0003\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0003"+
		"\u0001\u0000\u0000\u0000wx\u0005-\u0000\u0000xy\u0005\u0016\u0000\u0000"+
		"yz\u0003\u0006\u0003\u0000z{\u0005\u001a\u0000\u0000{\u0005\u0001\u0000"+
		"\u0000\u0000|}\u0006\u0003\uffff\uffff\u0000}\u0080\u0005\u0017\u0000"+
		"\u0000~\u0080\u0005-\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0092\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\n\u0007\u0000\u0000\u0082\u0083\u00050\u0000\u0000\u0083\u0091\u0003"+
		"\u0006\u0003\b\u0084\u0085\n\u0006\u0000\u0000\u0085\u0086\u00052\u0000"+
		"\u0000\u0086\u0091\u0003\u0006\u0003\u0007\u0087\u0088\n\u0005\u0000\u0000"+
		"\u0088\u0089\u00053\u0000\u0000\u0089\u0091\u0003\u0006\u0003\u0006\u008a"+
		"\u008b\n\u0004\u0000\u0000\u008b\u008c\u00051\u0000\u0000\u008c\u0091"+
		"\u0003\u0006\u0003\u0005\u008d\u008e\n\u0003\u0000\u0000\u008e\u008f\u0005"+
		"4\u0000\u0000\u008f\u0091\u0003\u0006\u0003\u0004\u0090\u0081\u0001\u0000"+
		"\u0000\u0000\u0090\u0084\u0001\u0000\u0000\u0000\u0090\u0087\u0001\u0000"+
		"\u0000\u0000\u0090\u008a\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000"+
		"\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0007\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u0005\u000e"+
		"\u0000\u0000\u0096\u0098\u0003\n\u0005\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\t\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0003\f\u0006\u0000\u009c\u009d\u0005\u0019\u0000\u0000\u009d"+
		"\u009e\u0003\u000e\u0007\u0000\u009e\u009f\u0005\u001a\u0000\u0000\u009f"+
		"\u000b\u0001\u0000\u0000\u0000\u00a0\u00a5\u0005-\u0000\u0000\u00a1\u00a2"+
		"\u0005\u001b\u0000\u0000\u00a2\u00a4\u0005-\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\r\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\u0010"+
		"\b\u0000\u00a9\u000f\u0001\u0000\u0000\u0000\u00aa\u00b0\u0005\n\u0000"+
		"\u0000\u00ab\u00b0\u0005\r\u0000\u0000\u00ac\u00b0\u0005\f\u0000\u0000"+
		"\u00ad\u00b0\u0005\u000b\u0000\u0000\u00ae\u00b0\u0003\u0012\t\u0000\u00af"+
		"\u00aa\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af"+
		"\u00ac\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u0011\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b4\u0003\u0014\n\u0000\u00b2\u00b4\u0003\u0016\u000b\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0013"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000f\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0005\u0000\u0000\u00b7\u00b8\u0005\u0017\u0000\u0000\u00b8\u00b9"+
		"\u0005\u001c\u0000\u0000\u00b9\u00ba\u0005\u0017\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0006\u0000\u0000\u00bb\u00bc\u0005\u0010\u0000\u0000\u00bc\u00bd"+
		"\u0005\n\u0000\u0000\u00bd\u0015\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u000f\u0000\u0000\u00bf\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c1\u0005"+
		"\u0017\u0000\u0000\u00c1\u00c2\u0005\u001c\u0000\u0000\u00c2\u00c3\u0005"+
		"\u0017\u0000\u0000\u00c3\u00c4\u0005\u001b\u0000\u0000\u00c4\u00c5\u0005"+
		"\u0017\u0000\u0000\u00c5\u00c6\u0005\u001c\u0000\u0000\u00c6\u00c7\u0005"+
		"\u0017\u0000\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000\u00c8\u00c9\u0005"+
		"\u0010\u0000\u0000\u00c9\u00ca\u0005\n\u0000\u0000\u00ca\u0017\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0005\u0011\u0000\u0000\u00cc\u00ce\u0003\u001a"+
		"\r\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u0019\u0001\u0000\u0000\u0000\u00d1\u00d4\u0003\u001c\u000e"+
		"\u0000\u00d2\u00d4\u0003\u001e\u000f\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u001b\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005\u0012\u0000\u0000\u00d6\u00d7\u0005\u0019\u0000"+
		"\u0000\u00d7\u00d8\u0005-\u0000\u0000\u00d8\u00d9\u0005\u0015\u0000\u0000"+
		"\u00d9\u00da\u0005\u001d\u0000\u0000\u00da\u00db\u0005\"\u0000\u0000\u00db"+
		"\u00dc\u0005\u001d\u0000\u0000\u00dc\u00dd\u0005\u001a\u0000\u0000\u00dd"+
		"\u001d\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0013\u0000\u0000\u00df"+
		"\u00e0\u0005\u0019\u0000\u0000\u00e0\u00e1\u0005-\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0015\u0000\u0000\u00e2\u00e3\u0005\u001d\u0000\u0000\u00e3\u00e4"+
		"\u0005-\u0000\u0000\u00e4\u00e5\u0005\u001d\u0000\u0000\u00e5\u00e6\u0005"+
		"\u001a\u0000\u0000\u00e6\u001f\u0001\u0000\u0000\u0000\u00e7\u00e9\u0003"+
		"\"\u0011\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb!\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005$\u0000\u0000"+
		"\u00ed\u00ee\u0005-\u0000\u0000\u00ee\u00ef\u0003$\u0012\u0000\u00ef\u00f0"+
		"\u0005\u0019\u0000\u0000\u00f0\u00f2\u0003&\u0013\u0000\u00f1\u00f3\u0003"+
		"\b\u0004\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00ff\u0005\b\u0000"+
		"\u0000\u00f5\u00fe\u00034\u001a\u0000\u00f6\u00fe\u0003:\u001d\u0000\u00f7"+
		"\u00fe\u0003@ \u0000\u00f8\u00fe\u0003F#\u0000\u00f9\u00fe\u0003\u0004"+
		"\u0002\u0000\u00fa\u00fe\u00032\u0019\u0000\u00fb\u00fe\u0003P(\u0000"+
		"\u00fc\u00fe\u0003L&\u0000\u00fd\u00f5\u0001\u0000\u0000\u0000\u00fd\u00f6"+
		"\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000\u00fd\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0105"+
		"\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0104"+
		"\u0007\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107"+
		"\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0003\u0004\u0002\u0000\u0109\u010a"+
		"\u0005\t\u0000\u0000\u010a\u010b\u0005\u001a\u0000\u0000\u010b#\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0005\u0003\u0000\u0000\u010d\u010f\u0003"+
		"(\u0014\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0004"+
		"\u0000\u0000\u0111%\u0001\u0000\u0000\u0000\u0112\u0113\u0007\u0001\u0000"+
		"\u0000\u0113\'\u0001\u0000\u0000\u0000\u0114\u0116\u0005\u000e\u0000\u0000"+
		"\u0115\u0117\u0003*\u0015\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119)\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0003,\u0016\u0000\u011b\u011c\u0005\u0019\u0000\u0000\u011c\u011d\u0003"+
		".\u0017\u0000\u011d+\u0001\u0000\u0000\u0000\u011e\u0123\u0005-\u0000"+
		"\u0000\u011f\u0120\u0005\u001b\u0000\u0000\u0120\u0122\u0005-\u0000\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124-\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u00030\u0018\u0000\u0127/\u0001\u0000\u0000\u0000\u0128\u0129\u0007"+
		"\u0001\u0000\u0000\u01291\u0001\u0000\u0000\u0000\u012a\u012b\u0005-\u0000"+
		"\u0000\u012b\u0136\u0005\u0003\u0000\u0000\u012c\u0131\u0007\u0002\u0000"+
		"\u0000\u012d\u012e\u0005\u001b\u0000\u0000\u012e\u0130\u0007\u0002\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000"+
		"\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0134\u012c\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0005\u0004\u0000\u0000\u013a\u013b\u0005\u001a\u0000"+
		"\u0000\u013b3\u0001\u0000\u0000\u0000\u013c\u013e\u00036\u001b\u0000\u013d"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"5\u0001\u0000\u0000\u0000\u0141\u0142\u0005%\u0000\u0000\u0142\u0143\u0003"+
		"8\u001c\u0000\u0143\u0144\u0005&\u0000\u0000\u0144\u014f\u0005\b\u0000"+
		"\u0000\u0145\u014e\u00034\u001a\u0000\u0146\u014e\u0003:\u001d\u0000\u0147"+
		"\u014e\u0003@ \u0000\u0148\u014e\u0003F#\u0000\u0149\u014e\u0003\u0004"+
		"\u0002\u0000\u014a\u014e\u00032\u0019\u0000\u014b\u014e\u0003P(\u0000"+
		"\u014c\u014e\u0003L&\u0000\u014d\u0145\u0001\u0000\u0000\u0000\u014d\u0146"+
		"\u0001\u0000\u0000\u0000\u014d\u0147\u0001\u0000\u0000\u0000\u014d\u0148"+
		"\u0001\u0000\u0000\u0000\u014d\u0149\u0001\u0000\u0000\u0000\u014d\u014a"+
		"\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0005\t\u0000\u0000\u0153\u0154\u0005\u001a\u0000\u0000\u01547\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0005\u0003\u0000\u0000\u0156\u0157\u0005"+
		"-\u0000\u0000\u0157\u0158\u0005#\u0000\u0000\u0158\u0159\u0007\u0002\u0000"+
		"\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0004\u0000"+
		"\u0000\u015b9\u0001\u0000\u0000\u0000\u015c\u015e\u0003<\u001e\u0000\u015d"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		";\u0001\u0000\u0000\u0000\u0161\u0162\u0005(\u0000\u0000\u0162\u0163\u0003"+
		">\u001f\u0000\u0163\u0164\u0005\'\u0000\u0000\u0164\u0165\u0007\u0002"+
		"\u0000\u0000\u0165\u0166\u0005&\u0000\u0000\u0166\u0171\u0005\b\u0000"+
		"\u0000\u0167\u0170\u00034\u001a\u0000\u0168\u0170\u0003:\u001d\u0000\u0169"+
		"\u0170\u0003@ \u0000\u016a\u0170\u0003F#\u0000\u016b\u0170\u0003\u0004"+
		"\u0002\u0000\u016c\u0170\u00032\u0019\u0000\u016d\u0170\u0003P(\u0000"+
		"\u016e\u0170\u0003L&\u0000\u016f\u0167\u0001\u0000\u0000\u0000\u016f\u0168"+
		"\u0001\u0000\u0000\u0000\u016f\u0169\u0001\u0000\u0000\u0000\u016f\u016a"+
		"\u0001\u0000\u0000\u0000\u016f\u016b\u0001\u0000\u0000\u0000\u016f\u016c"+
		"\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u016e"+
		"\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174"+
		"\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0005\t\u0000\u0000\u0175\u0176\u0005\u001a\u0000\u0000\u0176=\u0001"+
		"\u0000\u0000\u0000\u0177\u017a\u0005-\u0000\u0000\u0178\u017a\u0001\u0000"+
		"\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0016"+
		"\u0000\u0000\u017c\u017d\u0005\u0017\u0000\u0000\u017d?\u0001\u0000\u0000"+
		"\u0000\u017e\u0180\u0003B!\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182A\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0005)\u0000\u0000\u0184\u018f\u0005\b\u0000\u0000\u0185\u018e\u0003"+
		"4\u001a\u0000\u0186\u018e\u0003:\u001d\u0000\u0187\u018e\u0003@ \u0000"+
		"\u0188\u018e\u0003F#\u0000\u0189\u018e\u0003\u0004\u0002\u0000\u018a\u018e"+
		"\u00032\u0019\u0000\u018b\u018e\u0003P(\u0000\u018c\u018e\u0003L&\u0000"+
		"\u018d\u0185\u0001\u0000\u0000\u0000\u018d\u0186\u0001\u0000\u0000\u0000"+
		"\u018d\u0187\u0001\u0000\u0000\u0000\u018d\u0188\u0001\u0000\u0000\u0000"+
		"\u018d\u0189\u0001\u0000\u0000\u0000\u018d\u018a\u0001\u0000\u0000\u0000"+
		"\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000"+
		"\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0005\t\u0000\u0000\u0193"+
		"\u0194\u0003D\"\u0000\u0194C\u0001\u0000\u0000\u0000\u0195\u0196\u0005"+
		"*\u0000\u0000\u0196\u0197\u0005-\u0000\u0000\u0197\u0198\u0005#\u0000"+
		"\u0000\u0198\u0199\u0005-\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0005\u001a\u0000\u0000\u019bE\u0001\u0000\u0000\u0000\u019c"+
		"\u019e\u0003H$\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0G\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005+\u0000"+
		"\u0000\u01a2\u01a3\u0003J%\u0000\u01a3\u01a4\u0005,\u0000\u0000\u01a4"+
		"\u01af\u0005\b\u0000\u0000\u01a5\u01ae\u00034\u001a\u0000\u01a6\u01ae"+
		"\u0003:\u001d\u0000\u01a7\u01ae\u0003@ \u0000\u01a8\u01ae\u0003F#\u0000"+
		"\u01a9\u01ae\u0003\u0004\u0002\u0000\u01aa\u01ae\u00032\u0019\u0000\u01ab"+
		"\u01ae\u0003P(\u0000\u01ac\u01ae\u0003L&\u0000\u01ad\u01a5\u0001\u0000"+
		"\u0000\u0000\u01ad\u01a6\u0001\u0000\u0000\u0000\u01ad\u01a7\u0001\u0000"+
		"\u0000\u0000\u01ad\u01a8\u0001\u0000\u0000\u0000\u01ad\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ad\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000"+
		"\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0005\t\u0000\u0000\u01b3\u01b4\u0005\u001a\u0000"+
		"\u0000\u01b4I\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005-\u0000\u0000\u01b6"+
		"\u01b7\u0005#\u0000\u0000\u01b7\u01b8\u0007\u0002\u0000\u0000\u01b8K\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0005\u0001\u0000\u0000\u01ba\u01bb\u0005"+
		"\u0003\u0000\u0000\u01bb\u01bc\u0003N\'\u0000\u01bc\u01bd\u0005\u0004"+
		"\u0000\u0000\u01bd\u01be\u0005\u001a\u0000\u0000\u01beM\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0005-\u0000\u0000\u01c0O\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0005\u0002\u0000\u0000\u01c2\u01c3\u0005\u0003\u0000\u0000\u01c3"+
		"\u01c4\u0003R)\u0000\u01c4\u01c5\u0005\u0004\u0000\u0000\u01c5\u01c6\u0005"+
		"\u001a\u0000\u0000\u01c6Q\u0001\u0000\u0000\u0000\u01c7\u01cc\u0005-\u0000"+
		"\u0000\u01c8\u01c9\u0005\u0018\u0000\u0000\u01c9\u01ca\u0005\u001b\u0000"+
		"\u0000\u01ca\u01cc\u0005-\u0000\u0000\u01cb\u01c7\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c8\u0001\u0000\u0000\u0000\u01ccS\u0001\u0000\u0000\u0000\'"+
		"X[^jlu\u007f\u0090\u0092\u0099\u00a5\u00af\u00b3\u00cf\u00d3\u00ea\u00f2"+
		"\u00fd\u00ff\u0105\u010e\u0118\u0123\u0131\u0136\u013f\u014d\u014f\u015f"+
		"\u016f\u0171\u0179\u0181\u018d\u018f\u019f\u01ad\u01af\u01cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}