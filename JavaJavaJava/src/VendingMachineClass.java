import java.util.Scanner;

public class VendingMachineClass {
	Scanner scan = new Scanner(System.in);
	final int COST_OF_DRINK = 150;
	private int runningTotal = 0;
	
	public VendingMachineClass() {
		runningTotal = 0;
	}
	
	public void DepositCoin(int money) {
		switch(money) {
		case 5:
			runningTotal += money;
			checkTotal();
			break;
		case 10:
			runningTotal += money;
			checkTotal();
			break;
		case 25:
			runningTotal += money;
			checkTotal();
			break;
		case 100:
			runningTotal += money;
			checkTotal();
			break;
		default: 
			System.out.println("Invalid entry!");
			checkTotal();
			break;
		}
	}
	
	private void checkTotal() {
		System.out.println("You need to deposit at least 150. Your total entry is " + runningTotal + ".");
	}
	
	public boolean totalMoney() {
		return(runningTotal >= COST_OF_DRINK);
	}
	
	public void DisplayDrinkSelection() {
		System.out.println();
		System.out.println("*****************");
		System.out.println("* C - Coke      *");
		System.out.println("* P - Pepsi     *");
		System.out.println("* D - Diet Coke *");
		System.out.println("*****************");
		System.out.println();
		System.out.print("Please select one: ");
		MakeDrinkSelection(scan.next().toUpperCase().charAt(0));
	}
	
	private void MakeDrinkSelection(char selection) {
		boolean selectionOK = false;
		
		System.out.println();
		while(!selectionOK) {
			switch(selection) {
			case 'C':
				System.out.println("Thank you for choosing Coke!");
				CalculateChange();
				selectionOK = true;
				break;
			case 'P':
				System.out.println("Thank you for choosing Pepsi!");
				CalculateChange();
				selectionOK = true;
				break;
			case 'D':
				System.out.println("Thank you for choosing Diet Coke!");
				CalculateChange();
				selectionOK = true;
				break;
			default:
				System.out.print("Invalid input. Please try again: ");
				selection = scan.next().toUpperCase().charAt(0);
				selectionOK = false;
				break;
			}
		}
	}
	
	private void CalculateChange() {
		if(runningTotal >= COST_OF_DRINK)
		System.out.println("Your change is " + (runningTotal - COST_OF_DRINK) + ".");
	}
	
}
