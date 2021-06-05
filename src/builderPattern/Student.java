package builderPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 11:13 PM
 */
public class Student {

    private String name;

    private String age;

    private String sex;

    private String phone;

    private String email;

    private String address;

    private School school;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public School getSchool() {
        return school;
    }

    public Student() {
    }

    public Student(String name, String age, String sex, String phone, String email, String address, School school) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.school = school;
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + ", "
                + "age: " + this.getAge()+ ", "
                + "address: " + this.address+ ", "
                + "sex: " + this.getSex()+ ", "
                + "phone: " + this.getPhone()+ ", "
                + "email: " + this.email+ ", "
                + "address: " + this.address+ ", "
                +"school: " + this.school+ ", ";
    }
}
