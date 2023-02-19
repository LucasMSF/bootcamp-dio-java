package br.edu.lucasdev.dataStructure.node;

public class Node<T> {
    private T content;
    private Node<T> node;

    public Node(T content) {
        this.content = content;
        this.node = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                '}';
    }
}
