package DeepCopy;

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person person1 = new Person("John", address);

        // Creating a deep copy of person1
        Person person2 = (Person) person1.clone();

        // Modify the address in person2
        person2.address.city = "San Francisco";

        // person1 remains unaffected
        System.out.println(person1.address.city); // Output: New York
        System.out.println(person2.address.city); // Output: San Francisco
    }
}