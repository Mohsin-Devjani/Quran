/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quran;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SurahNames {
    String names[];
    String ProperNames[];
    public SurahNames() {
        String line="";
        String[] words=new String[114];
        names=new String[114];
        ProperNames=new String[114];
        int k=0;
        try {
            File file = new File(("SURAHNAMES.txt"));
            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
           
            while ((line=(String)bf.readLine()) != null) {
                words= line.split(" ");
                ProperNames[k]=words[0];
                names[k]=words[0].replaceAll("[0-9]","");
                names[k]=names[k].replaceAll("[.-]", "");
                k++;
        }
        }
        catch(IOException e){
            System.out.println("file nahi mili");
        }
   // filing();    
  
  }
}
