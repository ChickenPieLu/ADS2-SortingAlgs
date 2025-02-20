package SortingAlgorithms;

public class ShellSort extends Algorithm{

    public void sort(int[] a){

        int n = a.length;
        int h = 1;
        
        while (h < n/3) h = 3*h + 1;

        while (h >= 1) {
            for (int i = h; i < n; i++){
                for (int j = i; j >= h && a[j] < a[j-h]; j -= h){
                    //swap
                    int temp = a[j];
                    a[j] = a[j-h];
                    a[j-h] = temp;
                }
            }
            h /= 3;
        }
    }

    public String name(){
        return "ShellSort";
    }
}
