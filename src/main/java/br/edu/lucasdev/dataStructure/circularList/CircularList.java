package br.edu.lucasdev.dataStructure.circularList;

import br.edu.lucasdev.dataStructure.node.Node;

public class CircularList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public CircularList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private Node<T> getNode(int index) throws IndexOutOfBoundsException {
        if (this.isEmpty()) throw new IndexOutOfBoundsException("Empty List");

        if (index == 0) return this.tail;

        Node<T> ref = this.tail;

        for (int i = 0; i < index; i++) {
            ref = ref.getNode();
        }

        return ref;
    }

    public T get(int index) {
        return this.getNode(index).getContent();
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);

        if(this.isEmpty()) {
            this.head = newNode;
            this.tail = this.head;
            this.tail.setNode(this.tail);
        } else {
            newNode.setNode(this.tail);
            this.head.setNode(newNode);
            this.tail = newNode;
        }

        this.length++;
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        if (index >= this.length) throw new IndexOutOfBoundsException("Index out of range");

        Node<T> ref = this.tail;

        if (index == 0) {
            this.tail = this.tail.getNode();
            this.head.setNode(this.tail);
        } else if (index == 1) {
            this.tail.setNode(this.tail.getNode().getNode());
        } else {
            for (int i = 0; i < index - 1; i++) {
                ref = ref.getNode();
            }

            ref.setNode(ref.getNode().getNode());
        }

        this.length--;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int size() {
        return this.length;
    }

    @Override
    public String toString() {
        String string = "Circular list\n";
        string += "--------------------------\n";

        Node<T> ref = this.tail;

        for (int i = 0; i < this.length; i++) {
            string += "Node {\ncontent:" + ref.getContent() + ",\n";
            string += "next:" + ref.getNode().getContent() + "\n}\n";
            ref = ref.getNode();
        }

        string += "--------------------------";

        return string;
    }
}
