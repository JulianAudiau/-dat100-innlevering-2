package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

        for(int[] tabeller: matrise) {
            for (int verdi: tabeller) {
                System.out.print(verdi + " ");
            }
            System.out.println();
        }
            //throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
        String streng = "";

        for(int i = 0; i <matrise.length; i++) {
            for (int j = 0; j <matrise[i].length; j++) {
                streng += matrise[i][j] + " ";
            }
            streng += "\n";
        }

        return streng;



		// TODO
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nymatrise = new int[matrise.length][matrise[0].length];
        for(int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++){
                nymatrise[i][j]= matrise[i][j]*tall;
            }
        }
		return nymatrise;

		//throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;

        // TODO
		//throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {


		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
