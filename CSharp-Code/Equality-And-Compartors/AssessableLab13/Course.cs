using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab13
{
    class Course
    {
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

        //LAB13: OVERLOAD ==
        public static bool operator ==(Course x, Course y)
        {
            return object.Equals(x, y);
        }

        //LAB13: OVERLOAD !=
        public static bool operator !=(Course x, Course y)
        {
            return !object.Equals(x, y);
        }

        //LAB13: Equals(object
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (ReferenceEquals(obj, this))
            {
                return false;
            }

            if (obj.GetType() != this.GetType())
            {
                return false;
            }
            Course tempCourse = obj as Course;
            return this.courseCode == tempCourse.courseCode;
        }


        //LAB13: OVERRIDE GetHashCode
        public override int GetHashCode()
        {
            return this.courseCode.GetHashCode();
        }


        //ToString
        public override string ToString()
        {
            return string.Format("\nCourse Class: Code: {0}, Name: {1}, Cost: {2}", courseCode, courseName, cost);
        }




    }
}
