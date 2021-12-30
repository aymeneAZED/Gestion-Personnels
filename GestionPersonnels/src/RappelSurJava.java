/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Scanner;

/**
 *
 * @author KHALED
 */
public class RappelSurJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Affichage d'un simple message sur la console
        System.out.println("Bonjour tout le monde !");

        // Division entre deux nombres entiers
        final int valA = 7;
        int valB = 2;
        int valC = valA / valB; // valC contient la valeur 3
        int valD = valA % valB; // valD contient la valeur 1

        System.out.println("la valeur de C = " + valC);
        System.out.println("la valeur de D = " + valD);

        // Division entre deux nombres réels
        double reelA = 7;
        double reelB = 2.5;

        double division = reelA / reelB; //La variable division contient la valeur 3.5

        System.out.println("la valeur de la division = " + division);

        // Opérations logiques sur les booléens
        boolean boolA = TRUE;
        boolean boolB = FALSE;
        boolean nonA = !boolA; // nonA vaut FALSE
        boolean AetB = boolA && boolB; // AetB vaut FALSE

        System.out.println("la valeur de nonA = " + nonA);
        System.out.println("la valeur de AetB = " + AetB);

        // Différence entre les variables caractères et entiers
        char caractere = 'z'; // La variable caractere contient la valeur z
        int z = 3; // La variable z contient la valeur 3

        System.out.println("la valeur de caractere est " + caractere);
        System.out.println("la valeur de z = " + z);

        // les conversions de type de variables
        int i;
        double x = 2;
        i = (int) (x * 42.3); // i vaut 84

        System.out.println("la valeur de i = " + i);

        // Conversion entre Entiers et Caractères suivant le code ASCII
        int p = (int) 'b';
        char nj = (char) 99;
        System.out.println("p = " + nj);
        
        // La variable estDansIntervalle est vraie (True) si la condition est vérifiée, elles est fausse sinon
        double a = 8;
        boolean estDansIntervalle = ((a >= 0) && (a <= 10));

        System.out.println("la valeur de estDansIntervalle = " + estDansIntervalle);

        // Exemple des températures
        double celsius = 12;
        double fahrenheit = ((9.0 / 5.0) * celsius) + 32.0;
        System.out.print(celsius);
        System.out.print(" degrés Celsius convertit en Fahrenheit vaut ");
        System.out.println(fahrenheit);

        // Exemple de condition if
        int temperature = 52;
        if (temperature > 50) {
            System.out.println("La température est supérieure à 50°");
        } else {
            System.out.println("La température est inférieure ou égale à 50°");
        }

        // Exemple de switch-case
        int age = 70;
        switch (age) {
            case 18:
                System.out.println("L'age est légal pour voter");
                break;
            case 40:
                System.out.println("L'age est légal pour être candidat à la présidence");
                break;
            case 60:
                System.out.println("L'age de la retraite");
                break;
            default:
                System.out.println("L'age n'est pas pris en considération");
        }

        for (int celsius2 = 0; celsius2 < 10; celsius2 = celsius2 + 1) {
            double fahrenheit2 = ((9.0 / 5.0) * celsius2) + 32.0;
            System.out.print(celsius2);
            System.out.print(" degres Celsius2 convertit en Fahrenheit2 vaut ");
            System.out.println(fahrenheit2);
        }

        //Affiche la conversion en Fahrenheit des degrés Celsius tant que la conversion est inférieur à 100.
        int celsius3 = 0;

        while (celsius3 < 10) {
            double fahrenheit3 = ((9.0 / 5.0) * celsius3) + 32.0;
            System.out.print(celsius3);
            System.out.print(" degres Celsius3 convertit en Fahrenheit3 vaut ");
            System.out.println(fahrenheit3);
            celsius3 = celsius3 + 1;
        }

        // Exemple d une méthode mathhématique
        double racine = Math.sqrt(5.2);
        System.out.println("racine vaut " + racine);

        double cosinus = Math.cos(4.8);
        System.out.println("cosinus vaut " + cosinus);

        // Différence entre float et double
        float cosinusf = (float) Math.cos(4.8);
        System.out.println("cosinus vaut " + cosinusf);

        // Exemple des méthodes propres
        int s = 47;
        int v = 56;
        int somme = addition(s, v);  //s et v sont les paramètres effectifs de l’appel x prend la valeur de s et y prend la valeur v
        System.out.println("La somme de " + s + " et " + v + " est égale à : " + somme);

        // Exemple d'une méthode récursive
        int f = 7;
        int t = calculeFactorielle(f);
        System.out.println("le factoriel de " + f + "  vaut " + t);

        //L’OBJET PRÉDÉFINI STRING
        //Première méthode de déclaration
        String phrase;
        phrase = "Université de Béjaia";
        //Deuxième méthode de déclaration
        String phrase2 = new String();
        phrase2 = "Université de Béjaia";
        //Troisième méthode de déclaration
        String phrase3 = "Université de Béjaia";
        //Quatrième méthode de déclaration

        String ecole = new String("Université de Béjaia");
        System.out.println(ecole);

        char c = ecole.charAt(2);
        System.out.println(c);

        int longueur = ecole.length();
        System.out.println(longueur);

        String ville = ecole.substring(14, ecole.length());
        System.out.println(ville);

        // Conversion d un type primitif vers chaine de caractères
        int val = 22;
        String chaine = String.valueOf(val); // chaine contient "22"
        System.out.println(chaine);

        // Conversion d une chaine de caractères vers un entier
        String chaine2 = "22";
        int val2 = Integer.parseInt(chaine2); //valeur vaut 22
        System.out.println(val2);

        // Les entrées clavier
        Scanner sc = new Scanner(System.in);
        //Saisie d une chaine de caractere
        System.out.println("Veuillez saisir un mot :");
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : " + str);
        // Saisie d un entier
        System.out.println("Veuillez saisir un nombre entier :");
        int nombre = sc.nextInt();
        System.out.println("Vous avez saisi : " + nombre);

        // Les types non primitifs
        //LES TABLEAUX
        // Tableaux à une dimension
        char[] tabChar; // Déclaration d’un tableau de caractères
        int[] tabInt; // Déclaration d’un tableau d’entiers
        tabInt = new int[10]; // Instanciation d’un tableau de 10 entiers
        tabInt[0] = 5;
        int[] tabCinq = {12, 33, 44, 0, 50}; //Initialisation expresse
        int j = 0;
        int valeur1 = tabCinq[j]; //Renvoie 12, l’élément d’indice 0
        int valeur2 = tabCinq[4]; //Renvoie 50, l’élément d’indice 4
        System.out.println("le 1er élement du tableau tabInt est " + tabInt[0]);
        System.out.println("le 1er élement du tableau est " + valeur1);
        System.out.println("l'élement dont l'indice est 4 est " + valeur2);

        int taille = tabCinq.length; //Renvoie 5, le nombre de cases du tableau tabCinq
        System.out.println("la taille du tableau tabcinq est " + taille);

        // Tableaux à n dimension
        int premiersNombres[][] = {{0, 2, 4, 6, 8}, {1, 3, 5, 7, 9}};
        System.out.println("la valeur est egale à  " + premiersNombres[0][3]);
        System.out.println("la valeur est egale à  " + premiersNombres[1][2]);

        // Utiliser et rechercher dans un tableau
        char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        for (int k = 0; k < tableauCaractere.length; k++) {
            System.out.println("À l'emplacement " + k + " du tableau nous avons = " + tableauCaractere[k]);
        }

        int m = 0, n = 0;

        while (m < premiersNombres.length) {
            n = 0;

            while (n < premiersNombres[m].length) {
                System.out.print(premiersNombres[m][n]);
                n++;
            }
            System.out.println("");
            m++;
        }

        String tab[][] = {{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
        int i1 = 0, j1 = 0;
        for (String sousTab[] : tab) {
            i1 = 0;
            for (String strtab : sousTab) {
                System.out.println("La valeur de la nouvelle boucle est : " + strtab);
                System.out.println("La valeur du tableau à l'indice [" + j1 + "][" + i1 + "] est : " + tab[j1][i1]);
                i1++;
            }
            j1++;
        }
        // exemple d'un tableau à 3 dimension
        String tab3[][][] = {{{"toto", "titi", "tutu", "tete", "tata"}, {"coca", "titi", "tutu", "tete", "tata"}}, {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}}};
        String string3 = tab3[0][1][0];
        System.out.println(string3);

    }

    // Exemple d'une méthode propre
    static int addition(int x, int y) {//x et y sont les paramètres formels
        return x + y;
    }

    // Exemple d'une méthode récursive
    static int calculeFactorielle(int n) {
        if (n > 0) { // cas général
            return n * calculeFactorielle(n - 1);
        } else { //cas de base ou d’arrêt
            return 1;
        }
    }

}
