using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab13
{
    class Person
    {
        public string name;
        public string email;
        public string telNum;
        public Address address;

        ////CONSTRUCTOR Person without Address
        //public Person(string name, string email, string telNum)
        //{
        //    this.name = name;
        //    this.email = email;
        //    this.telNum = telNum;
        //}

        //CONSTRUCTOR Person with Address
        public Person(string name, string email, string telNum, 
            string number, string street, string suburb, string postcode, string state) 
        {
            this.name = name;
            this.email = email;
            this.telNum = telNum;
            this.address = new Address(number, street, suburb, postcode, state);
        }

        //LAB13: OVERLOAD ==
        public static bool operator == (Person x, Person y)
        {
            return object.Equals(x, y);
        }

        //LAB13: OVERLOAD !=
        public static bool operator !=(Person x, Person y)
        {
            return !object.Equals(x, y);
        }

        //LAB13: Equals(object
        public override bool Equals(object obj)
        {
            if(obj == null)
            {
                return false;
            }

            if(ReferenceEquals(obj, this))
            {
                return false;
            }

            if(obj.GetType() != this.GetType())
            {
                return false;
            }
            Person tempPerson = obj as Person;
            //Some families have 1 phone. 
            return this.name == tempPerson.name && this.telNum == tempPerson.telNum;
        }


        //LAB13: OVERRIDE GetHashCode
        public override int GetHashCode()
        {
            return this.name.GetHashCode() ^ this.telNum.GetHashCode();
        }


        //ToString
        public override string ToString()
        {
            return string.Format("\nPerson Class: {0}, {1}, {2}, {3}", name, email, telNum, address);
        }



    }
}
