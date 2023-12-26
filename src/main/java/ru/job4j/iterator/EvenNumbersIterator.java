package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator<Integer> {

    private int[] data;
    private int ind;

    /*private int pos = -1;
    private int nextPos = -1;*/

    public EvenNumbersIterator(int[] data) {
        this.data = data;
    }
/*iterator.next() - возвращают только четные числа. В этом примере - это 4 и 2.*/

    @Override
    public boolean hasNext() {
        boolean res = false;
        while (ind < data.length) {
            if (data[ind] % 2 == 0) {
                res = true;
                break;
            } else {
                ind++;
            }
        }
        return res;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        /*pos = nextPos;*/
        return data[ind++];
    }

    /*public Integer findEven() {
        for (int i = pos + 1; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                nextPos = i;
                break;
            }
        }
        return nextPos;
    }*/
}
