# Aula 36

## Arrays Multidimensionais - Parte 1

https://www.youtube.com/watch?v=EalQ6X_RtJk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=37

> "Arrays Multidimensionais são estruturas de dados que possuem duas ou  mais dimensões. Em suma, temos que um Array que contém uma única  dimensão funciona internamente como um Array multidimensional. A  diferença está na quantidade de índices que cada elemento da nossa  estrutura terá como identificador."
>
> http://excript.com/java/array-multidimensional-java.html

Sintaxe

```
tipo[][][] nome = new tipo[tamanho obrigatório][tamanho opcional][tamanho opcional];
ou
tipo[] nome[][] = new tipo[tamanho obrigatório][tamanho opcional][tamanho opcional];
ou
tipo[][][] nome = { { {valor1}, {valor2}, {...}, {valorN} }, { {valor1}, {valor2}, {...}, {valorN} } };
```

Exemplo de utilização

```
char[][] charsArray = new char[26][];

charsArray[0] = new char[2];
charsArray[1] = new char[3];
charsArray[2] = new char[5];

charsArray[0][0] = 1; 
```

Exemplo de utilização

```
String[][] technologyStacks = new String[2][10];

technologyStacks[0][0] = "Java 11";
technologyStacks[0][1] = "Kotlin";
technologyStacks[0][2] = "PHP";
technologyStacks[0][3] = "C#";
technologyStacks[1][0] = "Node";
technologyStacks[1][1] = "Javascript";
```

No exemplo, acima, foi criado um array bidimensional para armazenar as tecnologias mais usadas no "backend" e no "frontend". Veja como ficou na memória RAM:

Endereço do array na memória: **@448139f0**

| Endereços na memória | índice 1 | índice 2   | índice 3 | índice 4 | índice 5 | índice 6 | índice 7 | índice 8 | índice 9 | índice 10 |
| -------------------- | -------- | ---------- | -------- | -------- | -------- | -------- | -------- | -------- | -------- | --------- |
| @7cca494b            | Java 11  | Kotlin     | PHP      | C#       | null     | null     | null     | null     | null     | null      |
| @7ba4f24f            | Node     | Javascript | null     | null     | null     | null     | null     | null     | null     | null      |

