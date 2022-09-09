/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUF GAMING
 */
public class piramida {
    public static void main(String [] args){
        int [] nim = {2, 1, 4, 1, 7, 6, 2, 0, 7, 9};
        int index = 0;
        int i = 0;
         
        do{
            int j = i;
            do{
                System.out.print(" ");
                j++;
            }while(j < nim.length);
            int a = 0;
            do{
                System.out.print(nim[index]+" ");
                index++;
                a++;
            }while(a<=i);
            System.out.println();
            i++;
        }while (i < 4);
    }
}
