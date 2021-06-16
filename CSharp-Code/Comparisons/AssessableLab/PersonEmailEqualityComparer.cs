using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class PersonEmailEqualityComparer : EqualityComparer<Person>
    {
        private static readonly PersonEmailEqualityComparer _instance =
            new PersonEmailEqualityComparer();

        public static PersonEmailEqualityComparer Instance { get { return _instance; } }

        private PersonEmailEqualityComparer() { }

        public override bool Equals(Person x, Person y)
        {
            return x.email.ToUpperInvariant() == y.email.ToUpperInvariant();
        }

        public override int GetHashCode(Person obj)
        {
            return obj.email.ToUpperInvariant().GetHashCode();
        }
    }
}
