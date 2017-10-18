/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_igl;

import java.util.ArrayList;

/**
 *
 * @author Abdelaziz Ghanemi
 */

public class VectorHelper {
    
    
   protected void Trier(ArrayList<Integer> Vecteur){ 
   int cpt;
   int element;
 
    for (int i = 1; i < Vecteur.size() ; i++)
    {    
        element = Vecteur.get(i);
        cpt = i - 1;
        while (cpt >= 0 && Vecteur.get(cpt) > element)
        {
           Vecteur.set(cpt+1,Vecteur.get(cpt));
           cpt--;
        }
        Vecteur.set(cpt+1,element);
    }
    }
   /* Inverser les elements d'un vecteur */
   protected void Inverser(ArrayList<Integer> Vecteur){
       
       for (int i=0;i<Vecteur.size()/2;i++){
           int temp = Vecteur.get(i);
           Vecteur.set(i, Vecteur.get(Vecteur.size()-i-1));
           Vecteur.set(Vecteur.size()-i-1,temp);
       }
   }
   
   protected void MaxMin(ArrayList<Integer> Vecteur){
       int min=Vecteur.get(0),max=Vecteur.get(0);
       
       for(int i=1;i<Vecteur.size();i++){
           if (min > Vecteur.get(i)) min=Vecteur.get(i);
           if (max<Vecteur.get(i)) max=Vecteur.get(i);
       }
      
       
   }
   
}
