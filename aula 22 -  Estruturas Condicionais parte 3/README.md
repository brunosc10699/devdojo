# Aula 22

## Operador Ternário

https://www.youtube.com/watch?v=gU-qCpBC5jk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=23

O operador "Ternário" é uma forma abreviada de uso das estruturas condicionais.

Estrutura

```
(se a condição for verdadeira) ? devolve este valor : devolve outro valor;
```

Na estrutura do operador Ternário temos, em primeiro lugar, uma condição a ser verificada. Se essa condição for verdadeira, **então** (**?** = então) devolve o valor entre a interrogação e os dois pontos, **senão** ( **:** = senão) devolve o valor à direita dos dois pontos.

Exemplo 1

```
int age = 27;

String result = (age >= 18) ? "Maior de idade" : "Menor de idade";

System.out.println("O indivíduo é " + result);
```

Exemplo 2

```
double randomNumber = Math.random() * 10;

String result = randomNumber > 5 ? "maior que 5" : "menor que 5";

System.out.printf("O número %.2f é %s", randomNumber, result);
```

