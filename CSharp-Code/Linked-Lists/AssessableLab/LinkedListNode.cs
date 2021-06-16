using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class LinkedListNode<T>
    {
        public LinkedListNode(T value)
        {
            Value = value;
        }

        public T Value;
        public LinkedListNode<T> Next;
        public LinkedListNode<T> Previous;
    }

}
