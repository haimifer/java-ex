public class BineryTree {

  public static int what(Node t) {
    if (t == null) {
      return 0;
    }

    return 1 + Math.max(
      what(t.getLeftSon()),
      what(t.getRightSon()));
  }

  public static void secret(Node node, int[] a) {
    secret(node, 0, a);
  }

  public static void secret(Node node, int k, int[] a) {
    if (node == null) {
      return;
    }
    a[k] += node.getNumber();
    secret(node.getLeftSon(), k + 1, a);
    secret(node.getRightSon(), k + 1, a);
  }

  public static void printArr(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
      System.out.println();
    }
  }
}
