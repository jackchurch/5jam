/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedLists;

import lab.Student;

/**
 * Reference https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
 * and https://youtu.be/_VWBbcl_EYA for insertion and removal at postion for
 * linked list.
 *
 * @author jackc
 * @param <T>
 */
public class LinkedList<T> {

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
     * Add a node to the start of the list. 
     * @param node
     */
    public void addFirst(Node<T> node) {
        //Save the head
        Node<T> temp = head;
        //Point head to new node
        head = node;
        //Insert rest of the list behind the head
        head.next = temp;
        count++;
        //If list was empty then Head and Tail are pointing to the same new node. 
        if (count == 1) {
            tail = head;
        }
    }

    /**
     * Add a node to the end of the list. 
     * @param node
     */
    public void addLast(Node<T> node) {
        if (count == 0) //no nodes exist
        {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        count++;
    }

    /**
     * Insert node at the position specified in the  linked list. 
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
        temp.next = newNode;

    }

    /**
     * Remove node at the position specified in the linked list. 
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
    }

    /**
     * Remove node from head of list. 
     */
    public void removeFirst() {
        if (count != 0) {
            //Before: Head →3 → 5
            //After: Head → 3 → null
            head = head.next;
            count--;
            if (count == 0) {
                tail = null;
            }
        }
    }

    /**
     * Search for item in linked list. 
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

    /**
     * Remove node from tail of list. 
     */
    public void removeLast() {
        if (count != 0) {
            if (count == 1) {
                head = null;
                tail = null;
            } else {
                //Before: 
                //  head → 3 → 5 → 7
                //  tail = 7
                //After:
                //  head → 3 → 5 → null
                //  tail = 5
                Node<T> current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count--;
        }
    }

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

}
