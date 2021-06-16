using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class DoublyLinkedList<T> : System.Collections.Generic.ICollection<T>
    {
        //CONSTRUCTOR
        public LinkedListNode<T> Head
        {
            get;
            private set;
        }

        //CONSTRUCTOR
        public LinkedListNode<T> Tail
        {
            get;
            private set;
        }

        //Overload AddFirst()
        public void AddFirst(T value)
        {
            AddFirst(new LinkedListNode<T>(value));
        }
        public void AddFirst(LinkedListNode<T> node)
        {
            //Save head node so we don't lose it
            LinkedListNode<T> temp = Head;

            //Point head to new node
            Head = node;

            //Insert est of the list behind the head
            Head.Next = temp;

            //IF list was empty then Head and Tail point to the new node
            if (Count == 0)
                Tail = Head;
            //ELSE 
            //Before: Head ------> 5 <-> 7 -> null
            //After: Head -> 3 <-> 5 <-> 7 -> null
            else
                temp.Previous = Head;

            Count++;
        }


        //Overload AddLast()
        public void AddLast(T value)
        {
            AddLast(new LinkedListNode<T>(value));
        }
        public void AddLast(LinkedListNode<T> node)
        {
            if (Count == 0)
            {
                Head = node;
            }
            else
            {
                Tail.Next = node;
                //Before: Head -> 3 <-> 5 -> null
                //After:  Head ->3 <-> 5 <-> 7 -> null
                // Tail was 5, now is 7
                node.Previous = Tail;
            }
            Tail = node;
            Count++;
        }

        //RemoveFirst()
        public void RemoveFirst()
        {
            if (Count != 0)
            {
                //Before: Head -> 3 <-> 5 
                //After:  Head -------> 5
                //or 
                //Before: Head -> 3 -> null
                //After: Head -------> null
                Head = Head.Next;

                Count--;

                if (Count == 0)
                    Tail = null;
                else
                    //5.Previous was 3, now 5.previous is now null
                    Head.Previous = null;
            }
        }

        //RemoveLast()
        public void RemoveLast()
        {
            if (Count != 0)
            {
                if (Count == 1)
                {
                    Head = null;
                    Tail = null;
                }
                else
                {
                    //Before: Head -> 3 <-> 5 <-> 7
                    //     Tail: 7
                    //After:  Head ->3 <-> 5 -> null
                    //      Tail: 5
                    Tail.Previous.Next = null;
                    Tail = Tail.Previous;
                }

                Count--;
            }
        }

        //Count property
        public int Count
        {
            get;
            private set;
        }

        //Add()
        public void Add(T item)
        {
            AddFirst(item);
        }

        //Contains()
        public bool Contains(T item)
        {
            LinkedListNode<T> current = Head;
            while (current != null)
            {
                //Head -> 3 <-> 5 <-> 7
                //Value : 5
                if (current.Value.Equals(item))
                    return true;

                current = current.Next;
            }
            return false;
        }

        //CopyTo(T[] array, int arrayInded)
        public void CopyTo(T[] array, int arrayIndex)
        {
            LinkedListNode<T> current = Head;
            while (current != null)
            {
                array[arrayIndex++] = current.Value;
                current = current.Next;
            }
        }

        //IsReadOnly()
        public bool IsReadOnly
        {
            get { return false; }
        }

        //Remove metod
        public bool Remove(T item)
        {
            LinkedListNode<T> previous = null;
            LinkedListNode<T> current = Head;

            /* 1. Empty list, do nothing 
             * 2. Single node: (previous is null). 
             * 3 Many nodes:
             *      a. Node to remove is the first node. 
             *      b. Node to remove is the middle or last node. */

            //While NOT case 1?
            while (current != null)
            {
                //Before Head -> 3 <-> 5 <-> 7 -> null
                //After  Head -> 3 <-------> 7 -> null

                if (current.Value.Equals(item))
                {
                    //It's a node in the middle or end: 
                    if (previous != null)
                    {
                        //Case 3b:
                        previous.Next = current.Next;

                        //it was the end os update Tail
                        if (current.Next == null)
                        {
                            Tail = previous;
                        }
                        else
                        {
                            /*
                             * Before Head -> 3 <-> 5 <-> 7 -> null 
                             * After  Head -> 3 <-------> 7 -> null 
                             * Previous = 3
                             * Current = 5
                             * current.Next = 7
                             * So...... 7.Previous = 3
                              */
                            current.Next.Previous = previous;
                        }

                        Count--;
                    }
                    else
                    {
                        //CAse 2 or 3a
                        RemoveFirst();
                    }

                    return true;
                }

                //Case 1?
                previous = current;
                current = current.Next;
            }

            return false;
        }
        //END method public bool Remove(T item)



        // Implement the TWO GetEnumerator ( ) to enumerate over the linked list values from Head to Tail 
        System.Collections.Generic.IEnumerator<T> System.Collections.Generic.IEnumerable<T>.GetEnumerator()
        {
            LinkedListNode<T> current = Head;
            while (current != null)
            {
                yield return current.Value;
                current = current.Next;
            }
        }
        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return ((System.Collections.Generic.IEnumerable<T>)this).GetEnumerator();
        }

        //Clear()
        public void Clear()
        {
            Head = null;
            Tail = null;
            Count = 0;
        }
    }
}
