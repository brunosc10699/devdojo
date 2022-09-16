# Aula 34

## Arrays - Parte 3

https://www.youtube.com/watch?v=Vsn-CXzzpUc&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=35

Observe a seguinte instrução:

```
String[] stringsArray = new String[2];
```

A linha de comando, acima, cria o seguinte resultado na memória RAM (Random Access Memory):

| @77459877 |          |
| --------- | -------- |
| índice 0  | índice 1 |
| null      | null     |

Veja que foram alocados dois espaços na memória para armazenar dois valores do tipo **referência**.

A próxima instrução vai armazenar uma palavra em cada posição do array:

```
stringsArray[0] = "Dev";
stringsArray[1] = "Dojo";
```

Como resultado, temos:

| @77459877 |          |
| --------- | -------- |
| índice 0  | índice 1 |
| Dev       | Dojo     |

Os valores foram armazenados corretamente. A seguir, a próxima instrução vai criar um novo array e descartar o atual @77459877:

```
stringsArray = new String[]{"Américas", "Europa", "África", "Ásia", "Oceania"};
```

| @5b2133b1    |              |              |              |              |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| índice **0** | índice **1** | índice **2** | índice **3** | índice **4** |
| Américas     | Europa       | África       | Ásia         | Oceania      |

Perceba que o nome do array continua sendo **stringsArray**, mas o conteúdo é novo. O array anterior, @77459877, será removido da memória pelo **Garbage Collector (GC)** do Java.