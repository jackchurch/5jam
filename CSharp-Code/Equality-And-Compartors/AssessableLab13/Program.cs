using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab13
{
    class Program
    {
        static void Main(string[] args)
        {
            var date1 = new DateTime(2011, 01, 11);
            var date2 = new DateTime(2011, 01, 11);
            var date3 = new DateTime(2023, 03, 13);


            //CREATE AND DISPLAY COURSES
            Course c1 = new Course("4C#W", "ASP.NET", 35);
            Course c2 = new Course("4C#W", "ASP.NET", 35);
            Course c3 = new Course("5T3", "Redhat Security", 0.87);

            Console.WriteLine("\n\n### COURSES ###\n");
            Console.WriteLine("c1: " + c1);
            Console.WriteLine("c2: " + c2);
            Console.WriteLine("c3: " + c3);
            Console.WriteLine("\n\nPress any key to continue.");
            Console.ReadLine();


            Console.WriteLine("\n### Course comparions ###");
            Console.WriteLine("\nc1 == c1 ?\tExpect True. Same object.");

            AreTheyEqual(c1, c1);

            Console.WriteLine("\nc1 == c2 ?\tExpect True. Different objects, same comparison values.");
            AreTheyEqual(c1, c2);

            Console.WriteLine("\nc1 == c3 ?\tExpect False. Different objects, different comparison values.");
            AreTheyEqual(c1, c3);

            Console.WriteLine("\nPress any key to continue.");
            Console.ReadLine();




            //CREATE PERSON WITH ADDRESS
            Person p11 = new Person("Jack", "jack@jack.com", "555 123",
                "97", "King William Sreet", "Adelaide", "5000", "SA");

            Person p12 = new Person("Jack", "jack@jack.com", "555 123",
                "97", "King William Sreet", "Adelaide", "5000", "SA");

            Person p13 = new Person("Michael", "jack@jack.com", "555 123",
                "97", "King William Sreet", "Adelaide", "5000", "SA");

            Console.WriteLine("\n\n### PERSONS without student class inheritance:  ###\n");
            Console.WriteLine("p11: " + p11);
            Console.WriteLine("p12: " + p12);
            Console.WriteLine("p13: " + p13);
            Console.WriteLine("\n\nPress any key to continue.");
            Console.ReadLine();


            Console.WriteLine("\n### Person comparions (WITHOUT student class inheritance) ###");
            Console.WriteLine("\np11 == p11 ?\tExpect True. Same object.");

            AreTheyEqual(p11, p11);

            Console.WriteLine("\np11 == p12 ?\tExpect True. Different objects, same comparison values.");
            AreTheyEqual(p11, p12);

            Console.WriteLine("\np11 == p13 ?\tExpect False. Different objects, different comparison values.");
            AreTheyEqual(p11, p13);

            Console.WriteLine("\nPress any key to continue.");
            Console.ReadLine();







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


            Console.WriteLine("\n\n### STUDENTS ###\n");
            Console.WriteLine("s1: " + s1);
            Console.WriteLine("\ns2: " + s2);
            Console.WriteLine("\ns3: " + s3);
            Console.WriteLine("\n\nPress any key to continue.");
            Console.ReadLine();
         


            Console.WriteLine("\n\n### Student Comparions: ###");
            Console.WriteLine("\ns1 == s1 ?\tExpect True. Same object. ");
            AreTheyEqual(s1, s1);

            Console.WriteLine("\ns1 == s2 ?\tExpect True. Different objects, same comparison values.");
            AreTheyEqual(s1, s2);

            Console.WriteLine("\ns1 == s3 ?\tExpect False. Different objects, different comparison values.");
            AreTheyEqual(s1, s3);

            Console.WriteLine("\nPress any key to continue.");
            Console.ReadLine();

            Console.WriteLine("\n\n### Course Comparions: ###");
            Console.WriteLine("\nc1 == c1 ?\tExpect True. Same object. ");
            AreTheyEqual(c1, c1);

            Console.WriteLine("\nc1 == s2 ?\tExpect True. Different objects, same values. ");
            AreTheyEqual(c1, c2);

            Console.WriteLine("\nc1 == c3 ?\tExpect False. Differet objects, different values.");
            AreTheyEqual(c1, c3);


            Console.WriteLine("\nPress any key to end.");
            Console.ReadLine();
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
