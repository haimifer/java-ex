public class Node {

  private int _number;
  private Node _leftSon;
  private Node _rightSon;

  public Node(int number) {
    _number = number;
    _leftSon = null;
    _rightSon = null;
  }

  public Node(int number, Node leftSon, Node rightSon) {
    _number = number;
    _leftSon = leftSon;
    _rightSon = rightSon;
  }

  public int getNumber() {
    return _number;
  }

  public Node getLeftSon() {
    return _leftSon;
  }

  public Node getRightSon() {
    return _rightSon;
  }

  @Override
  public String toString() {
    return "value: " + this.getNumber();
  }

}