# Maratona Java Virado no Jiraya

## DevDojo

Este repositório tem por objetivo registrar o aprendizado nas aulas da "[Maratona Java Virado no Jiraya](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW)" do canal [DevDojo](https://www.youtube.com/c/DevDojoBrasil).

### Aula 05 - Executando compilação manualmente

https://www.youtube.com/watch?v=E64JTsEyXCM&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=6

Para compilar, manualmente, um arquivo no Java, é necessário ter o JDK (Java Development Kit) instalado e funcionando.

Nesta aula, produzimos um arquivo com extensão ".java" que imprime uma mensagem na tela. Mas, para que a mensagem seja exibida, é necessário gerar o bytecode, através da compilação, para ser executado pela JVM (Java Virtual Machine).

Criamos um arquivo com o nome "PrimeiraClasseJava.java" no diretório (pasta) "programas", com o conteúdo a seguir.

```
public class PrimeiraClasseJava {
	public static void main (String[] args) {
		System.out.println("Hello DevDojo");
    }
}
```

Para compilar esse arquivo manualmente, digitamos o seguinte no prompt de comandos do Windows:

```
c:\programas\javac PrimeiraClasseJava.java
```

Arquivo compilado com sucesso. A seguir, temos dois arquivos com o mesmo nome e extensões diferentes na pasta "programas":

```
PrimeiraClasseJava.java
PrimeiraClasseJava.class
```

O arquivo com extensão ".class" é o nosso byte code. Para ver a mensagem produzida pelo nosso programa, fazemos assim:

```
c:\programas\java PrimeiraClasseJava
```

