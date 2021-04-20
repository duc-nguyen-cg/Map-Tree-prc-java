public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();

        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.println("The number of nodes is: " + tree.getSize());

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println();

        System.out.println("Postorder (sorted): ");
        tree.postorder();
        System.out.println();

        System.out.println("Preorder (sorted): ");
        tree.preorder();
        System.out.println();

        System.out.println("Search name: ");
        System.out.println(tree.search("Daniel")); //true
        System.out.println(tree.search("George")); //true
        System.out.println(tree.search("Michael")); //true
        System.out.println(tree.search("Hellsing")); //false
    }
}
