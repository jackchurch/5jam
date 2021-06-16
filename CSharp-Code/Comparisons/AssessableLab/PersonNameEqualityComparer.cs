using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssessableLab
{
    class PersonNameEqualityComparer : EqualityComparer<Person>
    {
        private static readonly PersonNameEqualityComparer _instance =
            new PersonNameEqualityComparer();

        public static PersonNameEqualityComparer Instance { get { return _instance; } }

        private PersonNameEqualityComparer() { }

        public override bool Equals(Person x, Person y)
        {
            return x.name.ToUpperInvariant() == y.name.ToUpperInvariant();
        }

        public override int GetHashCode(Person obj)
        {
            return obj.name.ToUpperInvariant().GetHashCode();
        }
    }
}
