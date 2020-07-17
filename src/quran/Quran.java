/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quran;

import javax.swing.*;

public class Quran {
    
     static Trie trie;
     
    public static void main(String[] args) {
        // TODO code application logic here
        mainPage mp= new mainPage();
        mp.setVisible(true);
        
        while(!mainPage.start){
            System.out.println("");
        
        }
    }
    
}
