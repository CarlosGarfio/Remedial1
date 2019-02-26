package remedialunidad1;

import java.lang.reflect.Array;

public class Operaciones<T extends Comparable<T>> {

    T[] array;
    double suma=0d;
    T value;

    Operaciones(T[] a,T value) {
        array = a;
        this.value= value;
    }

    Operaciones(Class clazz, int size) {
        array = (T[]) Array.newInstance(clazz, size);
    }

    void print() {
        System.out.println("Normal:");
        printLR(array, 0);
        System.out.println("Alrevez:");
        printRL(array, array.length - 1);
        System.out.println("Suma de los valores: "+suma);
        System.out.println("El valor 3 se encuentra en la posicion: "+(search(array,value, 0)+1));
    }

    private void printRL(T[] a, int i) {
        if (i != -1) {
            System.out.println(a[i]);
            printRL(a, i - 1);
        }
    }

    private void printLR(T[] a, int i) {
        if (i != a.length) {
            suma=suma+(Double)a[i];
            System.out.println(a[i]);
            printLR(a, i + 1);
        }
    }
    
    private int search(T[]a,T value,int i){
        if(a[i].compareTo(value)==0){
            return i;
        }
        return search(a, value, ++i);
    }
}
