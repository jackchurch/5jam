using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class PersonTelNumEqualityComparer : EqualityComparer<Person>
    {
        private static readonly PersonTelNumEqualityComparer _instance =
            new PersonTelNumEqualityComparer();

        public static PersonTelNumEqualityComparer Instance { get { return _instance; } }

        private PersonTelNumEqualityComparer() { }

        public override bool Equals(Person x, Person y)
        {
            return x.telNum.ToUpperInvariant() == y.telNum.ToUpperInvariant();
        }

        public override int GetHashCode(Person obj)
        {
            return obj.telNum.ToUpperInvariant().GetHashCode();
        }
    }
}
