package sluker.ooad.animalTrainer;

import sluker.ooad.animal.Animal;

public abstract class AnimalTrainer implements Trainer {
    Animal animal;
    
    public Animal getAnimal() {
        return animal;
    }
    
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
