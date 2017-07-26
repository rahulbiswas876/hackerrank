/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Naveen
 */
public class Student {
    public  static void main(String args[]) {
        int i;
        Hashtable<Integer, String> hashT = new Hashtable<Integer, String>();
        
        hashT.put(1, "R");
        hashT.put(2, "A");
        hashT.put(3, "A");
        
        for(Map.Entry me : hashT.entrySet()){
            System.out.println(me.getKey() + "," + me.getValue());
        }
        
        System.out.println("************");
        HashMap<Integer, String> hashM = new HashMap<Integer, String>();
        
        hashM.put(1, "R");
        hashM.put(2, "A");
        hashM.put(3, "A");
        
        for(Map.Entry me : hashT.entrySet()){
            System.out.println(me.getKey() + "," + me.getValue());
        }
    }
}
