package com.gotodeveloper.exercises.treetraversal;

import org.junit.Test;

public class TreeTraversalTest {

    @Test
    public void inorderTest() {
        Node node1 = new Node();
        node1.data = 1;

        Node node2 = new Node();
        node2.data = 2;

        Node node3 = new Node();
        node3.data = 3;

        Node node4 = new Node();
        node4.data = 4;

        Node node5 = new Node();
        node5.data = 5;

        Node node6 = new Node();
        node6.data = 6;

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;

        new TreeTraversal().inorder(node1);

        new TreeTraversal().preorder(node1);

        new TreeTraversal().postorder(node1);
    }
}
