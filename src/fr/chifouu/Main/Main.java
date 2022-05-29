package fr.chifouu.Main;

import fr.chifouu.OBJECT.Player;

import java.awt.*;

import static fr.chifouu.FONCTIONS.cours.Fonction.getCalculAdditions;

public class Main {

    public static void main(String[] args) {
        int you_money = 1000;
        int price_phone = 800;
        boolean you_have_phone = false;

        //user
        String name = "Jean,Noah,Nasime";

             //si la money et = ou + a prix du tel & que tu n'a pas de telephone alors  {
        if(you_money >= price_phone && !you_have_phone) {
                //envoie le msg si la somme est = ou +
            System.out.println("tu as assez d'argent pour ce telephone");
            //ou alors envoi le else {
        } else {
            //reponse si la sonne n'est pas = ou +   ou que vous avez deja un telphone
            System.out.println("tu n'as pas assez d'argent pour acheter ce tlephone");
        }

        System.out.println("===============================");// coupure

        String pseudo = name; //pseudo de l'user
        String[] pseudos = pseudo.split(","); // separe les personne dans la list a partir des " , " virgules
        //envoie le num de l'user demander
        System.out.println(pseudos[1]);

        //pour tout les string nommé pseudo
        for(String str : pseudos) {
            //renvois la liste de tout les user
            System.out.println(str);
        }

        //int i = 0;
        //envoi un msg tant que i n'est pas egale a 7
        //while ((i != 7)) {
            //rajoute 1 a i qui est de base 0
            //i++;
            //envoi du msg formage 7 fois avec un décompte
            //System.out.println("fromage / " + i);
        //}
        System.out.println("===============================");// coupure
        //fais appel a la fonction getcalculAdditions dans la class fontions
        getCalculAdditions();

        System.out.println("===============================");// coupure

        //recupère les données crée du joueurs dans la class Player
        Player first_player = new Player("Michel", 5.0, 18.0,10.5);
        //Player Name
        System.out.println("Le pseudo du joueur est de : " + first_player.getPlayer_name());
            //Health /20
        System.out.println("La vie du joueur est de : " + first_player.getHealth_level());
            //Food Level /20
        System.out.println("Le niveau de nourriture joueur est de : " + first_player.getFood_level());
        //Attack player level
        System.out.println("L'attaque du du joueur est de : " + first_player.getAttack());


        System.out.println("===============================");// coupure

        Player second_player = new Player("Jean", 4.2, 04.8,13.2);
        //Player Name
        System.out.println("Le pseudo du joueur est de : " + second_player.getPlayer_name());
        //Health /20
        System.out.println("La vie du joueur est de : " + second_player.getHealth_level());
        //Food Level /20
        System.out.println("Le niveau de nourriture joueur est de : " + second_player.getFood_level());
        //Attack player level
        System.out.println("L'attaque du du joueur est de : " + second_player.getAttack());

    }

}
