/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansar.fileioconcept;

import com.sansar.fileioconcept.util.FileHelper;
import com.sansar.fileioconcept.util.Grabber;
import java.io.IOException;

/**
 *
 * @author Rasna
 */
public class Program {
    
    public static void main(String[] args) {
        String link="http://hamrobazaar.com/search.php?do_search=Search&Search.x=0&Search.y=0&Search=search&catid_search=2&searchword=";
        try{
            for(String keyword:FileHelper.read("d:/searchkeys.csv")){
                System.out.println("Grabbing context for"+keyword);
                String content=Grabber.grab(link+keyword);
                FileHelper.write("d:/datas/"+keyword+".html", content);
                System.out.println("====================================");
            }
            
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
    
}
