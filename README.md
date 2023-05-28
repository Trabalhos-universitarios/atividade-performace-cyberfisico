# atividade-universitária-performace-cyberfisico

Considere duas máquinas com conjuntos de instruções diferentes. Os
computadores tem uma frequência de 300 MHz. As medições a seguir foram
registradas executando programas de um benchmark:
Tipo de instrução Número de instruções
(milhões)
Ciclos por tipo de
instrução
Máquina A
Aritmética e lógica 8 1
Load e store 4 3
Desvios 2 4
Outros 4 3
Máquina B
Aritmética e lógica 10 1
Load e store 8 2
Desvios 2 4
Outros 4 3
a) Calcule o CPI médio para cada máquina
b) Calcule os tempos de execução
c) Calcule a taxa MIPS para cada máquina (pesquise o que é essa taxa).
d) Sabendo que o desempenho de cada máquina é calculado por 1/(tempo de
execução), calcule o desempenho de cada máquina e compare.
Pontifícia Universidade Católica do Paraná
Escola Politécnica
Bacharelado em Sistemas de Informação
_________________________________________________________________________________________________________________________________
e) A razão entre os desempenhos é conhecida como
speed-up. Calcule e
interprete.
2) Explique os três tipos de hazards em pipelines. Utilize
exemplos para fundamentar suas respostas.
3) Pesquise, explique e exemplifique o que são as “bolhas” ou
stalls no contexto de pipelining.
4) Explique de forma objetiva o que são os computadores
superescalares.
5) INTRODUÇÃO A THREADS EM PYTHON/JAVA
Em JAVA todas as propriedades e métodos estão
encapsulados no corpo JDK. Assim, para criarmos uma thread
instanciamos um objeto do tipo Thread. Passamos um objeto
da classe que implementa a interface Runnable. O que
inserirmos no método run será executado (desde que a thread
seja agendada pelo S.O).
Pontifícia Universidade Católica do Paraná
Escola Politécnica
Bacharelado em Sistemas de Informação
_________________________________________________________________________________________________________________________________
Replique o código (caso faça em python, pesquise como
retornar o nome da thread). Atribua um nome a thread
utilizando o método
setName(). Ainda, atribua uma prioridade
utilizando
setPriority(). Faça um teste utilizando a constante
Thread.MAXPRIORITY. Apresente o print dos seus testes
com o nome dado e a prioridade.
Pontifícia Universidade Católica do Paraná
Escola Politécnica
Bacharelado em Sistemas de Informação
_________________________________________________________________________________________________________________________________
Uma outra maneira de implementarmos thread é criarmos
uma classe e extendermos a classe Thread (que
implementa Runnable). Agora conseguimos utilizar “this”.
Crie um programa em que duas threads são criadas (t1 e t2).
No caso do JAVA, instancie dois objetos da sua classe Thread
(MinhaThread) em um classe chamada Processo, por exemplo.
Inicialize as duas threads e coloque um breakpoint no método
run(). Observe e reporte quantos Threads existem.
Exercício:
Faça um programa que dado um intervalo (numérico), imprima
todos os números primos existentes.
Exemplo:
Pontifícia Universidade Católica do Paraná
Escola Politécnica
Bacharelado em Sistemas de Informação
_________________________________________________________________________________________________________________________________
Intervalo [2;10]
Primos: 2,3,5,7
a) Faça apenas o processo (sem threads)
b) Criar um thread que imprime os primos no intervalo
c) Criar 2 threads: Uma para primeira metade (começo até
metade) e outra para (metade +1 até final)..
d) Criar vários threads, um para cada sub-intervalo.
Exemplo: 5-50 ; 50-100; 100-150; 150-200
e) Faça testes com intervalos grandes (na casa de milhões).
Qual dos exemplos anteriores é o caso mais rápido?
f) Utilize o powershell para medir o tempo:
measure-
command { java meu programa}. Para isso crie um
programa para cada versão e meça o tempo para
