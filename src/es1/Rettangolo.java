package es1;

public class Rettangolo {
    int alt;
    int lar;


    public Rettangolo (int alt, int lar){
        this.alt = alt ;
        this.lar = lar ;
        //costruttore
    }
    public int calcolaPerimetro (){
        return  (alt + lar ) * 2;
    }//metodo
    public int calcolaArea (){
        return alt * lar ;
    }//metodo

    public static void stampaRettangolo(Rettangolo rettangolo) {
        //metodo
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
    }
    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        //metodo
        stampaRettangolo(rettangolo1);
        stampaRettangolo(rettangolo2);
        System.out.println("Somma delle 2 aree: " + (rettangolo1.calcolaArea() + rettangolo2.calcolaArea()));
        System.out.println("Somma dei 2 perimetri: " + (rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro()));
    }

}
