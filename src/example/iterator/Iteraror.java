package example.iterator;

public interface Iteraror<T> {
    public boolean hasNext();

    public T next();
    public T current();
}
