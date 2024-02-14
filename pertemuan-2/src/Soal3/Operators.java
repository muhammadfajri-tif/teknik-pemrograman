package Soal3;

public class Operators {

  public static void main(String[] args) {
    double x = 92.98;

    // Dengan typecasting nilai akan di konversi ke tipe data tsb
    // default dari method Math.round() akan mengembalikan tipe data long
    // int nx = Math.round(x); // Error: tipe data variabel dan tipe data value
    // berbeda
    int nx = (int) Math.round(x);

    // nilai akan dibulatkan dan berubah menjadi tipe data int
    // jika nilai diatas dan sama dengan .5 maka akan dibulatkan keatas
    // jika nilai dibawah .5 maka akan dibulatkan kebawah
    System.out.println(nx);
  }
}
