package ProblemSolving;
import java.util.Scanner;

public class GestionCompteBancaire {



    public static void main(String[] args) {
        String codeBank;
        int choose;
        double amount;
        double amount2;

        //Créez un programme qui simule la gestion d'un compte bancaire avec les fonctionnalités suivantes
        Scanner input = new Scanner(System.in);

            Client[] clients = {
                    new Client("ilyass","elarabi",1000,"AI26R4"),
                    new Client("yassine","AZN",1000,"AI66R4"),
                    new Client("Omar","Fathi",1000,"AI79R4"),
            };

        try{
            boolean found = false;
            Client currentClient=null;
            while (!found) {
                System.out.println("Please enter the bank Code : ");
                codeBank = input.nextLine();

                for(Client client:clients){
                    if(client.getCodeBank().equals(codeBank)){
                        System.out.println("Welcom to your Account Ms "+client.getFirstName()+" "+client.getLastName());
                        currentClient = client;
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("Invalid Code");
                }
            }
            boolean quit = false;
            while(!quit){
                System.out.println("1.Consulter le solde ");
                System.out.println("2.Déposer de l'argent ");
                System.out.println("3.Retirer de l'argent ");
                System.out.println("4.Quitter ");

                System.out.print("Can you choose your services by number:");
                choose=input.nextInt();

                switch(choose){
                    case 1:
                        System.out.print("Your solid Ms"+currentClient.getFirstName()+
                                " "+currentClient.getLastName()+"is "+ currentClient.getSoldBank());
                        quit=true;
                    break;
                    case 2:
                        System.out.print("Can you enter the amount of l'argent for deposit:");
                        amount=input.nextDouble();
                        currentClient.setSoldBank(amount+currentClient.getSoldBank());
                        System.out.print("Your current sold is "+currentClient.getSoldBank());
                        quit=true;
                        break;

                     case 3:
                         System.out.print("Can you enter the amount of l'argent to retire:");
                         amount2=input.nextDouble();
                         currentClient.setSoldBank(currentClient.getSoldBank()-amount2);
                         System.out.print("Your current sold is "+currentClient.getSoldBank());
                         quit=true;
                         break;

                    case 4 :
                        quit = false;
                        System.out.println("Merci d'avoir utilisé nos services. Au revoir!");
                        break;
                    default:
                        System.out.println("Choix invalide!");

                }

            }
//            String codeBank = input.nextLine();

        }
        catch(Exception e){
            System.out.println("Invalid code");
        }
        finally {
            input.close();
        }

    }
}
