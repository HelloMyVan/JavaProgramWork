/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtest3_2;
import java.io.*;
import java.util.*;
/**
 *
 * @author fsl97
 */
public class ProgramTest3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("输入圆柱体半径：");
        double r,h;
        Scanner reader = new Scanner(System.in);
        r=reader.nextDouble();
        System.out.println("圆柱底面积为："+(r*r)+"π");
        System.out.println("输入圆柱体高：");
        h=reader.nextDouble();
        System.out.println("圆柱的体积为："+(h*r*r)+"π");
        // TODO code application logic here
    }
    
}
