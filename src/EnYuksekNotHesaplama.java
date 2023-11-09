
/* 20 kişilik bir dizi belirleyip elemanlarını random komutu ile yani rastgele  belirledikten sonra bu dizinin
en büyük 5 elemanını yazdırma kodu */


import java.util.Random;
import java.util.Scanner;

public class EnYuksekNotHesaplama {




   public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		Random r = new Random();
	
		int []dizi = new int [20];
		int gecici;
		
		System.out.println("Sınıfın Notları : ");
	
	for(int i  = 0 ; i < 20 ; i++) {
		
	  
		dizi[i]=r.nextInt(100);
		System.out.println(dizi[i]);

		
		}
	
	
    for(int i = 0; i < dizi.length; i++)
    {
        for(int j = i+1; j < dizi.length; j++)
        {
            if(dizi[j] >  dizi[i]) {
                gecici = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = gecici;
            }
        }
    }
    for(int i = 0; i < 5; i++)
    {
        System.out.println("Sınıfın en yüksek " + (i+1) + " . notu :  " + dizi[i]);
    }
}

	  
	}
