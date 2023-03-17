public class ABSCHLUSS extends LISTENELEMENT
{
    ABSCHLUSS () {
        super();
    }

    public LISTENELEMENT einfuegen(DATEN inhaltE)
    {
        return new KNOTEN(this, inhaltE);
    }

    public void datenAusgeben()
    {
    }

    public int anzahlKnoten()
    {
        return 0;
    }

    public int summeZahlen()
    {
        return 0;
    }

    public DATEN inhaltGeben()
    {
        return null;
    }

    public LISTENELEMENT naechsterGeben()
    {
        return null;
    }    

    public DATEN entfernen()
    {
        return null;
    }
    
    public int anzahlPersonen() {
        return 0;
    }
    
    public void einsteigen(int i, int x) {
        System.out.println("In den "+i+"-ten Wagen kann nicht eingestiegen werden, da er nicht existiert.");
    }
}