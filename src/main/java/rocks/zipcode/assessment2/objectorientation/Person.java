package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person extends Address {
    Long id;
    String name;
    Address address;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    Address instAddress= new Address();
    public Person(Long id, String name, Address address) {
        this.id =id;
        this.name=name;
        //super.address=super.getAddressLine1();
    }

    public Person() {
        this.id =Long.MIN_VALUE;
        this.name="";
       // this.address=super.getAddressLine1();
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id =id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
       this.instAddress.getAddressLine1();
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }
}