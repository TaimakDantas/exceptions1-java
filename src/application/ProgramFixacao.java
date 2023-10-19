package application;

import java.util.Scanner;

import model.entities.AccountFixacao;
import model.exceptions.DomainExceptionFixacao;

public class ProgramFixacao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter account data");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.println("Withdraw Limit: ");
		double wlimit = sc.nextDouble();
		
		AccountFixacao account = new AccountFixacao(number, holder, balance, wlimit);
		
		System.out.println();
		System.out.println("Enter amount for withdraw: ");
		double with = sc.nextDouble();
		
		account.withdraw(with);
		System.out.println(account);
		}
		catch(DomainExceptionFixacao e) {
			
			System.out.println("Withdraw erro:"+ e.getMessage());
			
		}
		catch(RuntimeException e) {
			
			System.out.println("Unexpected error");
			
		}
		sc.close();
	}
}
