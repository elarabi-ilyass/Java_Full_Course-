package TP;


public class TestEtudiant {

        public static void main(String[] args) {
            Etudiant e1= new Etudiant("Momo","LP-Dawn",12);
            Etudiant e2= new Etudiant("Toto","LPUMIAGE",10);
            Etudiant e3= new Etudiant("Toto","LPUMIAGE",15);
            e2.setMoyenne(8);
            e3.setMoyenne(13);
            boolean b=e1.estMeilleur(e2); //var primitif



            e1.affichage();
            if(e1.aReussi()){
                System.out.println(e1.getNom()+"a réussi");
            }
            else{
                System.out.println(e1.getNom()+"a redouble");
            }

            if(e2.aReussi()){
                System.out.println(e1.getNom()+"a réussi");
            }
            else{
                System.out.println(e1.getNom()+"a redouble");
            }

            if(b){
                System.out.println(e1.getNom()+ "est meilleur");
            }
            else{
                System.out.println(e1.getNom()+ " est meilleur");
            }

            System.out.println(e1.estMeilleur(e2));
            System.out.println(e3);
            System.out.println(Etudiant.getNbEtudiants());
            System.out.println(Etudiant.getMoyArithMoyennes());


            //Exercice 3
            EtudiantSup e4=new EtudiantSup("ilyass",new double[]{10,4,12.2});
            System.out.println(e4.notMax());
            System.out.println(e4.notMin());
        }








}

//LA SERIALISATION
//PARA IMPLICITE this
