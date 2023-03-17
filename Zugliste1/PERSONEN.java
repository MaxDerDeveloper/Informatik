class PERSONEN extends DATEN
{
 private double laenge; //Angabe in m
 private int anzahl;

    public PERSONEN (double laengeE, int anzahlE)    
    {
        laenge = laengeE;
        anzahl = anzahlE;
    }
    public void datenAusgeben()
    {
        System.out.println("Personenwaggon: "+laenge+ "m, " + "Personen: " + anzahl);
    }
    
    public int gibAnzahl() {
        return anzahl;
    }
    
    
    public void einsteigen(int x) {
        anzahl += x;
        String msg = x>0 ? "ausgestiegen" : "eingestiegen";
        System.out.println("Erfolgreich "+msg+": "+x);
    }
}
