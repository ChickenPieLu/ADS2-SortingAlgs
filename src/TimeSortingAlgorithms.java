import SortingAlgorithms.*;

public class TimeSortingAlgorithms {
    public static void time(Algorithm[] algs, int[] a){
        for( Algorithm alg: algs){
            int[] temp = a.clone();
            System.out.print("\n"+alg.name()+": ");
            long time0 = System.currentTimeMillis();


            Thread sortingThread = new Thread(() -> {
                try {
                    alg.sort(temp);
                } catch (InterruptedException e) {
                }
            });
            sortingThread.start();

            try {
                sortingThread.join(5000); // Wait for 5 seconds
                if (sortingThread.isAlive()) {
                    sortingThread.interrupt();
                    System.out.print("(ERROR: Sorting took too long) ");
                    System.out.print("  5000 milliseconds\n");
                } else {
                    long time1 = System.currentTimeMillis();
                    if (!TestSortingAlgorithms.isSorted(temp)) {
                        System.out.println("(ERROR: The array is not sorted) ");
                    }
                    System.out.print((time1 - time0) + " milliseconds\n");
                }
            } catch (InterruptedException e) {
                System.out.print("(ERROR: Sorting was interrupted) ");
                System.out.print("  5000 milliseconds\n");
            }
        }
    }
}
