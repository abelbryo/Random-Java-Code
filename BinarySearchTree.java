public class BinarySearchTree{

    private Node root;

    private static class Node{
        Node right;
        Node left;
        Node parent;
        int key;
        String value;


         Node(Node left, Node right, Node parent, int key, String value){
             this.right = right;
             this.left = left; 
             this.parent = parent;
             this.key = key; 
             this.value = value;
        }

        @Override
        public boolean equals(Object obj){
            return this.key == ((Node) obj).key;
        }
    }

    public void insert(int key){
        Node z = new Node(null, null, null, key, null);
        Node y = null;
        Node x = root; 
        while( x != null){
            y = x; 
            if( z.key < x.key)
                x = x.left;
            else
                x = x.right;
        }
        z.parent = y; 
        if (y == null)
            root = z; 
        else if( z.key < y.key)
            y.left = z; 
        else
            y.right = z;
    }

    public int min(){
        Node min = root;
        while(min != null)
            min = min.left;
        return min.parent.key;
    }

    public int max(){
        Node max = root; 
        while(max != null)
            max = max.right; 
        return max.parent.key;
    }


    public static void main(String [] args) {
        Node node1 = new Node (null, null, null, 1, "Bar");
        Node node2 = new Node(null, null, null, 1, "Foo");
        System.out.println("Testing equality : " + node1.equals(node2));
        BinarySearchTree bst = new BinarySearchTree();
        
        int input;
        do{
            input = TextIO.getInt();
            bst.insert(input);
            
        }while(input > 0);

        System.out.println(bst.min());
        System.out.println(bst.max());

    }

}
