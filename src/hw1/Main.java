package hw1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c", "d", "e"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arrayReplacement(arr, 1, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        ArrayList list = arrayTransformation(arr);
        System.out.println(list.get(0));

    }

    static <T> ArrayList<T> arrayTransformation(T[] arr){
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    };

    static <T> void arrayReplacement(T[] arr, int a, int b){
        if(a > arr.length || b > arr.length){
            System.out.println("Ошибка. Число больше массива");
        }
        a--;
        b--;
        T o = arr[a];
        arr[a] = arr[b];
        arr[b] = o;
    }
}
