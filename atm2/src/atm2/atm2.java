package atm2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class atm2 {

	public static void main(String[] args) {
		
	int choice,balance=50000,amount,pincode=9211;
	Scanner scan = new Scanner(System.in);
	System.out.println("     WELCOME TO STATE BANK OF INDIA ATM     "+"\n"+"     Insert your card     "+"\n");
	System.out.println("     Enter your pincode     ");
		
		try
			{
			pincode=scan.nextInt();
	
			
	
			if(pincode==9211)               //pincode checking
			{			
		               System.out.println("     1.Withdrawl    "+ "\n" + "     2.Balance Enquiry");
	
		               choice=scan.nextInt();
		               if(choice==1)
		               		{ 	System.out.println("Enter Your Amount");
		               				
		               		
		               		amount=scan.nextInt();
		               			if(amount<=balance&&amount%100==0&&amount>500)
		               				{
		               					System.out.println("Money Withdrawl = "+amount);
		               					System.out.println("\nRemaining account balance is"+(balance-amount));
		               					System.out.println("Thank You!!! ");
		               				}
		               			else
		               				{
		               				System.out.println("\n"+"wrong input");
		               				
		               				}
		               		}
		               else if(choice==2)
		               		{
		            	   	System.out.println("Your Current Balance "+balance);
		               		}
		               	else
		               	{	
		               		System.out.println("Wrong choice");
		               	}
	    	   
	       
		

         }
	else
	{
		System.out.println("Invalid pin");
	}
			}
		

		catch(InputMismatchException e)
			{
			System.out.println("Enter valid keyword");	
			System.exit(0);					//end of try catch
		
			}
		
	}
	

	}

	
