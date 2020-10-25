public class PersonBuilder {
    public String name;
    public String surname;
    public int age;
    public String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Некорректный возраст!");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        try {
            String name = this.name;
            String surname = this.surname;
        } catch (IllegalStateException e) {
            System.out.println("Введеные вами данные неккоректны! Проверьте имя и фамилию.");
        }
        int age = this.age;
        String address = this.address;
        return new Person(name, surname, age, address);
    }
}
