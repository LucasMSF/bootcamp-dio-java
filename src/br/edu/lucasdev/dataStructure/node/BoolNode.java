package br.edu.lucasdev.dataStructure.node;

public class BoolNode<T extends Comparable<T>> {
    private T content;
    private BoolNode<T> leftNode;
    private BoolNode<T> rightNode;

    public BoolNode(T content) {
        this.content = content;
        this.leftNode = this.rightNode = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BoolNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BoolNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BoolNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BoolNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BoolNode{" +
                "content=" + content +
                '}';
    }
}
