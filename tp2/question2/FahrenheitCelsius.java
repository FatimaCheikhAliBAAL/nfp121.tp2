package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       for(int i=0;i<args.length;i++)
       {
       try{
           int fahren=0;
           float cls=0;
           fahren=Integer.parseInt(args[i]);
           cls=fahrenheitEnCelsius(Integer.parseInt(args[i]));
           System.out.println(fahren + "\u00B0F ->" + cls + "\u00B0C");
           
        }
      
       catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
    }
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         float c;
         float res;
         c=(float)5/9*(f-32);
         res=(int)(c*10)/10.0f;
       // ...
       return res;	// à compléter	en remplaçant la valeur retournée par la fonction de conversion
       // ...
     }

}
