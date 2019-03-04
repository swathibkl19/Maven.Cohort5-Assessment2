package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> {
    Shelter<Ageable> shelterHouse = new Shelter<Ageable>();
    public Shelter() {
        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return -1;
    }

    public void add(Object object) {

        shelterHouse.add(object);

        }

    public Boolean contains(Object object) {

        return (Boolean)object;
    }

    public void remove(Object object) {
    }

    public Object get(Integer index) {

        return index;
    }

    public Integer getIndexOf(Object ageable) {

        return 0;
    }
}