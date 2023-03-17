abstract class LISTENELEMENT
{
    abstract LISTENELEMENT einfuegen(DATEN inhaltE);
    abstract void datenAusgeben();
    abstract int anzahlKnoten();
//    abstract int summeZahlen();
    abstract DATEN inhaltGeben();
    abstract LISTENELEMENT naechsterGeben();
    abstract DATEN entfernen();
    abstract int anzahlPersonen();
    abstract void einsteigen(int i, int x);
}