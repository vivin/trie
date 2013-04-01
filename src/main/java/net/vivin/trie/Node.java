package net.vivin.trie;

import java.util.*;

public class Node implements Comparable<Node> {

    private Character value;
    private Map<Character, Node> children;

    public Node() {
        children = new LinkedHashMap<>();
    }

    public Node(Character value) {
        this();
        this.value = value;
    }

    public Character getValue() {
        return value;
    }

    public Node getChild(Character c) {
        return children.get(c);
    }

    public List<Node> getChildren() {
        List<Node> sorted = new LinkedList<>(children.values());
        Collections.sort(sorted);
        return sorted;
    }

    public boolean hasChild(Character c) {
        return (children.get(c) != null);
    }

    public Node addChild(Character c) {
        Node child = new Node(c);
        children.put(c, child);
        return child;
    }

    @Override
    public int compareTo(Node o) {
        return value.compareTo(o.value);
    }
}
