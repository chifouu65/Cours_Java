package fr.chifouu.Main;

public class intNotes {

    public static void intNote(String[] args) {
        // int[] = list de nombres(notes de cours) { *,*,* }
        int[] notes = { 22,12,12,12};
        //definie la valeur de debut de calcul
        int calcul = 0;

        for(int note : notes){
            calcul = calcul + note;
        }

        //calcul + les notes(list).length = à la moyenne
        System.out.println("la moyenn de la personne est de " + (calcul / notes.length));
    }

}
