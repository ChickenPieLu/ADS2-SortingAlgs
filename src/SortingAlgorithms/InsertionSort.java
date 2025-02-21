package SortingAlgorithms;

public class InsertionSort extends Algorithm{

    public void sort(int a[]) throws InterruptedException{
        int len = a.length;
        for (int i=1; i<len; i++){
            int x = a[i];
            int j = i-1;
            while (j>=0 && a[j]>x) {
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
    }

    public static void sort(int a[], int p, int r){
        for (int i = p + 1; i <= r; i++){
            for (int j = i; j > p && a[j] < a[j-1]; j--){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }
       

    public String name(){
        return "InsertionSort";
    }
}