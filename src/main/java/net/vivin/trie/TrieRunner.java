package net.vivin.trie;

/**
 */
public class TrieRunner {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.addString("banana");
        trie.addString("bandanna");
        trie.addString("bandage");
        trie.addString("bandaid");
        trie.addString("banter");
        trie.addString("band");
        trie.addString("applicant");
        trie.addString("apple");
        trie.addString("applicable");
        trie.addString("apt");
        trie.addString("apropos");
        trie.addString("cat");
        trie.addString("catamaran");
        trie.addString("cattle");

        trie.print();

        System.out.println("cat exists " + trie.exists("cat"));
        System.out.println("banana exists " + trie.exists("cat"));
        System.out.println("catachresis exists " + trie.exists("catachresis"));
        System.out.println("zebra exists " + trie.exists("zebra"));
    }
}
