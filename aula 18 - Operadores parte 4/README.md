# Aula 18

## Operadores Lógicos

### "Ou" => |

https://www.youtube.com/watch?v=ELcO4DN7lxw&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=19

Os operadores lógicos são:

- E: **&** 
- E: **&&**
- Ou: **|**
- Ou: **||**
- Não: **!**

### Utilização

"Ou" => **|**

Ao utilizar o operador lógico "Ou" para obter o valor TRUE como resultado, apenas uma das condições precisa ser verdadeira.

```
if (1 == 1 | 5 != 5l) System.out.println("Utilizando o operador lógico OU.");
```

Veja que, nesse exemplo, apesar da primeira condição ser suficiente para retornar o valor TRUE, a segunda condição será verificada também, consumindo mais processamento e tempo.

"Ou" com curto-circuito => **||**

```
if (5 != 4 || 'a' == 'a') System.out.println("Utilizando o operador lógico OU.");
```

Com a utilização do operador com o recurso de curto-circuito, verificando que a primeira condição é verdadeira, o valor TRUE é retornado imediatamente sem verificar a segunda condição, poupando processamento e tempo.
