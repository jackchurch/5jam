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

            //Console.WriteLine("\n\nQUESTION: What precautions would you take when implementing the CompareTo() for the derived class Student\n" +
            // "(see the FoodItem and CookedFoodItem example in the labs)\n");
            //Console.WriteLine("ANSWER: I would include the base class in the Student CompareTo() method to ensure that the object in both classes match.\n\n");


            //Console.WriteLine("QUESTION: When comparing names for the Person class, how can you ensure that the comparisons ignore the case of \n" +
            //    "the characters the Name and Email properties.\n");
            //Console.WriteLine("ANSWER: C# or .NET (I haven't researched which one), provides (a) class' of culture information \n" +
            //    "that is specific to the language of the local computer. This allows the program to use the rules of the local \n" +
            //    "language to determin if it should make certian letters the same, such as upper and lower case letters in English.\n" +
            //    "It is accessed in the Compare method when indicating what type of comparision I am able to add in \"StringComparison.CurrentCulture\"\n\n");

            //Console.WriteLine("Press any key to continue.");
            //Console.ReadLine();


            var date1 = new DateTime(2011, 01, 11);
            var date2 = new DateTime(2011, 01, 11);
            var date3 = new DateTime(2023, 03, 13);


            ////CREATE AND DISPLAY COURSES
            //Course c1 = new Course("4C#W", "ASP.NET", 35);
            //Course c2 = new Course("4C#W", "ASP.NET", 35);
            //Course c3 = new Course("5T3", "Redhat Security", 0.87);




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


            //LAB15: 
            Student[] studentArray = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 };

            Console.WriteLine("Students array:\n");
            foreach (Student student in studentArray)
                Console.WriteLine(student + " ");
            Console.WriteLine("\nPress any key to continue.");
            Console.ReadLine();

            //QUESTION 1
            Console.WriteLine("\n\n### Lab15 Question 1 ###\n");
            Console.WriteLine("\nPress any key to continue.");
            Console.ReadLine();

            Console.WriteLine("Enter student ID to find: ");
            string input = (Console.ReadLine());
            int tempInput = Convert.ToInt32(input);

            Console.WriteLine("\nFinding student with ID " + input);

            int result = LinearSearchStudentArray(studentArray, input);

            Console.WriteLine("\nStudent found in array at position " + result);
            Console.WriteLine("\nStudent at array postion " + result + ": " + studentArray[result]);
            Console.WriteLine("\nPress any key to continue.");
            Console.ReadLine();


            //QUESTION 3
            Console.WriteLine("\n\n### Lab15 Question 3 ###\n");
            Console.WriteLine("\nPress any key to continue.");
            Console.ReadLine();


            BubbleSortStudentArray(studentArray);
            Console.WriteLine("\n\nThe bubble sorted array by name:\n");
            foreach (Student student in studentArray)
                Console.WriteLine(student + " ");
            Console.WriteLine("\nPress any key to continue.");
            Console.ReadLine();



            Console.WriteLine("\n\n### LAB15 Question 2 ###\n\n");
            Console.WriteLine("\nPress any key to continue.");
            Console.ReadLine();
            Console.WriteLine("Names are:");
            foreach (Student student in studentArray)
                Console.WriteLine(student.name + " ");

            Console.WriteLine("Enter student name to find: ");
            input = Console.ReadLine();

            Console.WriteLine("\nFinding student with name " + input);

           // result = LinearSearchStudentArray(studentArray, input);


     //       string critera = Convert.ToInt32(input);
            //string critera = studentArray[tempInput].name.ToString();


            result = BinarySearchStudentArray(studentArray, input);


            Console.WriteLine("\nStudent found in array at position " + result);
            Console.WriteLine("\nStudent at array postion " + result + ": " + studentArray[result]);
            Console.WriteLine("\nPress any key to end.");
            Console.ReadLine();






        }

        //Lab15 Question 3
        private static void BubbleSortStudentArray(Student[] studentsArray)
        {
            Student tempStudent; 
            
            for (int j = 0; j < studentsArray.Length - 1; j++)
            {
                for (int i = 0; i < studentsArray.Length - 1; i++)
                {
                    if (studentsArray[i].name.CompareTo(studentsArray[i + 1].name) > 0)
                    {
                        tempStudent = studentsArray[i];
                        studentsArray[i] = studentsArray[i + 1];
                        studentsArray[i + 1] = tempStudent;

                    }
                }
            }
        }



        //LAB15 Question 1
        public static int LinearSearchStudentArray(Student[] studentsArray, string input)
        {
            for (int i = 0; i < studentsArray.Length; i++)
            {
                if (input.Equals(studentsArray[i].studentID))
                    return i;
            }
            return -1;
        }


        //LAB15 Question 2
        private static int BinarySearchStudentArray(Student[] studentsArray, string criteria)
        {
            int min = 0;
            int max = studentsArray.Length - 1;
            string input = criteria.ToUpper();
            
            while ( min <= max) 
            {
                int mid = (min + max) / 2;

                if (input.CompareTo(studentsArray[mid].name.ToUpper()) == 0)
                    return mid;
                else if (input.CompareTo(studentsArray[mid].name.ToUpper()) > 0)
                    min = mid + 1;
                else
                    max = mid - 1;
            }
            return -1;

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
