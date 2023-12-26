package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class NonNullIterator implements Iterator<Integer> {

    private Integer[] data;
    private int pos = -1;
    private int nextPos = -1;

    public NonNullIterator(Integer[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return pos != findNotNull();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        pos = nextPos;
        return data[pos];
    }

    public Integer findNotNull() {
        for (int i = pos + 1; i < data.length; i++) {
            if (data[i] != null) {
                nextPos = i;
                break;
            }
        }
        return nextPos;
    }

}