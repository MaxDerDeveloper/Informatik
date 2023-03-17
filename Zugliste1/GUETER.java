public class GUETER extends DATEN
{
private double laenge; //Angabe in m

    public GUETER (double laengeE)
    {
        laenge=laengeE; 
    }
    public void datenAusgeben()
    {
        System.out.println("Güterwaggon: "+laenge+ "m");
    }
    
     public int gibAnzahl() {
        return 0;
    }
    
    public void einsteigen(int x) {
        System.out.println("In den Wagen kann nicht eingestiegen werden, da er ein Güterwagen ist.");
    }
}
