package Second_Chapter;

import java.util.Random;
/**
 * Created by Денис on 06.11.2016.
 */

public class Sort {
    public static void main(String[] args){
        int[] a = new int[10];
        int num = 15;
        Generation(a);
        Max(a);
        Choose(a);
        Booble(a);
        int poz = Search(a, num);
        if (poz == 0){
            System.out.println("Искомое число не содержится в массиве");
        } else System.out.println("Позиция искомого элемента: " + poz);
    }
    public static void Generation(int[] a){
        Random r = new Random();
        System.out.println("Генерация массива:");
        for (int i = 0; i < 10; i++) {
            a[i] = r.nextInt(30);
            System.out.println(a[i]);
        }
    }
    public static void Max(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Максимальное число массива: " + max);
    }
    public static void Choose(int[] a){
        //Cортировка методом выбора по убыванию
        int elementNumber = 0;
        int element;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[elementNumber] < a[j]) {
                    elementNumber = j;
                }
            }
            element = a[i];
            a[i] = a[elementNumber];
            a[elementNumber] = element;
            elementNumber = i + 1;
        }
        System.out.println("Сортировка методом выбора по убыванию:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void Booble(int[] a){
        //Метод пузырька по возрастанию
        int element=0;
        for(int i= 0; i<a.length-1;i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j - 1] > a[j]) {
                    element = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = element;
                }
            }
        }
        System.out.println("Сортировка методом пузырька по возрастанию:");
        for(int i= 0; i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    public static int Search(int[] a, int num){
        //Поиск позиции элемента бинарным методом
        int last = a.length;
        int first = 1;
        while(first <= last) {
            int middle = (first+last) / 2;
            if (a[middle] == num) {
                return middle + 1;
            }
            else if (a[middle] < num) {
                first = middle+1;
            }
            else{
                last = middle-1;
            }
        }
        return 0;
    }
}

