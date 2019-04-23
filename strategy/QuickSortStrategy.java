package viren.designPattern.strategy;

public class QuickSortStrategy extends AbstractSortingStrategy {

    @Override
    public void sort() {
        super.sort(this.getClass().getName().toString());

    }

}
