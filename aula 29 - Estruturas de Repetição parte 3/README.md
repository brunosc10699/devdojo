# Aula 29

## Estruturas de Repetição

https://www.youtube.com/watch?v=bcv-cgpw7Ak&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=30

### Instrução de parada: BREAK

O "break" é uma instrução utilizada para interromper a execução dos comandos dentro de um bloco.

Exemplo de utilização

```
//Imprime, no console, números aleatórios entre 0 (inclusive) e 10

while (true) {
    int number = new Random().nextInt(10);
    if (number == 5) break;
    System.out.println(number);
}
```
