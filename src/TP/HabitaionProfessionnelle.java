package TP;

public class HabitaionProfessionnelle extends Habitation {

    private int nbEmployes;
    public HabitaionProfessionnelle(int nbEmployes,String proprietaire, String adresse , double surface) {
        super(proprietaire,adresse,surface);
        this.nbEmployes = nbEmployes;
    }
    @Override
    public void affiche(){
        super.affiche();
        System.out.println("l'address est "+getAdresse()+"et son proprietaire "+getProprietaire()+" surface "+getSurface());
    }

    @Override
    public double impot(){
        int tranche=0;
        if(nbEmployes>0){
            tranche=nbEmployes/10+1;
            return tranche*1000+super.impot();
        }
        else{
            return 0.0;
        }

    }


}
