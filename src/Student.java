public class Student {
    private String name;
    private String email;
    private Address address = new Address();
    private Course course = new Course();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public Course getCourse() {
        return course;
    }
}
