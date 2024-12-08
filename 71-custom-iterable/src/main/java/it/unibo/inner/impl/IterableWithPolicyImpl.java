package it.unibo.inner.impl;

import java.util.Iterator;

import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class IterableWithPolicyImpl<T> implements IterableWithPolicy<T> {

    private final T[] elements;
    private Predicate<T> filter;

    public IterableWithPolicyImpl(final T[] elements) {
        this(elements, e -> true);
    }

    public IterableWithPolicyImpl(final T[] elements, Predicate<T> filter) {
        this.elements = elements;
        this.filter = filter;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorElements();
    }

    private class IteratorElements implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            while (index < elements.length && !filter.test(elements[index])) {
                index++;
            }
            return index < elements.length;
        }

        @Override
        public T next() {
            return (T) elements[index++];
        }
    }

    @Override
    public void setIterationPolicy(Predicate<T> filter) {
        if (filter == null) {
            throw new IllegalArgumentException("The filter cannot be null");
        }

        this.filter = filter;
    }
}
