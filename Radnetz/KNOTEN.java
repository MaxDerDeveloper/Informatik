/**
 * Diese Klasse stellt die Knoten eines Graphen dar.
 * Jedes Objekt dieser Klasse enth�lt genau ein Datenelement.
 * 
 */

class KNOTEN
{
    DATENELEMENT inhalt;
    
    KNOTEN(DATENELEMENT inhalt) {
        this.inhalt = inhalt;
    }
    
    DATENELEMENT gibInhalt() {
        return inhalt;
    }
}
