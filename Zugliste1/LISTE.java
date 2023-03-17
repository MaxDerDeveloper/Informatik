public class LISTE
{
    private LISTENELEMENT erster;

    public LISTE (){
        erster = new ABSCHLUSS();
    }

    public void einfuegen(DATEN inhaltE)
    {
        erster=erster.einfuegen(inhaltE);
    }

    public void datenAusgeben()
    {
        erster.datenAusgeben();
    }

    public int anzahlKnoten()
    {
        return erster.anzahlKnoten();
    }

//     public int summeZahlen()
//     {
//         return erster.summeZahlen();
//     }
    //neue Methoden
    public void vorneEinfuegen(DATEN inhalt)
    {
        erster = new KNOTEN(erster, inhalt);
    }

    public boolean istLeer()
    {
        return (anzahlKnoten()==0);
    }

    public DATEN vorneEntfernen()
    {
        if (!istLeer()){
            DATEN inhalt = erster.inhaltGeben();
            erster=erster.naechsterGeben();
            return inhalt;
        }
        return null;
    }

    public DATEN hintenEntfernen()
    {
        if (!istLeer()) {
            if (anzahlKnoten()==1){
                DATEN inhalt = erster.inhaltGeben();
                erster=erster.naechsterGeben();
                return inhalt;
            }
            else {
                return erster.entfernen();
            }
        }
        return null;
    }
    
    public int anzahlPersonen() {
        return erster.anzahlPersonen();
    }
    
    public void einsteigen(int i, int x) {
        erster.einsteigen(i, x);
    }
}