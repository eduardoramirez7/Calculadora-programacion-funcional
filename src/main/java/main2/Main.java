package main2;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        
        BiFunction<Integer,Integer,Integer> suma = (numero1, numero2)-> numero1 + numero2;
        
        BiFunction<Integer,Integer,Integer> resta = (numero1, numero2)-> numero1 - numero2;

        BiFunction<Integer,Integer,Integer> multiplicacion = (numero1, numero2)-> IntStream.range(0, numero2 + 1)
                .reduce((acumulador, numero)-> suma.
                        apply(acumulador,numero1))
                .getAsInt();

        BiFunction<Integer,Integer,Integer> division = (numero1, numero2) -> IntStream.range(0, numero1)
                .reduce((acumulador, numero)-> multiplicacion
                        .apply(numero,numero2)<= numero1?suma
                        .apply(acumulador,1) :acumulador)
                .getAsInt();

        System.out.println("El resultado de la Suma es: " + suma.apply(6,9));
        System.out.println("El resultado de la Resta es: "+ resta.apply(25,9));
        System.out.println("El resultado de la Multiplicacion es: " + multiplicacion.apply(7,6));
        System.out.println("El resultado de la Division es: " + division.apply(80,2));;
    }
}
