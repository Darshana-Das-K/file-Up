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
    
      String[] equalFiles1;
      String[] equalFiles2;
      int flag;
      public int fileCompare(String path1, String path2,int size){
          int i,j,k=0;
          flag=0;
          equalFiles1 = new String[size];
          equalFiles2 = new String[size];
      File file1 = new File(path1);
      File file2 = new File(path2);
      File[] array_file1=file1.listFiles();
      File[] array_file2=file2.listFiles();
    //FileCompareWindow w= new FileCompareWindow(); 
     
      for(i=0;i<array_file1.length;i++){
         for(j=0;j<array_file2.length;j++){
             System.out.println(flag);
             String n1=array_file1[i].getName();
      String n2=array_file2[i].getName();

         

    //  DateFormat sdf
      //      = new SimpleDateFormat("MM-dd-yyyy hh:mm a");
     // String n1= w.row1[i];
     // String n2= w.row2[j];
      System.out.println(n1+n2);
      if (n1.equals(n2)) {
          flag++;
            equalFiles1[k]= n1;
            equalFiles2[k] = n2;
            k++;
            
        
        System.out.println("Both the  are  equal");
       /* long time1 = array_file1[i].lastModified();
        System.out.print(sdf.format(time1));
        long time2 = array_file2[i].lastModified();
        System.out.print(sdf.format(time2));
        String t1 = String.valueOf(time1);	
        String t2 = String.valueOf(time2);	
         if (t1.compareTo(t2) == 0){
            System.out.println("equal");
            
            
        }
        else{
            System.out.println("not equal");
            
            
        }*/
      } 
     // else if(array_file1[i].getName()!=array_file2[i].getName()){
     //    System.out.println("Both the folders not equal");
         
      //}
      

      
   }
}
     // if(flag==0){
      //    System.out.println("Both the folders not equal");
          
     // }
      return flag;
}
    
    
}
