# JAVA

### Linguagem Multiplataforma
### WORA -> Write Once, Run Anywhere

Código fonte -> Compilador (JAVAC) -> Bytecode -> JVM (JAVA VIRTUAL MACHINE) -> Sistema Operacional

O Java primeiro é compilado para um bytecode, que é uma linguagem intermediária, e depois é interpretado pela JVM, que é uma máquina virtual que roda em cima do sistema operacional.

JRE -> Java Runtime Environment + JVM + Bibliotecas + Suporte de recursos

JDK -> Java Development Kit + JRE + Compilador + Ferramentas de desenvolvimento


POO -> 
Objetos -> Um objeto é a representação de algo do mundo real: Pessoa, Carro, Dispositivos, ...
Atributos -> Características do objeto: cor, modelo, marca, ...
Métodos -> Ações do objeto: ligar, desligar, acelerar, frear, ...

Instância -> Um objeto criado a partir de uma classe, cria uma representação do objeto na memória.

## Excessões
Excessões verificadas -> Excessões que são verificadas em tempo de compilação, ou seja, o compilador verifica se o código está correto, se não estiver, ele não compila.

Excessões não verificadas -> Excessões que não são verificadas em tempo de compilação, ou seja, o compilador não verifica se o código está correto, se não estiver, ele compila, mas em tempo de execução, o programa pode lançar uma excessão.

## Wrapper Classes
São classes que representam os tipos primitivos, elas são utilizadas para converter um tipo primitivo em um objeto, e vice-versa.