# Aula 19

## Operadores de Atribuição

https://www.youtube.com/watch?v=EFrq1WxsL1k&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=20

Os operadores de atribuição são:

- **=**
- **+=**
- **-=**
- ***=**
- **/=**
- **%=**
- **++**
- **--**

### Utilização

#### Operador: **=**

Serve para atribuir um valor a uma variável.

```
byte number = 10;
```

O valor **10** foi atribuído a variável "number".

#### Operador: +=

Soma, o valor dado, ao valor da variável existente.

```
byte number = 10;
number += 5;
```

O valor da variável "number" passou a ser **15**.

#### Operador: -=

Subtrai, o valor dado, do valor da variável existente.

```
byte number = 10;
number -= 5;
```

O valor da variável "number" passou a ser **5**.

#### Operador: *=

Multiplica, o valor dado, pelo valor da variável existente.

```
byte number = 10;
number *= 5;
```

O valor da variável "number" passou a ser **50**.

#### Operador: /=

Divide o valor da variável existente pelo valor dado.

```
byte number = 10;
number /= 5;
```

O valor da variável "number" passou a ser **2**.

#### Operador: %=

Atribui o resto da divisão do valor da variável existente pelo valor dado.

```
byte number = 10;
number %= 5;
```

O valor da variável "number" passou a ser **0**.

#### Operador: ++

Acrescenta uma unidade ao valor da variável existente.

```
byte number = 10;
number ++;
```

O valor da variável "number" passou a ser **11**.

Há certas situações em que se esse operador for utilizado antes do nome da variável, o pode resultado variar como no exemplo a seguir:

```
int number = 5;
System.out.println(number ++);
```

Nesse caso, a saída do comando de impressão é **5** porque o operador de atribuição foi colocado à direita do nome da variável.

```
int number = 5;
System.out.println(++ number);
```

A saída desse comando de impressão é igual a **6** porque o operador de atribuição foi colocado à esquerda do nome da variável.

#### Operador: --

Subtrai uma unidade do valor da variável existente.

```
byte number = 10;
number --;
```

O valor da variável "number" passou a ser **9**.

Caso esse operador seja utilizado à esquerda do nome da variável, pode gerar um resultado diferente em certas situações, como no exemplo a seguir:

```
int number = 7;
System.out.println(number --);
```

Nesse caso, a saída do comando de impressão é **7** porque o operador de atribuição foi colocado à direita do nome da variável.

```
int number = 7;
System.out.println(-- number);
```

A saída desse comando de impressão é igual a **6** porque o operador de atribuição foi colocado à esquerda do nome da variável.
