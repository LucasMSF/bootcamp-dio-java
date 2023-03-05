package br.edu.lucasdev.dataStructure.linkedLists;

import br.edu.lucasdev.dataStructure.node.DoubleNode;

public class DoubleLinkedList<T> {
    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;
    private int length;

    public DoubleLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.length = 0;
    }

    private DoubleNode<T> getNode(int index) {
        DoubleNode<T> ref = this.firstNode;

        for (int i = 0; (i < index) && (ref.getNextNode() != null); i++) {
            ref = ref.getNextNode();
        }

        return ref;
    }

    public T get(int index) {
        return this.getNode(index).getContent();
    }

    public void add(T content) {
        DoubleNode<T> newNode = new DoubleNode<>(content);
        newNode.setPreviousNode(this.lastNode);
        if (this.firstNode == null) {
            this.firstNode = newNode;
        }

        if (this.lastNode != null) {
            this.lastNode.setNextNode(newNode);
        }
        this.lastNode = newNode;

        this.length++;
    }

    public void add(T content, int index) {
        DoubleNode<T> ref = getNode(index);
        DoubleNode<T> newNode = new DoubleNode<>(content);
        newNode.setNextNode(ref);

        if (newNode.getNextNode() != null) {
            newNode.setPreviousNode(ref.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(this.lastNode);
            this.lastNode = newNode;
        }
        if (index == 0) {
            this.firstNode = newNode;
        } else {
            newNode.getPreviousNode().setNextNode(newNode);
        }
        this.length++;
    }

    public void remove(int index) {
        if (index == 0) {
            this.firstNode = this.firstNode.getNextNode();
            if (this.firstNode != null) {
                this.firstNode.setPreviousNode(null);
            }
        } else {
            DoubleNode<T> ref = this.getNode(index);
            ref.getPreviousNode().setNextNode(ref.getNextNode());
            if (ref != this.lastNode) {
                ref.getNextNode().setPreviousNode(ref.getPreviousNode());
            } else {
                this.lastNode = ref.getPreviousNode();
            }
        }
        this.length--;
    }

    public int size() {
        return this.length;
    }

    @Override
    public String toString() {
        int size = this.size();
        String string = "";
        DoubleNode<T> ref = this.firstNode;
        for(int i = 0; i < size; i++) {
            string += "[No{conteudo=" + ref.getContent() + "}]--->";
            ref = ref.getNextNode();
        }
        string += "null";
        return string;
    }
}
