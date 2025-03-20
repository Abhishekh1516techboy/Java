// create BasicAnimal Interface...
interface BasicAnimal {
    void eat();

    void sleep();
}

// create monkey Class...
class Monkey {
    public void jump() {
        System.out.println("Jumping...");
    }

    public void bite() {
        System.out.println("Biting...");
    }
}

// create Human class...
class Human extends Monkey implements BasicAnimal {
    public void speak() {
        System.out.println("Hello sir...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class cwh_ch60_Pset_Abstract_and_Interface_Q3_Q5 {
    public static void main(String[] args) {
        Human man = new Human();
        man.jump();
        man.bite();
        man.eat();
        man.sleep();
        System.out.println("=========================");
        // Demonstrate Polymorphism Q5...
        Monkey mon = new Human();
        mon.jump();
        mon.bite();
        System.out.println("=========================");
        BasicAnimal abhi = new Human();
        abhi.eat();
        abhi.sleep();
    }
}