package net.vivin.trie;

import java.util.Stack;

/**
 * To change this template use File | Settings | File Templates.
 */
public class Trie {

    private Node root;

    public Trie() {
        root = new Node();
    }

    public void addString(String string) {
        Node node = root;

        for(Character c : string.toCharArray()) {
            if(node.hasChild(c)) {
                node = node.getChild(c);
            } else {
                node = node.addChild(c);
            }
        }
    }

    public boolean exists(String string) {
        Node node = root;
        int i = 0;

        while(node != null && i < string.length()) {
            node = node.getChild(string.charAt(i));
            i++;
        }

        return node != null;
    }

    public void print() {
        Node node = root;
        _print(node, 0);
    }

    private void _print(Node node, int offset) {
        for(Node child : node.getChildren()) {
            System.out.println(spaces(offset) + child.getValue());
            _print(child, offset + 1);
        }
    }

    private String spaces(int spaces) {
        String space = "";
        for(int i = 0; i < spaces; i++) {
            space += " ";
        }

        return space;
    }
}
