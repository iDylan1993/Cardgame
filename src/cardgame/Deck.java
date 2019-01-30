/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dylan Bastiaanse
 */
public class Deck {
    List<Card> cards = new ArrayList<>(); 
    int k;
    
    public Deck() {  
        for(int i = 0; i < 4; i++) {
            String Type = "";
            switch(i) {
                case 0: 
                    Type = "Harten";
                    break;
                case 1: 
                    Type = "Klaveren";
                    break;
                case 2:
                    Type = "Ruiten";
                    break;
                case 3:
                    Type = "Schoppen";
                    break;
            }
            for(k = 2; k < 15; k++) {
                String displayName = "";
                switch(k) {
                    case 11:
                        displayName = "Boer " + Type;
                        break;
                    case 12: 
                        displayName = "Vrouw " + Type;
                        break;
                    case 13:
                        displayName = "Koning " + Type;
                        break;
                    case 14:
                        displayName = "Aas " + Type;
                        break;
                    default:
                        displayName = k + " " + Type;
                }
                Card c = new Card(k, Type, displayName);
               cards.add(c); 
            }
        }
    } 
}
