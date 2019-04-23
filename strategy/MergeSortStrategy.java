package viren.designPattern.strategy;

public class MergeSortStrategy extends AbstractSortingStrategy {

    @Override
    public void sort() {
        super.sort(this.getClass().getName().toString());

    }

}
