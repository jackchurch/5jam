/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedLists;

import lab.Student;

/**
 *
 * @author jackc
 */
public class LinkedList<T>
{

    Node<T> head;
    Node<T> tail;
    int count = 0;

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head; 
        while(current != null) 
        {
            sb.append(current.getValue());
            
            if (current.getNext() != null) 
            {
                sb.append(", ");
            }
            current = current.getNext();
        }
        
        return "Linked List: " + sb;
    }
    


    public void addFirst(Node<T> node)
    {
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

    public void addLast(Node<T> node)
    {
        if (count == 0) //no nodes exist
        {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        count++;
    }

    public void removeFirst()
    {
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

    public boolean contains(T item)
    {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeLast()
    {
        if (count != 0) {
            if (count == 1) 
            {
                head = null;
                tail = null;
            }
            else  
            {
                //Before: 
                //  head → 3 → 5 → 7
                //  tail = 7
                //After:
                //  head → 3 → 5 → null
                //  tail = 5
                Node<T> current = head;
                while (current.next != tail)
                {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count--;
        }
    }
    
        //GETTERS AND SETTERS
    public Node<T> getHead()
    {
        return head;
    }

    public void setHead(Node<T> head)
    {
        this.head = head;
    }

    public Node<T> getTail()
    {
        return tail;
    }

    public void setTail(Node<T> tail)
    {
        this.tail = tail;
    }


}
