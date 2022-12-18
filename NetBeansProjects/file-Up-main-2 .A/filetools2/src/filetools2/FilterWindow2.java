package filetools2;

import java.io.File;
import filetools2.FilterWindow1;
import java.io.FilenameFilter;
import java.nio.file.Files;
import javax.swing.table.DefaultTableModel;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author darshanadask
 */
public class FilterWindow2 extends javax.swing.JFrame {

    /**
     * Creates new form FilterWindow2
     */
   
    String ex= filetools2.FilterWindow1.extension;
   //  nameArray, pathArray2;
    int i=0;
    String[] nameArray;
    
    public FilterWindow2() {
        this.nameArray = new String[filetools2.FilterWindow1.listOfFiles1.length];
        initComponents();
        TablePopulate2();
    }
    
    public void TablePopulate2(){
         File directoryPath = new File(filetools2.FilterWindow1.folderpath1);
         FilenameFilter textFilefilter = new FilenameFilter(){
         public boolean accept(File dir, String name) {
            String lowercaseName = name.toLowerCase();
            if (lowercaseName.endsWith(".txt")) {
               return true;
            } else {
               return false;
            }
         }
      };
         FilenameFilter jpgFilefilter = new FilenameFilter(){
         public boolean accept(File dir, String name) {
            String lowercaseName = name.toLowerCase();
            if (lowercaseName.endsWith(".jpg")) {
               return true;
            } else {
               return false;
            }
         }
      };
      
      FilenameFilter pdfFilefilter = new FilenameFilter(){
        public boolean accept(File dir, String name) {
           String lowercaseName = name.toLowerCase();
           if (lowercaseName.endsWith(".pdf")) {
              return true;
           } else {
              return false;
           }
        }
     };
     FilenameFilter pptxFilefilter = new FilenameFilter(){
        public boolean accept(File dir, String name) {
           String lowercaseName = name.toLowerCase();
           if (lowercaseName.endsWith(".pptx")) {
              return true;
           } else {
              return false;
           }
        }
     };
     FilenameFilter docFilefilter = new FilenameFilter(){
        public boolean accept(File dir, String name) {
           String lowercaseName = name.toLowerCase();
           if (lowercaseName.endsWith(".docx")) {
              return true;
           } else {
              return false;
           }
        }
     };
     FilenameFilter mp3Filefilter = new FilenameFilter(){
        public boolean accept(File dir, String name) {
           String lowercaseName = name.toLowerCase();
           if (lowercaseName.endsWith(".mp3")) {
              return true;
           } else {
              return false;
           }
        }
     };
     FilenameFilter wavFilefilter = new FilenameFilter(){
        public boolean accept(File dir, String name) {
           String lowercaseName = name.toLowerCase();
           if (lowercaseName.endsWith(".wav")) {
              return true;
           } else {
              return false;
           }
        }
     };
     
      //List of all the text files
      if(ex==".txt"){
      String textFilesList[] = directoryPath.list(textFilefilter);
      System.out.println("List of the text files in the specified directory:");
      for(String fileName : textFilesList) {
         //System.out.println(fileName);
         nameArray[i]= fileName;
         i++;
      }
    }
    else if(ex==".jpg"){
      String imageFilesList[] = directoryPath.list(jpgFilefilter);
      System.out.println("List of the jpeg files in the specified directory:");
      for(String fileName : imageFilesList) {
        // System.out.println(fileName);
         nameArray[i]= fileName;
         i++;
      }
    }
    else if(ex==".docx"){
        String imageFilesList[] = directoryPath.list(jpgFilefilter);
        System.out.println("List of the jpeg files in the specified directory:");
        for(String fileName : imageFilesList) {
          // System.out.println(fileName);
          nameArray[i]= fileName;
         i++;
        }
      }
      else if(ex==".pptx"){
        String pptFilesList[] = directoryPath.list(pptxFilefilter);
        System.out.println("List of the jpeg files in the specified directory:");
        for(String fileName : pptFilesList) {
           //System.out.println(fileName);
           nameArray[i]= fileName;
         i++;
        }
      }
      else if(ex==".mp3"){
        String imageFilesList[] = directoryPath.list(jpgFilefilter);
        System.out.println("List of the jpeg files in the specified directory:");
        for(String fileName : imageFilesList) {
           //System.out.println(fileName);
           nameArray[i]= fileName;
         i++;
        }
      }
      else if(ex==".wav"){
        String wavFilesList[] = directoryPath.list(wavFilefilter);
        System.out.println("List of the jpeg files in the specified directory:");
        for(String fileName : wavFilesList) {
          // System.out.println(fileName);
          nameArray[i]= fileName;
         i++;
        }
      }
    else{
      String pdfFilesList[] = directoryPath.list(pdfFilefilter);
      System.out.println("List of the pdf files in the specified directory:");
      for(String fileName : pdfFilesList) {
         //System.out.println(fileName);
         nameArray[i]= fileName;
         i++;
      }
    }
    //  filetools2.FileComparison.fileCompare(filetools2.FileCompareWindow.directory1,filetools2.FileCompareWindow.directory2);
         
        for(String s : nameArray){
            System.out.println("pathArray1 nut: "+s);
        }
  //int k=0;
  //String[] row3= new String[filetools2.FileComparison.flag];
 // System.out.println("row3 length is  "+ filetools2.FileCompareWindow.row1.length);
        for (String s: nameArray) {
            
            if(s!=null){
              //  System.out.println("file is " +file);
             //   String name=s; 
                 //   String modifiedDate=sdf.format(file.lastModified());
                 //   String type=Files.probeContentType(file.toPath());
                  //  String sizeKB=Long.toString(file.length());
                    String[] data={s};
                  //  size1 = filetools2.FileComparison.equalFiles1.length;
                  //  pathArray1= new String[size1];
                    
                    DefaultTableModel model1 = (DefaultTableModel)FilterTable.getModel();
              //      for(int j=0;j<size1;j++){
               //         pathArray1[j]= file.getAbsolutePath() ;
                //    }
                     model1.addRow(data);
                     
               
        
              // row3[k]= file.getName() ;
              // k++;
               // model1.addRow(row3);

            }
             
            
        }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        FilterTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FilterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FilterTable);

        jLabel1.setText("Required Files");

        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FilterWindow1 w = new FilterWindow1();
        w.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilterWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilterWindow2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FilterTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
