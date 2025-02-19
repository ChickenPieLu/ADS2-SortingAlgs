public class SelectionSort {
    
    public static void sort(int a[]){
        int len = a.length;
        for (int i=0; i<=len-2; i++){
            int minIndex = i;
            for (int j = i+1; j<=len-1; j++){
                if (a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            int min = a[minIndex];
            a[minIndex] = a[i];
            a[i] = min;
        }
    }
}
