package banking;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		while(true) {
			System.out.println("--------------------Menu------------------");
			System.out.println("Choose what do you want to do:");
			System.out.println("1. Opening an account");
			System.out.println("2. Check your Balance");
			System.out.println("3. Withdrawal");
			System.out.println("4. Deposit");
			System.out.println("5. Exit");
			System.out.println("Enter your option which you want : ");
			int option=scn.nextInt();
			switch(option) {
				case 1:
					System.out.println("Enter your name :");
					String name=scn.next();
					System.out.println("Enter the initial amount you want to deposit");
					int balance=scn.nextInt();	
					BankManagement.AccountOpen(name,balance);
					break;
				case 2:
					System.out.println("Enter your cust ID");
					int id1=scn.nextInt();
					BankManagement.checkBalance(id1);
					break;
				case 3:
					System.out.println("Enter your cust ID");
					int id2=scn.nextInt();
					System.out.println("Enter amount you want to withdrawal");
					int amount=scn.nextInt();
					BankManagement.withdrawal(id2,amount);
					break;
				case 4:
					System.out.println("Enter your cust ID");
					int id3=scn.nextInt();
					System.out.println("Enter amount you want to deposit");
					int amount1=scn.nextInt();
					BankManagement.deposit(id3,amount1);
					break;
				case 5:
					System.out.println("Exit successfully");
					return;
				default:
					System.out.println("Wrong input enter again");
					break;
			}
		}
	}
}