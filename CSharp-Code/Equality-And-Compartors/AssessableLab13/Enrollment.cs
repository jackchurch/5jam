using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab13
{
    class Enrollment
    {
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



        //LAB13: OVERLOAD ==
        public static bool operator ==(Enrollment x, Enrollment y)
        {
            return object.Equals(x, y);
        }

        //LAB13: OVERLOAD !=
        public static bool operator !=(Enrollment x, Enrollment y)
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
            Enrollment tempEnrollment = obj as Enrollment;
            return this.enrollmentID == tempEnrollment.enrollmentID;
        }


        //LAB13: OVERRIDE GetHashCode
        public override int GetHashCode()
        {
            return this.enrollmentID.GetHashCode();
        }


        //ToString
        public override string ToString()
        {
            return string.Format("\nEnrollment Class: ID: {0}, Date: {1}, Grade: {2}, Semester: {3}, {4}", enrollmentID, dateEnrolled, grade, semester, course);

        }


    }
}
