/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUF GAMING
 */
public class array {
    public static void main (String [] args){
        int [] nim = {2, 1, 4, 1, 7, 6, 2, 0, 7, 9};
        int jumlah = 0;
        
        for(int i = 0; i < nim.length; i++){
            jumlah+=nim[i];
        }
        System.out.println("Hasil penjumlahan  dari nim tersebut adalah = " + jumlah);
         
    }
}
