package SortingAlgorithms;

public class Median3QuickSort extends QuickSort{

    @Override
    public void sort(int a[], int p, int r) throws InterruptedException{
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        if (r <= p) return;

        int mid = (p + r) / 2;
        if (a[mid] < a[p]) swap(a, p, mid);
        if (a[r] < a[p]) swap(a, p, r);
        if (a[r] < a[mid]) swap(a, mid, r);

        swap(a, mid, r - 1);
        int q = partition(a, p, r - 1);

        sort(a, p, q - 1);
        sort(a, q + 1, r);
    }

    @Override
    public String name(){
        return "Median3QuickSort";
    }
}
