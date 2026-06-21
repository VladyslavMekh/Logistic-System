package container;

import model.Product;

public class Box<T> {
    T content;

    public Box() {
        content = null;
    }

    public Box(T content) {
        this.content = content;
    }

    public void put(T item) {
        if (content != null) throw new IllegalArgumentException("Container is not empty.");
        content = item;
    }

    public T get() {
        if (content == null) throw new IllegalArgumentException("Container is empty.");
        return content;
    }

    public T getAndClear() {
        T item = get();
        clear();
        return item;
    }

    public boolean isEmpty() {
        return content == null;
    }

    public void clear() {
        content = null;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Box empty? " + isEmpty();
        return "Box{" + content.toString() + "}";
    }
}
