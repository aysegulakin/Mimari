package _22010310005_Aysegul_Akin_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class _22010310005_Main {

	public static void main(String[] args) {

		_22010310005_Signal sinyal = new _22010310005_Signal();

		String filePath = "denetim_fonksiyonlari.txt";
	
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String satir;
			System.out.println("denetim_fonksiyonlari.txt dosyası okundu.");
			while ((satir = br.readLine()) != null) {

				String[] kelimeler = satir.split("\\s+");
				
				
				System.out.println("Denetim fonksiyonu: " + Arrays.toString(kelimeler));
				sinyal.SinyalAl(kelimeler);
				

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}