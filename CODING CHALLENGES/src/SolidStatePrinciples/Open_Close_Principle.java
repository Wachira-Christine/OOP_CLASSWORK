package SolidStatePrinciples;

// ❌ Without Open/Closed Principle
static class ZooWithoutOCP {
    public void hearAnimal(String animalType) {
        if (animalType.equals("dog")) {
            System.out.println("Dog says: Woof!");
        } else if (animalType.equals("cat")) {
            System.out.println("Cat says: Meow!");
        } else if (animalType.equals("cow")) {
            System.out.println("Cow says: Moo!");
        } else {
            System.out.println("Unknown animal");
        }
    }
}

// ✅ With Open/Closed Principle
interface Animal {
    void makeSound();
}

static class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

static class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

static class Cow implements Animal {
    public void makeSound() {
        System.out.println("Cow says: Moo!");
    }
}

static class ZooWithOCP {
    public void hearAnimal(Animal animal) {
        animal.makeSound();
    }
}


public static void main(String[] args) {

    // Using ZooWithoutOCP
    ZooWithoutOCP zoo1 = new ZooWithoutOCP();
    zoo1.hearAnimal("dog");
    zoo1.hearAnimal("cat");
    zoo1.hearAnimal("cow");

    // Using ZooWithOCP
    ZooWithOCP zoo2 = new ZooWithOCP();
    zoo2.hearAnimal(new Dog());
    zoo2.hearAnimal(new Cat());
    zoo2.hearAnimal(new Cow());
}