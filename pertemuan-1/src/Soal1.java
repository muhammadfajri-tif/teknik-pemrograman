public class Soal1 {
  public static void main(String[] args) {
    byte angka1 = 125;
    byte angka2 = 6;

    // type casting: memaksa hasil dari variable untuk mengubah menjadi tipe data
    // tsb
    byte hasil = (byte) (angka1 + angka2);

    System.out.println("Hasil 1 " + hasil);
    // output: -125
    // Hal ini dikarenakan tipe data 'byte' hanya 1 byte sehingga range angka nya
    // hanya -128 hingga 127
    // Apabila nilainya melebihi range, maka akan dihitung menjadi -128
  }
}
