public class Soal2 {
  public static void main(String[] args) {
    int i = 42;

    // ternary operation (versi singkat dari if-else)
    // format syntax: (kondisi) ? expression-true : expression-false
    String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
    System.out.println(s);
  }
}
