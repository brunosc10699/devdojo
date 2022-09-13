# Aula 20

## Estruturas Condicionais

https://www.youtube.com/watch?v=gk1_Pn8GZA4&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=21

### Estrutura Condicional "if"

A estrutura condicional **if** executa comandos quando a condição escrita, entre parênteses, resultar em um valor booleano TRUE. 

Pode executar um bloco de comandos delimitado por chaves **{ }**. 

Quando há apenas um comando para ser executado, o uso de chaves **{ }** é opcional. 

Estrutura:

```
if (condição verdadeira) {
	comando1;
	comando2;
	comandoN; //onde "N" é um número infinito
}
```

Exemplo:

```
long number1 = 10L;
short number2 = 8;

//exemplo de "if" com um bloco de comandos delimitado por { }
if (number1 > number2) {
	System.out.println("A variável 'number1' vale " + number1);
	System.out.println("A variável 'number2' vale " + number2);
	System.out.println("A variável 'number1' é maior que a 'number2'");
}

//exemplo de "if" com apenas um comando
if (number1 > number2) System.out.println("A variável 'number1' é maior que a 'number2'");
```

