using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class Student : Person, IComparable<Student>, IEquatable<Student>, IComparable
    {
        private float _value;
        public new float Value { get { return _value; } }
        public string studentID;
        public DateTime dateRegistered;
        public string program;
        public Enrollment enrollment;
        public static string number;
        public static string street;
        public static string suburb;
        public static string postcode;
        public static string state;
        public string name;
        public string email;
        public string telNum;

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



        //LAB15 for simplicities sake, only the student and person call will be created. 
        //CONSTRUCTOR Student with Address and Enrollment
        public Student(string studentID, string program, DateTime dateRegistered,
            string name, string email, string telNum)
            : base(name, email, telNum, number, street, suburb, postcode, state)
        {
            this.studentID = studentID;
            this.dateRegistered = dateRegistered;
            this.program = program;
        }



        //LAB14 relates to IComparable<Student>. 
        public int CompareTo(Student other)
        {
         //   return this.name.CompareTo(other.name);
            return this._value.CompareTo(other._value);
        }

        //LAB14 relates to IEquatable<Student>. 
        public bool Equals(Student other)
        {
            return _value == other._value;
        }

        //LAB14 relates to IComparable.
        //public int CompareTo(object obj)
        public new int CompareTo(object obj)
        {
            //IF obj is null
            if (obj == null)
                throw new ArgumentNullException("obj");
            //IF obj is NOT of course object
            if (!(obj is Student))
                throw new ArgumentException("Expected CalorieCount instance", "obj");
            return CompareTo((Student)obj);
        }





        ////LAB14
        //public override bool Equals(object obj)
        //{
        //    if (obj == null)
        //        return false;
        //    if (!(obj is Student))
        //        return false;
        //    return _value == ((Student)obj)._value;
        //}

        //LAB14
        public override int GetHashCode()
        {
            return _value.GetHashCode();
        }

        //LAB13 & 14: OVERLOAD ==(Student x, Student y
        public static bool operator ==(Student x, Student y)
        {
            return object.Equals(x, y);
        }

        //LAB13 & 14: OVERLOAD !=(Student x, Student y
        public static bool operator !=(Student x, Student y)
        {
            return !object.Equals(x, y);
        }

        //LAB14
        public static bool operator <(Student x, Student y)
        {
            return x._value < y._value;
        }

        //LAB14
        public static bool operator <=(Student x, Student y)
        {
            return x._value <= y._value;
        }

        //LAB14
        public static bool operator >(Student x, Student y)
        {
            return x._value > y._value;
        }

        //LAB14
        public static bool operator >=(Student x, Student y)
        {
            return x._value >= y._value;
        }







        //LAB13: OVERRIDE Equals(object)
        public override bool Equals(object obj)
        {
            if (!base.Equals(obj))
                return false;
            Student tempS = (Student)obj;
            return this.studentID == tempS.studentID;
        }

        ////LAB13: OVERRIDE GetHasCode()
        //public override int GetHashCode()
        //{
        //    return base.GetHashCode() ^ this.studentID.GetHashCode();
        //}


        //ToString
        public override string ToString()
        {
            return string.Format("\nStudent Class: ID: {0}, Program: {1}, Date: {2}, Name: {3}, Email: {4}, Phone: {5}", studentID, program, dateRegistered, name, email, telNum);
        }
    }

}



