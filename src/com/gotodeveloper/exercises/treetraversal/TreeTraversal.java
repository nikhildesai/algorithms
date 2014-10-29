package com.gotodeveloper.exercises.treetraversal;

public class TreeTraversal {

    public void inorder(Node n) {

        if (n != null && n.left != null)
            inorder(n.left);

        if (n != null) {
            System.out.println(n.data);
        }

        if (n != null && n.left != null)
            inorder(n.right);

    }

    public void preorder(Node n) {

        if (n != null) {
            System.out.println(n.data);
        }

        if (n != null && n.left != null)
            preorder(n.left);

        if (n != null && n.left != null)
            preorder(n.right);

    }

    public void postorder(Node n) {

        if (n != null && n.left != null)
            postorder(n.left);
        if (n != null && n.left != null)
            postorder(n.right);
        if (n != null) {
            System.out.println(n.data);
        }
    }
}
