public class Main {
    public static void main(String[] args) {

        NodeAbstract number_1 = new Value(5);
        NodeAbstract number_2 = new Value(6);
        NodeAbstract number_3 = new Value(4);

        Operation multiplication = new Multiplication();

        multiplication.setLeft(number_2);
        multiplication.setRight(number_1);

        Operation subtraction = new Subtraction();
        subtraction.setLeft(number_3);
        subtraction.setRight(multiplication);

        System.out.println(subtraction.evaluate());

    }
}
