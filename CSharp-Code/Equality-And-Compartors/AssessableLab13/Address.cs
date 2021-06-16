using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab13
{
    /*Number
     * Street
     * Suburb
     * Postcode
     * State
     */

    class Address
    {
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




        //LAB13: OVERLOAD ==
        public static bool operator ==(Address x, Address y)
        {
            return object.Equals(x, y);
        }

        //LAB13: OVERLOAD !=
        public static bool operator !=(Address x, Address y)
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
            Address tempAddress = obj as Address;
            return this.number == tempAddress.number 
                && this.street == tempAddress.street 
                && this.suburb == tempAddress.suburb;
        }


        //LAB13: OVERRIDE GetHashCode
        public override int GetHashCode()
        {
            return this.number.GetHashCode() ^ this.street.GetHashCode() ^ this.suburb.GetHashCode();
        }


        //ToString
        public override string ToString()
        {   
            return string.Format("\nAddress Class: Number: {0}, Street: {1}, Suburb: {2}, Postcode: {3}, State: {4}", number, street, suburb, postcode, state);

        }

    }
}
