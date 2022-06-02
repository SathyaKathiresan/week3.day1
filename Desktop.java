package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Size of the Desktop");
	}
	
	public static void main(String[] args) {
		Desktop objDesk = new Desktop();
		objDesk.computerModel();
		objDesk.desktopSize();
		
	}
	

}
