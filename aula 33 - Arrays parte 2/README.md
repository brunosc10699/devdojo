# Aula 33

## Arrays - Parte 2

https://www.youtube.com/watch?v=S8Eaq6uxnd8&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=34

### Valor padrão para tipos "Primitivo"

Tipos primitivos não aceitam o valor "null" como atribuição.

| **Tipo** | **Tamanho         | **Faixa**                                                    | **Valor Padrão** |
| -------- | ----------------- | ------------------------------------------------------------ | ---------------- |
| byte     | 8 bits = 1 Byte   | -128 a 127                                                   | 0                |
| short    | 16 bits = 2 Bytes | -32.768 a 32.767                                             | 0                |
| int      | 32 bits = 4 Bytes | -231 a 231 – 1                                               | 0                |
| long     | 64 bits = 8 Bytes | -263 a 263 -1                                                | 0L               |
| float    | 32 bits = 4 Bytes | IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38  | 0.0f             |
| double   | 64 bits = 8 Bytes | IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308 | 0.0d             |
| char     | 16 bits = 2 Bytes | \u0000 (ou 0) a \uffff (ou 65535)                            | \u0000           |
| boolean  | 1 bit             | ou true ou false                                             | false            |



### Valor padrão para tipos "Referência"

O valor padrão usado para tipos **referência** é null.



### Acesso ao conteúdo do array

Arrays, na maioria das linguagens, têm como índice inicial o **0** (ZERO).

Para acessar o conteúdo, do array, basta indicar a posição (índice), entre colchetes, em que se encontra o dado desejado, como no exemplo abaixo:

```
int[] oddNumbers = {7, 3, 5, 7, 9};

System.out.println(oddNumbers[0]);
```

A instrução, acima, gera a seguinte saída no console: 

```
7
```

Exibindo todos os elementos do array:

```
int[] oddNumbers = {7, 3, 5, 7, 9};

int counter = oddNumbers.length;

while (--counter >= 0) System.out.println("índice [" + counter + "]: " + oddNumbers[counter]);
```

Saída no console:

```
índice [4]: 9
índice [3]: 7
índice [2]: 5
índice [1]: 3
índice [0]: 7
```

