/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author dany_
 */
public class Calculadora {
    
    private double num1;
    private double num2;

    public Calculadora() {
        this.num1= 0.0;
        this.num2= 0.0;
    }

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double sumar(double num1, double num2){
        double x;
        return x= num1 + num2;
    }
    
    public double restar(double num1, double num2){
        double x;
        return x= num1 - num2;
    }
    
    public double multiplicar(double num1, double num2){
        double x;
        return x= num1 * num2;
    }
    
    public void dividir(double num1, double num2){
        double x;
        if(num2 != 0){
          x= num1/num2;
          System.out.println(x);
        }else{
            System.out.println("No se puede hacer la division");
        }
    }
}
