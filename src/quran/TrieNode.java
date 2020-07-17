/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quran;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class TrieNode {
    char content; 
    boolean isEnd; 
    int count;  
    LinkedList<TrieNode> childList; 
    String fileName;
    Queue<String> wordOcc; //occurences 
    int countOcc;
    /* Constructor */
    public TrieNode(char c)
    {
        childList = new LinkedList<TrieNode>();
        isEnd = false;
        content = c;
        count = 0;
        fileName="";
        wordOcc=new LinkedList<String>();
        countOcc=0;
    }  
    public TrieNode subNode(char c)
    {
        if (childList != null)
            for (TrieNode eachChild : childList) {
                if (eachChild.content == c)
                    return eachChild;
        }
        return null;
    }
}
 