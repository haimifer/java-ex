/**
 * main
 */
public class program {
  public static void main(String[] args) {
    Node root = new Node(50,
        new Node(20, new Node(10, new Node(50), null), new Node(20, new Node(20, null, new Node(70)), new Node(10))),
        new Node(40));

    int size = BineryTree.what(root);
    int[] arr = new int[size];
    BineryTree.secret(root, arr);
    BineryTree.printArr(arr, size);
  }
}
