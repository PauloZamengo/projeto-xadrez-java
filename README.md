# projeto-xadrez-java
Projeto de um jogo de xadrez em java com intuito de fixar conceitos de orientação a objeto

###Packages
O projeto-xadrez-java está dividido em três packages:

    # application
    # boardgame
    # chess

#application
Package onde a aplicação é iniciada através da classe Program, também contém uma classe "UI" de configuração de cores e de como o tabuleiro é montado.

####Program
A classe Program é a principal classe da aplicação, onde a aplicação é iniciada e onde os jogadores farão as suas jogadas informando os possíveis movimentos de suas respectivas peças


####UI
Classe com a definição das cores utilizadas através do terminal.
Também é feita a montagem e apresentação do tabuleiro utilizado, através dos métodos ``printBoard``, ``printPiece``, ``printMach``.


#boardgame

Package responsável pela montagem do board (tabuleiro), peças e posições.

####Board
A classe Board é responsável por fazer os tratamentos da montagem do tabuleiro, validar se existem as peças, retirar as peças, validar se as posições existem no tabuleiro, mover as peças do lugar 

####Piece
Classe abstrata onde é representada uma peça. Essa classe verifica se existem movimentos possíveis para a peça.

####Position
Classe abstrata onde é representada uma posição. Essa classe recebe dois atributos, `row` e `column`, ou seja, linha e coluna que serão representadas por uma matriz.


#chess

Package responsável pela partida de xadrez. Esse package recebe classes que serão especificamente da partida de xadrez.

###pieces

Dentro dessa package estão sendo representadas as peças do xadrez, e a lógica dos possíveis movimentos de cada peça.

    Bishop - Bispo
    King - Rei
    Pawn - Peão
    Queen - Rainha
    Rook - Torre

###ChessMatch
Uma das principais classes, é responsável pelo posicionamento inicial das peças do jogo de xadrez.
Toda lógica da partida de xadrez também é feita nessa classe, jogadas como check, checkmate, jogadas especiais en passant, promoção, a validação dos movimentos das peças de cada jogada, validação se a peça escolhida foi a do jogador do turno atual, controle de cada jogada(turno).



