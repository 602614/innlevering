package no.hvl.dat100;

public class O3 {

	public static void main(String[] args) {
		
		String tallstr = javax.swing.JOptionPane.showInputDialog("Heltall?");
		int heltall = Integer.parseInt(tallstr);
		
		int x = 1;
		int n = heltall;
		
		while (n > 0) {
			x *= n;
			n--;
		}
		
		System.out.println("Fakultet til " + heltall + " er " + x);

		
	}

}
