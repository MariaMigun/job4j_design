package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator<Integer> {

    private int[] data;
    private int ind;
    private int pos = -1;
    private int nextPos = -1;

    public EvenNumbersIterator(int[] data) {
        this.data = data;
    }
/*iterator.next() - возвращают только четные числа. В этом примере - это 4 и 2.*/

    @Override
    public boolean hasNext() {
        return pos != findEven();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        pos = nextPos;
        return data[pos];
    }

    public Integer findEven() {
        for (int i = pos + 1; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                nextPos = i;
                break;
            }
        }
        return nextPos;
    }
}
