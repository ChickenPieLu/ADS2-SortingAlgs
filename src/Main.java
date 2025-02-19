public class Main {
    
    public static void main(String[] args) {
        int[] arr1 = {1,9,7,5,4,7,6,2};
        SelectionSort.sort(arr1);
        for (int e : arr1){
            System.out.print(e + " ");
        }
        System.out.println(TestSortingAlgorithms.isSorted(arr1));
    }
}
