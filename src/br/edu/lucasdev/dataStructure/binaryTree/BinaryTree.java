package br.edu.lucasdev.dataStructure.binaryTree;

import br.edu.lucasdev.dataStructure.node.BoolNode;

public class BinaryTree<T extends Comparable<T>> {
    private BoolNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    private BoolNode<T> insert(BoolNode<T> node, BoolNode<T> newNode) {
        if (node == null) {
            return newNode;
        } else if (newNode.getContent().compareTo(node.getContent()) < 0) {
            node.setLeftNode(this.insert(node.getLeftNode(), newNode));
        } else {
            node.setRightNode(this.insert(node.getRightNode(), newNode));
        }
        return newNode;
    }

    public void insert(T content) {
        BoolNode<T> newNode = new BoolNode<>(content);
        this.root = this.insert(this.root, newNode);
    }

    private void showInOrder(BoolNode<T> node) {
        if (node != null) {
            this.showInOrder(node.getLeftNode());
            System.out.println(node.getContent() + ", ");
            this.showInOrder(node.getRightNode());
        }
    }

    public void showInOrder() {
        System.out.println("Show InOrder\n");
        this.showInOrder(this.root);
    }

    private void showPostOrder(BoolNode<T> node) {
        if (node != null) {
            this.showPostOrder(node.getLeftNode());
            this.showPostOrder(node.getRightNode());
            System.out.println(node.getContent() + ", ");
        }
    }

    public void showPostOrder() {
        System.out.println("Show InOrder\n");
        this.showPostOrder(this.root);
    }

    private void showPreOrder(BoolNode<T> node) {
        if (node != null) {
            System.out.println(node.getContent() + ", ");
            this.showPreOrder(node.getLeftNode());
            this.showPreOrder(node.getRightNode());
        }
    }

    public void showPreOrder() {
        System.out.println("Show InOrder\n");
        this.showPreOrder(this.root);
    }
}
