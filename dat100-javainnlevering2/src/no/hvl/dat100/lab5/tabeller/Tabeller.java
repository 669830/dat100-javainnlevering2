package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int i : tabell) {
			System.out.println(i+" ");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
 
		// TODO
		String itabell = "[";
		for (int i=0; i<tabell.length; i++) {
			itabell += tabell[i];
			if (i <tabell.length-1){
				itabell += ",";
			}
		}
		itabell +="]";
		return itabell;
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;
		/*for (int i =0; i<tabell.length; i++) {
			sum += tabell[i];
			
		}
		return sum;
		*/
		//int sum = 0;
	    //for (int value : tabell) {
			// sum += value;
	   // }
	    //return sum;
		
		int j = 0;
		while(j<tabell.length) {
			sum += tabell[j];
			j++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
boolean finnes = false;
		
		int i = 0;
		
		while (!finnes && i<tabell.length) {
			
			if (tabell[i] == tall) {
				finnes = true;
			}
			
			i++;
		}
		
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		if (tabell == null) {
			return -1;
		}
		int i = 0;
		while (i<tabell.length) {
			if(tabell[i]==tall) {
				return i;
			}else {
				i=i+1;
			}
			
			}
		
		return -1;
	}

	
	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int[] nytab = new int [tabell.length];
		int y = 0;
		for (int i = tabell.length -1; i>=0; i--) {
			nytab[y]=tabell[i];
			y++;
		}
		return nytab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		for(int i = 0; i<tabell.length-1; i++) {
			if(tabell[i]>tabell[i+1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int tab1 = tabell1.length;
		int tab2 = tabell2.length;
		int[] nytab = new int[tab1 + tab2];
		int pos = 0;
		for (int element : tabell1) {
			nytab[pos] = element;
			pos++;
		}
		for (int element : tabell2) {
			nytab[pos] = element;
			pos++;
		}
		return nytab;
	}
}
