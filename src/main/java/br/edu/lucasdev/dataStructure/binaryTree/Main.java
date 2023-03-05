package br.edu.lucasdev.dataStructure.binaryTree;

import br.edu.lucasdev.dataStructure.binaryTree.model.Obj;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Obj> tree = new BinaryTree<>();

        tree.insert(new Obj(13));
        tree.insert(new Obj(10));
        tree.insert(new Obj(25));
        tree.insert(new Obj(2));
        tree.insert(new Obj(12));
        tree.insert(new Obj(20));
        tree.insert(new Obj(31));
        tree.insert(new Obj(29));

        tree.showInOrder();
        tree.showPostOrder();
        tree.showPreOrder();

    }
}
