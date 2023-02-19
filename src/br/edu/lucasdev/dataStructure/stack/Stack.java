package br.edu.lucasdev.dataStructure.stack;

import br.edu.lucasdev.dataStructure.node.Node;

public class Stack<T> {
    private Node<T> topNodeRef;

    public Stack() {
        this.topNodeRef = null;
    }

    public void push(Node<T> newNode) {
       Node<T> oldNodeRef = this.topNodeRef;
       this.topNodeRef = newNode;
       this.topNodeRef.setNode(oldNodeRef);
    }

    public Node<T> pop() {
        if(!this.isEmpty()) {
            Node<T> poppedNode = this.topNodeRef;
            this.topNodeRef = this.topNodeRef.getNode();
            return poppedNode;
        }

        return null;
    }

    public Node<T> top() {
        return this.topNodeRef;
    }

    public boolean isEmpty() {
        return this.topNodeRef == null;
    }

    @Override
    public String toString() {
        String string = "Stack\n";
        string += "---------------------------------\n";

        Node<T> tempNode = this.topNodeRef;

        while(true) {
            if(tempNode == null) break;

            string += "Node {content:" + tempNode.getContent() + "}\n";
            tempNode = tempNode.getNode();
        }

        string += "---------------------------------";

        return string;
    }
}
