using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    /*Number
     * Street
     * Suburb
     * Postcode
     * State
     */

    class Address : IComparable<Address>, IEquatable<Address>, IComparable
    {
        private float _value;
        public float Value { get { return _value; } }
        public string number;
        public string street;
        public string suburb;
        public string postcode;
        public string state;

        //CONSTRUCTOR Address(string, string, string, string, string
        public Address(string number, string street, string suburb, string postcode, string state)
        {
            this.number = number;
            this.street = street;
            this.suburb = suburb;
            this.postcode = postcode;
            this.state = state;
        }




        //LAB14 relates to IComparable<Address>. 
        public int CompareTo(Address other)
        {
            return this._value.CompareTo(other._value);
        }

        //LAB14 relates to IEquatable<Address>. 
        public bool Equals(Address other)
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
            if (!(obj is Address))
                throw new ArgumentException("Expected CalorieCount instance", "obj");
            return CompareTo((Address)obj);
        }


        ////LAB14
        //public override bool Equals(object obj)
        //{
        //    if (obj == null)
        //        return false;
        //    if (!(obj is Address))
        //        return false;
        //    return _value == ((Address)obj)._value;
        //}

        //LAB14
        public override int GetHashCode()
        {
            return _value.GetHashCode();
        }

        //LAB13 & 14: OVERLOAD ==
        public static bool operator ==(Address x, Address y)
        {
            return object.Equals(x, y);
        }

        //LAB13 & 14: OVERLOAD !=
        public static bool operator !=(Address x, Address y)
        {
            return !object.Equals(x, y);
        }

        //LAB14
        public static bool operator <(Address x, Address y)
        {
            return x._value < y._value;
        }

        //LAB14
        public static bool operator <=(Address x, Address y)
        {
            return x._value <= y._value;
        }

        //LAB14
        public static bool operator >(Address x, Address y)
        {
            return x._value > y._value;
        }

        //LAB14
        public static bool operator >=(Address x, Address y)
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
            Address tempAddress = obj as Address;
            return this.number == tempAddress.number
                && this.street == tempAddress.street
                && this.suburb == tempAddress.suburb;
        }


        ////LAB13: OVERRIDE GetHashCode
        //public override int GetHashCode()
        //{
        //    return this.number.GetHashCode() ^ this.street.GetHashCode() ^ this.suburb.GetHashCode();
        //}


        //ToString
        public override string ToString()
        {
            return string.Format("\nAddress Class: Number: {0}, Street: {1}, Suburb: {2}, Postcode: {3}, State: {4}", number, street, suburb, postcode, state);

        }

    }
}
