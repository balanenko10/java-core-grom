package lesson8;

public class Demo {
    public static void main(String[] args) {
        Adder adder = new Adder();

        adder.add(20,5);

        int [] array  = {-10, 0, 110, 555, 1000, -45, 0, 60, 10};
        adder.check(array);

    }
}
