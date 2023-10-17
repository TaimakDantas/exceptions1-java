package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		method1();
		
		System.out.println("End of Program");
		sc.close();
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid position!");	
//			exibe a exceção que esta ocorrendo no momento
//			e.printStackTrace();
//			sc.next();
		}
		
		catch(InputMismatchException e) {
			System.out.println("Input erro");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}
	
}
