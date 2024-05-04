public class Abstraction {
    public static void main(String[] args) {
Tenth t1=new Tenth();
t1.idCard();
t1.study();
    }
}
abstract class Students{
void study(){
    System.out.println("Students needs to study");

}
abstract void idCard();
}
class Tenth extends Students{
    @Override
    void idCard() {
        System.out.println("Wear Your Id Cards");
    }
}