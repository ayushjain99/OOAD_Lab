enum State{
    X,O,EMPTY;
}

public class TicTacToe{
    private int[][] arr = new int[3][3];

    TicTacToe(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = State.EMPTY;
            }
        }
    }
}
