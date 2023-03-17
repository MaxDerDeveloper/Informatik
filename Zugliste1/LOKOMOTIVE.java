class LOKOMOTIVE extends DATEN
{
private double laenge; //Angabe in m

    LOKOMOTIVE ()
    {
        laenge=15.10;   
    }
    public void datenAusgeben()
    {
        System.out.println("Lokomotive: "+laenge+ "m");
    }
    
    public int gibAnzahl() {
        return 0;
    }
    
    public void einsteigen(int x) {
        System.out.println("In den Wagen kann nicht eingestiegen werden, da er eine Lokomotive ist.");
    }
}
