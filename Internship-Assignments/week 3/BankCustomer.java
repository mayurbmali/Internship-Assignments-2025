import java.util.*;
public class BankCustomer{

	private double bankBalance;

	BankCustomer()
	{
		this.bankBalance=500.00;	
	}

	public void Deposit(double amount)
	{
		if(amount>0)
		{
			bankBalance+=amount;
		}
		else
			System.out.println("Enter appropriate amount.");	
	}

	public void Withdraw(double amount)
	{
		if(amount>0)
		{
			if(bankBalance-amount>=500)
			{
				bankBalance-=amount;
			}
			else
			{
				System.out.println("\nInsufficient Balance !! \nMinimum 500 Rupees must be maintained.");
			}
		}
		
		else{
			System.out.println("Enter appropriate amount.");	
		}
	}

	public void displayBalance()
	{
		System.out.println("\nCurrent Balance is : "+bankBalance+" Rupees.");
	}
	
	public static void main(String args[])
	{	
		BankCustomer customer=new BankCustomer();
		Scanner sc =new Scanner(System.in);

		do
		{
			System.out.println("\nChoose an Option.");
			System.out.println("1: Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: Check Balance");
			System.out.println("4: Exit\n");

			int choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter the amount to Deposit : ");
					double deposit =sc.nextInt();
					customer.Deposit(deposit);
					break;

				case 2:
					System.out.print("Enter the amount to Withdraw : ");
					double withdraw =sc.nextInt();
					customer.Withdraw(withdraw);
					break;

				case 3:
					customer.displayBalance();
					break;

				case 4:
					System.out.println("Exiting Do visit again ThankYou !!");
					sc.close();
					System.exit(0);
					
				default:
					System.out.println("Enter appropriate amount.");

			}
		}while(true);
	}
}














