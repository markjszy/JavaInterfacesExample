public class RunDemo {
    public static void main(String[] args) {
        var myZoo = new Zoo();
        myZoo.insertAnimal(new Dog());
        myZoo.insertAnimal(new Cat());

        myZoo.makeCacophony();
        // the following will not work - do you know why?
        // Animal anotherDog = new Dog();
        // anotherDog.wagTail();
    }
}
