package ru.job4j.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CyclicIterator<T> implements Iterator<T> {

    private List<T> data;
    private Iterator itr;

    public CyclicIterator(List<T> data) {
        this.data = data;
        itr = data.iterator();
    }


    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return data.get(1);
            /*    throw new NoSuchElementException();*/
        } else {
            return data.iterator().next();
        }
    }
}
