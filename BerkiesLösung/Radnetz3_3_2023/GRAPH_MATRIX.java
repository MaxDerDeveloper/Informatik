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
        for (int i=0; i<anzahlKnoten; i++)
        {
            knotenfeld[i].datenGeben().ausgeben();
        }
 
    }
    
    //Die Kanten bzw. Adjazenzmatrix ausgeben
    void matrixAusgeben()
    {
        for(int i=0; i < anzahlKnoten; i=i+1)
        {
            for(int j=0; j < anzahlKnoten; j=j+1)
            {
                System.out.print(adjazenzmatrix[i][j]+", "); 
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
        if (start<anzahlKnoten && ziel<anzahlKnoten)
        {
            adjazenzmatrix[start][ziel]=bewertung;
        }
        else
        {
            System.out.println("Start- oder Zielknoten existiert nicht!");
        }
          
    }
    
    //Eine Kante loeschen
    void kanteLoeschen(int start, int ziel)
    {
     
    }
    
    //Einen Knoten hinzufuegen, der Index wird zurückgegeben
    int knotenHinzufuegen(DATENELEMENT inhalt)
    {
        int index =-1;
        
        if (anzahlKnoten<knotenfeld.length)
        {
            index = anzahlKnoten;
            knotenfeld[index]= new KNOTEN(inhalt);
            anzahlKnoten++;
        }
        else
        {
            System.out.println("Knotenfeld ist voll!");
        }
        
        return index;
    }
    
    //Einen Knoten loeschen
    void knotenLoeschen(int knotenIndex)
    {

    }
    public void tiefensucheStarten(int startKnoten)
    {
    // Alle Knoten als unbesucht markieren
    for (int i=0; i<anzahlKnoten; i++)
    {
        knotenfeld[i].markierungSetzen(false);
        if (startKnoten>=0 && startKnoten<anzahlKnoten)
        {
            tiefensucheDurchfuehren(startKnoten);
        }
    }
}
    public void tiefensucheDurchfuehren(int knotenNr)
    {
        knotenfeld[knotenNr].markierungSetzen(true);
        System.out.println("folgender Ort wurde besucht: ");
        knotenfeld[knotenNr].datenGeben().ausgeben();
        for (int i=0; i<anzahlKnoten; i++)
        {
            if (!knotenfeld[i].markierungGeben() && adjazenzmatrix[knotenNr][i]>0)
            {
                tiefensucheDurchfuehren(i);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
