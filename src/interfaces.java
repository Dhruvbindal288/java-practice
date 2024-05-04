public class interfaces {
    public static void main(String[] args) {
Queen q=new Queen();
q.moves();

    }
}
interface Chessplayer{
    void moves();

}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("Left, right,up,down.diagonally");
    }
}