package me.tanyihao;

public class Token {
  final TokenType type;
  final String lexeme;
  final Object literal;
  final int line; // 位置信息

  public Token(TokenType type, String lexeme, Object literal, int line) {
    this.type = type;
    this.lexeme = lexeme;
    this.literal = literal;
    this.line = line;
  }

  @Override
  public String toString() {
    return type + " " + lexeme + " " + literal;
  }
}
