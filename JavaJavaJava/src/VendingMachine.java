import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		VendingMachineClass vendingMachine = new VendingMachineClass();
		Scanner scan = new Scanner(System.in);
		
		while(!vendingMachine.totalMoney()) {
			System.out.print("Please enter either 5, 10, 25, 100: ");
			vendingMachine.DepositCoin(scan.nextInt());
		}
		
		vendingMachine.DisplayDrinkSelection();
		scan.close();
	}

}
