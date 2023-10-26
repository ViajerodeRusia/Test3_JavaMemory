public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Lyapis", "Trubetskoy");
        System.out.println(firstPerson.toString());

        ChangePerson.changePerson(firstPerson);
        System.out.println(firstPerson.toString());

        ChangePerson.changePersonSecond(firstPerson);
        System.out.println(firstPerson.toString());
    }
    }