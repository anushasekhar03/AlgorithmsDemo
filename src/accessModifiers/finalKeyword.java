package accessModifiers;

public class finalKeyword {
    public static void main(String[] args) {
      Dog d=new Dog();
      d.eat();
      d.sleep();


    }
}
class Animal{
    final String name="riya";
    final public void eat(){
        System.out.println("riya eats");
    }
}
class Dog extends Animal{
//    public void eat(){
//        System.out.println("ritaaaa eats");
//    }
    public void sleep(){
        System.out.println("riya sleeps");
    }
}