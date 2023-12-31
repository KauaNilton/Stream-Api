package exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio10 {
    // Agrupando os valores ímpares múltiplos de 3 ou de 5
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multiplos = numeros.stream()
                .filter(n -> n % 2 == 1)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .toList();

        System.out.print("Os valores ímpares multiplos de 3 ou de 5 são: " + multiplos);

    }
}
