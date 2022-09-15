# Aula 31

## Estruturas de Repetição

https://www.youtube.com/watch?v=RaEO2YsqFII&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=31

### Instrução: CONTINUE

A instrução **continue** é utilizada para interromper uma iteração dentro de uma estrutura de repetição.

Exemplo de utilização

```
System.out.println("Números pares de 0 a 20");

for (byte i = 0; i <= 20; i++) {
	if (i % 2 == 1) continue;
	System.out.println(i);
}
```

No exemplo, acima, somente os números pares são impressos na tela, pois a instrução "continue" é executada quando o valor da variável "i" é ímpar.

Resumindo, o "continue" faz com que todas as linhas de código abaixo dele sejam ignoradas.
