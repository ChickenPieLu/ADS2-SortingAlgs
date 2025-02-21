package SortingAlgorithms;
public class SelectionSort extends Algorithm{
    
    public void sort(int a[]) throws InterruptedException{
        int len = a.length;
        for (int i=0; i<=len-2; i++){
            int minIndex = i;
            for (int j = i+1; j<=len-1; j++){
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                if (a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            int min = a[minIndex];
            a[minIndex] = a[i];
            a[i] = min;
        }
    }

    public String name(){
        return "SelectionSort";
    }
}
