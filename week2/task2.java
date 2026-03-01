import java.util.*;
class task2 {
    String name;
    int age;
    task2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static boolean isOlderThanLimit(task2 p, int limit) {
        return p.age > limit;
    }
}

class PersonStreamDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            persons.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();
        persons.stream()
                .map(Person::getName)
                .sorted(String::compareTo)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();
        persons.stream()
                .filter(p -> Person.isOlderThanLimit(p, ageLimit))
                .map(Person::getName)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();
        persons.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        sc.close();
    }
}
