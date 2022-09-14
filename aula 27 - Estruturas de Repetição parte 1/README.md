# Aula 27

## Estruturas de Repetição

https://www.youtube.com/watch?v=hEl67ZAU_Hg&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=28

### Laços de repetição WHILE, DO WHILE e FOR

> "Um **Laço de Repetição**, ou **loop**, é uma estrutura de programação que repete uma sequência de instruções até que uma condição específica seja atendida. Nós programadores usamos *loops* para percorrer os valores, adicionar somas de números, repetir funções e muitas outras coisas."
>
> https://programadoresbrasil.com.br/2021/01/o-que-e-um-laco-de-repeticao/



#### Laço de repetição WHILE (Enquanto)

Sintaxe

```
while (enquanto a condição for verdadeira) {
	executa um ou mais comandos neste bloco
}
```

Exemplo de utilização

```
//Palpite para a Megasena da Virada

byte count = 0;
byte tempNumber = 0;

while (count < 6) {
    int randomNumber = new Random().nextInt(61);
    if (randomNumber == tempNumber || randomNumber == 0) {
        break;
    } else {
        tempNumber = (byte) randomNumber;
        System.out.println((count + 1) + "ª dezena: " + randomNumber);
        count++;
    }
}
```



#### Laço de repetição DO WHILE (Faça Enquanto)

Sintaxe

```
do {
	executa um ou mais comandos neste bloco
} while (enquanto a condição for verdadeira);
```

Exemplo de utilização

```
//Menu

Scanner scanner = new Scanner(System.in);
byte option = 0;

do {
    System.out.println("\n============ MENU ============");
    System.out.println("Escolha uma das opções abaixo:");
    System.out.println("1 - Criar novo usuário");
    System.out.println("2 - Exibir lista de usuários");
    System.out.println("9 - Sair");
    System.out.println("============ MENU ============");
    System.out.print("Sua opção: ");
    option = scanner.nextByte();
    switch (option) {
        case 1:
            System.out.println("Tela de cadastro de usuário");
            break;
        case 2:
            System.out.println("Tela de exibição da lista de usuários");
            break;
        case 9:
            System.out.println("Obrigado por utilizar nossas soluções!");
            break;
        default:
            System.out.println("Opção inválida!");
    }
} while (option != 9);
```



#### Laço de repetição FOR (Para)

Sintaxe

```
for (inicialização de variável; condição de parada; instrução) {
	executa um ou mais comandos neste bloco
}
```

Exemplo de utilização

```
//Imprime na tela quais números, entre 1 e 10, são ímpar ou par

for (byte i = 0; i <= 10; i++) {
	if (i % 2 == 1) 
		System.out.println(i + " é ímpar!");
	else
		System.out.println(i + " é par!");
}
```

