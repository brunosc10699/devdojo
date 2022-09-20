# Aula 52

## Orientação a Objetos - Métodos parte 9

https://www.youtube.com/watch?v=T0E4Ewwz1IY&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=53

### Varargs...

O "Varargs" é um recurso disponível desde o Java 5 e é outra forma de representar os arrays na assinatura de um método.

- Deve sempre ser o último dos parâmetros de um método
- Permite passar o parâmetro sem a necessidade de instanciar um array

Exemplo

```
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {    
    	sumArrayNumbers("Hello varargs...", 1.0, 3.1, 4.5, 7L, 3.5f, 8, 9.3);
    }
    
    public static void sumArrayNumbers(String greeting, double... numbers) {
        double result = 0d;
        for(double number : numbers) result += number;
        System.out.printf("%n%s%nO resultado da SOMA dos números enviados no array %s é %.2f", greeting, Arrays.toString(numbers), result);
    }
}
```

