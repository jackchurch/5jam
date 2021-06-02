/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedLists;

/**
 *
 * @author jackc
 */
public class DoublyLinkedList<T>
{

    Node<T> head;
    Node<T> tail;
    int count = 0;

    @Override
    public String toString()
    {
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

    public String toStringReverse()
    {
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
    //END     public boolean contains(T item)

    public void addFirst(Node<T> node)
    {
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

    public void addLast(Node<T> node)

    {
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

    public void removeFirst()
    {
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

    public void removeLast()
    {
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

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

}
