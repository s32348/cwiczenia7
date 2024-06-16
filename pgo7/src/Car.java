public class Car implements Comparable<Car>{
    String model;
    int year;

    public Car(String model, int year){
        this.model=model;
        this.year=year;
        }
        @Override
    public int compareTo(Car o){
        return model.compareTo(o.model);
        }
}
