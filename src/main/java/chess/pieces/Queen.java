package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

    public Queen(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //verificando possíveis movimentos acima
        p.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() -1);
        }

        if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //verificando possíveis movimentos a esquerda
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() -1);
        }

        if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //verificando possíveis movimentos a direita
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }

        if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //verificando possíveis movimentos abaixo
        p.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }

        if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // verificando possíveis movimentos diagonal esquerda
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() - 1);
        }

        if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //verificando possíveis movimentos a diagonal direita
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }

        if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //verificando possíveis movimentos diagonal direita abaixo
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        }

        if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // verificando possíveis movimentos diagonal esquerda
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() - 1);
        }

        if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
