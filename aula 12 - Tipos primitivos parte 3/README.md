# Aula 12

## Tipos Primitivos parte 3

https://www.youtube.com/watch?v=74hd4o7V328&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=13

### Casting

Casting se trata da possibilidade de converter um valor de tipo específico para outro tipo. Pode ser explícito ou implícito, conforme a tabela a seguir:

![tabela-casting-implicito-explicito.webp](https://raw.githubusercontent.com/brunosc10699/devdojo/main/aula%2012%20-%20Tipos%20primitivos%20parte%203/projeto/.github/images/tabela-casting-implicito-explicito.webp)

Fonte: http://www.universidadejava.com.br/java/java-casting-tipos-primitivos/

#### Casting Explícito

Para fazer o Casting explícito, adicione o tipo desejado para conversão entre parenteses.

Exemplo de casting explícito

```
float number = (float) 3000.0;
```

**Importante:** no casting explícito pode haver perda de dados.

#### Casting Implícito

O Casting é implícito quando o tipo de origem do dado tem menor capacidade de armazenamento do que o tipo de destino.

Converter um valor do tipo "float" para "double" é fazer um casting implícito, no qual não é necessário informar o tipo antes do valor da variável, já que o double consegue armazenar o dobro da capacidade do float.

Exemplo de casting implícito

```
double number = 3000f;
```

**Tabela de Tipos Primitivos**

| **Tipo** | **Tamanho         | **Faixa**                                                    | **Valor Padrão** |
| :------- | ----------------- | ------------------------------------------------------------ | ---------------- |
| byte     | 8 bits = 1 Byte   | -128 a 127                                                   | 0                |
| short    | 16 bits = 2 Bytes | -32.768 a 32.767                                             | 0                |
| int      | 32 bits = 4 Bytes | -231 a 231 – 1                                               | 0                |
| long     | 64 bits = 8 Bytes | -263 a 263 -1                                                | 0L               |
| float    | 32 bits = 4 Bytes | IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38  | 0.0f             |
| double   | 64 bits = 8 Bytes | IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308 | 0.0d             |
| char     | 16 bits = 2 Bytes | \u0000 (ou 0) a \uffff (ou 65535)                            | \u0000           |
| boolean  | 1 bit             | ou true ou false                                             | false            |
