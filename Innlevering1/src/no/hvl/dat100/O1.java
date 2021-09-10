package no.hvl.dat100;

public class O1 {

	public static void main(String[] args) {
		
		double sats1 = 0.93;
		double sats2 = 2.41;
		double sats3 = 11.52;
		double sats4 = 14.52;
		
		String tallstr = javax.swing.JOptionPane.showInputDialog("Din bruttoinntekt?");
		int inntekt = Integer.parseInt(tallstr);
		
		if (inntekt <= 164100) {
			System.out.println("Ingen skatt");
		}else if (inntekt >= 164101 && inntekt <= 230951) {
			System.out.println("Trinnskatten din er: " + inntekt*sats1/100);
		}else if (inntekt >= 230951 && inntekt <=580650) {
			System.out.println("Trinnskatten din er: " + inntekt*sats2/100);
		}else if (inntekt >= 580651 && inntekt <= 934050) {
			System.out.println("Trinnskatten din er: " + inntekt*sats3/100);
		}else {
			System.out.println("Trinnskatten din er: " + inntekt*sats4/100);
		}

	}

}
