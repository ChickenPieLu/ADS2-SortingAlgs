package SortingAlgorithms;

public class BotMergeSort extends MergeSort{
    @Override
    public void sort(int[] a, int p, int r) throws InterruptedException{
        int n = r - p + 1; 
        for (int sz = 1; sz < n; sz = sz + sz) {
            for (int i = p; i < r - sz + 1; i += sz + sz) {  
                merge(a, i, i + sz - 1, Math.min(i + sz + sz - 1, r));
            }
        }
    }

    @Override
    public String name() {
        return "Bottom-upMergeSort";
    }
}
