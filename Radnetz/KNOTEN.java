/**
 * Diese Klasse stellt die Knoten eines Graphen dar.
 * Jedes Objekt dieser Klasse enthält genau ein Datenelement.
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
