package viren.designPattern.strategy;

public class Client {

    public static void main(String[] args) {
        Sorter sorter = new Sorter(new QuickSortStrategy());
        sorter.sort();
    }
}
