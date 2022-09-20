# Aula 51

## Orientação a Objetos - Métodos parte 8

https://www.youtube.com/watch?v=0fVZlarZ-Lg&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=52

### Referência THIS

A referência "this" referencia o atributo da classe e ajuda a distingui-lo do parâmetro recebido no método. É vista, principalmente, no método construtor de uma classe que recebe parâmetros.

Exemplo

```
public class Student {

    private Long id;
    private String name;
    private Integer age;
    private Character genre;

    public Student() {
    }

    public Student(Long id, String name, Integer age, Character genre) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.genre = genre;
    }
}
```

