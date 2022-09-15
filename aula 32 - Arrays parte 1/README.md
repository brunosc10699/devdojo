# Aula 32

## Arrays

https://www.youtube.com/watch?v=fvw4bmihZHA&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=33

> "Um array é uma estrutura de dados usada para armazenar dados do mesmo tipo. Os arrays armazenam seus elementos em localizações sequenciais  contínuas da memória.
>
> Em Java, arrays são objetos. Todos os  métodos da classe Object podem ser invocados em um array. Podemos  armazenar um número fixo de elementos em um array."
>
> [Thanoshan MV](https://www.freecodecamp.org/news/author/thanoshan/)

Os Arrays possuem algumas particularidades:

- Uma vez definido o seu tamanho, não é possível modifica-lo em tempo de execução
- Não armazena tipos diferentes. Ex: Impossível armazenar dados do tipo **boolean** e **int** simultaneamente
- A forma mais indicada para se declarar um array é colocando os **[ ]** (colchetes) junto ao tipo de dado
- Não é um tipo "primitivo", mas tipo "referência"
- Os elementos de um array não podem receber valor "null"

Sintaxe

```
tipo[] nome = new tipo[tamanho];
ou
tipo nome[] = new tipo[tamanho];
ou
tipo[] nome = {elemento1, elemento2, ..., elementoN};
ou
tipo[] nome = null;
```

Exemplo de utilização

```
byte[] byteArray = new byte[256];
byteArray[0] = -128;
byteArray[255] = 127;
```

Exemplo de utilização

```
int intArray[] = new int[1000];
intArray[999] = 999;
```

Exemplo de utilização

```
String[] fruits = {"Apple", "Orange", "Pineapple", "Grape", "Strawberry", "Papaya", "Banana", "Lemon", "Figs", "Tangelo"};
```

