package viren.designPattern.strategy;

public class SelectionSortStrategy extends AbstractSortingStrategy {

    @Override
    public void sort() {
        super.sort(this.getClass().getName().toString());

    }

}
