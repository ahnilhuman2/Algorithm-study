package com.example.algorithmstudy.자료구조;

public class ArrayList<T> {
    private Object[] data;
    private int size;

    public ArrayList() {
        data = new Object[10];
        size = 0;
    }

    public void add(T element) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // 삭제된 요소 이후의 요소들을 한 칸씩 앞으로 이동
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;  // 마지막 요소를 null로 초기화
    }

    // 요소 개수 반환
    public int size() {
        return size;
    }
}
