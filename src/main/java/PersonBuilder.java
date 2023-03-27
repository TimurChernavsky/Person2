
public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String city;


    public PersonBuilder setName(String name1) {
        PersonBuilder.this.name = name1;

        return PersonBuilder.this;
    }

    public PersonBuilder setSurname(String surname1) { /*...*/

        PersonBuilder.this.surname = surname1;

        return PersonBuilder.this;
    }

    public PersonBuilder setAge(int age1) { /*...*/

        PersonBuilder.this.age = age1;
        return PersonBuilder.this;

    }

    public PersonBuilder setAddress(String address1) { /*...*/

        PersonBuilder.this.city = address1;

        return PersonBuilder.this;

    }

    public Person build() { /*...*/
       Person person = new Person(name, surname, age, city);
        if (!person.hasAge()) {
            throw new IllegalStateException("данные возраста введены неверно");
        } else if (!person.hasAddress()) {
            throw new IllegalStateException("данные адреса введены неверно");
        }
        return person;

    }
}
