/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtest3_1;
import java.io.*;
import java.util.*;
/**
 *
 * @author fsl97
 */
public class ProgramTest3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("输入华氏温度：");
        Scanner reader = new Scanner(System.in);
        double Hs;
        Hs=reader.nextDouble();
        System.out.println("摄氏温度为:"+((Hs-32)*5/9));
        // TODO code application logic here
    }
    
}
