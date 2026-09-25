import java.util.Arrays;//Hinzufügen der Array
import java.util.Scanner;//Hinzufügen des Scaners
import java.util.InputMismatchException;//Hinzufügen try und catch 

class Guthaben // Ernenneung variablen 
{
    int startGuthaben; 
    int taschengeld;
    double gehalt;
    int geschenke[];


}
class Ausgaben // Ernennung variablen 
{
    int flüge[];
    int unterkunft[];
    int nahrung[];
    int fortbewegung[];
    int mitbringsel[]; 
    int sonstiges[];
}




public class Main   
{
    public static void main ( String a[])
     {
        Guthaben geld = new Guthaben();//Ein Objekt der Klasse hinzufügen

        Ausgaben verluste = new Ausgaben();
     
          Scanner eingaben = new Scanner(System.in);// Ernennung eines Scanners
      System.out.println("Was ist ihr Startguthaben?: ");
      int startGuthaben = eingaben.nextInt();//User input zu einer variable hinzufügen

      geld.startGuthaben = startGuthaben ;

      System.out.println("Wie viel Taschengeld erhalten sie? ");
      int taschengeld = eingaben.nextInt();

      geld.taschengeld = taschengeld;

      System.out.println("Wie viel beträgt ihr monatliches Gehalt?");
      int monatlichesGehalt = eingaben.nextInt(); 

      geld.gehalt = monatlichesGehalt;

      System.out.println("Wurde ihnen Geld geschenkt?");
      boolean antwortGeschenk = eingaben.nextBoolean();
      
      if(antwortGeschenk == true)
        {
      
      int geldgeschenke = Fehler.sucheFehlernum("Wie oft wird ihnen Geld geschenkt? ",eingaben);

      geld.geschenke = new int[geldgeschenke];
      
      Fehler.sucheFehlernum("Was waren die Werte der einzelnen Geschenke?", eingaben);
      geld.geschenke = Rechnen2.summe2(geld.geschenke, eingaben);
       
        }
        else
            {
                geld.geschenke = new int[0];
            }
      
      System.out.println("Sind sie kostenpflichtig geflogen?");
      boolean antwortFlüge = eingaben.nextBoolean();

      if(antwortFlüge == true)
      {
      System.out.println("Wie viele mussten sie für die Flüge bezahlen?");
      int mengeFlüge = eingaben.nextInt();  

      verluste.flüge = new int[mengeFlüge];

      System.out.println("Was waren die Preise?");
      verluste.flüge = Rechnen2.summe2(verluste.flüge, eingaben);
      System.out.println("Die Zahlen: " + Arrays.toString(verluste.flüge));
      }
      else
        {
            verluste.flüge = new int[0];
        }
      
      System.out.println("Haben sie Geld für Unterkünfte ausgegeben?");
      boolean antwortUnterkünfte = eingaben.nextBoolean();

      if(antwortUnterkünfte == true)
      {
      System.out.println("Wie viele Unterkünfte mussten sie bezahlen?");
      int mengeUnterkünfte = eingaben.nextInt();

      verluste.unterkunft = new int[mengeUnterkünfte];

      System.out.println("Was waren die Preise der einzelnen Unterkünfte?");
      verluste.unterkunft = Rechnen2.summe2(verluste.unterkunft, eingaben);
      System.out.println("Die Zahlen: " + Arrays.toString(verluste.unterkunft));
      }
      else
        {
            verluste.unterkunft = new int[0];
        }

      System.out.println("Haben sie Geld für Nahrungsmittel ausgegeben?");
      boolean antwortNahrung = eingaben.nextBoolean();

      if(antwortNahrung == true)
      {
      System.out.println("Wie oft mussten sie ihre Nahrung bezahlen?");
      int mengeNahrung = eingaben.nextInt();

      verluste.nahrung = new int[mengeNahrung];

      System.out.println("Was waren die Preise der einzelnen Nahrungsmittel?");
      verluste.nahrung = Rechnen2.summe2(verluste.nahrung, eingaben);
      }
      else
        {
            verluste.nahrung = new int[0];
        }

      System.out.println("Haben sie Geld für ihre Fortbewegung ausgegeben?");
      boolean antwortFortbewegung = eingaben.nextBoolean();
      if(antwortFortbewegung == true)
      {
      System.out.println("Wie oft mussten sie geld für ihre Fortbewegung bezahlen?");
      int mengeFortbewegung = eingaben.nextInt();

      verluste.fortbewegung = new int[mengeFortbewegung];

      System.out.println("Was waren die Preise, der einzelnen nutzungen, der Fortbewegung?");
      verluste.fortbewegung = Rechnen2.summe2(verluste.fortbewegung, eingaben);
      }
      else
        {
            verluste.fortbewegung = new int[0];
        }

      System.out.println("Haben sie Mitbringsel gekauft?");
      boolean antwortMitbringsel = eingaben.nextBoolean();
      if(antwortMitbringsel == true)
      {
      System.out.println("Wie viele Mitbringesl haben sie geakuft?");
      int mengeMitbringsel = eingaben.nextInt();

      verluste.mitbringsel =  new int[mengeMitbringsel]; 

      System.out.println("Was waren die einzelnen Preise der Mitbringsel?");
      verluste.mitbringsel = Rechnen2.summe2(verluste.mitbringsel, eingaben);
      }
      else
        {
            verluste.mitbringsel = new int[0];
        }

      System.out.println("Hatten sie sonstige ausgaben?");
      boolean antwortSonstiges = eingaben.nextBoolean();

      if(antwortSonstiges == true)
      {
      System.out.println("Wie viele sonstige ausgaben hatten sie?");
      int mengeSonstiges = eingaben.nextInt();

      verluste.sonstiges = new int[mengeSonstiges];

      System.out.println("Nennen sie die einzelnen Summen der Sonstigen sachen.");
      verluste.sonstiges = Rechnen2.summe2(verluste.sonstiges, eingaben);
      }
      else
        {
            verluste.sonstiges = new int[0];
        }

    

     
         int summeGeschenke = Rechnen.summe(geld.geschenke);//Die Arrays werden zusammen Addiert und einer variable hinzugegügt
         int summeFlüge = Rechnen.summe(verluste.flüge);
         int summeUnterkunft = Rechnen.summe(verluste.unterkunft);
         int summeNahrung = Rechnen.summe(verluste.nahrung);
         int summeFortbewegung = Rechnen.summe(verluste.fortbewegung);
         int summeMitbringsel = Rechnen.summe(verluste.mitbringsel);
         int summeSonstiges = Rechnen.summe(verluste.sonstiges);
       
       
    
      double result1 = geld.startGuthaben + geld.taschengeld + geld.gehalt + summeGeschenke;//Zahlen zusammen rechnen die Positiv sind

      double result2 = summeFlüge + summeUnterkunft + summeNahrung + summeFortbewegung + summeMitbringsel + summeSonstiges;//Zahlen zusammen rechnen die negativ sind

      double result = result1 - result2;// Negative Zahlen von Positiven subtrahieren und ergebnis zu einer Variable hinzufügen

      System.out.println("Geld welches ihnen zur verfügung stand: " + result1 + "€"); 
      System.out.println("Alle ihrer Ausgaben: " + result2 + "€");
      
      
      System.out.println("Geld welches ihnen noch zur verfügung steht: " + result + "€");
      
      eingaben.close();
    } 




    class Rechnen
    {
        public static int summe(int[] werte)//Methode das alle einzelnen zahlen der Arrays zusammengerechnet werden 
        {
          int ergebnis = 0;
          for(int r = 0; r < werte.length;r++)
          {
            ergebnis = ergebnis + werte[r];
          }
            return ergebnis;

    
        }
    }

    class Rechnen2
    {
        public static int[] summe2(int[] werte2, Scanner eingaben)//Methode das der User input zu einem Array hinzugefügt wird  
        {
            for(int g = 0; g < werte2.length;g++)
        {
            werte2[g] = Fehler.sucheFehlernum("Wert eingeben: ", eingaben);
        }

            return werte2;
           
        }
    }

    class Fehler
    {
        public static int sucheFehlernum (String frage, Scanner eingaben)
        {
            int wert = 0;
            boolean fehlerfrei = false; 

            while(fehlerfrei == false)
                {
                    try
                    {
                        System.out.println(frage);
                        wert = eingaben.nextInt();
                        fehlerfrei = true;
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("Das war keine richtige Zahl.");
                        eingaben.nextInt();
                    }
                }
                
          return wert;
        }
    }
     
        
    
}     

        

