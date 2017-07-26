/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author Naveen
 */
public class SortFrequency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sortByFrequency(new int[] {4,3,3,2,2,2,1,3,3,2,4});
    }
    
    
    static void sortByFrequency(int [] arry) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0; i< arry.length;i++) {
            Integer val = map.get(arry[i]);
            
            if(val == null){
                map.put(arry[i], 1);
            }else{
                map.put(arry[i], val+1);
            }
        }
        
        ArrayList<Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                if(o1.getValue().compareTo(o2.getValue()) != 0)
                    return o2.getValue().compareTo(o1.getValue());
                else
                    return o1.getKey().compareTo(o2.getKey());
            }
        });
        
        
        for(Entry<Integer,Integer> e : list){
            int key = e.getKey();
            int value = e.getValue();
            
            for(int i = 1; i<= value;i++){
                System.out.print(key + " ,");
            }
        }
    }
}
