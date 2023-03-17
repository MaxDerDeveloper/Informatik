public class ZUG
{
    private LISTE liste1;


    public ZUG ()
    {
        liste1 = new LISTE();
        liste1.einfuegen(new LOKOMOTIVE());
        liste1.einfuegen(new GUETER(11.2));
        liste1.einfuegen(new PERSONEN(8.1, 4));
        liste1.datenAusgeben();
    }

    public void ablauf()
    {
        
    }
    
    public int anzahlPersonen() {
        return liste1.anzahlPersonen();
    }
    
    public void anhängen(DATEN abteilDaten) {
        liste1.einfuegen(abteilDaten);
    }
    
   public void einsteigen(int i, int x) {
       liste1.einsteigen(i, x);
   }
}