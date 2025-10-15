public class Main {
    public static void main(String[] args) {
        int age = 25;
        double income = 45000;
        boolean hasGoodCredit = true;

        if (age >= 21) {
            if (income >= 30000) {
                if (hasGoodCredit) {
                    System.out.println("Loan Approved!");
                } else {
                    System.out.println("Loan Denied: Poor credit history");
                }
            } else {
                System.out.println("Loan Denied: Insufficient income");
            }
        } else {
            System.out.println("Loan Denied: Below minimum age requirement");
        }
    }
}
















