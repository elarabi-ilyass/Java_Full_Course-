import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        int quantity;
        char currency = '$';
        double total;
        int choose;

        String[] pizza = {
                "1. pizza mixte : 20$",
                "2. pizza fruit de mer : 30$",
                "3. pizza quatre saisons : 30$",
                "4. pizza dinde : 40$",
                "5. pizza viande hachée : 23$"
        };

        String[] tacos = {
                "1. tacos mixte : 20$",
                "2. tacos fruit de mer : 30$",
                "3. tacos quatre saisons : 30$",
                "4. tacos dinde : 40$",
                "5. tacos viande hachée : 23$"
        };

        try {
            System.out.print("What item would you like to buy? (pizza/tacos): ");
            item = sc.nextLine().toLowerCase().trim();

            if (item.equals("pizza")) {
                System.out.println("\n--- Pizza Menu ---");
                for(int i = 0; i < pizza.length; i++) {
                    System.out.println(pizza[i]);
                }

                // 🔁 BOUCLE pour redemander si choix invalide
                boolean choixValide = false;
                while (!choixValide) {
                    System.out.print("\nChoose your pizza (1-5): ");
                    choose = Integer.parseInt(sc.nextLine());

                    if (choose >= 1 && choose <= 5) {
                        choixValide = true; // Sort de la boucle

                        System.out.print("How many would you like? ");
                        quantity = Integer.parseInt(sc.nextLine());

                        double[] pizzaPrices = {20.0, 30.0, 30.0, 40.0, 23.0};
                        total = pizzaPrices[choose - 1] * quantity;

                        System.out.println("\n--- Order Summary ---");
                        System.out.println("Item: " + pizza[choose - 1]);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total: " + total + currency);

                    } else {
                        System.out.println("❌ Invalid choice! Please choose between 1 and 5.");
                    }
                }

            } else if (item.equals("tacos")) {
                System.out.println("\n--- Tacos Menu ---");
                for(int i = 0; i < tacos.length; i++) {
                    System.out.println(tacos[i]);
                }

                // 🔁 BOUCLE pour redemander si choix invalide
                boolean choixValide = false;
                while (!choixValide) {
                    System.out.print("\nChoose your tacos (1-5): ");
                    choose = Integer.parseInt(sc.nextLine());

                    if (choose >= 1 && choose <= 5) {
                        choixValide = true; // Sort de la boucle

                        System.out.print("How many would you like? ");
                        quantity = Integer.parseInt(sc.nextLine());

                        double[] tacosPrices = {20.0, 30.0, 30.0, 40.0, 23.0};
                        total = tacosPrices[choose - 1] * quantity;

                        System.out.println("\n--- Order Summary ---");
                        System.out.println("Item: " + tacos[choose - 1]);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total: " + total + currency);

                    } else {
                        System.out.println("❌ Invalid choice! Please choose between 1 and 5.");
                    }
                }

            } else {
                System.out.println("❌ Error: This food doesn't exist. Please choose pizza or tacos.");
            }

        } catch (NumberFormatException e) {
            System.out.println("❌ Error: Please enter valid numbers!");
        } finally {
            sc.close();
        }
    }
}