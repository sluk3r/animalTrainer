package sluker.ooad;

import sluker.ooad.animal.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    List<Animal> animals = new ArrayList<>();
    
    public Order(Animal... animal) {
        animals.addAll(Arrays.asList(animal));
    }
    
    public List<Animal> getAnimals() {
        return animals;
    }
    
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
