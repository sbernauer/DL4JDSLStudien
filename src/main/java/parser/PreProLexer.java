// Generated from src/main/java/parser/PrePro.g4 by ANTLR 4.7.1

package parser;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreProLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, WS=16, BLOCK_COMMENT=17, 
		LINE_COMMENT=18, TYPE=19, IDENTIFIER=20, STRING_LITERAL=21, NUMERIC_LITERAL=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "WS", "BLOCK_COMMENT", 
		"LINE_COMMENT", "LETTER", "NON_ZERO_DIGIT", "DIGIT", "STRING_CHAR", "TYPE", 
		"IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'('", "')'", "'{'", "'}'", "','", "';'", "'='", "'print'", 
		"'debug'", "'+'", "'-'", "'*'", "'crossproduct'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "WS", "BLOCK_COMMENT", "LINE_COMMENT", "TYPE", 
		"IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL"
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


	public PreProLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrePro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\6"+
		"\21q\n\21\r\21\16\21r\3\21\3\21\3\22\3\22\3\22\3\22\7\22{\n\22\f\22\16"+
		"\22~\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0089\n\23"+
		"\f\23\16\23\u008c\13\23\3\23\3\23\3\24\5\24\u0091\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00a0\n\30\3\31"+
		"\3\31\3\31\7\31\u00a5\n\31\f\31\16\31\u00a8\13\31\3\32\3\32\7\32\u00ac"+
		"\n\32\f\32\16\32\u00af\13\32\3\32\3\32\3\33\5\33\u00b4\n\33\3\33\3\33"+
		"\3\33\7\33\u00b9\n\33\f\33\16\33\u00bc\13\33\5\33\u00be\n\33\3|\2\34\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\2)\2+\2-\2/\25\61\26\63\27\65\30\3\2\b\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\6\2&&C\\aac|\3\2\63;\3\2\62;\6\2\f\f\17\17$$^^\2\u00c4"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67"+
		"\3\2\2\2\5@\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3"+
		"\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25T\3\2\2\2\27Z\3\2\2\2\31\\\3\2\2\2\33"+
		"^\3\2\2\2\35`\3\2\2\2\37m\3\2\2\2!p\3\2\2\2#v\3\2\2\2%\u0084\3\2\2\2\'"+
		"\u0090\3\2\2\2)\u0092\3\2\2\2+\u0094\3\2\2\2-\u0096\3\2\2\2/\u009f\3\2"+
		"\2\2\61\u00a1\3\2\2\2\63\u00a9\3\2\2\2\65\u00b3\3\2\2\2\678\7h\2\289\7"+
		"w\2\29:\7p\2\2:;\7e\2\2;<\7v\2\2<=\7k\2\2=>\7q\2\2>?\7p\2\2?\4\3\2\2\2"+
		"@A\7*\2\2A\6\3\2\2\2BC\7+\2\2C\b\3\2\2\2DE\7}\2\2E\n\3\2\2\2FG\7\177\2"+
		"\2G\f\3\2\2\2HI\7.\2\2I\16\3\2\2\2JK\7=\2\2K\20\3\2\2\2LM\7?\2\2M\22\3"+
		"\2\2\2NO\7r\2\2OP\7t\2\2PQ\7k\2\2QR\7p\2\2RS\7v\2\2S\24\3\2\2\2TU\7f\2"+
		"\2UV\7g\2\2VW\7d\2\2WX\7w\2\2XY\7i\2\2Y\26\3\2\2\2Z[\7-\2\2[\30\3\2\2"+
		"\2\\]\7/\2\2]\32\3\2\2\2^_\7,\2\2_\34\3\2\2\2`a\7e\2\2ab\7t\2\2bc\7q\2"+
		"\2cd\7u\2\2de\7u\2\2ef\7r\2\2fg\7t\2\2gh\7q\2\2hi\7f\2\2ij\7w\2\2jk\7"+
		"e\2\2kl\7v\2\2l\36\3\2\2\2mn\7\61\2\2n \3\2\2\2oq\t\2\2\2po\3\2\2\2qr"+
		"\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\21\2\2u\"\3\2\2\2vw\7\61\2"+
		"\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2"+
		"\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7,\2\2\u0080\u0081\7\61\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\b\22\2\2\u0083$\3\2\2\2\u0084\u0085\7\61\2"+
		"\2\u0085\u0086\7\61\2\2\u0086\u008a\3\2\2\2\u0087\u0089\n\3\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\23\2\2\u008e"+
		"&\3\2\2\2\u008f\u0091\t\4\2\2\u0090\u008f\3\2\2\2\u0091(\3\2\2\2\u0092"+
		"\u0093\t\5\2\2\u0093*\3\2\2\2\u0094\u0095\t\6\2\2\u0095,\3\2\2\2\u0096"+
		"\u0097\n\7\2\2\u0097.\3\2\2\2\u0098\u0099\7x\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7e\2\2\u009b\u00a0\7\65\2\2\u009c\u009d\7o\2\2\u009d\u009e\7c\2"+
		"\2\u009e\u00a0\7v\2\2\u009f\u0098\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\60"+
		"\3\2\2\2\u00a1\u00a6\5\'\24\2\u00a2\u00a5\5\'\24\2\u00a3\u00a5\5+\26\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\62\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ad\7$\2\2\u00aa\u00ac\5-\27\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1\64\3\2\2\2\u00b2\u00b4\7/\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00bd\3\2\2\2\u00b5\u00be"+
		"\7\62\2\2\u00b6\u00ba\5)\25\2\u00b7\u00b9\5+\26\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2\2\2\u00be"+
		"\66\3\2\2\2\16\2r|\u008a\u0090\u009f\u00a4\u00a6\u00ad\u00b3\u00ba\u00bd"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}