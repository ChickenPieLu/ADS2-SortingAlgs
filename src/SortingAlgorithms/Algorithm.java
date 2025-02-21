package SortingAlgorithms;

public abstract class Algorithm {
    public abstract void sort(int a[]) throws InterruptedException;
    public abstract String name();
    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
} 
