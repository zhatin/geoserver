package org.geoserver.catalog.rest;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class AvailableResources extends AbstractCollection<String> {
    final Collection<String> delegate;
    final String name; 
    
    public AvailableResources(Collection<String> delegate, String name) {
        super();
        this.delegate = Collections.unmodifiableCollection(delegate);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<String> iterator() {
        return delegate.iterator();
    }
    
    @Override
    public int size() {
        return delegate.size();
    }

    public void forEach(Consumer<? super String> action) {
        delegate.forEach(action);
    }

    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    public boolean contains(Object o) {
        return delegate.contains(o);
    }

    public Object[] toArray() {
        return delegate.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return delegate.toArray(a);
    }

    public boolean containsAll(Collection<?> c) {
        return delegate.containsAll(c);
    }

    public void clear() {
        delegate.clear();
    }

    public boolean equals(Object o) {
        return delegate.equals(o);
    }

    public int hashCode() {
        return delegate.hashCode();
    }

    public Spliterator<String> spliterator() {
        return delegate.spliterator();
    }

    public Stream<String> stream() {
        return delegate.stream();
    }

    public Stream<String> parallelStream() {
        return delegate.parallelStream();
    }
    
    
}
