package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        // TODO
        int[] tabellHeltall = {0, 2, 4, 6, 8};

        for (int i = 0; i < tabellHeltall.length; i++) {
            System.out.println(tabellHeltall[i]);
        }


    }

    // b)
    public static String tilStreng(int[] tabell) {

        if (tabell.length == 0) return "[]";

        String resultat = "[" + tabell[0];
        for (int i = 1; i < tabell.length; i++) {
            resultat += "," + tabell[i];

        }
        resultat += "]";
        return resultat;
    }


    // c)
    public static int summer(int[] tabell) {


        int sum = 0;
        for (int resultat : tabell) {
            sum += resultat;

        }
        return sum;

        //throw new UnsupportedOperationException("Metoden summer ikke implementert");
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {


        for (int tallVerdi : tabell)
        {
            if (tallVerdi == tall) {
                return true;
            }

        }
        return false;
    }

		//throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");



	// e)
	public static int posisjonTall(int[] tabell, int tall) {

	for (int i=0; i < tabell.length; i++){

        if(tabell[i] == tall){
        return i;}


    }
    return -1;

		//throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

            int[] nyTabell = new int[tabell.length];
            for (int i = 0; i < tabell.length; i++) {
                nyTabell[i] = tabell[tabell.length - 1 - i];
            }
            return nyTabell;


		//throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i = 0; i < tabell.length -1; i++){
            if (tabell[i] > tabell[i + 1]){
                return false;
            }
        }
        return true;
        // TODO
		//throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
     int[] tabell3 = new int[tabell1.length + tabell2.length];
        for (int i = 0; i < tabell1.length; i++) {
            tabell3[i] = tabell1[i];     int verdi2 = 0;}

        for (int i = 0; i < tabell2.length; i++) {
                tabell3[tabell1.length + i] = tabell2[i];}


     return tabell3;




        // TODO
		//throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
