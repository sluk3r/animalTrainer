package sluker.ooad.animalTrainer;

import org.junit.Before;
import org.junit.Test;
import sluker.ooad.animal.Animal;
import sluker.ooad.animal.Dog;

import static org.junit.Assert.*;

public class AnimalTrainerFactoryTest {
    AnimalTrainerFactory factory;
    @Before
    public void init() {
        factory = new AnimalTrainerFactory();
    
        Animal dog = new Dog();
        dog.setName("littleP");
        dog.setType("Poodle");
    
        AnimalTrainer dogTrainer = new DogTrainer();
        factory.registerAnimalTrainer(dog, dogTrainer);
    }
    
    @Test
    public void assert_registerAnimalTrainer_ok() {
        assertTrue(factory.animalTrainerRegistery.size() == 1);
    }
    
    @Test
    public void assert_getTrainer_by_animal_ok() {
        AnimalTrainer animalTrainer = factory.getTrainer(new Dog());
        assertNotNull(animalTrainer);
        assertTrue(animalTrainer instanceof DogTrainer);
    }
    
}