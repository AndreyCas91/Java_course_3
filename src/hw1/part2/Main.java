package hw1.part2;


public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        appleBox1.setFruit(apple, 2);
        appleBox1.getBoxFruit();

        appleBox1.setFruit(apple, 10);
        appleBox1.getBoxFruit();

        orangeBox.setFruit(orange, 11);
        orangeBox.getBoxFruit();

        appleBox2.setFruit(apple, 12);

        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox));

        appleBox1.boxFill(appleBox2);

        appleBox2.getBoxFruit();

        appleBox2.boxFill(orangeBox);
    }
}
