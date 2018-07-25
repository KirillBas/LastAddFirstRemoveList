package ru.basharin;

public class MyArrayList {
    private int defaultCapacity = 16;
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[defaultCapacity];
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            this.data = new Object[capacity];
        } else {
            this.data = new Object[defaultCapacity];
        }
    }

    public boolean add(Object o) {
        if (size == data.length) {
            remove();
            data[data.length - 1] = o;
            return true;
        }
        data[size++] = o;

        return true;
    }

    public int getIndex(int index) {
        return 1;
    }

    public Object getValue(Object o) {
        return o;
    }

    public boolean delete(Object o) {
        return true;
    }

    public boolean set(Object oldObj, Object newObj) {
        return true;
    }

    public int getSize() {
        return size;
    }

    private void remove() {
        int numMoved = size - 1;
        System.arraycopy(data, 1, data, 0, numMoved);
    }
}
