package SortingAlgorithms;

public class MergeSort extends Algorithm{

    public void merge(int a[], int p, int q, int r) throws InterruptedException{
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i=0; i<n1; i++)
        L[i] = a[p + i];
        for (int j=0; j<n2; j++)
        R[j] = a[q + 1+ j];
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k=p; k<= r; k++){
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException();
            }
            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }
            else{
                a[k] = R[j];
                j++;
            }
        }
    }

    public void sort(int[] a) throws InterruptedException{
        sort(a, 0, a.length - 1);
    }

    public void sort(int[] a, int p, int r) throws InterruptedException{
        if (p < r){
            int q = (p+r)/2;
            sort(a, p, q);
            sort(a , q+1, r);
            merge(a, p, q, r);
        }
           
    }

    public String name(){
        return "MergeSort";
    }
}
