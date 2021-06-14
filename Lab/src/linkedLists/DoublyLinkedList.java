/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedLists;

/**
 * Reference https://www.programiz.com/dsa/doubly-linked-list for Inserting and
 * removing from position of doubly linked list.
 *
 * @author jackc
 * @param <T>
 */
public class DoublyLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int count = 0;

    /**
     * Doubly Linked List to string, traverse the list from head to tail. 
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getValue());

            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }

        return "Linked List: " + sb;
    }

    /**
     * Doubly Linked List to string in traverse the doubly linked list from tail to head. 
     * @return
     */
    public String toStringReverse() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = tail;
        while (current != null) {
            sb.append(current.getValue());

            if (current.getPrevious() != null) {
                sb.append(", ");
            }
            current = current.getPrevious();
        }

        return "Linked List: " + sb;
    }

    /**
     * Search for item in doubly linked list. 
     * @param item
     * @return
     */
    public boolean contains(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }

            current = current.next;

        }
        return false;
    }
    //END     public boolean contains(T item)

    /**
     * Add a node to the start of the list. 
     * @param node
     */
    public void addFirst(Node<T> node) {
        Node<T> temp = head;
        head = node;
        head.next = temp;
        if (count == 0) {
            //if the liist is empty, the head and tail 
            //point to the new node: 
            tail = head;
        } else {
            /*
            Before: head → 5 ←→ 7 → null
            After: head → 3 ←→ 5 ←→ 7 → null
            temp.previous was null and now head
             */
            temp.previous = head;
        }
        count++;
    }
    //END     public void addFirst(Node<T> node)

    /**
     * Add a node to the end of the list. 
     * @param node
     */
    public void addLast(Node<T> node) {
        if (count == 0) // no nodes
        {
            head = node;
        } else {
            tail.next = node;
            //Before: Head → 3 ←→ 5 → null
            //After: Head → 3 ←→ 5 ←→ 7 → null
            node.previous = tail;
        }
        tail = node;
        count++;
    }
    //END     public void addLast(Node<T> node)

    /**
     * Insert node at the position specified in the doubly linked list. 
     * @param position
     * @param newNode
     */
    public void insertMiddle(int position, Node<T> newNode) {
        //Save the head
        Node<T> temp = head;

        if (position < 1) {
            System.out.println("Position can't be 0 or less.");
        }

        for (int i = 2; i < position; i++) {
            if (temp.next != null) {
                temp = temp.next;
            }
        }

        newNode.next = temp.next;

        //Set the nodes prvious to the current node
        newNode.previous = temp;

        //Don't foreget to set the next node's head to point back to the new node. Forgot first time. 
        newNode.next.previous = newNode;
        temp.next = newNode;

    }

    /**
     * Remove node at the position specified in the doubly linked list. 
     * @param postion
     */
    public void removeMiddle(int postion) {
        Node<T> temp = head;

        for (int i = 2; i < postion; i++) {
            if (temp.next != null) {
                temp = temp.next;
            }
        }
        temp.next = temp.next.next;
        temp.next.previous = temp;
    }

    /**
     * Remove node from head of list. 
     */
    public void removeFirst() {
        if (count != 0) {
            //Bfore: Head: → 3 ←→ 5
            //After: Head: → 5

            //Head → → null
            //Head → null
            head = head.next;
            count--;
            if (count == 0) {
                tail = null;
            } else {
                //5.previous was 3, now 5.prev is null
                head.previous = null;
            }
        }
    }
    //END     public void removeFirst()

    /**
     * Remove node from tail of list. 
     */
    public void removeLast() {
        if (count != 0) {
            if (count == 1) {
                head = null;
                tail = null;
            } else {
                tail.previous.next = null;
                tail = tail.previous;
            }
            count--;
        }
    }
    //END     public void removeLast() 

    //GETTERS AND SETTERS

    /**
     *
     * @return
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     *
     * @param head
     */
    public void setHead(Node<T> head) {
        this.head = head;
    }

    /**
     *
     * @return
     */
    public Node<T> getTail() {
        return tail;
    }

    /**
     *
     * @param tail
     */
    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    /**
     *
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

}
