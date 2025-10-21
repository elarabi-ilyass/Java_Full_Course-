package TP;

public class EtudiantSup {

    private String name;
    private double[ ] notes;


    public EtudiantSup(String name, double[ ] notes) {
        this.name = name;
        this.notes = notes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double[ ] getNotes() {
        return notes;
    }
    public void setNotes(double[ ] notes) {
        this.notes = notes;
    }
//    public double notMax(){
//        double max=notes[0];
//        for( int i = 0; i < notes.length; i++ ){
//             max=Math.max(max,notes[i]);
//        }
//        return max;
//    }
//    public double notMin(){
//        double min=notes[0];
//        for( int i = 0; i < notes.length; i++ ){
//             min=Math.min(min,notes[i]);
//        }
//        return min;
//    }


        public double notMax(){
          double max=notes[0];
           for( int i = 0; i < notes.length; i++ ){
                if(max<notes[i]){
                    max=notes[i];
                }
           }
       return max;
    }

        public double notMin(){
        double min=notes[0];
        for( int i = 0; i < notes.length; i++ ){
             if(min>notes[i]){
                 min=notes[i];

             }
        }
        return min;
   }



}
