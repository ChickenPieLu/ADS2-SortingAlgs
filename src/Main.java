import SortingAlgorithms.*;

public class Main {
    
    public static void main(String[] args) {
        Algorithm[] algs = {
            new InsertionSort(), 
            new SelectionSort(),
        };
        String[] fileDirs = {
            "data/bad.txt",
            "data/dutch.txt",
            "data/int20k.txt",
            "data/int10.txt",
            "data/int50.txt",
            "data/int100.txt",
            "data/int500k.txt",
            "data/int1000.txt",
            "data/intBig.txt",
        };
        for (String file: fileDirs){
            int[] a = ReadFile.read(file);
            String fileName = file.substring(5);
            System.out.println("\n-------------------");
            System.out.println("\nTime taken to sort " + fileName + ":");
            TimeSortingAlgorithms.time(algs, a);
        }
    }
}
