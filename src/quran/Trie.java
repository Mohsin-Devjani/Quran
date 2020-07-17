/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quran;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;




public class Trie {
    private TrieNode root;
    String fileNames[];
    String[]names;
    String fName;
    String index;
   // String[] indexList;
    int i=0;
     public Trie()
    {
        root = new TrieNode(' ');         
    }
   public void doInsertion(){       
       SurahNames s= new SurahNames();
String names[]=s.names;
 String line="";
 String words[]={""};

String index[];
for(int i=0;i<names.length;i++){
   
     try {
            File file = new File((names[i]+".txt"));
            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file))); 
            line=(String)bf.readLine();
             line=(String)bf.readLine(); line=(String)bf.readLine(); line=(String)bf.readLine();
                  while ((line=(String)bf.readLine()) != null) {
                      
                      if(line.charAt(0)=='['){
                      line=    line.toLowerCase();  
                     
                     line=line.replaceAll("allah", "Allah");
                      line=line.replaceAll("[(,!.);?]","" );
                      line=line.replaceAll("[--]","" );
                       
                words= line.split(" ");
               for(int n=1;n<words.length;n++){
                   words[n]=words[n].replaceAll("[:]", "");
               }
                this.insert(words,words[0]); 
                      }
                } 
            }
     
     catch(IOException e){
            System.out.println("file nahi mili");
        }
}

   }
     /* Function to insert word */
    public void insert(String names[],String index)
    {this.index=index; boolean exist=false; boolean subnodenull=true;
        for(int i = 1; i<names.length; i++){
            
            TrieNode current = root;
            for (char ch : names[i].toCharArray() )
        {
            if (current.subNode(ch) == null){
                exist= false; subnodenull=false;
               // System.out.println(names[i]+" "+ ch);
                break;
            }
            else{
                current = current.subNode(ch);
               // System.out.println(ch);
        }  }
             if (current.isEnd == true) {
                 exist=true;
             }
             
        if (exist == true && subnodenull==true){
        //    System.out.println(names[i]+" "+ index);
            current.wordOcc.add(index); 
            current.countOcc++;
                    
        }
        else{
             current = root;
        for (char ch : names[i].toCharArray() )
        {
            TrieNode child = current.subNode(ch);
            if (child != null)
                current = child;
            else 
            {
                 current.childList.add(new TrieNode(ch));
                 current = current.subNode(ch);
            }
            current.count++;
        }
        current.isEnd = true;
     //   current.fileName=names[i] + ".txt";
        current.countOcc++;
       current.wordOcc.add(index);
//        try {
//              PrintWriter pr = new PrintWriter(new FileOutputStream(new File("wordsearch.txt"),true));
//         pr.print(index);
//                pr.close();
//                        }catch (IOException ex) {
//                System.out.println("file nahi bani");
//            }          
      }
        }
    }
      
    public Queue<String> search(String word)
    { //SurahList s = new SurahList();
        String report="nahe hai";
        TrieNode current = root; 
        for (char ch : word.toCharArray() )
        {
          
            if (current.subNode(ch) == null){
                
                return null;
            }
            else
                current = current.subNode(ch);
        }     
        
        if (current.isEnd == true) {
  //       current.wordOcc.add(index);    
        //   String str= current.wordOcc.toString();
           String occ=Integer.toString(current.countOcc);
           current.wordOcc.add(occ);
         //   System.out.println("Occurences: "+ current.countOcc);
       //    System.out.println(str);
           // System.out.println(word);
//            try {
//            File file = new File((current.fileName));
//            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
//            String read;
//            while ((read=(String)bf.readLine()) != null) {
//               
//                System.out.println(read);
//      //          s.SurahDisplay.append(read+"\n");
//                
//            }
//            bf.close();
//            }
//            catch (IOException e) {
//            System.out.println("file nahe mili");
//       
//   }
            
            return current.wordOcc;
        }
        return null;
    }
}