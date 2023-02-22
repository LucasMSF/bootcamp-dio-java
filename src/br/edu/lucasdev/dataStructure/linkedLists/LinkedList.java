package br.edu.lucasdev.dataStructure.linkedLists;

import br.edu.lucasdev.dataStructure.node.Node;

public class LinkedList<T> {
    private Node startRef;

    private void indexValidation(int index) throws IndexOutOfBoundsException {
        if(index > (this.size() - 1) || index < 0) {
            throw new IndexOutOfBoundsException("the specified index is not in range. The range of this list is 0-" + (this.size() - 1));
        }
    }
    private Node<T> getNode(int index) {
        indexValidation(index);

        Node<T> ref = this.startRef;
        Node<T> returnNode = null;

        for (int i = 0; i <= index; i++) {
            returnNode = ref;
            ref = ref.getNode();
        }

        return returnNode;
    }
    public LinkedList() {
        this.startRef = null;
    }

    public boolean isEmpty() {
        return this.startRef == null;
    }

    public int size() {
        if (!this.isEmpty()) {
            int count = 0;
            Node ref = this.startRef;

            while (ref != null) {
                count++;
                ref = ref.getNode();
            }

            return count;
        }
        return 0;
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);

        if(this.isEmpty()) {
            this.startRef = newNode;
            return;
        }

        Node<T> ref = this.startRef;
        for (int i = 0; i < (this.size() - 1); i++) {
            ref = ref.getNode();
        }

        ref.setNode(newNode);
    }

    public T get(int index) {
        return this.getNode(index).getContent();
    }

    public T remove(int index) {
        Node<T> pivotNode = this.getNode(index);

        if(index == 0) {
            this.startRef = this.startRef.getNode();
            return pivotNode.getContent();
        }

        Node<T> backNode = this.getNode(index - 1);
        backNode.setNode(pivotNode.getNode());

        return pivotNode.getContent();
    }

    @Override
    public String toString() {
       String string = "List\n";
       string += "------------------------\n";

       Node<T> ref = this.startRef;

        for (int i = 0; i < this.size(); i++) {
            string += "Node {content:" + ref.getContent() + "}\n";
            ref = ref.getNode();
        }

        string += "------------------------";

        return string;
    }
}
