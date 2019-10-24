/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan63.gradiengarislurus;

/**
 *
 * @author ASUS
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: Menghitung Gradient
 */
public class IF110118008Latihan63GradienGarisLurus {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Koordinat koor = new Koordinat(2, 10, 5, 7);
		System.out.printf("Garis yang melalui titik (%d, %d) dan (%d, %d) \nmemiliki gradien sebesar %d", koor.getX1(), koor.getY1(), koor.getX2(), koor.getY2(), koor.hitungGradien());
		Koordinat koor1 = new Koordinat(5, 1, 3, 12);
		System.out.printf("\nGaris yang melalui titik (%d, %d) dan (%d, %d) \nmemiliki gradien sebesar %d\n", koor1.getX1(), koor1.getY1(), koor1.getX2(), koor1.getY2(), koor1.hitungGradien());
	}
	
}
