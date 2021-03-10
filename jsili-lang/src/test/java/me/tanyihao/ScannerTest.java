package me.tanyihao;

import junit.framework.TestCase;

public class ScannerTest extends TestCase {

  public void testScanTokens() {
    String code = "var tanhao = 23.1;";
    Scanner scanner = new Scanner(code);
    for (Token token : scanner.scanTokens()) {
      System.out.println(token);
    }

  }
}