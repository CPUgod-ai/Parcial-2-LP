// Generated from CRUD.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CRUDParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INSERT=1, INTO=2, FIND=3, FROM=4, WHERE=5, UPDATE=6, SET=7, DELETE=8, 
		AND=9, OR=10, NOT=11, NULL=12, BOOL=13, EQ=14, NEQ=15, LTE=16, GTE=17, 
		LT=18, GT=19, ASSIGN=20, PLUS=21, MINUS=22, MULT=23, DIV=24, LBRACE=25, 
		RBRACE=26, LPAREN=27, RPAREN=28, SEMICOLON=29, COLON=30, COMMA=31, FLOAT=32, 
		INT=33, STRING=34, ID=35, WS=36, COMMENT=37;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_insertar = 2, RULE_buscar = 3, 
		RULE_actualizar = 4, RULE_eliminar = 5, RULE_lista = 6, RULE_condicion = 7, 
		RULE_op = 8, RULE_valor = 9, RULE_campo = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "insertar", "buscar", "actualizar", "eliminar", 
			"lista", "condicion", "op", "valor", "campo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INSERT'", "'INTO'", "'FIND'", "'FROM'", "'WHERE'", "'UPDATE'", 
			"'SET'", "'DELETE'", "'AND'", "'OR'", "'NOT'", "'NULL'", null, "'=='", 
			"'!='", "'<='", "'>='", "'<'", "'>'", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'{'", "'}'", "'('", "')'", "';'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INSERT", "INTO", "FIND", "FROM", "WHERE", "UPDATE", "SET", "DELETE", 
			"AND", "OR", "NOT", "NULL", "BOOL", "EQ", "NEQ", "LTE", "GTE", "LT", 
			"GT", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "SEMICOLON", "COLON", "COMMA", "FLOAT", "INT", "STRING", "ID", 
			"WS", "COMMENT"
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
	public String getGrammarFileName() { return "CRUD.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CRUDParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CRUDParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				sentencia();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 330L) != 0) );
			setState(27);
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
	public static class SentenciaContext extends ParserRuleContext {
		public InsertarContext insertar() {
			return getRuleContext(InsertarContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CRUDParser.SEMICOLON, 0); }
		public BuscarContext buscar() {
			return getRuleContext(BuscarContext.class,0);
		}
		public ActualizarContext actualizar() {
			return getRuleContext(ActualizarContext.class,0);
		}
		public EliminarContext eliminar() {
			return getRuleContext(EliminarContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				insertar();
				setState(30);
				match(SEMICOLON);
				}
				break;
			case FIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				buscar();
				setState(33);
				match(SEMICOLON);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				actualizar();
				setState(36);
				match(SEMICOLON);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				eliminar();
				setState(39);
				match(SEMICOLON);
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
	public static class InsertarContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(CRUDParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(CRUDParser.INTO, 0); }
		public TerminalNode ID() { return getToken(CRUDParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(CRUDParser.LBRACE, 0); }
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CRUDParser.RBRACE, 0); }
		public InsertarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterInsertar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitInsertar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitInsertar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertarContext insertar() throws RecognitionException {
		InsertarContext _localctx = new InsertarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(INSERT);
			setState(44);
			match(INTO);
			setState(45);
			match(ID);
			setState(46);
			match(LBRACE);
			setState(47);
			lista();
			setState(48);
			match(RBRACE);
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
	public static class BuscarContext extends ParserRuleContext {
		public TerminalNode FIND() { return getToken(CRUDParser.FIND, 0); }
		public TerminalNode FROM() { return getToken(CRUDParser.FROM, 0); }
		public TerminalNode ID() { return getToken(CRUDParser.ID, 0); }
		public TerminalNode WHERE() { return getToken(CRUDParser.WHERE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public BuscarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buscar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterBuscar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitBuscar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitBuscar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuscarContext buscar() throws RecognitionException {
		BuscarContext _localctx = new BuscarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_buscar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(FIND);
			setState(51);
			match(FROM);
			setState(52);
			match(ID);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(53);
				match(WHERE);
				setState(54);
				condicion(0);
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
	public static class ActualizarContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(CRUDParser.UPDATE, 0); }
		public TerminalNode ID() { return getToken(CRUDParser.ID, 0); }
		public TerminalNode SET() { return getToken(CRUDParser.SET, 0); }
		public CampoContext campo() {
			return getRuleContext(CampoContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CRUDParser.ASSIGN, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(CRUDParser.WHERE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ActualizarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterActualizar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitActualizar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitActualizar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizarContext actualizar() throws RecognitionException {
		ActualizarContext _localctx = new ActualizarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actualizar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(UPDATE);
			setState(58);
			match(ID);
			setState(59);
			match(SET);
			setState(60);
			campo();
			setState(61);
			match(ASSIGN);
			setState(62);
			valor(0);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(63);
				match(WHERE);
				setState(64);
				condicion(0);
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
	public static class EliminarContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(CRUDParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(CRUDParser.FROM, 0); }
		public TerminalNode ID() { return getToken(CRUDParser.ID, 0); }
		public TerminalNode WHERE() { return getToken(CRUDParser.WHERE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public EliminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eliminar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterEliminar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitEliminar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitEliminar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EliminarContext eliminar() throws RecognitionException {
		EliminarContext _localctx = new EliminarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eliminar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(DELETE);
			setState(68);
			match(FROM);
			setState(69);
			match(ID);
			setState(70);
			match(WHERE);
			setState(71);
			condicion(0);
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
	public static class ListaContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(CRUDParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CRUDParser.COLON, i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CRUDParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CRUDParser.COMMA, i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			campo();
			setState(74);
			match(COLON);
			setState(75);
			valor(0);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(76);
				match(COMMA);
				setState(77);
				campo();
				setState(78);
				match(COLON);
				setState(79);
				valor(0);
				}
				}
				setState(85);
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
	public static class CondicionContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CRUDParser.NOT, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(CRUDParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CRUDParser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(CRUDParser.AND, 0); }
		public TerminalNode OR() { return getToken(CRUDParser.OR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_condicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(87);
				valor(0);
				setState(88);
				op();
				setState(89);
				valor(0);
				}
				break;
			case 2:
				{
				setState(91);
				match(NOT);
				setState(92);
				condicion(2);
				}
				break;
			case 3:
				{
				setState(93);
				match(LPAREN);
				setState(94);
				condicion(0);
				setState(95);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new CondicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(99);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(100);
						match(AND);
						setState(101);
						condicion(5);
						}
						break;
					case 2:
						{
						_localctx = new CondicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(OR);
						setState(104);
						condicion(4);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class OpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CRUDParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CRUDParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(CRUDParser.LT, 0); }
		public TerminalNode GT() { return getToken(CRUDParser.GT, 0); }
		public TerminalNode LTE() { return getToken(CRUDParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(CRUDParser.GTE, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
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
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CRUDParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CRUDParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(CRUDParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(CRUDParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(CRUDParser.NULL, 0); }
		public TerminalNode ID() { return getToken(CRUDParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CRUDParser.LPAREN, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CRUDParser.RPAREN, 0); }
		public TerminalNode PLUS() { return getToken(CRUDParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CRUDParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(CRUDParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CRUDParser.DIV, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		return valor(0);
	}

	private ValorContext valor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValorContext _localctx = new ValorContext(_ctx, _parentState);
		ValorContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_valor, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(113);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(114);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(115);
				match(STRING);
				}
				break;
			case BOOL:
				{
				setState(116);
				match(BOOL);
				}
				break;
			case NULL:
				{
				setState(117);
				match(NULL);
				}
				break;
			case ID:
				{
				setState(118);
				match(ID);
				}
				break;
			case LPAREN:
				{
				setState(119);
				match(LPAREN);
				setState(120);
				valor(0);
				setState(121);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ValorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_valor);
						setState(125);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(126);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						valor(10);
						}
						break;
					case 2:
						{
						_localctx = new ValorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_valor);
						setState(128);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(129);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						valor(9);
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class CampoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CRUDParser.ID, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRUDListener ) ((CRUDListener)listener).exitCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRUDVisitor ) return ((CRUDVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 9:
			return valor_sempred((ValorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean valor_sempred(ValorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u008b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"*\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00038\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"B\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006R\b\u0006\n\u0006\f\u0006"+
		"U\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007j\b\u0007\n\u0007\f\u0007m\t\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t|\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0084\b\t\n\t\f\t\u0087\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0000\u0002\u000e\u0012\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0001\u0000\u000e\u0013\u0001"+
		"\u0000\u0015\u0016\u0001\u0000\u0017\u0018\u0092\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000"+
		"\u00062\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\nC\u0001\u0000"+
		"\u0000\u0000\fI\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000"+
		"\u0010n\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014\u0088"+
		"\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e\u001f"+
		"\u0005\u001d\u0000\u0000\u001f*\u0001\u0000\u0000\u0000 !\u0003\u0006"+
		"\u0003\u0000!\"\u0005\u001d\u0000\u0000\"*\u0001\u0000\u0000\u0000#$\u0003"+
		"\b\u0004\u0000$%\u0005\u001d\u0000\u0000%*\u0001\u0000\u0000\u0000&\'"+
		"\u0003\n\u0005\u0000\'(\u0005\u001d\u0000\u0000(*\u0001\u0000\u0000\u0000"+
		")\u001d\u0001\u0000\u0000\u0000) \u0001\u0000\u0000\u0000)#\u0001\u0000"+
		"\u0000\u0000)&\u0001\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0001\u0000\u0000,-\u0005\u0002\u0000\u0000-.\u0005#\u0000\u0000"+
		"./\u0005\u0019\u0000\u0000/0\u0003\f\u0006\u000001\u0005\u001a\u0000\u0000"+
		"1\u0005\u0001\u0000\u0000\u000023\u0005\u0003\u0000\u000034\u0005\u0004"+
		"\u0000\u000047\u0005#\u0000\u000056\u0005\u0005\u0000\u000068\u0003\u000e"+
		"\u0007\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0007"+
		"\u0001\u0000\u0000\u00009:\u0005\u0006\u0000\u0000:;\u0005#\u0000\u0000"+
		";<\u0005\u0007\u0000\u0000<=\u0003\u0014\n\u0000=>\u0005\u0014\u0000\u0000"+
		">A\u0003\u0012\t\u0000?@\u0005\u0005\u0000\u0000@B\u0003\u000e\u0007\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000"+
		"\u0000CD\u0005\b\u0000\u0000DE\u0005\u0004\u0000\u0000EF\u0005#\u0000"+
		"\u0000FG\u0005\u0005\u0000\u0000GH\u0003\u000e\u0007\u0000H\u000b\u0001"+
		"\u0000\u0000\u0000IJ\u0003\u0014\n\u0000JK\u0005\u001e\u0000\u0000KS\u0003"+
		"\u0012\t\u0000LM\u0005\u001f\u0000\u0000MN\u0003\u0014\n\u0000NO\u0005"+
		"\u001e\u0000\u0000OP\u0003\u0012\t\u0000PR\u0001\u0000\u0000\u0000QL\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000T\r\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VW\u0006\u0007\uffff\uffff\u0000WX\u0003\u0012\t\u0000XY\u0003\u0010"+
		"\b\u0000YZ\u0003\u0012\t\u0000Zb\u0001\u0000\u0000\u0000[\\\u0005\u000b"+
		"\u0000\u0000\\b\u0003\u000e\u0007\u0002]^\u0005\u001b\u0000\u0000^_\u0003"+
		"\u000e\u0007\u0000_`\u0005\u001c\u0000\u0000`b\u0001\u0000\u0000\u0000"+
		"aV\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000"+
		"\u0000bk\u0001\u0000\u0000\u0000cd\n\u0004\u0000\u0000de\u0005\t\u0000"+
		"\u0000ej\u0003\u000e\u0007\u0005fg\n\u0003\u0000\u0000gh\u0005\n\u0000"+
		"\u0000hj\u0003\u000e\u0007\u0004ic\u0001\u0000\u0000\u0000if\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000l\u000f\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000no\u0007\u0000\u0000\u0000o\u0011\u0001\u0000\u0000\u0000pq\u0006"+
		"\t\uffff\uffff\u0000q|\u0005!\u0000\u0000r|\u0005 \u0000\u0000s|\u0005"+
		"\"\u0000\u0000t|\u0005\r\u0000\u0000u|\u0005\f\u0000\u0000v|\u0005#\u0000"+
		"\u0000wx\u0005\u001b\u0000\u0000xy\u0003\u0012\t\u0000yz\u0005\u001c\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{p\u0001\u0000\u0000\u0000{r\u0001\u0000"+
		"\u0000\u0000{s\u0001\u0000\u0000\u0000{t\u0001\u0000\u0000\u0000{u\u0001"+
		"\u0000\u0000\u0000{v\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000"+
		"|\u0085\u0001\u0000\u0000\u0000}~\n\t\u0000\u0000~\u007f\u0007\u0001\u0000"+
		"\u0000\u007f\u0084\u0003\u0012\t\n\u0080\u0081\n\b\u0000\u0000\u0081\u0082"+
		"\u0007\u0002\u0000\u0000\u0082\u0084\u0003\u0012\t\t\u0083}\u0001\u0000"+
		"\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005#\u0000\u0000\u0089\u0015\u0001\u0000\u0000"+
		"\u0000\u000b\u0019)7ASaik{\u0083\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}