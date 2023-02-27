package br.edu.lucasdev.dataStructure.binaryTree.model;

import java.util.Objects;

public class Obj extends ObjTree<Obj>{
    Integer value;

    public Obj(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(value, obj.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Obj compare) {
        if(this.value > compare.value) return 1;
        else if(this.value < compare.value) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
