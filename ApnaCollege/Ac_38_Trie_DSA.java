public class Ac_38_Trie_DSA {
//    Node Class...
    public static class Node{
        Node[] children;
        boolean eow;

//        Node constructor...
    public Node(){
        children = new Node[26];
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        eow = false;
    }

}

static Node root = new Node();

//  insert function...
    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i <word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null){
                //add new nodes...
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

//    search function...
    public static boolean search(String key){
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx =key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null){
                return false;
            }
            if (i == key.length() -1 && !node.eow){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

// startWith function...
    public static boolean startWith(String prefix){
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String [] word = {"the","a","there","their","any"};
        for (String i : word) {
            insert(i);
        }
        System.out.println(search("their"));
        System.out.println(search("are"));
        System.out.println(search("the"));

        System.out.println("--------startWith--------");
        String [] newWord = {"apple", "app", "mango", "man", "woman"};
        String prefix = "app";
        for (String i : newWord) {
            insert(i);
        }
        System.out.println(startWith(prefix));
    }
}
