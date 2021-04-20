public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BST(){}

    public BST(E[] objects){
        for (int i = 0; i < objects.length; i++){
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e){
        if (root == null){
            root = new TreeNode<>(e);
            return true;
        }
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null){
            if (e.compareTo(current.element) < 0){
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0){
                parent = current;
                current = current.right;
            } else {
                return false;  //node is already in the tree, not insert
            }
        }

        if (e.compareTo(parent.element) < 0){
            parent.left = new TreeNode<>(e);
        } else {
            parent.right = new TreeNode<>(e);
        }
        size++;
        return true; //insert successfully
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
