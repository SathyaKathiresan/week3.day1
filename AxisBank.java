package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Deposit in Axisbank");
	}


	public static void main(String[] args) {
		AxisBank objAx = new AxisBank();
		objAx.deposit();
		objAx.fixed();
		objAx.saving();
		
		
	}

}
