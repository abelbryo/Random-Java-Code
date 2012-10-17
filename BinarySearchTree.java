public class BinarySearchTree{

    private static class Node{
        Node right;
        Node left;
        Node parent;
        int key;
        String value;


         Node(Node right, Node left, Node parent, int key, String value){
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


    public static void main(String [] args) {
        Node node1 = new Node (null, null, null, 1, "Bar");
        Node node2 = new Node(null, null, null, 1, "Foo");

        System.out.println( node1.equals(node2));
    }

}
