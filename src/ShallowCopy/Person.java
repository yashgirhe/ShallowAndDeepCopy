package ShallowCopy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Overriding clone() method to create a shallow copy
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
