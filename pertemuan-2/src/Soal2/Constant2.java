package Soal2;
public class Constant2 {
	// field/attribut statis pada class Constant2 sehingga ketika beberapa instance/objek yang diinisialisasi dengan class ini maka variabel ini akan di share ke instance/object tersebut
	public static final double CM_PER_INCH = 2.54;
	public static void main(String[] args) {
		// variabel local
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}