package Soal2;
public class Constant {
	public static void main(String[] args) {
		// ketiga variable dibawah merupakan variabel local
		// Keyword final merupakan penanda bahwa variabel tersebut berjenis konstanta
		final double CM_PER_INCH = 2.54;

		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}

}