package TP;

public class HabitationIndividuelle  extends  Habitation{

    private int nbPieces ;
    private boolean apiscine;
    public HabitationIndividuelle(int nbPieces, boolean apiscine,
                                  String proprietaire, String adresse , double surface){
        super(proprietaire,adresse,surface);
        this.nbPieces = nbPieces;
        this.apiscine = apiscine;
    }

    @Override
    public void affiche(){
        super.affiche();
        System.out.println("l'address est "+getAdresse()+"et son proprietaire "+getProprietaire()+" surface "+getSurface());
    }

    @Override
    public double impot(){
        super.impot();
        if(apiscine){
            return nbPieces*200 + 500+super.impot() ;
        }else{
            return nbPieces*200  ;
        }

    }

}
