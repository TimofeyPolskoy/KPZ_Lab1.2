package com.it.kpzlab12;

import java.io.Serializable;
import java.util.Objects;

public final class Vector2f implements Serializable, Comparable<Vector2f> {
    private final float x;
    private final float y;

    public Vector2f() {
        this.x = 0;
        this.y = 0;
    }

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2f(float angle) {
        this.x = (float)Math.cos(angle);
        this.y = (float)Math.sin(angle);
    }

    public Vector2f(Vector2f v, float length) {
        this.x = v.x * length;
        this.y = v.y * length;
    }

    public float length() {
        return (float)Math.sqrt(x * x + y * y);
    }

    public Vector2f normalize() {
        final float len = length();
        return new Vector2f(x / len, y / len);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public int compareTo(Vector2f vector2f) {
        return Float.compare(length(), vector2f.length());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2f vector2f = (Vector2f) o;
        return Float.compare(vector2f.x, x) == 0 &&
                Float.compare(vector2f.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    protected Vector2f clone() {
        return new Vector2f(x, y);
    }

    @Override
    public String toString() {
        return "{ " + x + ", " + y + " }";
    }
}
