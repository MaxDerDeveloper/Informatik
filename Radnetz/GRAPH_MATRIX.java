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
    private int knotenIndex = 0;
    
    // Konstruktor
    GRAPH_MATRIX(int maxAnzahlKnoten)
    {
        knotenfeld = new KNOTEN[maxAnzahlKnoten];        
        adjazenzmatrix = new int[maxAnzahlKnoten][maxAnzahlKnoten];
        anzahlKnoten = maxAnzahlKnoten;
            
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
        for (int i=0; i<=knotenIndex; i++) {
            knotenfeld[i].gibInhalt().ausgeben();
        }
    }
    
    //Die Kanten bzw. Adjazenzmatrix ausgeben
    void matrixAusgeben()
    {
        System.out.println("a");
        for (int i=0; i<anzahlKnoten; i++) {
            for (int j=0; j<anzahlKnoten; j++) {
                int v = adjazenzmatrix[j][i];
                String s = (v<0 ? "" : "+") + String.valueOf(v);
                System.out.print(" " + s);
            }
            System.out.println();
        }
    }
    

    /****************************************************************************************************
     * Hinzufuegen und Loeschen von Knoten bzw. Kanten
     ****************************************************************************************************/
    //Eine Kante hinzufuegen
    void kanteHinzufuegen(int start, int ziel, int bewertung)
    {
          adjazenzmatrix[start][ziel] = bewertung;
    }
    
    int[] findeErreichbareKnoten(int startKnoten) {
        // Nachbarorte in der Adjazenzmatrix nachschauen.
        for (int i=0; i<anzahlKnoten; i++) {
            adjazenzmatrix[startKnoten][i];
        }
    }
    
    //Eine Kante loeschen
    void kanteLoeschen(int start, int ziel)
    {
        adjazenzmatrix[start][ziel] = -1;
    }
    
    //Einen Knoten hinzufuegen, der Index wird zurückgegeben
    int knotenHinzufuegen(DATENELEMENT inhalt)
    {
        if (knotenIndex == knotenfeld.length-1) {
            System.out.println("KnotenFeld ist bereits voll");
            return -1; 
        }
                
        knotenfeld[knotenIndex] = new KNOTEN(inhalt);
        knotenIndex += 1;
        return knotenIndex-1;
    }
    
    //Einen Knoten loeschen
    void knotenLoeschen(int knotenIndex)
    {
        // Wenn es keine Knoten gibt, return.
        if (knotenIndex == 0) {return;}
        
        if (knotenIndex == anzahlKnoten-1) {   
            // Lösche Knoten und schiebe Folgeelemente nach, um Lücken zu vermeiden
            for(int i=knotenIndex; i<anzahlKnoten-1; i++) {
                knotenfeld[i] = knotenfeld[i+1];
            }
        } else {
            // Weil es keine Folgeelemente gibt, muss nicht nachgeschoben werden.
            knotenfeld[knotenIndex] = null;
        }
        
        
        // Lösche alle Kanten
        for(int i=0; i<anzahlKnoten; i++) {
            adjazenzmatrix[i][knotenIndex] = -1;
            adjazenzmatrix[knotenIndex][i] = -1;
        }
        
        // Verschiebe in der Adjazenzmatrix
    }
}
