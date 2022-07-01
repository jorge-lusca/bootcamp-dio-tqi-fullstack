# JOGO DA MEMÓRIA

## Criação das cartas

- usei como imagens as tecnologias que ando estudando atualmente

- Usei o backface-visibility para esconder a imagem de trás, bem como o transform-style em preserve-3d para que tratasse a frente e as costas da carta como um objeto só.

- No caso optei por criar o tabuleiro com Javascript e não preenchendo na mão as 20 cartas.

- usei o flatMap para retornar as 20 cartas.

## Embaralhando as cartas

- Usei como lógica para embaralhar as cartas começando a partir da última, apontando para última carta do array e a trocando de lugar com outra aleatória, em seguida apontando para a penúltima carta do array e a trocando de lugar com outra carta aleatória e sendo assim até chegar na primeira carta do array.

## Montando o tabuleiro

- Para criar uma carta visual para cada modelo utilizei um loop dentro do array de cartas.

![gif do jogo da memória](https://github.com/jorge-lusca/bootcamp-dio-tqi-fullstack/blob/main/JavaScript/PROJETO-jogo-da-memoria/assets/gif_jogo.gif)
