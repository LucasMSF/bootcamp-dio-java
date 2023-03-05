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
            System.out.print(node.getContent() + ", ");
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
            System.out.print(node.getContent() + ", ");
        }
    }

    public void showPostOrder() {
        System.out.println("Show InOrder\n");
        this.showPostOrder(this.root);
    }

    private void showPreOrder(BoolNode<T> node) {
        if (node != null) {
            System.out.print(node.getContent() + ", ");
            this.showPreOrder(node.getLeftNode());
            this.showPreOrder(node.getRightNode());
        }
    }

    public void showPreOrder() {
        System.out.println("Show InOrder\n");
        this.showPreOrder(this.root);
    }

    public void remover(T conteudo){
        try{
            BoolNode<T> atual = this.root;
            BoolNode<T> pai = null;
            BoolNode<T> filho = null;
            BoolNode<T> temp = null;

            while (atual != null && !atual.getContent().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getContent()) < 0){
                    atual = atual.getLeftNode();
                }else {
                    atual = atual.getRightNode();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            if(pai == null){
                if(atual.getRightNode() == null){
                    this.root = atual.getLeftNode();
                }else if(atual.getLeftNode() == null){
                    this.root = atual.getRightNode();
                }else {
                    for(temp = atual, filho = atual.getLeftNode();
                        filho.getRightNode() != null;
                        temp = filho, filho = filho.getLeftNode()
                    ){
                        if(filho != atual.getLeftNode()){
                            temp.setRightNode(filho.getLeftNode());
                            filho.setLeftNode(root.getLeftNode());
                        }
                    }
                    filho.setRightNode(root.getRightNode());
                    root = filho;
                }
            }else if(atual.getRightNode() == null){
                if(pai.getLeftNode() == atual){
                    pai.setLeftNode(atual.getLeftNode());
                }else {
                    pai.setRightNode(atual.getLeftNode());
                }
            }else if(atual.getLeftNode() == null){
                if(pai.getLeftNode() == atual){
                    pai.setLeftNode(atual.getRightNode());
                }else {
                    pai.setRightNode(atual.getRightNode());
                }
            }else{
                for(
                        temp = atual, filho = atual.getLeftNode();
                        filho.getRightNode() != null;
                        temp = filho, filho = filho.getRightNode()
                ){
                    if(filho != atual.getLeftNode()){
                        temp.setRightNode(filho.getLeftNode());
                        filho.setLeftNode(atual.getLeftNode());
                    }
                    filho.setRightNode(atual.getRightNode());
                    if(pai.getLeftNode() == atual){
                        pai.setLeftNode(filho);
                    }else{
                        pai.setRightNode(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }
}
