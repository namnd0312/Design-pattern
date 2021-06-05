package builderPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 11:27 PM
 */
public class StudentBuilder implements IStudentBuilder {

    private String name;

    private String age;

    private String sex;

    private String phone;

    private String email;

    private String address;

    private School school;

    @Override
    public IStudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IStudentBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    @Override
    public IStudentBuilder setSex(String sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public IStudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public IStudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public IStudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public IStudentBuilder setSchool(School school) {
        this.school = school;
        return this;
    }

    @Override
    public Student build() {
        return new Student(name, age, sex, phone, email, address, school);
    }
}
