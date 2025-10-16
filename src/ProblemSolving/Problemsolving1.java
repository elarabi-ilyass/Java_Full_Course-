package ProblemSolving;
import java.util.Locale;
import java.util.Scanner;

public class Problemsolving1 {
    //Gestion des notes d'un étudiant BOUCLE FOR


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        double java;
        double python;
        double react;
        double sql;
        double somme=0;
        double total=0;



        try{
            System.out.println("Monsieur le proffiseur tu peux entrer les notes ");
            System.out.println("Entrez le nom d'étudiant s'il vous plait");
            String etudiant = sc.nextLine();
            name=etudiant.toUpperCase().trim();

            System.out.print("Entrez la note du java :");
            java = sc.nextDouble();

            System.out.print("Entrez la note du python :");
            python = sc.nextDouble();

            System.out.print("Entrez la note du react :");
            react = sc.nextDouble();

            System.out.print("Entrez la note du sql :");
            sql = sc.nextDouble();

            double[] modules={java,python,react,sql};

                for(int i=0;i<modules.length;i++){
                   somme+=modules[i];
                }

                 total=somme/modules.length;

                if(total==0){
                    System.out.println("La note est vide !");
                } else if (total<=7) {
                    System.out.println("Vous étes en rattrappage");
                } else if (total>9) {
                    System.out.println("Vous étes Validez");
                }
                else{
                    System.out.println("il y a un error");
                }


            System.out.println("le nom détudiant est "+name);
            System.out.println("Donc la somme des notes du  :"+total);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
        }

    }
}
