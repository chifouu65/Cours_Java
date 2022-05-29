package fr.chifouu.FONCTIONS.cours;

public class Fonction {

    public static int reponse;

    //fonction pour recuperer un nombre /5
    private static int getInt() {
        return 5;
    }

    //fonction pour recupérer une foncion qui est vrais /true
    private static boolean getResponse() {
        return true;
    }

    public static void getCalculAdditions() {

        int number_A = 2;
        int number_B = 3;
        int reponse = 0;

        reponse = reponse + number_A + number_B;

        System.out.println
                ("la réponse du calcul " + number_A + "+" + number_B+" est de " + reponse);

        return;//se termine a la fin du code exécuter
    }

}
