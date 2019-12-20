package sluker.ooad;

import sluker.ooad.animal.Cat;
import sluker.ooad.animal.Dog;
import sluker.ooad.animal.Mouse;

public class App {
    
    public static void main( String[] args )
    {
        AnimalTrainCompany animalTrainCompany = new AnimalTrainCompany();
        
        Order order = new Order(new Dog(), new Mouse(), new Cat());
        animalTrainCompany.acceptTrainOrder(order);
        
        animalTrainCompany.train();
    }
}
