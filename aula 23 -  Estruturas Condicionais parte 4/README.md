# Aula 23

## Estruturas Condicionais

https://www.youtube.com/watch?v=Y3ODYE3npgo&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=24

### Tabela Verdade

> "Tabela verdade é um dispositivo utilizado no estudo da lógica  matemática. Com o uso desta tabela é possível definir o valor lógico de  uma proposição, isto é, saber quando uma sentença é verdadeira ou falsa."
>
> ​																						Rosimar Gouveia - Professora de Matemática e Física

A tabela verdade ajuda a compreender o resultado da comparação entre valores booleanos, como se vê a seguir:

Operador lógico "E", representado pelo carácter especial: &

| Valor 1 | e Valor 2 | e Valor 3 | Resultado |
| :-----: | :-------: | :-------: | :-------: |
|  TRUE   |   TRUE    |   TRUE    |   TRUE    |
|  TRUE   |   FALSE   |   TRUE    |   FALSE   |
|  FALSE  |   TRUE    |   TRUE    |   FALSE   |
|  FALSE  |   FALSE   |   FALSE   |   FALSE   |

Analisando a tabela para o operador lógico **&**, verificamos que só se obtém um resultado TRUE se todas as condições ou valores comparados, entre si, forem TRUE. 

Operador lógico "Ou", representado pelo carácter especial: |

| Valor 1 | ou Valor 2 | ou Valor 3 | Resultado |
| :-----: | :--------: | :--------: | :-------: |
|  TRUE   |    TRUE    |    TRUE    |   TRUE    |
|  TRUE   |   FALSE    |    TRUE    |   TRUE    |
|  FALSE  |    TRUE    |    TRUE    |   TRUE    |
|  FALSE  |   FALSE    |   FALSE    |   FALSE   |

Observa-se que o resultado da tabela verdade para o operador lógico **|** é exatamente o oposto do que acontece para o operador &. Ao comparar os valores, basta que haja um valor TRUE para que toda a sentença seja TRUE.
