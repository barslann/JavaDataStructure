//Many common singly linked list problems can be solved by iterating with two pointers. 
//This is sometimes known as the runner technique.

// Question 
//Create a method that returns the nth last element of a singly linked list.

//Approach1
// using Arraylist to store a representation of the linkedlist.
// Prons: Easy to implement and read. 
// Cons: Use extra space. O(n) space complexity


public static Node arrayNthLast(LinkedList list, int n) {
  ArrayList<Node> linkedListArray = new ArrayList<Node>();
  Node currentNode = list.head;
  while (currentNode != null) {
    linkedListArray.add(currentNode);
    currentNode = currentNode.getNextNode();
  }
  return linkedListArray.get(linkedListArray.size() - n);
}


//Approach2 
// using two pointers at different positions in the list but moving at the same rate
public static Node nthLastNode(LinkedList list, int n) {
  Node first = null;
  Node second = list.head;
  int count = 0;
  while (second != null) {
    second = second.getNextNode();
    if (count >= n) {
      if (first == null) {
        first = list.head;
      }
      first = first.getNextNode();
    }
    count++;
  }
  return first;
}