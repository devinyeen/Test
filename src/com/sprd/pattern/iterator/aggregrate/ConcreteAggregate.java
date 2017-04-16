package com.sprd.pattern.iterator.aggregrate;

import com.sprd.pattern.iterator.ConcreteIterator;
import com.sprd.pattern.iterator.Iterator;

public class ConcreteAggregate extends Aggregate {

    private Object[] elementData;
    private int size;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 8;

    public ConcreteAggregate() {
        elementData = new Object[8];
        size = 0;
        capacity = DEFAULT_CAPACITY;
    }

    // Only ConcreteAggregateList
    public Object get(int index) {
        checkIndex(index);

        return (Object) elementData[index];
    }

    @Override
    public void add(Object element) {
        if (size == capacity) {
            Object[] tempArray = new Object[capacity];
            for (int i = 0; i < size; i++) {
                tempArray[i] = elementData[i];
            }
            elementData = new Object[capacity * 2];
            for (int i = 0; i < size; i++) {
                elementData[i] = tempArray[i];
            }
            elementData[capacity] = element;
            capacity = capacity * 2;
        }
        elementData[size++] = element;
    }

    @Override
    public void remove(Object element) {
        if (element == null) {
            return;
        }
        int findIndex = -1;
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
                findIndex = i;
                break;
            }
        }

        for (int i = findIndex; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[--size] = null;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    private void checkIndex(int index) {
        if (index >= capacity) {
            throw new IndexOutOfBoundsException();
        }
    }

}
