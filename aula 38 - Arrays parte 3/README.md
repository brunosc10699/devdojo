# Aula 38

## Arrays Multidimensionais - Parte 3

https://www.youtube.com/watch?v=vp8bQZomKLo&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=39

### Inicialização de Arrays Multidimensionais



#### Primeira forma (com definição completa do tamanho da matriz)

```
tipo[][] nome = new tipo[tamanho obrigatório][tamanho opticional];
```

Exemplo de inicialização

```
short[][] numbers = new short[3][2];
```



#### Segunda Forma (com definição parcial do tamanho da matriz)

```
tipo[][] nome = new tipo[tamanho obrigatório][tamanho opticional];
```

Exemplo de inicialização

```
byte[][] bytesArray = new byte[2][];
bytesArray[0] = new byte[5];
bytesArray[1] = new byte[]{9, 7, 5, 3, 1};
```



#### Terceira Forma (inicializando a matriz com dados)

```
tipo[][] nome = { {dado1, dado2}, {dado1, dado2, dado3} };
```

Exemplo de inicialização

```
int[][] intsArray = { {0, 2, 4, 6}, {1, 3, 5, 7} };
```



#### Quarta Forma (inicializando a matriz a partir de outro array existente)

```
tipo[] nome1 = new tipo[tamanho obrigatório];

tipo[][] nome2 = new tipo[tamanho obrigatório][tamanho opcional];

nome2[0] = nome1;
```

Exemplo de inicialização

```
float[] decimals = {7.5f, 3.7f, 9.6f, 13.2f};
float[][] floatsArray = new float[5][];
floatsArray[0] = decimals;
floatsArray[1] = decimals;
floatsArray[2] = decimals;
floatsArray[3] = decimals;
floatsArray[4] = decimals;
```

Outros exemplos

```
String[] words = new String[10];

char[] vowels = {'a', 'e', 'i', 'o', 'u'};

String[] fruits = null;
fruits = new String[]{"Banana", "Strawberry", "Apple", "Mamey"};

byte[] numbers = {1, 3, 5, 7, 9};

boolean[] affirmations = new boolean[4];

boolean[][] booleansArray = new boolean[2][];
booleansArray[0] = affirmations;
booleansArray[1] = affirmations;
```



