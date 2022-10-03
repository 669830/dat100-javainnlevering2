package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		for (int[] navn : matrise) {
			for (int verdi : navn) {
				System.out.print(verdi+" ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String ut = "";
		for (int[] i : matrise) {
			for (int verdi : i) {
				ut += verdi + " ";
			}
			ut += "\n";
		}
		return ut;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		int[][] nymat = new int[matrise.length][matrise[1].length];//Det er for å bestemme lengden. grunn til
		// å velge 0 er for å ta fra 0 tabbellen. du kan ta hva som helst tall fra et tabell så lenge den er i tabellen
		// kan for eks være 1 eller 2, hvis du har tabell til 5 så kan du for eks ta 3, men siden den har bare 3
		// så kan du bare ta 0,1,2 siden java teller fra 0
		
		for(int i = 0; i<matrise.length; i++){
			
			for (int y=0; y<matrise[i].length; y++ ){
				nymat[i][y] = matrise[i][y]*tall;
				
			}
		}
		return nymat;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		boolean likL = true;
		boolean lik = true; 
		int i =0;
		if (a.length != b.length) {
			likL = false;
		}
		while(i<a.length && lik == true && likL == true) {
			int y = 0;
			while(y<a[i].length && lik == true) {
				if (a[i][y] !=b[i][y]) {
					lik = false;
				}
				y++;
			}
			i++;
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		int [][] nymat = new int [matrise.length][matrise[0].length];
		int a =0;
		
		for (int i=0; i<matrise.length; i++) {
				int i2 = 0;
				
				for (int y=0; y<matrise.length; y++) {
					nymat[i][a]=matrise[y][i2];
					
					i2++;
				}
				a++;
				
		}
			return nymat;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
