package TP;

public class Habitation {

    private String proprietaire ;
    private String adresse ;
    private double surface ;

    public Habitation(String proprietaire, String adresse , double surface ) {
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.surface = surface;
    }
    public String getProprietaire() {
        return proprietaire;
    }
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public double getSurface() {
        return surface;
    }
    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double impot() {
        if(surface != 0){
            return surface * 10;
        }
        else{
            return 0;
        }
    }

    public void affiche(){
        System.out.println("l'address est "+adresse+"et son proprietaire "+proprietaire+" surface "+surface);
    }


    public static  void main(String[] args){

//        Habitation h=new Habitation("Moha","5 Rue de la prix",120);
//        h.affiche();
//        System.out.println("Impot ="+h.impot());

        Habitation[] tableHabitation=new Habitation[5];

         tableHabitation[0] =new HabitationIndividuelle(5,true,"Ismail","casa",5);
         tableHabitation[1] =new HabitationIndividuelle(7,false,"ilyass","Tanger",10);

         tableHabitation[2]=new HabitaionProfessionnelle(12,"Samir","Taza",100);
         tableHabitation[3]=new HabitaionProfessionnelle(35,"kAMAL","oujda",100);
         tableHabitation[4]=new HabitaionProfessionnelle(109,"mAJID","Fes",100);


         for(int i=0;i<tableHabitation.length;i++){
             tableHabitation[i].affiche();
         }








    }
}
