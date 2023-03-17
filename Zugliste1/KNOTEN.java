public class KNOTEN extends LISTENELEMENT
{
    private LISTENELEMENT naechster;
    private DATEN inhalt; 

    public KNOTEN(LISTENELEMENT naechsterE,DATEN inhaltE)
    {
        naechster=naechsterE;
        inhalt=inhaltE;    
    }

    public LISTENELEMENT einfuegen(DATEN inhaltE)
    {
        naechster=naechster.einfuegen(inhaltE);
        return this;   
    }

    public void datenAusgeben()
    {
        inhalt.datenAusgeben(); 
        naechster.datenAusgeben();
    }

    public int anzahlKnoten()
    {
        return 1+naechster.anzahlKnoten();
    }

//     public int summeZahlen()
//     {
//         return naechster.summeZahlen()+inhalt.zahlGeben();
//     }
    //neue Methoden
    public DATEN inhaltGeben()
    {
        return inhalt;
    }

    public LISTENELEMENT naechsterGeben()
    {
        return naechster;
    }

    public DATEN entfernen()
    {
        if (naechster.anzahlKnoten()>1)
        {
            return naechster.entfernen();
        }
        else
        {
            DATEN inh =naechster.inhaltGeben();
            naechster=naechster.naechsterGeben();
            return inh;
        }
    }
    
    public int anzahlPersonen() {
        System.out.println("KNOTEN->inhalt.gibAnzahl() " + inhalt.gibAnzahl() + "");
        inhalt.datenAusgeben();
        return inhalt.gibAnzahl() + naechster.anzahlPersonen();
    }
    
    public void einsteigen(int i, int x) {
        if (i == 0) {
            inhalt.einsteigen(x);
        } else {
            naechster.einsteigen(i-1, x);
        }
    }
}