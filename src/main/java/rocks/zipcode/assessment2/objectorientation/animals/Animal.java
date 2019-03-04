package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

import java.security.acl.Owner;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal extends Person {
    Long id;
    Owner owner;
    public Animal() {
        this.id =null;
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.id =id;
        this.owner=null;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id =id;
    }

    public Person getOwner() {

        return (Person) owner;
    }

    public void setOwner(Person owner) {
        this.owner= (Owner) owner;
    }

    public Address getAddress() {

        return null;
    }
}
