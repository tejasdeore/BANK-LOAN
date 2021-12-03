package bankLoan;

import java.util.Scanner;

public class BankApp {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		int ch;
		System.out.println("..............RESERVE BANK OF INDIA...........");
		System.out.println("Please fill the detils to procced further.Thank you!!");
		
		System.out.println("\n\nPlease Enter Your  first Name only:");
		String name ="";
		 name +=sc.nextLine();
		
		System.out.println("Please Enter Your Account number :");
		long accno =sc.nextLong();
		
		System.out.println("Please Enter Your Mobile number :");
		String mobno =sc.next();
		
		System.out.println("\n Name : "+name);
		System.out.println(" Account number : "+accno);
		System.out.println(" Contact Nuimber : "+mobno);
		do
		{
			System.out.println("\n\n \t \t WE ARE HAPPY TO HELP YOU !!");
			System.out.println("choose the option to know loan details ");
			System.out.println("Main Menu\n1.SBI\n2.AXIS\n3.PNB\n4.Exit");
			System.out.println("PLEASE...Enter your choice");
			ch=sc.nextInt();
			
			switch (ch)
			{
			case 1:
				SBI   s1  = new SBI();
				float ans = s1.calculteintrest();
				System.out.println("Intrest on principal amount"+s1.p+"rs for"+s1.d+"yrs with intrest rate"+s1.sbi_irate+ " % is"+ans);
				break;
				
			case 2:
				AXIS a1 = new AXIS();
				float ans1 = a1.calculteintrest();
				System.out.println("Intrest on principal amount"+a1.p+"rs for"+a1.d+"yrs with intrest rate"+a1.axis_irate+ " % is"+ans1);
				break;
			case 3:
				PNB p1 = new PNB();
				float ans2 = p1.calculteintrest();
				System.out.println("Intrest on principal amount"+p1.p+"rs for"+p1.d+"yrs with intrest rate"+p1.pnb_irate+ " % is"+ans2);
				break;
			case 4:
				System.out.println("HAVE A GOOD DAY ... :) ");
			}
			
		}
		while(ch!=4);
	}
	
	

}
