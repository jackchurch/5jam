using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class Enrollment : IComparable<Enrollment>, IEquatable<Enrollment>, IComparable
    {
        private float _value;
        public float Value { get { return _value; } }
        public string enrollmentID;
        public DateTime dateEnrolled;
        public string grade;
        public string semester;
        public Course course;

        public Enrollment(string enrollmentID, DateTime dateEnrolled, string grade, string semester)
        {
            this.enrollmentID = enrollmentID;
            this.dateEnrolled = dateEnrolled;
            this.grade = grade;
            this.semester = semester;
        }

        //CONSTRUCTOR Enrollment with Course
        public Enrollment(string enrollmentID, DateTime dateEnrolled, string grade, string semester, Course course) : this(enrollmentID, dateEnrolled, grade, semester)
        {
            this.course = course;
        }


        //LAB14 relates to IComparable<Enrollment>. 
        public int CompareTo(Enrollment other)
        {
            return this._value.CompareTo(other._value);
        }

        //LAB14 relates to IEquatable<Enrollment>. 
        public bool Equals(Enrollment other)
        {
            return _value == other._value;
        }

        //LAB14 relates to IComparable.
        public int CompareTo(object obj)
        {
            //IF obj is null
            if (obj == null)
                throw new ArgumentNullException("obj");
            //IF obj is NOT of course object
            if (!(obj is Enrollment))
                throw new ArgumentException("Expected CalorieCount instance", "obj");
            return CompareTo((Enrollment)obj);
        }


        ////LAB14
        //public override bool Equals(object obj)
        //{
        //    if (obj == null)
        //        return false;
        //    if (!(obj is Enrollment))
        //        return false;
        //    return _value == ((Enrollment)obj)._value;
        //}

        //LAB14
        public override int GetHashCode()
        {
            return _value.GetHashCode();
        }

        //LAB13 & 14: OVERLOAD ==
        public static bool operator ==(Enrollment x, Enrollment y)
        {
            return object.Equals(x, y);
        }

        //LAB13 & 14: OVERLOAD !=
        public static bool operator !=(Enrollment x, Enrollment y)
        {
            return !object.Equals(x, y);
        }

        //LAB14
        public static bool operator <(Enrollment x, Enrollment y)
        {
            return x._value < y._value;
        }

        //LAB14
        public static bool operator <=(Enrollment x, Enrollment y)
        {
            return x._value <= y._value;
        }

        //LAB14
        public static bool operator >(Enrollment x, Enrollment y)
        {
            return x._value > y._value;
        }

        //LAB14
        public static bool operator >=(Enrollment x, Enrollment y)
        {
            return x._value >= y._value;
        }










        //LAB13: Equals(object
        public override bool Equals(object obj)
        {
            if (obj == null)
                return false;
            if (ReferenceEquals(obj, this))
                return false;
            if (obj.GetType() != this.GetType())
                return false;
            Enrollment tempEnrollment= obj as Enrollment;
            return this.enrollmentID == tempEnrollment.enrollmentID;
        }


        //    if (obj.GetType() != this.GetType())
        //    {
        //        return false;
        //    }
        //    Enrollment tempEnrollment = obj as Enrollment;
        //    return this.enrollmentID == tempEnrollment.enrollmentID;
        //}


            ////LAB13: OVERRIDE GetHashCode
            //public override int GetHashCode()
            //{
            //    return this.enrollmentID.GetHashCode();
            //}


            //ToString
        public override string ToString()
        {
            return string.Format("\nEnrollment Class: ID: {0}, Date: {1}, Grade: {2}, Semester: {3}, {4}", enrollmentID, dateEnrolled, grade, semester, course);

        }


    }
}
