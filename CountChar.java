import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String x;
		char y;
		
		System.out.println("Masukkan String: ");
		x = input.nextLine();
		
		System.out.println("Masukkan Character: ");
		y = input.nextLine().charAt(0); 
	
		myCountChar(x, y);
	}
	
	public static void myCountChar(String x, char y) {
		ArrayList<Character> array = new ArrayList<>();
		
		int hasil = 0;
		
		for(int i = 0; i < x.length(); i++) {
			array.add(x.charAt(i));
		}
		for(int i = 0; i < x.length(); i++) {
			if(array.get(i) == y) {
				hasil++;
			}
		}
		
		System.out.println("Hasil: " +hasil);
	}

}
