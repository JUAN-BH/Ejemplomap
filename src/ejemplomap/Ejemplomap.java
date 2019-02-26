/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author juan_man.becerra
 */
public class Ejemplomap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<Persona> listap = new LinkedList<>();
        LinkedList<Persona> listap2 = new LinkedList<>();
        
       /* HashMap<Integer,Persona> map1 = new HashMap<>();        
        LinkedHashMap<Integer, Persona> map2 = new LinkedHashMap<>();
        TreeMap<Integer, Persona> map3 = new TreeMap<>();*/
        HashMap<Integer,LinkedList<Persona>> map1 = new HashMap<>();        
        LinkedHashMap<Integer, LinkedList<Persona>> map2 = new LinkedHashMap<>();
        TreeMap<Integer, LinkedList<Persona>> map3 = new TreeMap<>();
        
        listap.add(new Persona("manolo", "2175775", 20));
        listap.add(new Persona("lipa", "2173453", 24));
        listap.add(new Persona("pipe", "2173543", 18));
        listap.add(new Persona("alex", "2173453", 23));
        map1.put(3, listap);
        
        listap2.add(new Persona("valentina", "2179737", 34));
        listap2.add(new Persona("magara", "217894", 32));
        listap2.add(new Persona("isabel", "2178489", 23));
        listap2.add(new Persona("maryanne", "217948", 54));
        map1.put(2, listap2);
        
        
        
        
       /* map1.put(3, new Persona("manolo", "2175775", 20));
        map1.put(2, new Persona("lipa", "21345775", 19));
        map1.put(5, new Persona("pipe", "21787675", 18));
        map1.put(4, new Persona("alex", "2176865", 18));
        
        map2.put(3, new Persona("manolo", "2175775", 20));
        map2.put(2, new Persona("lipa", "21345775", 19));
        map2.put(5, new Persona("pipe", "21787675", 18));
        map2.put(4, new Persona("alex", "2176865", 18));
        
        map3.put(3, new Persona("manolo", "2175775", 20));
        map3.put(2, new Persona("lipa", "21345775", 19));
        map3.put(5, new Persona("pipe", "21787675", 18));
        map3.put(4, new Persona("alex", "2176865", 18));*/
        
        String m1 = mostrar(map1);
//        String m2 = mostrar(map2);
//        String m3 = mostrar(map3);
        
        System.out.println(m1);
//        System.out.println("_____________");
//        System.out.println(m2);
//        System.out.println("_____________");
//        System.out.println(m3);
//        System.out.println("_____________");


    
    }
    
    
   /* public static String mostrarmap(Map<Integer, Persona> m){
    String mostrar = " ";
    
        Iterator<Map.Entry<Integer, Persona>> it = m.entrySet().iterator();
        while (it.hasNext()){
        Map.Entry<Integer, Persona> pair = it.next();
        mostrar += pair.getKey() + " " + pair.getValue() + "\n";        
        }
        
    return mostrar;
    }*/
    
     public static String mostrar(Map<Integer, LinkedList<Persona>> m){
    String mostrar = " ";
    
        Iterator<Map.Entry<Integer, LinkedList<Persona>>> it = m.entrySet().iterator();
        while (it.hasNext()){
        Map.Entry<Integer, LinkedList<Persona>> pair = it.next();
        
        mostrar += pair.getKey();
        
            for (int i = 0; i < pair.getValue().size(); i++) {
                mostrar += " " + pair.getValue().get(i) + "\n";
            }
        
        }
        
    return mostrar;
    }
    
    
    
    
    
    
    
    
}
