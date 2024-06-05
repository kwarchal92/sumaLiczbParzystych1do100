package sumaLiczbParzystych1do100;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> liczby = IntStream.rangeClosed(1,100)
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        Integer suma = liczby.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("\nSuma wszystkich liczb parzystych z przedziału 1 do 100 wynosi: " + suma +".");
    }
}
