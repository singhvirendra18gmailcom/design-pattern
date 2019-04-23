package viren.designPattern.strategy;

public class Sorter {

    private SortingStrategy sortingStrategy;

    public Sorter(SortingStrategy sortingStrategy) {
        super();
        this.sortingStrategy = sortingStrategy;
    }

    public void sort() {
        sortingStrategy.sort();
    }

}
