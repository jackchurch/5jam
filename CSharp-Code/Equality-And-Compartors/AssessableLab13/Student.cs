using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab13
{
    class Student : Person
    {
        //Program
        //DateREgistered
        //ID

        public string studentID;
        public DateTime dateRegistered;
        public string program;
        public Enrollment enrollment;
        public static string number;
        public static string street;
        public static string suburb;
        public static string postcode;
        public static string state;

        //CONSTRUCTOR Student with Address and Enrollment
        public Student(string studentID, string program, DateTime dateRegistered, 
            string name, string email, string telNum, 
            string number, string street, string suburb, string postcode, string state,
            string enrollmentID, DateTime dateEnrolled, string grade, string semester, Course course)
            : base(name, email, telNum, number, street, suburb, postcode, state)
        {
            this.studentID = studentID;
            this.dateRegistered = dateRegistered;
            this.program = program;
            this.enrollment = new Enrollment(enrollmentID, dateEnrolled, grade, semester, course);
        }


        //ToString
        public override string ToString()
        {
            return string.Format("\nStudent Class: ID: {0}, Program: {1}, Date: {2}, Name: {3}, Email: {4}, Phone: {5}, {6}, {7}", studentID, program, dateRegistered, name, email, telNum, address, enrollment);
        }

        //LAB13: OVERLOAD ==(Student x, Student y
        public static bool operator ==(Student x, Student y)
        {
            return object.Equals(x, y);
        }

        //LAB13: OVERLOAD !=(Student x, Student y
        public static bool operator !=(Student x, Student y)
        {
            return !object.Equals(x, y);
        }

        //LAB13: OVERRIDE Equals(object)
        public override bool Equals(object obj)
        {
            if (!base.Equals(obj))
            {
                return false;
            }
            Student tempS = (Student)obj;
            return this.studentID == tempS.studentID;
        }

        //LAB13: OVERRIDE GetHasCode()
        public override int GetHashCode()
        {
            return base.GetHashCode() ^ this.studentID.GetHashCode();
        }
    }

}



