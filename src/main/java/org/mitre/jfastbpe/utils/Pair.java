package org.mitre.jfastbpe.utils;

import java.util.Map;

public class Pair<T, U> {
    final public T first;
    final public U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair<>(first, second);
    }

    public static <T, U> Pair<T, U> of(final Map.Entry<T, U> entry) {
        return Pair.of(entry.getKey(), entry.getValue());
    }

    @Override
    public String toString() {
        return first + ", " + second;
    }

    @Override
    public int hashCode() {
        return second.hashCode() + 0x9e3779b9 + (first.hashCode() << 6) + (first.hashCode() >> 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        try {
            Pair other = (Pair) obj;
            return first.equals(other.first) && second.equals(other.second);
        } catch (ClassCastException e) {
            return false;
        }
    }
}
