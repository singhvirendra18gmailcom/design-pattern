package viren.designPattern.strategy;

public class BubbleSortStrategy extends AbstractSortingStrategy {

    @Override
    public void sort() {
        super.sort(this.getClass().getName().toString());

    }

}
