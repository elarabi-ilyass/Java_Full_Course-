package TP;

public class ComptBancaire {
    private double sold;
    private int code;

    private static int nbCompt = 0;

    public ComptBancaire(double sold) {
        this.sold = sold;
        code = ++nbCompt ;

    }

    public double deposer(double montant) {
         sold += montant;

    }
    public double retirer(double montant) {
         sold -= montant;
    }

    public double getSold() {
        return sold;
    }
    public void setSold(double sold) {
        this.sold = sold;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }


}
