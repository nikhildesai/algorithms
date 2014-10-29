package com.gotodeveloper.exercises.bfsdfs;

import java.util.List;

public class DFS {
    private List<Node> allNodes;

    public DFS() {
        // TODO Auto-generated constructor stub
    }

    public DFS(List<Node> allNodes) {
        this.allNodes = allNodes;
    }

    public void dfsTraversal(Node start, int distance) {
        if (start == null) {
            return;
        }
        for (Node n : allNodes) {
            n.isVisited = false;
        }
        dfs(start, distance);
    }

    private void dfs(Node root, int distance) {
        int temp = ++distance;
        System.out.println(root.data + ",distance=" + distance);
        if (root.adjacentNodes == null) {
            return;
        }
        for (Node x : root.adjacentNodes) {
            if (!x.isVisited) {
                dfs(x, temp);
            }
        }
    }

}
