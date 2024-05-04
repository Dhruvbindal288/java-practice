public class inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.color= "blue";
        shark.fins=2;
    }

}
// BASE CLASS
class Animal {
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}
// DERIEVED CLASS

class Fish extends animal {
    int fins;

}
