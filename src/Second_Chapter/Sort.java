package Second_Chapter;

/**
 * Created by Денис on 06.11.2016.
 */
import java.util.Random;

public class Sort {
    public static void main(String[] args){
        int[] a = new int[10];
        Generation(a);
        Max(a);
        Choose(a);
        Booble(a);
    }
    public static void Generation(int[] a){
        Random r = new Random();
        System.out.println("Генерация массива:");
        for (int i = 0; i < 10; i++) {
            a[i] = r.nextInt(100);
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
        //Бинарный поиск
        //int num = 0;
        boolean found = false;
        int mid = a.length/2;
        do {

            if (a[mid] == num){
            }
        }while(!found);
        System.out.println(a.length/2);
        return num;
    }
}

