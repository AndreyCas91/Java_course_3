package hw1.part2;


import java.util.ArrayList;

public class Box<T> {
    T fruit;
    private ArrayList<String> boxFruit = new ArrayList<>();


    public Box() {
    }

    public void getBoxFruit() {
        System.out.println("В коробке " + boxFruit.size() + " " + boxFruit.get(0));
    }


    public void setFruit(T fruit, int quantity) {

        if(fruit instanceof Apple){
            for (int i = 0; i < quantity; i++) {
                boxFruit.add("Apple");
            }
        }
        if(fruit instanceof Orange){
            for (int i = 0; i < quantity; i++) {
                boxFruit.add("Orange");
            }
        }
    }

    public float getWeight(){
        if(boxFruit.get(0).equals("Apple")){
            return new Apple().getWt() * boxFruit.size();
        }
        if(boxFruit.get(0).equals("Orange")){
            return new Orange().getWt() * boxFruit.size();
        }
        return 0.0f;
    }

    public boolean compare(Box box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.000001;
    }

    public void boxFill(Box box){
        if(this.boxFruit.get(0).equals(box.boxFruit.get(0))) {
            for (int i = 0; i < this.boxFruit.size(); i++) {
                this.boxFruit.remove(0);
                box.boxFruit.add(box.boxFruit.get(0));
            }
        } else {
            System.out.println("Нельзя хранить в обной коробке разные фрукты");
        }

    }
}
