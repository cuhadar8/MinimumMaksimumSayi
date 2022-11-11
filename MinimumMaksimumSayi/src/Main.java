import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Minimum maksimum sayı bulma programı");
		System.out.print("Kaç sayı gireceksiniz? : ");
		int counter = scanner.nextInt();  
		
		int minimum = Integer.MAX_VALUE;         //kullanıcının 1 ve 0 değerlerini girme ihtimaline karşın minimum ve
		int maximum = Integer.MIN_VALUE;		//maksimum değişkenlerimize bu değerleri atamayı seçtim
		int number;
		
		for(int i = 1; i<=counter; i++) {
			System.out.print( i + ". Sayı: " );
			number = scanner.nextInt();
			if(number > maximum) {
				maximum = number;
			}
			
			if(number < minimum) {
				minimum = number;
			}
		}
		System.out.println("En büyük değer: " + maximum);
		System.out.println("En küçük değer: " + minimum);

	}

}
