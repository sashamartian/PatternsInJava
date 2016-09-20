package main.java.com.patterns.structural.adapter.example01;

/**
 *
 */
public interface AlphaList {
    void add(int value);
    void insert(int index, int value);
    int get(int index);
    void set(int index, int value);
    int count();
    void remove(int index);
}
