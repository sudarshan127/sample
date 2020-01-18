public class Vehicle {
    public static void main(String[] args) {

        Truck t1 = new Truck();
        t1.Sedan();
        t1.SUV();
    }
}

interface SUV {
    void SUV();
}

interface Sedan {
    void Sedan();

}

class Truck implements SUV, Sedan {


    @Override
    public void SUV() {
        System.out.println("This is SUV method");
    }

    @Override
    public void Sedan() {
        System.out.println("This is Sedan method");
    }
}
