# Aula 37

## Arrays Multidimensionais - Parte 2

https://www.youtube.com/watch?v=TGq3754CsN4&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=38

### Manipulando dados com Foreach

Para manipular os dados de um array multidimensional, pode-se usar as estruturas de repetição, também, como **for**, **while** e **do while**.

Exemplo de manipulação (sem estrutura de repetição)

```
float[][] grades = new float[3][4];

grades[0][0] = 7.5f;
grades[0][1] = 6.8f;
grades[0][2] = 8.9f;
grades[0][3] = 8.3f;

grades[1][0] = 7.2f;
grades[1][1] = 5.8f;
grades[1][2] = 3.7f;
grades[1][3] = 8.4f;

grades[2][0] = 5.9f;
grades[2][1] = 7.7f;
grades[2][2] = 7f;
grades[2][3] = 9.3f;
```

No exemplo, acima, foi criado um array para armazenar as notas dos 4 bimestres de 3 estudantes. As notas foram inseridas uma a uma.

Exemplo de manipulação (com estrutura de repetição)

```
byte[][][] threeDimensionalMatrix = new byte[4][3][2];

for (int index1 = 0; index1 < threeDimensionalMatrix.length; index1++) {
    for (int index2 = 0; index2 < threeDimensionalMatrix[0].length; index2++) {
        for (int index3 = 0; index3 < threeDimensionalMatrix[0][0].length; index3++) {
            byte payload = 0;
            while (payload == 0) payload = (byte) new Random().nextInt(61);
            threeDimensionalMatrix[index1][index2][index3] = payload;
        }
    }
}

for (byte[][] matrix : threeDimensionalMatrix)
    for (byte[] data : matrix)
        for (byte payload : data) System.out.print(payload + " ");
```

No exemplo, acima, temos um array tridimensional. O código preenche a matriz com números aleatórios, entre 0 e 61, do tipo byte. A imagem, a seguir, ilustra esse array:

![array-tridimensional-4x3x2](https://raw.githubusercontent.com/brunosc10699/devdojo/main/.github/images/array-tridimensional-4x3x2.webp)

