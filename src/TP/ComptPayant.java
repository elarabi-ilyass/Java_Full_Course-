package TP;

public class ComptPayant extends ComptBancaire {

    private  final static int prixOperation=5 ;

    public ComptPayant(double sold) {
        super( sold);
    }


    @Override
    public double deposer(double montant) {
         super.deposer(montant-prixOperation);
    }

    @Override
    public double retirer(double montant) {
         super.retirer(montant+prixOperation);
    }
}
