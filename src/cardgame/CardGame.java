/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.util.*;

/**
 *
 * @author Dylan Bastiaanse
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */

   static int Score = 0;
   static String Input;
    
    public static void main(String[] args) 
    {
        Vragen();
    }
    
    public static void Vragen()
    {
        Scanner SC = new Scanner(System.in);
        Deck D = new Deck();
        Random r = new Random();
        int Kaart1 = r.nextInt(D.cards.size());
        int Kaart2 = r.nextInt(D.cards.size());
        Card HuidigeKaart = D.cards.get(Kaart1);
        Card VolgendeKaart = D.cards.get(Kaart2);
        System.out.println("Deze kaart is getrokken: " + D.cards.get(Kaart1).GetDisplayName());
        System.out.println("Is uw volgende kaart hoger of lager?");
        Input = SC.nextLine();
       switch (Input.toLowerCase())
       {
            case "hoger":
            {
            if (HuidigeKaart.Kaartnummer() < VolgendeKaart.Kaartnummer())
            {   
            Score = Score + 1;
            System.out.println("Correct, de volgende kaart is hoger: " +  VolgendeKaart.GetDisplayName());
            Vragen();
            }
            else 
            {   
            System.out.println("Helaas, u heeft verloren. De kaart was: " + VolgendeKaart.GetDisplayName()) ;
            System.out.println("Uw Score was: " + Score);
            }
            }   
            break;
            case "lager":
            {
            if (HuidigeKaart.Kaartnummer() > VolgendeKaart.Kaartnummer())
            {   
            Score = Score + 1;
            System.out.println("Correct, de volgende kaart is lager: " +  VolgendeKaart.GetDisplayName());
            Vragen();
           }
             else 
            {   
            System.out.println("Helaas, u heeft verloren. De kaart was: " + VolgendeKaart.GetDisplayName()) ;
            System.out.println("Uw Score was: " + Score);
            }
            }
            break;
            default:
            System.out.println("Voer een geldige keuze in: ");
            Input = SC.nextLine();
            
       } 
           }
       }
   
       



