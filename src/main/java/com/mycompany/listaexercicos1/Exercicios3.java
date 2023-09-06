/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicos1;
import java.util.Scanner;  
/**
 *
 * @author kawan.0946
 */
public class Exercicios3 {
    
    public static void main(String[] args){
        
       Scanner scanner = new Scanner (System.in);
       
       int num1;
       System.out.println("digite os numeros");
       num1 = scanner.nextInt();
       if (num1 % 2 == 0){
           System.out.println(" o numero e par ");
       }else{
           System.out.println("o numero e impar");
           
           
       }
       
    }
    
}
