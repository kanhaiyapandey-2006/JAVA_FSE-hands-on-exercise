package OOPS;

public class Interface {
    public static void main(String[] args){
        ChessPlayer queen = new Queen();
        ChessPlayer rook = new Rook();
        ChessPlayer king = new King();

        queen.moves();
        rook.moves();
        king.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("moves in all directions");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("moves in straight lines");
    }
}
 class King implements ChessPlayer{
    public void moves(){
        System.out.println("moves one step in any direction");
    }
}