import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Car("GOLF", 1999));
        cars.add(new Car("ASTRA", 2005));
        cars.add(new Car("CORSA", 2000));
        cars.add(new Car("VECTRA", 2002));
        cars.add(new Car("INSIGNIA", 2010));
        cars.add(new Car("IBIZA", 2013));
        cars.add(new Car("206", 2006));
        cars.add(new Car("C4", 2007));
        cars.add(new Car("LEON", 2004));
        cars.add(new Car("FOCUS", 2009));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.model);
        }
    }
}