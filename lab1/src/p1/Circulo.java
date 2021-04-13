package p1;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Circulo {

    public static void main(String[] args){
		double r,area,circunferecnia;
                String input;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca el radio: ");
		input=leer.nextLine();
		
                try{
                    if(input=="abc"){
                        throw new Exception();
                    }
                    r=Double.parseDouble(input);
                    if(r>0){
                       
                       circunferecnia =2 * Math.PI*r;
                       area= Math.PI*Math.pow(r, 2);
                       System.out.println("Circulo con radio "+r+",");
                       System.out.println(" la circunferencia es "+circunferecnia);
                       System.out.println(" y el area es "+area+".");
                       leer.close();
                    }else{
                        throw new Exception();
                    }
                
                }catch(Exception e){
                    System.out.println("error");
                }		
	}

    
    public double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double circunferencia(double r) {
        return 2 * Math.PI * r;
    }
}
