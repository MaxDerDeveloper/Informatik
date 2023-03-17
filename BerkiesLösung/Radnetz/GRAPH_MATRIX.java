 /**
 * Beispiel für einen gerichteten, bewerteten Graphen, der mit Hilfe der
 * Adjazenzmatrix implementiert wird.
 * Der Anwendungszusammenhang ist ein Wegenetz für Radfahrer. 
 * Die Richtung einer Kante gibt die Richtung des Radweges an 
 * und ihre Bewertung steht für die durchschnittlich benoetigte Zeit.
 * 
 */
class GRAPH_MATRIX
{
    private KNOTEN[] knotenfeld;
    private int[][] adjazenzmatrix;
    private int anzahlKnoten = 0;
    
    // Konstruktor
    GRAPH_MATRIX(int maxAnzahlKnoten)
    {      
        knotenfeld = new KNOTEN[maxAnzahlKnoten];
        adjazenzmatrix = new int[maxAnzahlKnoten][maxAnzahlKnoten];
            
        //Die Adjazenzmatrix wird mit den Werten 0 auf der Diagonalen und 
        //sonst mit den Werten -1 ("keine Kante") vorbelegt.
        for(int i=0; i < maxAnzahlKnoten; i=i+1)
        {
            for(int j=0; j < maxAnzahlKnoten; j=j+1)
            {
                if(i == j)
                {
                    adjazenzmatrix[i][j] = 0;
                }
                else
                {
                    adjazenzmatrix[i][j] = -1;
                }
            }
        }
    }
    
    //Die Knoten ausgeben
    void knotenAusgeben()
    {
 
    }
    
    //Die Kanten bzw. Adjazenzmatrix ausgeben
    void matrixAusgeben()
    {

    }
    

    /****************************************************************************************************
     * Hinzufuegen und Loeschen von Knoten bzw. Kanten
     ****************************************************************************************************/
    //Eine Kante hinzufuegen
    void kanteHinzufuegen(int start, int ziel, int bewertung)
    {
          
    }
    
    //Eine Kante loeschen
    void kanteLoeschen(int start, int ziel)
    {
     
    }
    
    //Einen Knoten hinzufuegen, der Index wird zurückgegeben
//    int knotenHinzufuegen(DATENELEMENT inhalt)
    {

    }
    
    //Einen Knoten loeschen
    void knotenLoeschen(int knotenIndex)
    {

    }
}
