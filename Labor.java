

public class Labor
{
    private String gebaude;
    private String raum;
    private int stock;
    private boolean beamer;
    private int anzZimmer;
    
    
    public Labor(String gebaude,String raum, int stock, boolean beamer,
    int anZzimmer)
    {
        setGebaude (gebaude);
        setRaum (raum);
        setStock (stock);
        setBeamer (beamer);
        setAnzZimmer (anzZimmer);
    }
    
    public Labor(String gebaude, int stock, boolean beamer, int anzZimmer)
    {
        setGebaude(gebaude);
        setRaum ("C.03.27A");
        setStock (stock);
        setBeamer (beamer);
        setAnzZimmer (anzZimmer);
    
        
    }
    
    public Labor(String gebaude, int stock, int anzZimmer)
    {
        setGebaude(gebaude);
        setRaum("C.03.27A");
        setStock(stock);
        setBeamer(true);
        setAnzZimmer(anzZimmer);

    }
    
    public Labor(int stock)
    {
        setGebaude("C");
        setRaum("C.03.27A");
        setStock(stock);
        setBeamer(true);
        setAnzZimmer(20);
        
    }
    
    public Labor()
    {
        setGebaude("C");
        setRaum("C.03.27A");
        setStock(5);
        setBeamer(true);
        setAnzZimmer(20);
    }
    
    
    public void setGebaude(String gebaude)
    {
        this.gebaude = gebaude;
    }
    
    public void setRaum (String raum)
    {
        this.raum =raum;
    }
    
    public void setStock(int stock)
    {
    if ((stock >= 0) && (stock <= 20))
    {
        this.stock = stock;
    }
    else 
    {
        System.out.println("fehler. Stock muss zweischen 0 und 20 sein.");
        this.stock = 5;
    }
    }
    
    public void setBeamer(boolean beamer)
    {
        this.beamer = beamer;
    }
    
    public void setAnzZimmer(int anzZimmer)
    {
        this.anzZimmer = anzZimmer;
    }
    
    public String getGebaude()
    {
        return gebaude;
    }
    
    public String getRaum()
    {
        return raum;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public boolean getBeamer()
    {
        return beamer;
    }
    
    public int getAnzZimmer()
    {
        return anzZimmer;
    }
    
    public String getZimmerNummer()
    {
        String zimmerNummer;
        
        zimmerNummer= raum.substring (5);
        
        return zimmerNummer;
    }
    
    public String getLaborstock()
    {
        String stock;
        int pos1;
        int pos2;

        pos1 = raum.indexOf(".")+1;
        pos2 = raum.indexOf(".",pos1);
        stock = raum.substring(pos1,pos2);

        return stock;
    }
    
    
    
}
