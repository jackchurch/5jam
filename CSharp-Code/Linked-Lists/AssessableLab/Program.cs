using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class Program
    {
        static void Main(string[] args)
        {


            var date1 = new DateTime(2011, 01, 11);
            var date2 = new DateTime(2011, 01, 11);
            var date3 = new DateTime(2023, 03, 13);



            //CREATE AND DISPLAY STUDENTS 
            Student s1 = new Student("1", "Law", date1, "Jack", "1@jack.com", "555 123");
            Student s2 = new Student("2", "Maths", date2, "Fiona", "2@jack.com", "555 123");
            Student s3 = new Student("3", "Law", date3, "Alvin", "3@jack.com", "555 123");
            Student s4 = new Student("4", "Chemistry", date1, "Dylan", "4@jack.com", "555 123");
            Student s5 = new Student("5", "Material", date2, "Charlie", "5@jack.com", "555 123");
            Student s6 = new Student("6", "Indonesian", date3, "Harry", "6@jack.com", "555 123");
            Student s7 = new Student("7", "Maths", date1, "Eugene", "7@jack.com", "555 123");
            Student s8 = new Student("8", "Material", date2, "Giana", "8@jack.com", "555 123");
            Student s9 = new Student("9", "Chemistry", date3, "Isobel", "9@jack.com", "555 123");
            Student s10 = new Student("10", "Indonesian", date1, "Bob", "10@jack.com", "555 123");

            //LAB16
            DoublyLinkedList<Student> myLL = new DoublyLinkedList<Student>();

            myLL.AddLast(s1);
            myLL.AddLast(s2);
            myLL.AddLast(s3);
            myLL.AddLast(s4);
            myLL.AddLast(s5);
            myLL.AddLast(s6);

            Console.WriteLine("Enumerate through the list and display each of the Student node values");

            var currentNode = myLL.Head;

            while (currentNode != null)
            {
                Console.WriteLine(currentNode.Value);
                currentNode = currentNode.Next;
            }
            Console.WriteLine("Press enter to continue. ");
            Console.ReadLine();


            Console.WriteLine("\n\nAdd student s7 to the end of the list and read the list again: ");
            myLL.AddLast(s7);

            currentNode = myLL.Head;

            while (currentNode != null)
            {
                Console.WriteLine(currentNode.Value);
                currentNode = currentNode.Next;
            }
            Console.WriteLine("Press enter to continue. ");
            Console.ReadLine();


            Console.WriteLine("\n\nFind if list contians student instance s3: ");
            Console.WriteLine(myLL.Contains(s3));
            Console.WriteLine("\nPress enter to continue. ");
            Console.ReadLine();


            Console.WriteLine("\n\nRemove a Student instance from the beginning and end of the list: ");
            myLL.RemoveFirst();
            myLL.RemoveLast();

            currentNode = myLL.Head;
            while (currentNode != null)
            {
                Console.WriteLine(currentNode.Value);
                currentNode = currentNode.Next;
            }
            Console.WriteLine("Press enter to continue. ");
            Console.ReadLine();


        }








        static void SortAndShowListByName(Person[] _personArray)
        {
            Array.Sort(_personArray, PersonNameComparer.Instance);
            foreach (var _person in _personArray)
                Console.WriteLine(_person);
        }

        static void SortAndShowListByTelNum(Person[] _personArray)
        {
            Array.Sort(_personArray, PersonTelNumComparer.Instance);
            foreach (var _person in _personArray)
                Console.WriteLine(_person);
        }

        static void SortAndShowListByEmail(Person[] _personArray)
        {
            Array.Sort(_personArray, PersonEmailComparer.Instance);
            foreach (var _person in _personArray)
                Console.WriteLine(_person);
        }







        //LAB14, Course class:
        static void DisplayOrder<T>(T x, T y) where T : IComparable<T>
        {
            int result = x.CompareTo(y);
            if (result == 0)
            {
                Console.WriteLine("{0,12} = {1}", x, y);
            }
            else if (result > 0)
            {
                Console.WriteLine("{0,12} > {1}", x, y);
            }
            else
            {
                Console.WriteLine("{0,12} < {1}", x, y);
            }
        }


        static void AreTheyEqual(Person personX, Person personY)
        {
            if (personX == personY)
            {
                Console.WriteLine(string.Format("True: {0} \n\nIS EQUAL TO \n{1}", personX, personY));
            }
            else
            {
                Console.WriteLine(string.Format("False: {0} \n\nIS NOT EQUAL TO \n{1}", personX, personY));
            }
        }

        static void AreTheyEqual(Course courseX, Course courseY)
        {
            if (courseX == courseY)
            {
                Console.WriteLine(string.Format("True: {0} \n\nIS EQUAL TO \n{1}", courseX, courseY));
            }
            else
            {
                Console.WriteLine(string.Format("False: {0} \n\nIS NOT EQUAL TO \n{1}", courseX, courseY));
            }
        }
    }
}
