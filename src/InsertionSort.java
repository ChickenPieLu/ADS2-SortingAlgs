public class InsertionSort {

    public static void sort(int a[]){
        int len = a.length;
        for (int i=1; i<len; i++){
            int x = a[i];
            int j = i-1;
            while (j>=0 && a[j]>x) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
    }
}