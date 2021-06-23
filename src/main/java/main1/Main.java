package main1;

public class Main {

    public static void main(String[] args) {

        System.out.println("El resultado de la Suma es: " + suma(6,9));
        System.out.println("El resultado de la Resta es: " + resta(25,9));
        System.out.println("El resultado de la Multiplicacion es: " + multiplicacion(7,6));
        System.out.println("El resultado de la Division es: " + division(80,2));
    }

    public static int suma(int numero1, int numero2){
        return (numero1 + numero2);
    }

    public static int resta(int numero1, int numero2){
        return (numero1 - numero2);
    }

    public static int multiplicacion(int numero1, int numero2){
        if(numero2 >= 1){
            return suma(numero1 , multiplicacion(numero1, numero2 - 1));
        }else{
            return 0;
        }
    }

    public static int division(int numero1, int numero2 ){
        if (numero2 > numero1){
            return 0;
        }else{
            return 1 + division(numero1 - numero2, numero2);
        }
    }
}
