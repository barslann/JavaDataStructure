public class Node {

  public String data;
  private Node next;
  private Node previous;

  public Node(String data) {
    this.data = data;
    this.next = null;
    this.previous = null;
  }

  public void setNextNode(Node node) {
    this.next = node;
  }

  public Node getNextNode() {
    return this.next;
  }

  public void setPreviousNode(Node node) {
    this.previous = node;
  }

  public Node getPreviousNode() {
    return this.previous;
  }

}
