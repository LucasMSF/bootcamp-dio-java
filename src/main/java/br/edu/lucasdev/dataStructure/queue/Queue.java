package br.edu.lucasdev.dataStructure.queue;

import br.edu.lucasdev.dataStructure.node.Node;

public class Queue<T> {
    private Node<T> endNodeRef;

    public Queue() {
        this.endNodeRef = null;
    }

    public boolean isEmpty() {
        return this.endNodeRef == null;
    }

    public T first() {
        if (!this.isEmpty()) {
            Node<T> firstNode = this.endNodeRef;
            while (true) {
                if (firstNode.getNode() != null) {
                    firstNode = firstNode.getNode();
                } else {
                    break;
                }
            }

            return firstNode.getContent();
        }
        return null;
    }

    public T deQueue() {
        if (!this.isEmpty()) {
            Node<T> firstNode = this.endNodeRef;
            Node<T> beforeNode = this.endNodeRef;
            while (true) {
                if (firstNode.getNode() != null) {
                    beforeNode = firstNode;
                    firstNode = firstNode.getNode();
                } else {
                    break;
                }
            }
            beforeNode.setNode(null);
            return firstNode.getContent();
        }
        return null;
    }

    public void enQueue(T content) {
        Node<T> node = new Node<>(content);
        node.setNode(this.endNodeRef);
        this.endNodeRef = node;
    }

    @Override
    public String toString() {
        String string = "Queue\n";
        string += "---------------------\n";

        Node<T> node = this.endNodeRef;

        if (!this.isEmpty()) {
            while (true) {
                string += "Node {content:" + node.getContent() + "}\n";
                node = node.getNode();

                if (node == null) break;
            }
        } else {
            string += "null";
        }

        string += "---------------------";

        return string;
    }
}
