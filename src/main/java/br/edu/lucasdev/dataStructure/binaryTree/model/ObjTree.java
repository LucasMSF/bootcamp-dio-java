package br.edu.lucasdev.dataStructure.binaryTree.model;

public abstract class ObjTree<T> implements Comparable<T> {

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T compare);
    public abstract String toString();
}
