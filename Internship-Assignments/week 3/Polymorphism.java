//Problem Statement: Demonstrating Polymorphism in Java

class Bird {
    void sound() {
        System.out.println("Bird sings");
    }

    void sound(String type) {
        System.out.println("Bird sings in " + type + " style");
    }
}

class Sparrow extends Bird {
    @Override
    void sound() {
        System.out.println("Sparrow chirps");
    }
}

class Crow extends Bird {
    @Override
    void sound() {
        System.out.println("Crow caws");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Bird genericBird = new Bird();
        genericBird.sound();
        genericBird.sound("jazz");

        Bird myBird;

        myBird = new Sparrow();
        myBird.sound();

        myBird = new Crow();
        myBird.sound();
    }
}