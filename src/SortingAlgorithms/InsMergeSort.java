package SortingAlgorithms;

public class InsMergeSort extends MergeSort{

    @Override
    public void sort(int[] a, int p, int r) throws InterruptedException{
        int cutoffNum = 10;
        if (r <= p + cutoffNum - 1){
            InsertionSort.sort(a, p, r);
            return;
        }
        int q = p + (r - p) / 2;
        sort (a, p, q);
        sort (a, q+1, r);
        merge(a, p, q, r);
    }

    @Override
    public String name(){
        return "Insertion variant of Merge Sort";
    }
}
