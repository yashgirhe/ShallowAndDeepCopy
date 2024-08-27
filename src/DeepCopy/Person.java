package DeepCopy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Deep copy for the Address class
    public Address deepCopy() {
        return new Address(this.city);
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Overriding clone() method to create a deep copy
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = this.address.deepCopy();
        return cloned;
    }
}

