package SortingAlgorithms;

public class InsQuickSort extends QuickSort{

    private int k = 10;//threshold value

    private void kSort(int a[], int p, int r)throws InterruptedException{
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        if (r - p <= k) return;
        int q = partition(a, p, r);
        kSort(a, p, q-1);
        kSort(a, q+1, r);
       }

    @Override
    public void sort(int a[], int p, int r) throws InterruptedException{
        kSort(a, p, r);
        InsertionSort.sort(a, p, r);
    }

    @Override
    public String name(){
        return "InsQuickSort";
    }
}
