package org.santiagolopez.system;

import java.util.Scanner;



/**
 *
 * @author Familia Lopez
 */
public class Principal {
    public static void main(String[] args){
        int opcion, num1;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Santiago López");
            System.out.println("2020076");
            System.out.println("------------Menú de Programas------------");
            System.out.println("1. convertidor de segundos a formato h:m:s");
            System.out.println("2. Programa de Billetes");
            System.out.println("3. Programa de número par o impar");
            System.out.println("4. Programa de número Perfecto");
            System.out.println("5. Serie Fibonacci");
            System.out.println("Elegir una opción");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    int hora, min;
                    System.out.println("Convertidor de Segundos a formato h:m:s");
                    System.out.println("Ingresar la cantidad de segundos a convertir");
                    num1 = sc.nextInt();
                    hora = num1/3600;
                    min = (num1/60)-(hora* 60);
                    num1 = num1-(min*60)-(hora*3600);
                    System.out.println("El resultado es:");
                    System.out.println(hora+":"+min+":"+num1);
                break;
                case 2: 
                    int b200, b100, b50, b20, b10, b5, b1;
                    System.out.println("Programa de Billetes");
                    System.out.println("Ingrese la cantidad de billetes a convertir");
                    num1=sc.nextInt();
                    b200=num1/200;
                    b100=(num1-(b200*200))/100;
                    b50=(num1-(b200*200)-(b100*100))/50;
                    b20=(num1-(b200*200)-(b100*100)-(b50*50))/20;
                    b10=(num1-(b200*200)-(b100*100)-(b50*50)-(b20*20))/10;
                    b5=(num1-(b200*200)-(b100*100)-(b50*50)-(b20*20)-(b10*10))/5;
                    b1=num1-(b200*200)-(b100*100)-(b50*50)-(b20*20)-(b10*10)-(b5*5);
                    System.out.println("Hay "+b200+" billetes de Q.200.00");
                    System.out.println("Hay "+b100+" billetes de Q.100.00");
                    System.out.println("Hay "+b50+" billetes de Q.50.00");
                    System.out.println("Hay "+b20+" billetes de Q.20.00");
                    System.out.println("Hay "+b10+" billetes de Q.10.00");
                    System.out.println("Hay "+b5+" billetes de Q.5.00");
                    System.out.println("Hay "+b1+" billetes de Q.1.00");


                break;
                case 3:
                    System.out.println("Programa de Múmero Par o Impar");
                    System.out.println("Ingrese el número entero  ´para verificar");
                    num1=sc.nextInt();
                   
                    if (num1==0)
                        System.out.println("El número es 0");
                    else if (num1%2==0)
                        System.out.println("El número es par");
                    else 
                        System.out.println("El número es impar");
                    
                break;
                case 4:
                    int sumdiv=0, div;
                    System.out.println("Programa de Número Perfecto");
                    System.out.println("Ingrese el Número a Verficar");
                    num1=sc.nextInt();
                    
                    for(div=1; div< num1; div++){
                        if(num1 % div ==0)
                            sumdiv +=div;
                    }
                    if (sumdiv==num1)
                        System.out.println("El número es Perfecto");
                    else
                        System.out.println("El número no es Perfecto");
                    
                break;
                case 5:
                    int num2=1, num3=0, num4=0;
                   
                    System.out.println("Serie Fibonacci");
                    System.out.println("Ingrese cuantos valores quiere de la serie");
                    num1=sc.nextInt();
                    
                    if (num1==1)
                        System.out.println("0");
                    else if (num1==2)
                        System.out.println("0,1");
                    else{
                        System.out.print("0,1");
                        for(int cont=3; cont<= num1; cont++){
                            num4=num3+num2;
                            System.out.print(","+num4);
                            num3=num2;
                            num2=num4;
                        }
                    }
                    
                break;
                }
            }while(opcion > 0 & opcion < 6);
                System.out.println("Gracias por usar el Programa");
        
        
    }
    
}
