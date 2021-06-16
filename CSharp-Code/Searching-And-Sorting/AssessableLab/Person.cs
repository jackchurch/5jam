using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class Person : IComparable<Person>, IEquatable<Person>, IComparable
    {
        private float _value;
        public float Value { get { return _value; } }
        public string name;
        public string email;
        public string telNum;
        public Address address;

        //CONSTRUCTOR Person without Address
        public Person(string name, string email, string telNum)
        {
            this.name = name;
            this.email = email;
            this.telNum = telNum;
        }

        //CONSTRUCTOR Person with Address
        public Person(string name, string email, string telNum,
            string number, string street, string suburb, string postcode, string state)
        {
            this.name = name;
            this.email = email;
            this.telNum = telNum;
            this.address = new Address(number, street, suburb, postcode, state);
        }





        //LAB14 relates to IComparable<Person>. 
        public int CompareTo(Person other)
        {
            return this._value.CompareTo(other._value);
        }

        //LAB14 relates to IEquatable<Person>. 
        public bool Equals(Person other)
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
            if (!(obj is Person))
                throw new ArgumentException("Expected CalorieCount instance", "obj");
            return CompareTo((Person)obj);
        }

        //LAB14 relates to 
        public int CompareTo(Address other)
        {
            throw new NotImplementedException();
        }



        ////LAB14
        //public override bool Equals(object obj)
        //{
        //    if (obj == null)
        //        return false;
        //    if (!(obj is Person))
        //        return false;
        //    return _value == ((Person)obj)._value;
        //}

        //LAB14
        public override int GetHashCode()
        {
            return _value.GetHashCode();
        }

        //LAB13 & 14: OVERLOAD ==
        public static bool operator ==(Person x, Person y)
        {
            return object.Equals(x, y);
        }

        //LAB13 & 14: OVERLOAD !=
        public static bool operator !=(Person x, Person y)
        {
            return !object.Equals(x, y);
        }

        //LAB14
        public static bool operator <(Person x, Person y)
        {
            return x._value < y._value;
        }

        //LAB14
        public static bool operator <=(Person x, Person y)
        {
            return x._value <= y._value;
        }

        //LAB14
        public static bool operator >(Person x, Person y)
        {
            return x._value > y._value;
        }

        //LAB14
        public static bool operator >=(Person x, Person y)
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
            Person tempPerson = obj as Person;
            //Some families have 1 phone. 
            return this.name == tempPerson.name && this.telNum == tempPerson.telNum;
        }


        ////LAB13: OVERRIDE GetHashCode
        //public override int GetHashCode()
        //{
        //    return this.name.GetHashCode() ^ this.telNum.GetHashCode();
        //}


        //ToString
        public override string ToString()
        {
            return string.Format("\nPerson Class: {0}, {1}, {2}", name, email, telNum);
        }


    }
}
