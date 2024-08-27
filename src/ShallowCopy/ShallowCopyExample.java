package ShallowCopy;

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person person1 = new Person("John", address);

        // Creating a shallow copy of person1
        Person person2 = (Person) person1.clone();

        // Modify the address in person2
        person2.address.city = "San Francisco";

        // This change reflects in both person1 and person2
        System.out.println(person1.address.city); // Output: San Francisco
        System.out.println(person2.address.city); // Output: San Francisco
    }
}