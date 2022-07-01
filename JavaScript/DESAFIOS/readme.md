# Desafios

## 1

Daenerys é a khaleesi dos Dothraki. Juntamente com Drogon, eles vão atrás do Tyrion, para tentar dominar Westeros. Ela possui, além do seu dragãozinho, um rastreador que mede o nível de energia de qualquer ser vivo. Todos os seres com o nível menor ou igual a 8000, ela considera como se fosse um inseto. Quando passa deste valor, que foi o caso do Drogon, ela se espanta e grita “Mais de 8000”. Baseado nisso, utilize a mesma tecnologia e analise o nível de energia dos seres vivos.

### Entrada

A entrada é composta por vários casos de teste. A primeira linha contém um número inteiro C relativo ao número de casos de teste. Em seguida, haverá C linhas, com um número inteiro N (100 <= N <= 100000) relativo ao nível de energia de um ser vivo.

### Saída

Para cada valor lido, imprima o texto correspondente.

Exemplo de Entrada - Exemplo de Saída
8001 - Mais de 8000!
100 - Inseto!
200 - Inseto!

## 2

Um número natural é um inteiro não-negativo (0, 1, 2, 3, 4, 5,...). A sua tarefa neste problema é calcular a soma dos números naturais que estão presentes em um determinado intervalo [A, B] inclusive.

Por exemplo, a soma dos números naturais no intervalo [2, 5] é 14 = (2+3+4+5).

### Entrada

Cada caso de teste contém dois inteiros A e B (1 ≤ A ≤ B ≤ 109), representando o limite inferior e o superior respectivamente.

### Saída

Para cada caso de teste, a saída consiste de uma linha contendo a soma dos números naturais do intervalo.

Exemplo 1

Entrada - Saída
1 - 15
5

Exemplo 2

Entrada - Saída
1 - 500500
1000

## 3

Papaleguas é um corredor exemplar, sua especialidade é a prova dos 100 metros rasos. Diariamente, ele treina para realizar as provas no menor tempo possível e se tornar recordista mundial na categoria. Pode se perceber que, dependendo da quantidade de tentativas, o seu desempenho melhora ou piora. Diante disso, ele te desafia para calcular a tentativa mais rápida de cada treino diário.

### Entrada

A entrada é composta por vários casos de teste. A primeira linha de cada caso de teste contém um número inteiro T (2 <= T <= 99) relativo ao número de tentativas de um dia. As T linhas seguintes contêm um número real Ti (9 <= Ti <= 11) relativo ao tempo, em segundos, da i-ésima tentativa do treino. A entrada termina com fim de arquivo.

### Saída

Para cada caso de teste de entrada do seu programa, você deve imprimir um número real contendo o tempo da tentativa mais rápida de cada treino.

Exemplo de Entrada Exemplo de Saída
2
9.81
9.71
3
9.82
9.72
9.92

9.71
9.72

## 4

O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}, desenvolva um programa que retorne como resultado apenas os números pares dessa array, conforme exemplo abaixo.

### Entrada

2, 3, 5, 7, 11, 13, 18, 34

### Saída

2
18
34

## 5

Você recebe um inteiro n, o número de equipes em um torneio que tem regras estranhas:

- Se o número atual de equipes for par , cada equipe será emparelhada com outra equipe. Um total de n / 2 partidas são jogadas e n / 2 as equipes avançam para a próxima rodada.

- Se o número atual de equipes for ímpar , uma equipe avança aleatoriamente no torneio e o restante é emparelhado. Um total de (n - 1) / 2 partidas são jogadas e (n - 1) / 2 + 1as equipes avançam para a próxima rodada.

Retorna o número de partidas jogadas no torneio até que um vencedor seja decidido.

### Exemplo 1

Entrada Saída
7 6

### Explicação:

- 1Round: Times= 7, Partidas = 3 e 4 times avançam.

- 2Round: Times = 4, Partidas = 2, e 2 times avançam.

- 3Round: Times = 2, Partidas = 1, e um time é campeão.

Total número de partidas = 3 + 2 + 1 = 6.

### Exemplo 2

Entrada Saída
14 13

### Explicação

- 1Round: Times = 14, Partidas = 7, e 7 ttimes avançam.

- 2Round: Times = 7, Partidas = 3, e 4 times avançam.

- 3Round: Times = 4, Partidas = 2, e 2 times avançam.

- 4Round: Times = 2, Partidas= 1, e 1 é campeão.

Total número de partidas = 7 + 3 + 2 + 1 = 13.
