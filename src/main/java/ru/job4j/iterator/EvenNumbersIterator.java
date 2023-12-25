package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator<Integer> {

    private int[] data;
    private int ind;

    public EvenNumbersIterator(int[] data) {
        this.data = data;
    }
/*iterator.next() - возвращают только четные числа. В этом примере - это 4 и 2.*/
    @Override
    public boolean hasNext() {
        return ind < data.length;/* && data[ind]%2 == 0;*/
    }

    @Override
    public Integer next() {
        int res;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if  (data[ind]%2 == 0) {
            res = data[ind];
        }
        ind++;
        return res;
    }
}
