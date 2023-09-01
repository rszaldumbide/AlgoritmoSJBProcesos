/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SJB;


import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rszaldumbide
 */
public class metodosSJF {

    private char[] matrizChar;
    private String[] matrizString;
    private int cont;
    private double L, U;
    private String proceso;
    
    public metodosSJF() {
    }
    
    public void ordenar2(int[] arrU, int[] arrL, String[] arrN, DefaultTableModel ordenados, DefaultTableModel procesos, int tamaño){
        
//        for(int i=0; i<procesos.getRowCount(); i++){     
//            if(i==0){     
//                proceso=procesos.getValueAt(i, 0).toString();
//                L = Math.round(Double.parseDouble(procesos.getValueAt(i, 1).toString()));
//                U = Math.round(Double.parseDouble(procesos.getValueAt(i, 2).toString()));
//                ordenados.setValueAt(proceso, i, 0);
//                ordenados.setValueAt((int)(L), i, 1);                
//                ordenados.setValueAt((int)(U), i, 2);                  
//            }
//        }
//        for (int i = 1; i < arrU.length; i++) {
//            for (int j = 1; j < arrU.length; j++) { 
//                if (arrU[i] < arrU[j]) {
//                    //paso 1
//                    int temp = arrU[i];
//                    int tempL= arrL[i];
//                    String tempN=arrN[i];
//                    //paso 2
//                    arrU[i] = arrU[j];
//                    arrL[i] = arrL[j];
//                    arrN[i] = arrN[j];
//                    //paso 3
//                    arrU[j] = temp;
//                    arrL[j] = tempL;
//                    arrN[j] = tempN;
//                }       
//            }         
//        }

        int rafaga=arrU[0]+arrL[0];
        for(int i=0; i<arrU.length-1; i++){
            
            int temp=arrU[i+1];
            int tempL= arrL[i];
            String tempN=arrN[i];
            
            for(int j= i+1; j<arrU.length-1; j++){
                if(arrU[j+1]<temp){
                    if(arrL[j+1]<=rafaga){
                        //paso 1
                        temp=arrU[j+1];
                        tempL=arrL[j+1];
                        tempN=arrN[j+1];
                        //paso 2
                        arrU[j+1] = arrU[i+1];
                        arrL[j+1] = arrL[i+1];
                        arrN[j+1] = arrN[i+1];
                        //paso 3
                        arrU[i+1] = temp;
                        arrL[i+1] = tempL;
                        arrN[i+1] = tempN;
                        }
                }else{
                    if(arrU[j+1] == arrU[j]){
                        //paso 1
                        temp=arrU[j];
                        tempL=arrL[j];
                        tempN=arrN[j];
                        //paso 2
                        arrU[j+1] = arrU[j+1];
                        arrL[j+1] = arrL[j+1];
                        arrN[j+1] = arrN[j+1];
                        //paso 3
                        arrU[j] = temp;
                        arrL[j] = tempL;
                        arrN[j] = tempN;
                    }
                }
            }
            rafaga=tamaño;
        }
              
        for(int i=0; i<arrU.length; i++){
            ordenados.setValueAt(arrN[i], i, 0);
            ordenados.setValueAt(arrL[i], i, 1); 
            ordenados.setValueAt(arrU[i], i, 2);  
        }
    }

    public char[] MatrizChar(int tamaño) {
                
        matrizChar = new char[tamaño];
        cont=0;                                                                                                             
        
        for(int fila=0; fila<tamaño; fila++){
            matrizChar[fila]=(char)('A'+cont);
            cont++;
            }

        return matrizChar;   
    }
    
    public void imprimirMatriz(char[] matriz, int filas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        int col=0;
        for (int fila = 0; fila < filas; fila++) {
            nombre.setValueAt(matriz[fila], fila, col);
        }   
    }
    
    public void imprimirMatriz(String matriz[], int filas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        int col=0;
        for (int fila = 0; fila < filas; fila++) {
            nombre.setValueAt(matriz[fila], fila, col);
        }   
    }
    
    public String[] MatrizString(int tamaño) {
                
        matrizString = new String[tamaño];                                                                                                           
        
        for(int fila=0; fila<tamaño; fila++){
            matrizString[fila]="";
            }

        return matrizString;   
    }
    
    
    public void imprimirMatrizRafaga(String[] matriz, int filas, int rafagas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        
        String vector[]=new String[rafagas];
        cont=0;
        for(int i=0; i<rafagas; i++){
            if(i==0){
                vector[i]="procesos/rafaga";
            }else{
                vector[i]=""+cont;
                cont++;
            }
        }
        modelo.setColumnIdentifiers(vector);
        
        int col=0;
        cont=0;
        for (int fila = 0; fila < filas; fila++) {
            if(col==0){
                //nombre.getValueAt(fila, 0);
//                nombre.setValueAt((char)('A'+cont), fila, col);
//                cont++;
            }else{
                nombre.setValueAt(matriz[fila], fila, col);
            }
        }   
    }

}
