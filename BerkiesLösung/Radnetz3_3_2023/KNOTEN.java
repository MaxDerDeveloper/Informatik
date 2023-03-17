/**
 * Diese Klasse stellt die Knoten eines Graphen dar.
 * Jedes Objekt dieser Klasse enth�lt genau ein Datenelement.
 * 
 */

class KNOTEN
{
    private boolean markierung;
    private DATENELEMENT daten;
    
    public KNOTEN(DATENELEMENT datenE)
    {
        daten=datenE;
    }
    
    public DATENELEMENT datenGeben()
    {
        return daten;
    }
    public void markierungSetzen(boolean markierungE)
    {
        markierung=markierungE;
    }
    
    public boolean markierungGeben()
    {
        return markierung;
    }
    
    
}
