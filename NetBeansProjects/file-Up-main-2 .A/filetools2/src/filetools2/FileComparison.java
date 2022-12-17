/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filetools2;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author darshanadask
 */
public class FileComparison {
    
       public static File[] equalFiles1;
    public static File[] equalFiles2;
    public static File[] lastModifiedFilesB;
    public static File[] firstModifiedFilesA;
    public static int flag;
    public static File[] array_file1;
    public static File[] array_file2;

    public static int fileCompare(File file1, File file2){
        int i,j,k=0,p=0;
        flag=0;
           
        array_file1=file1.listFiles();    
        array_file2=file2.listFiles();
        int size1 = array_file1.length>array_file2.length ? array_file1.length:array_file2.length;     
        equalFiles1 = new File[size1];
        equalFiles2 = new File[size1];
        
        lastModifiedFilesB = new File[size1];
        firstModifiedFilesA = new File[size1];
   
      for(i=0;i<array_file1.length;i++){
        String n1=array_file1[i].getName();
        for(j=0;j<array_file2.length;j++){
            String n2=array_file2[j].getName();
        DateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm a");


            if (n1.equals(n2)) {
                flag++;
                equalFiles1[k]= array_file1[i] ;
                equalFiles2[k] = array_file2[j];
                
                
                long time1 = array_file1[i].lastModified();
                System.out.print(sdf.format(time1));
                long time2 = array_file2[j].lastModified();
                System.out.print(sdf.format(time2));
               // String t1 = String.valueOf(time1);	
               // String t2 = String.valueOf(time2);	
                if (time1<time2){
                       firstModifiedFilesA [p]= array_file1[i];
                     lastModifiedFilesB[p]= array_file2[j];
                     System.out.println("The file A is not last modified");
                     p++;
                }
                else{
                    System.out.println("not equal");
                }

                k++;
            } 
        }
      }
 
      //System.out.println("the array is");
     // for(File file: lastModifiedFilesB){
       //   System.out.println("kakakakaka"+file);
      //}
     
      return flag;
  }
}
    
    

