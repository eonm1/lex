package codigo;

/* The following code was generated by JFlex 1.4.3 on 24/06/20 2:09 */

import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 24/06/20 2:09 from the specification file
 * <tt>/Users/erick/Downloads/Descargas-Jun2020/Babel/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\46\2\0\1\4\22\0\1\4\1\52\1\64\1\4"+
    "\1\45\1\51\1\51\1\0\1\55\1\56\1\50\1\50\1\4\1\3"+
    "\1\65\1\50\12\2\1\57\1\54\1\53\1\47\1\53\2\0\1\40"+
    "\1\23\1\27\1\20\1\5\1\26\2\1\1\32\2\1\1\37\1\15"+
    "\2\1\1\43\1\1\1\31\1\13\1\35\1\1\1\24\4\1\1\62"+
    "\1\0\1\63\1\0\1\1\1\0\1\16\1\30\1\21\1\25\1\10"+
    "\1\1\1\34\1\41\1\14\2\1\1\22\1\33\1\6\1\12\1\44"+
    "\1\1\1\11\1\17\1\7\1\42\5\1\1\60\1\0\1\61\163\0"+
    "\1\36\uff0e\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\16\2\1\1"+
    "\1\6\1\4\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\1\1\22\1\23"+
    "\1\2\1\24\23\2\1\0\1\25\1\11\3\0\1\26"+
    "\1\27\1\23\7\2\1\24\17\2\1\0\1\27\2\0"+
    "\1\23\14\2\1\30\5\2\1\22\1\0\1\23\12\2"+
    "\1\0\4\2\1\30\2\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\66\0\330\0\u010e\0\u0144"+
    "\0\u017a\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4"+
    "\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402\0\66\0\u0438\0\66"+
    "\0\u0438\0\u0438\0\66\0\u046e\0\66\0\66\0\66\0\66"+
    "\0\66\0\66\0\u04a4\0\u04da\0\u0510\0\u0546\0\u057c\0\u05b2"+
    "\0\u05e8\0\u061e\0\u0654\0\u068a\0\u06c0\0\u06f6\0\u072c\0\u0762"+
    "\0\u0798\0\u07ce\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc\0\u0912"+
    "\0\u0948\0\u097e\0\u0402\0\u0402\0\66\0\u09b4\0\u09ea\0\u04a4"+
    "\0\u04a4\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8\0\u0b2e\0\u0b64"+
    "\0\u0b9a\0\u0bd0\0\154\0\u0c06\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde"+
    "\0\u0d14\0\u0d4a\0\u0d80\0\u0db6\0\u0dec\0\u0e22\0\u0e58\0\u0e8e"+
    "\0\u0ec4\0\u0efa\0\u0f30\0\66\0\u0f66\0\u0f9c\0\u0fd2\0\u1008"+
    "\0\u103e\0\u1074\0\u10aa\0\u10e0\0\u1116\0\u114c\0\u1182\0\u11b8"+
    "\0\u11ee\0\u1224\0\u125a\0\154\0\u1290\0\u12c6\0\u12fc\0\u1332"+
    "\0\u1368\0\66\0\u139e\0\u13d4\0\u140a\0\u1440\0\u1476\0\u14ac"+
    "\0\u14e2\0\u1518\0\u154e\0\u1584\0\u15ba\0\u15f0\0\u1626\0\u165c"+
    "\0\u1692\0\u16c8\0\u16fe\0\66\0\u1734\0\u176a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\5\3\1\10"+
    "\1\3\1\11\2\3\1\12\2\3\1\13\1\14\1\3"+
    "\1\15\1\16\1\3\1\17\1\20\2\3\1\21\1\2"+
    "\1\22\1\23\2\3\1\24\1\3\1\25\1\26\1\27"+
    "\1\5\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\2\67\0\2\3"+
    "\2\0\31\3\1\0\6\3\22\0\1\44\1\4\2\0"+
    "\31\44\1\0\6\44\20\0\1\45\4\0\1\6\62\0"+
    "\2\3\2\0\1\3\1\46\27\3\1\0\6\3\22\0"+
    "\2\3\2\0\7\3\1\47\21\3\1\0\6\3\22\0"+
    "\2\3\2\0\7\3\1\50\21\3\1\0\6\3\22\0"+
    "\2\3\2\0\3\3\1\51\1\3\1\52\23\3\1\0"+
    "\6\3\22\0\2\3\2\0\5\3\1\53\23\3\1\0"+
    "\6\3\22\0\2\3\2\0\3\3\1\54\25\3\1\0"+
    "\6\3\22\0\2\3\2\0\7\3\1\55\1\3\1\56"+
    "\3\3\1\57\13\3\1\0\3\3\1\60\2\3\22\0"+
    "\2\3\2\0\11\3\1\61\3\3\1\62\13\3\1\0"+
    "\6\3\22\0\2\3\2\0\3\3\1\63\25\3\1\0"+
    "\3\3\1\64\2\3\22\0\2\3\2\0\1\3\1\65"+
    "\24\3\1\66\2\3\1\0\6\3\22\0\2\3\2\0"+
    "\11\3\1\67\17\3\1\0\6\3\22\0\2\3\2\0"+
    "\11\3\1\70\17\3\1\0\6\3\22\0\2\3\2\0"+
    "\1\3\1\71\27\3\1\0\6\3\22\0\2\3\2\0"+
    "\5\3\1\72\23\3\1\0\6\3\21\0\45\73\1\74"+
    "\1\0\17\73\47\0\1\75\20\0\1\76\1\77\62\0"+
    "\46\100\1\0\15\100\1\101\1\100\1\0\1\44\3\0"+
    "\31\44\1\0\6\44\23\0\1\102\62\0\1\103\1\0"+
    "\2\3\2\0\2\3\1\104\26\3\1\0\6\3\22\0"+
    "\2\3\2\0\1\3\1\105\27\3\1\0\6\3\22\0"+
    "\2\3\2\0\3\3\1\106\25\3\1\0\6\3\22\0"+
    "\2\3\2\0\14\3\1\107\14\3\1\0\6\3\22\0"+
    "\2\3\2\0\23\3\1\110\5\3\1\0\6\3\22\0"+
    "\2\3\2\0\5\3\1\111\23\3\1\0\6\3\22\0"+
    "\2\3\2\0\4\3\1\112\24\3\1\0\6\3\22\0"+
    "\2\3\2\0\1\3\1\113\27\3\1\0\6\3\22\0"+
    "\2\3\2\0\15\3\1\114\13\3\1\0\6\3\22\0"+
    "\2\3\2\0\5\3\1\115\23\3\1\0\6\3\22\0"+
    "\2\3\2\0\1\3\1\116\27\3\1\0\6\3\22\0"+
    "\2\3\2\0\20\3\1\117\10\3\1\0\6\3\22\0"+
    "\2\3\2\0\11\3\1\120\17\3\1\0\6\3\22\0"+
    "\2\3\2\0\2\3\1\121\26\3\1\0\6\3\22\0"+
    "\2\3\2\0\2\3\1\122\26\3\1\0\6\3\22\0"+
    "\2\3\2\0\7\3\1\123\17\3\1\124\1\3\1\0"+
    "\6\3\22\0\2\3\2\0\11\3\1\125\17\3\1\0"+
    "\5\3\1\126\22\0\2\3\2\0\26\3\1\127\2\3"+
    "\1\0\6\3\22\0\2\3\2\0\4\3\1\130\24\3"+
    "\1\0\6\3\22\0\2\3\2\0\14\3\1\131\14\3"+
    "\1\0\6\3\22\0\2\3\2\0\12\3\1\132\16\3"+
    "\1\0\6\3\22\0\1\133\1\76\2\0\31\133\1\0"+
    "\6\133\11\0\1\134\6\0\1\135\2\0\1\136\65\0"+
    "\1\102\62\0\1\137\65\0\1\103\1\0\2\3\2\0"+
    "\3\3\1\140\25\3\1\0\6\3\22\0\2\3\2\0"+
    "\5\3\1\113\23\3\1\0\6\3\22\0\2\3\2\0"+
    "\1\3\1\141\27\3\1\0\6\3\22\0\2\3\2\0"+
    "\15\3\1\142\13\3\1\0\6\3\22\0\2\3\2\0"+
    "\15\3\1\143\13\3\1\0\6\3\22\0\2\3\2\0"+
    "\15\3\1\144\13\3\1\0\6\3\22\0\2\3\2\0"+
    "\20\3\1\145\10\3\1\0\6\3\22\0\2\3\2\0"+
    "\12\3\1\146\16\3\1\0\6\3\22\0\2\3\2\0"+
    "\2\3\1\147\26\3\1\0\6\3\22\0\2\3\2\0"+
    "\14\3\1\150\14\3\1\0\6\3\22\0\2\3\2\0"+
    "\3\3\1\151\25\3\1\0\6\3\22\0\2\3\2\0"+
    "\12\3\1\152\16\3\1\0\6\3\22\0\2\3\2\0"+
    "\5\3\1\153\23\3\1\0\6\3\22\0\2\3\2\0"+
    "\11\3\1\154\17\3\1\0\6\3\22\0\2\3\2\0"+
    "\14\3\1\155\14\3\1\0\6\3\22\0\2\3\2\0"+
    "\4\3\1\156\24\3\1\0\6\3\22\0\2\3\2\0"+
    "\27\3\1\157\1\3\1\0\6\3\22\0\2\3\2\0"+
    "\4\3\1\160\24\3\1\0\6\3\22\0\2\3\2\0"+
    "\11\3\1\161\17\3\1\0\6\3\22\0\2\3\2\0"+
    "\27\3\1\146\1\3\1\0\6\3\22\0\2\3\2\0"+
    "\31\3\1\0\2\3\1\146\3\3\22\0\2\3\2\0"+
    "\7\3\1\116\21\3\1\0\6\3\22\0\1\133\3\0"+
    "\31\133\1\0\6\133\11\0\1\162\11\0\1\163\65\0"+
    "\1\136\62\0\1\135\2\0\1\164\64\0\2\3\2\0"+
    "\4\3\1\146\24\3\1\0\6\3\22\0\2\3\2\0"+
    "\2\3\1\165\26\3\1\0\6\3\22\0\2\3\2\0"+
    "\11\3\1\166\17\3\1\0\6\3\22\0\2\3\2\0"+
    "\3\3\1\154\25\3\1\0\6\3\22\0\2\3\2\0"+
    "\3\3\1\167\25\3\1\0\6\3\22\0\2\3\2\0"+
    "\11\3\1\170\17\3\1\0\6\3\22\0\2\3\2\0"+
    "\5\3\1\154\23\3\1\0\6\3\22\0\2\3\2\0"+
    "\11\3\1\171\17\3\1\0\6\3\22\0\2\3\2\0"+
    "\7\3\1\172\21\3\1\0\6\3\22\0\2\3\2\0"+
    "\1\3\1\173\27\3\1\0\6\3\22\0\2\3\2\0"+
    "\3\3\1\113\25\3\1\0\6\3\22\0\2\3\2\0"+
    "\4\3\1\174\24\3\1\0\6\3\22\0\2\3\2\0"+
    "\7\3\1\105\21\3\1\0\6\3\22\0\2\3\2\0"+
    "\3\3\1\175\25\3\1\0\6\3\22\0\2\3\2\0"+
    "\3\3\1\55\25\3\1\0\6\3\22\0\2\3\2\0"+
    "\7\3\1\176\21\3\1\0\6\3\22\0\2\3\2\0"+
    "\31\3\1\177\6\3\23\0\1\163\53\0\1\134\11\0"+
    "\1\164\62\0\1\137\1\0\2\3\2\0\4\3\1\200"+
    "\24\3\1\0\6\3\22\0\2\3\2\0\4\3\1\201"+
    "\24\3\1\0\6\3\22\0\2\3\2\0\11\3\1\202"+
    "\17\3\1\0\6\3\22\0\2\3\2\0\20\3\1\104"+
    "\10\3\1\0\6\3\22\0\2\3\2\0\1\3\1\203"+
    "\27\3\1\0\6\3\22\0\2\3\2\0\5\3\1\55"+
    "\23\3\1\0\6\3\22\0\2\3\2\0\11\3\1\113"+
    "\17\3\1\0\6\3\22\0\2\3\2\0\1\3\1\201"+
    "\27\3\1\0\6\3\22\0\2\3\2\0\12\3\1\173"+
    "\16\3\1\0\6\3\22\0\2\3\2\0\26\3\1\152"+
    "\2\3\1\0\6\3\33\0\1\204\54\0\2\3\2\0"+
    "\11\3\1\205\17\3\1\0\6\3\22\0\2\3\2\0"+
    "\11\3\1\206\17\3\1\0\6\3\22\0\2\3\2\0"+
    "\1\3\1\146\27\3\1\0\6\3\22\0\2\3\2\0"+
    "\2\3\1\143\26\3\1\0\6\3\22\0\2\3\2\0"+
    "\12\3\1\113\16\3\1\0\6\3\22\0\2\3\2\0"+
    "\4\3\1\113\24\3\1\0\6\3\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6048];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\20\1\1\11\1\1\1\11"+
    "\2\1\1\11\1\1\6\11\30\1\1\0\1\1\1\11"+
    "\3\0\32\1\1\0\1\11\2\0\23\1\1\11\1\0"+
    "\13\1\1\0\4\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
    String cadena="";
    PintarPalabras pintar = new PintarPalabras();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 164) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: 
          { pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;
          }
        case 25: break;
        case 24: 
          { pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;
          }
        case 26: break;
        case 18: 
          { pintar.pintaRojo(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return ErrorIdentificador;
          }
        case 27: break;
        case 4: 
          { lexeme=yytext(); return OpAritmetico;
          }
        case 28: break;
        case 10: 
          { lexeme=yytext(); return finSentencia;
          }
        case 29: break;
        case 1: 
          { pintar.pintaRojo(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return ERROR;
          }
        case 30: break;
        case 21: 
          { pintar.pintaVerCla(yychar,yylength());/*Ignore*/
          }
        case 31: break;
        case 22: 
          { lexeme=yytext(); return C_Cadena;
          }
        case 32: break;
        case 8: 
          { lexeme=yytext(); return No;
          }
        case 33: break;
        case 6: 
          { lexeme=yytext(); return Salto;
          }
        case 34: break;
        case 19: 
          { pintar.pintaRojo(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return ErrorNumero;
          }
        case 35: break;
        case 13: 
          { lexeme=yytext(); return DosPuntos;
          }
        case 36: break;
        case 7: 
          { lexeme=yytext(); return OpLogico;
          }
        case 37: break;
        case 11: 
          { lexeme=yytext(); return agrupacionIzquierda;
          }
        case 38: break;
        case 9: 
          { lexeme=yytext(); return OpRelacional;
          }
        case 39: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 40: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 41: break;
        case 17: 
          { lexeme=yytext(); return cierraCorchete;
          }
        case 42: break;
        case 15: 
          { lexeme=yytext(); return cierraLlave;
          }
        case 43: break;
        case 12: 
          { lexeme=yytext(); return agrupacionDerecha;
          }
        case 44: break;
        case 16: 
          { lexeme=yytext(); return abreCorchete;
          }
        case 45: break;
        case 5: 
          { /*Ignore*/
          }
        case 46: break;
        case 23: 
          { lexeme=yytext(); return NumeroFlotante;
          }
        case 47: break;
        case 14: 
          { lexeme=yytext(); return abreLlave;
          }
        case 48: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
