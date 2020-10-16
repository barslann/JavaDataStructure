public static Node findMiddle(LinkedList linkedList) {
  Node fast = linkedList.head;
  Node slow = linkedList.head;

  while (fast != null) {
    fast = fast.getNextNode();
    if (fast != null) {
      fast = fast.getNextNode();
      slow = slow.getNextNode();
    }
  }
  return slow;
}



class Node {

  public String data;
  private Node next;

  public Node(String data) {
    this.data = data;
    this.next = null;
  }

  public void setNextNode(Node node) {
    this.next = node;
  }

  public Node getNextNode() {
    return this.next;
  }

}