/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansar.fileioconcept.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rasna
 */
public class FileHelper {
    public static List<String> read(String fileName)throws IOException{
        List<String> lines=new ArrayList<>();
         BufferedReader reader=new BufferedReader(new FileReader(fileName));
          String line="";
          StringBuilder content=new StringBuilder();
          while((line=reader.readLine())!=null){
             lines.add(line);
              
          }
          reader.close();
          return lines;
    }
    
    public static void write(String fileName,String content)throws IOException{
        FileWriter writer=new FileWriter(fileName);
        writer.write(content);
        writer.close();
          
        
    }
    
}
