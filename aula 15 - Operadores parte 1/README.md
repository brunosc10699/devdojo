# Aula 15

## Operadores Aritméticos

https://www.youtube.com/watch?v=1Fsvlted69g&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=16

Os operadores aritméticos são:

- Adição: **+**
- Subtração: **-**
- Multiplicação: *****
- Divisão: **/**
- Resto da divisão: **%**

### Utilização

Soma

```
int numero1 = 10;
int numero2 = 20;
int resultadoDaSoma = numero1 + numero2;
```

Subtração

```
int numero1 = 8;
int numero2 = 15;
int resultadoDaSubtracao = numero1 - numero2;
```

Multiplicação

```
int numero1 = 5;
int numero2 = 80;
int resultadoDaMultiplicacao = numero1 * numero2;
```

Divisão

```
int numero1 = 30;
int numero2 = 5;
int resultadoDaDivisao = numero1 / numero2;
```

Resto da Divisão

```
int numero1 = 10;
int numero2 = 5;
int restoDaDivisao = numero1 % numero2;
```

### Observação

O resultado da operação entre dois números inteiros é um número inteiro. 

Isso significa que ao atribuir o resultado divisão entre os números "5" e "2", números inteiros, a uma variável do tipo "double", o resultado será a parte inteira da divisão.

Exemplo

```
int numero1 = 5;
int numero2 = 2;
double resultadoDaDivisao = numero1 / numero2;
System.out.println(resultadoDaDivisao);
```

No exemplo, acima, a saída do comando de impressão é **2.0** e não 2.5
