# Maratona Java Virado no Jiraya

## DevDojo

Este repositório tem por objetivo registrar o aprendizado nas aulas da "[Maratona Java Virado no Jiraya](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW)" do canal [DevDojo](https://www.youtube.com/c/DevDojoBrasil).

### Aula 09 - Comentários

https://www.youtube.com/watch?v=2rMT0qRyiYs&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=10

### Tipos

Existe três tipos de comentário no Java:

- Comentário de uma linha
- Comentário de múltipas linhas
- Comentário oficial Javadoc

### Comentário de uma linha

Para se fazer o comentário de uma linha, usa-se duas barras, como no exemplo a seguir:

```
//esse é o comentário de uma linha
public class Hello {
}
```

O comentário de uma linha deve ser evitado ao máximo, segundo as regras de boas práticas em programação (Clean Code).

### Comentário de múltiplas linhas

Para se fazer o comentário de múltiplas linhas, usa-se os caracteres /* para iniciar e */ para indicar o término do comentário:

```
/* 
   Comentário
   Visando as melhores práticas no desenvolvimento de software,
   evite comentar o seu código.
*/
public class MyProgram {
}
```

O comentário de múltiplas linhas também deve ser evitado ao máximo, segundo as regras de boas práticas em programação (Clean Code).

### Javadoc

Javadoc é o comentário oficial do Java, utilizado para documentação de software. Para iniciar, utiliza-se /** e um * para cada linha do comentário. Para encerrar, utiliza-se */

```
public class MyProgram {

	public static void main(String[] args) {
		sum(10, 15);
	}
	
    /**
     * Método usado para somar dois números inteiros
     * @param a: número inteiro
     * @param b: número inteiro
     * @author: Bruno
     * @version: 0.1
     */
    public static void sum(int a, int b) {
        System.out.println("Dados dois números, a sua soma é: " + (a + b));
    }
}
```

Nesse tipo de comentário, pode-se usar tags HTML

Recomenda-se fortemente que esse tipo de comentário seja usado em métodos públicos, como no exemplo de código anterior.

Nem todas as empresas adotam este tipo de documentação e optam por outras, como [Swagger](https://swagger.io/specification/) porque Javadoc necessita de atualização ao se fazer mudanças no código.
