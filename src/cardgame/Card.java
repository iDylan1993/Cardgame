/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author Dylan Bastiaanse
 */
public class Card {
    
    private String type;
    private int value;
    private String displayName;
    private String test;

    //Hier kan de volledige kaart worden opgeroepen.
    public Card(int value, String type, String displayName) {
        this.value = value;
        this.type = type;
        this.displayName = displayName;
    }
    public String GetDisplayName()
    {
        return displayName;
    }
  
    
    public int Kaartnummer()
    {
        return value;
    }
}
