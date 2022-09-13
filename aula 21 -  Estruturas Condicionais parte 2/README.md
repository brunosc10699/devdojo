# Aula 21

## Estruturas Condicionais

https://www.youtube.com/watch?v=exxeNsgcg3c&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=22

### Estrutura Condicional "else" e "else if"

A palavra "else", traduzida para o Português, significa "senão". A estrutura condicional **else** não pode ser executada sem a presença da estrutura principal **if**. A cada vez que o "if" receber um valor booleano FALSE, ou seja, quando a condição testada pelo "if" for falsa, os comandos presentes no bloco "else" serão executados.

Estrutura:

```
if (condição verdadeira) {
	comando1;
	comando2;
	comandoN; 
} else {
	comando3;
	comando4;
	comandoN;
}
```

Exemplo:

```
long number = 10L;

//verificando se um número é par ou ímpar
if (number % 2 == 0) {
	System.out.println("O número " + number + " é par!");
} else {
	System.out.println("O número " + number + " é ímpar!");
}
```

A estrutura condicional **else if** também depende da presença a estrutura principal **if**. Ela é usada para iniciar o teste de uma nova condição caso o resultado da condição anterior seja um valor booleano FALSE.

Estrutura

```
if (se a condição for verdadeira) {
	comando1;
	comandoN; 
} else if (se a nova condição for verdadeira) {
	comando3;
	comandoN;
} else if (se a nova condição for verdadeira) {
	comando5;
	comandoN;
} else {
	comando7;
}
```

Exemplo:

```
double studentAverage = 7.5;

if (studentAverage > 7)
	System.out.println("Aluno aprovado!");
else if (studentAverage >= 6)
	System.out.println("Aluno em recuperação!");
else
	System.out.println("Aluno reprovado!");
```

**Obs:** Percebemos que, no exemplo acima, não foram utilizadas as chaves **{ }** para delimitação de bloco por se tratar apenas de uma linha de comando de execução em cada estrutura condicional.
