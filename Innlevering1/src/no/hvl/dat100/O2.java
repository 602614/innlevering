package no.hvl.dat100;

public class O2 {

	public static void main(String[] args) {
		
		final int N = 10;
		
		
	
	for (int i = 0; i != N; i++) {
		
		String tallstr = javax.swing.JOptionPane.showInputDialog("Din poengsum?");
		int poeng = Integer.parseInt(tallstr);
	
		
		if (poeng >=90 && poeng <= 100) {
			System.out.println("Du fikk karakteren A");
		}else if (poeng >= 80 && poeng <= 89) {
			System.out.println("Du fikk karakteren B");
		}else if (poeng >= 60 && poeng <=79) {
			System.out.println("Du fikk karakteren C");
		}else if (poeng >= 50 && poeng <= 59) {
			System.out.println("Du fikk karakteren D");
		}else if (poeng >= 40 && poeng <= 49) {
			System.out.println("Du fikk karakteren E");
		}else if (poeng >= 0 && poeng <= 39) {
			System.out.println("Du fikk karakteren F");
		}else if (poeng > 100 || poeng < 0) {
			i--;
		}
	}

	}

		
}
