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

            Console.WriteLine("\n\nQUESTION: What precautions would you take when implementing the CompareTo() for the derived class Student\n" +
             "(see the FoodItem and CookedFoodItem example in the labs)\n");
            Console.WriteLine("ANSWER: I would include the base class in the Student CompareTo() method to ensure that the object in both classes match.\n\n");


            Console.WriteLine("QUESTION: When comparing names for the Person class, how can you ensure that the comparisons ignore the case of \n" +
                "the characters the Name and Email properties.\n");
            Console.WriteLine("ANSWER: C# or .NET (I haven't researched which one), provides (a) class' of culture information \n" +
                "that is specific to the language of the local computer. This allows the program to use the rules of the local \n" +
                "language to determin if it should make certian letters the same, such as upper and lower case letters in English.\n" +
                "It is accessed in the Compare method when indicating what type of comparision I am able to add in \"StringComparison.CurrentCulture\"\n\n");

            Console.WriteLine("Press any key to continue.");
            Console.ReadLine();


            var date1 = new DateTime(2011, 01, 11);
            var date2 = new DateTime(2011, 01, 11);
            var date3 = new DateTime(2023, 03, 13);

            /*
            //CREATE AND DISPLAY COURSES
            Course c1 = new Course("4C#W", "ASP.NET", 35);
            Course c2 = new Course("4C#W", "ASP.NET", 35);
            Course c3 = new Course("5T3", "Redhat Security", 0.87);




            //CREATE AND DISPLAY STUDENTS WITH ADDRESS, ENROLLMENT AND ADD COURSES
            Student s1 = new Student("1", "Law", date1,
                "Jack", "jack@jack.com", "555 123",
                "97", "King William Sreet", "Adelaide", "5000", "SA",
                "100", date3, "D", "2", c1);

            Student s2 = new Student("1", "Law", date1,
                "Jack", "jack@jack.com", "555 123",
                "97", "King William Sreet", "Adelaide", "5000", "SA",
                "100", date3, "D", "2", c1);

            Student s3 = new Student("3", "Maths", date3,
                "Michael", "jack@jack.com", "555 123",
                "97", "King William Sreet", "Adelaide", "5000", "SA",
                "200", date1, "M", "1", c2);

            */



            //CREATE PERSON WITH ADDRESS
            Person p11 = new Person("Michael", "michael@michael.com", "555 555",
            "97", "King William Sreet", "Adelaide", "5000", "SA");

            Person p12 = new Person("abby", "abby@abby.com", "555 999",
            "97", "King William Sreet", "Adelaide", "5000", "SA");

            Person p13 = new Person("ABBY", "ZANE@ZANE.COM", "555 111",
            "97", "King William Sreet", "Adelaide", "5000", "SA");

            Person p14 = new Person("Zane", "zane@zane.com", "555 111",
            "97", "King William Sreet", "Adelaide", "5000", "SA");





            //Console.WriteLine("\n\n### PERSONS without student class inheritance:  ###\n");
            //Console.WriteLine("p11: " + p11);
            //Console.WriteLine("p12: " + p12);
            //Console.WriteLine("p13: " + p13);
            //Console.WriteLine("\n\nPress any key to continue.");
            //Console.ReadLine();


            //LAB14: Array
            Person[] personArray = { p11, p12, p13, p14 };

            Console.WriteLine("\n\nSorting with normal array: \n\n");

            Console.WriteLine("\nSorting people by name:\nExpetnat order Abby, ABBY, Michael, Zane\n");
            SortAndShowListByName(personArray);

            Console.WriteLine("\n\nSorting people by phone:\nExpetnat order ABBY, Zane, Michael, Abby\n");
            SortAndShowListByTelNum(personArray);

            Console.WriteLine("\n\nSorting people by email:\nExpetnat order Abby, Michael, Zane, ABBY\n");
            SortAndShowListByEmail(personArray);

            Console.WriteLine("\n\nPress any key to continue.");
            Console.ReadLine();





            //LAB14: HashSet
            Console.WriteLine("\n\nHash Set by Name: \nExpetnat order Michael, Abby, Zane\n");
            var personNameHashSet = new HashSet<Person>(PersonNameEqualityComparer.Instance) { p11, p12, p13, p14 };

            foreach (var _person in personNameHashSet)
                Console.WriteLine(_person);

            Console.WriteLine("\n\nHash Set by Phone: \nExpetnat order Michael, Abby, ABBY\n");
            var personTelNumHashSet = new HashSet<Person>(PersonTelNumEqualityComparer.Instance) { p11, p12, p13, p14 };

            foreach (var _person in personTelNumHashSet)
                Console.WriteLine(_person);


            Console.WriteLine("\n\nHash Set by Email: \nExpetnat order Michael, Abby, ABBY\n");
            var personEmailHashSet = new HashSet<Person>(PersonEmailEqualityComparer.Instance) { p11, p12, p13, p14 };

            foreach (var _person in personEmailHashSet)
                Console.WriteLine(_person);

            Console.WriteLine("\n\nPress any key to end.");
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




            //LAB13 below #####################

            //Console.WriteLine("\n\n### COURSES ###\n");
            //Console.WriteLine("c1: " + c1);
            //Console.WriteLine("c2: " + c2);
            //Console.WriteLine("c3: " + c3);
            //Console.WriteLine("\n\nPress any key to continue.");
            //Console.ReadLine();


            //Console.WriteLine("\n### Course comparions ###");
            //Console.WriteLine("\nc1 == c1 ?\tExpect True. Same object.");

            //AreTheyEqual(c1, c1);

            //Console.WriteLine("\nc1 == c2 ?\tExpect True. Different objects, same comparison values.");
            //AreTheyEqual(c1, c2);

            //Console.WriteLine("\nc1 == c3 ?\tExpect False. Different objects, different comparison values.");
            //AreTheyEqual(c1, c3);

            //Console.WriteLine("\nPress any key to continue.");
            //Console.ReadLine();








            //Console.WriteLine("\n### Person comparions (WITHOUT student class inheritance) ###");
            //Console.WriteLine("\np11 == p11 ?\tExpect True. Same object.");

            //AreTheyEqual(p11, p11);

            //Console.WriteLine("\np11 == p12 ?\tExpect True. Different objects, same comparison values.");
            //AreTheyEqual(p11, p12);

            //Console.WriteLine("\np11 == p13 ?\tExpect False. Different objects, different comparison values.");
            //AreTheyEqual(p11, p13);

            //Console.WriteLine("\nPress any key to continue.");
            //Console.ReadLine();







            //Console.WriteLine("\n\n### STUDENTS ###\n");
            //Console.WriteLine("s1: " + s1);
            //Console.WriteLine("\ns2: " + s2);
            //Console.WriteLine("\ns3: " + s3);
            //Console.WriteLine("\n\nPress any key to continue.");
            //Console.ReadLine();



            //Console.WriteLine("\n\n### Student Comparions: ###");
            //Console.WriteLine("\ns1 == s1 ?\tExpect True. Same object. ");
            //AreTheyEqual(s1, s1);

            //Console.WriteLine("\ns1 == s2 ?\tExpect True. Different objects, same comparison values.");
            //AreTheyEqual(s1, s2);

            //Console.WriteLine("\ns1 == s3 ?\tExpect False. Different objects, different comparison values.");
            //AreTheyEqual(s1, s3);

            //Console.WriteLine("\nPress any key to continue.");
            //Console.ReadLine();

            //Console.WriteLine("\n\n### Course Comparions: ###");
            //Console.WriteLine("\nc1 == c1 ?\tExpect True. Same object. ");
            //AreTheyEqual(c1, c1);

            //Console.WriteLine("\nc1 == s2 ?\tExpect True. Different objects, same values. ");
            //AreTheyEqual(c1, c2);

            //Console.WriteLine("\nc1 == c3 ?\tExpect False. Differet objects, different values.");
            //AreTheyEqual(c1, c3);


            //Console.WriteLine("\nPress any key to end.");
            //Console.ReadLine();
        






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
