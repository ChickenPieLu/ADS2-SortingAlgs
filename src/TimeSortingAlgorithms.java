import SortingAlgorithms.*;

public class TimeSortingAlgorithms {
    public static void time(Algorithm[] algs, int[] a){
        for( Algorithm alg: algs){
            int[] temp = a.clone();
            System.out.print("\n"+alg.name()+": ");
            long time0 = System.currentTimeMillis();
            alg.sort(temp);
            long time1 = System.currentTimeMillis();
            if (!TestSortingAlgorithms.isSorted(temp)){
                System.out.println("(ERROR: The array is not sorted) ");
            }
            System.out.print((time1-time0) + " miliseconds\n");
        }
    }
}
