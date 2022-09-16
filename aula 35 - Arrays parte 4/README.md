# Aula 35

## Arrays - Parte 4

https://www.youtube.com/watch?v=cl47iLWalUw&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=36

### Laço (Looping) FOREACH

O **foreach**, for, é a versão simplificada do laço **for**. Algumas das diferenças são:

- não permite acessar um elemento específico através do índice
- sintaxe mais simples
- percorre, compulsóriamente, todos os índices do array

Sintaxe

```
for(tipo nome : nome do vetor) {
	instruções a serem executadas
}
```

Exemplo de utilização

```
char[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};

for(char vowel : vowelsArray) System.out.println(vowel);
```

Saída no console:

```
a
e
i
o
u
```

