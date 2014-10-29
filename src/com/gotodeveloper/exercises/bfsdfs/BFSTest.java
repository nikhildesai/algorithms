package com.gotodeveloper.exercises.bfsdfs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BFSTest {

    @Test
    public void test() {
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

        List<Node> node1Adj = new ArrayList<Node>();
        node1Adj.add(node2);
        node1Adj.add(node3);
        node1.adjacentNodes = node1Adj;

        List<Node> node2Adj = new ArrayList<Node>();
        node2Adj.add(node4);
        node2Adj.add(node5);
        node2.adjacentNodes = node2Adj;

        List<Node> node3Adj = new ArrayList<Node>();
        node3Adj.add(node6);
        node3.adjacentNodes = node3Adj;

        List<Node> allNodes = new ArrayList<Node>();
        allNodes.add(node1);
        allNodes.add(node2);
        allNodes.add(node3);
        allNodes.add(node4);
        allNodes.add(node5);
        allNodes.add(node6);

        BFS bfs = new BFS(allNodes);

        bfs.bfsTraversal(node1);
    }

}
