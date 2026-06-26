import java.util.*;
abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Notice: First Class Compartment. Reserved passengers only.";
    }
}
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Notice: Ladies Compartment. Only for female passengers.";
    }
}
class General extends Compartment {
    @Override
    public String notice() {
        return "Notice: General Compartment. Valid ticket required.";
    }
}
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Notice: Luggage Compartment. For authorized cargo only.";
    }
}
public class TestCompartment { 
    public static void main(String[] args) {
        Compartment[] train = new Compartment[10];
        Random rand = new Random();
        for (int i = 0; i < train.length; i++) {
            int randomType = rand.nextInt(4) + 1; 

            switch (randomType) {
                case 1:
                    train[i] = new FirstClass();
                    break;
                case 2:
                    train[i] = new Ladies();
                    break;
                case 3:
                    train[i] = new General();
                    break;
                case 4:
                    train[i] = new Luggage();
                    break;
            }
        }
        System.out.println("--- Train Compartment Notices ---");
        for (int i = 0; i < train.length; i++) {
            System.out.print("Coach " + (i + 1) + " | ");
            System.out.println(train[i].notice());
        }
    }
}
