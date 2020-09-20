import java.util.List;
import java.util.ArrayList;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void insertAnimal(Animal a) {
        animals.add(a);
    }

    public void makeCacophony() {
        for (var animal: animals) {
            animal.makeSound();
        }
    }
}