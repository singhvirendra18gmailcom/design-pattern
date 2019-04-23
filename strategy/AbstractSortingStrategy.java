package viren.designPattern.strategy;

public abstract class AbstractSortingStrategy implements SortingStrategy {

    public void sort(String strategyType) {
        System.out.println("Processing with " + strategyType);
    }
}
