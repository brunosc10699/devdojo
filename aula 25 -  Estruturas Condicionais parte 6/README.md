# Aula 25

## Estruturas Condicionais

https://www.youtube.com/watch?v=AYMtqJSrQTU&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=26

### Switch Case

> "A declaração switch executa uma declaração vinda de múltiplas  condições. É como o if-else-if. Trabalha com byte, short, int, long,  tipos enum, String e alguns outros tipos como Byte, Short, Int, and  Long. Desde o Java 7, você pode usar strings na declaração switch.
>
> Em outras palavras, a declaração switch testa a igualdade de uma variável mediante múltiplos valores."
>
> https://www.javatpoint.com/pt/declara%C3%A7%C3%A3o-switch-no-java

#### Estrutura

```
switch (nome da variavel a ser testada) {
	case valor1:
		comando1;
		break;
    case valor2:
    	outro comando;
    	break;
    case valor3:
    	outro comando;
    	break;
    default:
    	outro comando;
}
```

#### Utilização

Exemplo 1:

```
byte dayOfTheWeek = 7;

switch (dayOfTheWeek) {
    case 0:
        System.out.println("Domingo");
        break;
    case 1:
        System.out.println("Segunda-feira");
        break;
    case 2:
        System.out.println("Terça-feira");
        break;
    case 3:
        System.out.println("Quarta-feira");
        break;
    case 4:
        System.out.println("Quinta-feira");
        break;
    case 5:
        System.out.println("Sexta-feira");
        break;
    case 6:
        System.out.println("Sábado");
        break;
    default:
        System.out.println("O número informado não corresponde a um dia da semana!");
}
```

Exemplo 2:

```
Locale brasil = new Locale("pt", "BR");

String productName = "t-shirt";
float productPrice = 60f;
float productDiscount = 0f;

switch (productName) {
    case "skirt":
        productDiscount = 0.05f;
        break;
    case "t-shirt":
        productDiscount = 0.075f;
        break;
    default:
        System.out.println("O produto informado não está dentro da política de descontos.");
        break;
    case "jeans":
        productDiscount = 0.1f;
        break;
    case "dress":
        productDiscount = 0.125f;
}

productPrice -= productPrice * productDiscount;

System.out.printf(
        "O preço final do produto '%s' é %s.",
        productName,
        NumberFormat.getCurrencyInstance(brasil).format(productPrice)
);
```

Exemplo 3 (switch case aninhado):

```
var randomNumber = new Random().nextInt(6);
var randomNumberMod = 0;

switch (randomNumber) {
    default:
        System.out.println("Todo número terminado em '" + randomNumber + "' é par");
        break;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        randomNumberMod = randomNumber % 2;
        switch (randomNumberMod) {
            case 0:
                System.out.println(randomNumber + " é par");
                break;
            case 1:
                System.out.println(randomNumber + " é ímpar");
        }
}
```

Comparando-se os três exemplos, nota-se que a posição do bloco "default", em cada um deles, está colocado em posição diferente e todos funcionam corretamente. A situação mais comum é encontar o bloco "default" depois do último bloco "case".

O uso do comando "break" no final de cada bloco é opcional. Porém, se não for utilizado, os comandos inseridos nos blocos posteriores serão executados também.
