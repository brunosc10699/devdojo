# Aula 16

## Operadores Relacionais

https://www.youtube.com/watch?v=U390IaCtOUk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=17

Os operadores relacionais são:

- Igual: **==**
- Menor que: **<**
- Menor ou igual a: **<=**
- Maior que: **>**
- Maior ou igual a: **>=**
- Diferente de: **!=**

### Utilização

Igual

```
int number1 = 10;
double number2 = 10.0;
if (number1 == number2) System.out.println(number1 + " é igual a " + number2);
```

Menor que

```
int number1 = 8;
short number2 = 15;
if (number1 < number2) System.out.println(number1 + " é menor que " + number2);
```

Menor ou igual a

```
byte number1 = 5;
long number2 = 5l;
if (number1 <= number2) System.out.println(number1 + " é menor ou igual a " + number2);
```

Maior que

```
int number1 = 30;
double number2 = 5.0;
if (number1 > number2) System.out.println(number1 + " é maior que " + number2);
```

Maior ou igual a

```
int number1 = 10;
float number2 = 5f;
if (number1 >= number2) System.out.println(number1 + " é maior ou igual a " + number2);
```

Diferente de

```
char character1 = 'a';
char character2 = 'b';
if (character1 != character2) System.out.println(character1 + " é diferente de " + character2);
```

### Observação

Não é possível utilizar um operador relacional para comparar tipos não-comparáveis.

Exemplo: o tipo "boolean" não é comparável com o tipo "char", assim como o tipo "char" não é comparável com o tipo "long".
