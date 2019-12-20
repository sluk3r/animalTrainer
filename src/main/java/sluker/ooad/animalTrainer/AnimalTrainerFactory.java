package sluker.ooad.animalTrainer;

import sluker.ooad.animal.Animal;
import sluker.ooad.animal.Dog;

import java.util.HashMap;
import java.util.Map;

public class AnimalTrainerFactory {
    Map<Class<? extends Animal>, AnimalTrainer> animalTrainerRegistery = new HashMap();
    
    public void registerAnimalTrainer(Animal animal, AnimalTrainer animalTrainer) {
        animalTrainerRegistery.put(animal.getClass(), animalTrainer);
    }
    
    public AnimalTrainer getTrainer(Animal animal) {
        Class animalClass = animal.getClass();
        return animalTrainerRegistery.get(animalClass);
    }
    
}
