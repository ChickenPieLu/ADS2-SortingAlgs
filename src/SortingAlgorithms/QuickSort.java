package SortingAlgorithms;

public class QuickSort extends Algorithm{

    public void sort(int a[]) throws InterruptedException{
        sort(a, 0, a.length-1);
    }

    protected int partition(int a[], int p, int r){
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++){
            if (a[j] <= x){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;
        return i + 1;
       }

    public void sort(int a[], int p, int r) throws InterruptedException{
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        if (r <= p) return;
        int q = partition(a, p, r);
        sort(a, p, q-1);
        sort(a, q+1, r);
    }

    public String name(){
        return "QuickSort";
    }
}
