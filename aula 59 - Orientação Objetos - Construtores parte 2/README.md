# Aula 59

## Orientação a Objetos - Construtores

https://www.youtube.com/watch?v=rW11EAkxFnc&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=60

### Construtores com Sobrecarga

Regras

- Construtores não são métodos
- Construtor não tem tipo de retorno
- É composto pelo modificador de acesso seguido do nome da classe
- Na ausência de um construtor na classe, o Java adiciona um construtor sem parâmetros durante a compilação
- É o responsável pela criação de um objeto
- **this();** e **this(param1, param2, ...)** referem-se ao construtor da classe
- **this();** e **this(param1, param2, ...)** só funcionam dentro de outro construtor
- **this();** e **this(param1, param2, ...)** devem ser a primeira linha executável do corpo do construtor

Exemplo de Sobrecarga de **Construtor**

```
public class Anime {

    private String name;
    private String type;
    private Integer numberOfEpisodes;
    private String genre;

    public Anime() {
    }

    public Anime(String name, String type, Integer numberOfEpisodes) {
        this.name = name;
        this.type = type;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public Anime(String name, String type, Integer numberOfEpisodes, String genre) {
        this(name, type, numberOfEpisodes);
        this.genre = genre;
    }
}
```

