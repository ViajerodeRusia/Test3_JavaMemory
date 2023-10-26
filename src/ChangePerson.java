public class ChangePerson {
    public static void changePerson(Person person) {
        Person newPerson = new Person("Ilya","Lagutenko");
        person = newPerson;
    }
    public static void changePersonSecond(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}
