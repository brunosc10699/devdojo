# Aula 60

## Orientação a Objetos - Bloco de Inicialização

https://www.youtube.com/watch?v=HGB02nLvgKU&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=61

### Bloco de Inicialização

- É um bloco delimitado por **{ }** que pode ser colocado em qualquer lugar, dentro da classe.
- É executado todas as vezes em que for criada uma instância do objeto
- É executado antes do Construtor

Exemplo

```
public class Anime {

    private String name;
    private final Integer[] episodes;

    public Anime() {
    }

    public Anime(String name) {
        this.name = name;
    }
	
	//Bloco de Inicialização: pode estar posicionado em qualquer parte da classe
    {
        episodes = new Integer[100];
        for (int index = 0; index < episodes.length; index++) episodes[index] = index + 1;
    }

```

Ao criar um objeto:

1. É alocado o espaço na memória para o objeto
2. Cada atributo de classe é criado e inicializado com valores **default** ou com os valores que forem passados
3. O Bloco de Inicialização é executado
4. O Construtor é executado
