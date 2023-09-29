package exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio06 {
    // Verificando se a lista contém algum número maior que 10

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Retorna um valor booleano (true ou false)
        boolean verificandoNumeros = numeros.stream()
                .anyMatch(n -> n > 10);

        System.out.println(verificandoNumeros);

        // Se existir um ou mais valores maiores que 10 ele retorna esses valores
        numeros.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}
