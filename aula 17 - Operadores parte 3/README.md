# Aula 17

## Operadores Lógicos

### "E" => &

https://www.youtube.com/watch?v=cT6sw-Pw4l0&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=18

Os operadores lógicos são:

- E: **&** 
- E: **&&**
- Ou: **|**
- Ou: **||**
- Não: **!**

### Utilização

"E" => **&**

Ao utilizar o operador lógico "E" para obter o valor TRUE como resultado, todas as condições precisam ser verdadeiras.

```
if (2 == 1 & 'a' == 'a') System.out.println("Utilizando o operador lógico E.");
```

No exemplo acima foi usado o operador "&", que verifica as duas condições, bit a bit, antes de dar o resultado. Mesmo que a primeira condição seja falsa, ele verifica a segunda condição também.

"E" com curto-circuito => **&&**

```
if (2 == 1 && 7f == 7.0) System.out.println("Utilizando o operador lógico E com curto-circuito.");
```

Nesse exemplo, foi utilizado o operador "E" com curto-circuito, o que significa dizer que ao verificar que a primeira condição "2 == 1" é falsa, não será necessário verificar a segunda condição. Dessa forma, melhora-se a performance na execução do código.
