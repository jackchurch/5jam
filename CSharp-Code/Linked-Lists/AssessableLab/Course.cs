using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class Course : IComparable<Course>, IEquatable<Course>, IComparable
    {
        private float _value;
        public float Value { get { return _value; } }
        public string courseCode;
        public string courseName;
        //Cost can change depending on student and can't be used for comparision. i.e. cost may vary for student international, domestic, NDIS, government 
        public double cost;

        //CONSTRUCTOR
        public Course(string courseCode, string courseName, double cost)
        {
            this.courseCode = courseCode;
            this.courseName = courseName;
            this.cost = cost;
        }

        //LAB14 relates to IComparable<Course>. 
        public int CompareTo(Course other)
        {
            return this._value.CompareTo(other._value);
        }

        //LAB14 relates to IEquatable<Course>. 
        public bool Equals(Course other)
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
            if (!(obj is Course))
                throw new ArgumentException("Expected CalorieCount instance", "obj");
            return CompareTo((Course)obj);
        }

        
        ////LAB14
        //public override bool Equals(object obj)
        //{
        //    if (obj == null)
        //        return false;
        //    if (!(obj is Course))
        //        return false;
        //    return _value == ((Course)obj)._value;
        //}






        //LAB14
        public override int GetHashCode()
        {
            return _value.GetHashCode();
        }


        //LAB13 & 14: OVERLOAD ==
        public static bool operator ==(Course x, Course y)
        {
            return object.Equals(x, y);
        }

        //LAB13 & 14: OVERLOAD !=
        public static bool operator !=(Course x, Course y)
        {
            return !object.Equals(x, y);
        }

        //LAB14
        public static bool operator <(Course x, Course y)
        {
            return x._value < y._value;
        }

        //LAB14
        public static bool operator <=(Course x, Course y)
        {
            return x._value <= y._value;
        }

        //LAB14
        public static bool operator >(Course x, Course y)
        {
            return x._value > y._value;
        }

        //LAB14
        public static bool operator >=(Course x, Course y)
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
            Course tempCourse = obj as Course;
            return this.courseCode == tempCourse.courseCode;
        }

        ////LAB13: OVERRIDE GetHashCode
        //public override int GetHashCode()
        //{
        //    return this.courseCode.GetHashCode();
        //}


        //ToString
        public override string ToString()
        {
            return string.Format("\nCourse Class: Code: {0}, Name: {1}, Cost: {2}", courseCode, courseName, cost);
        }


    }
}
