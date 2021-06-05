package builderPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 11:23 PM
 */
public interface IStudentBuilder {

    IStudentBuilder setName(String name);

    IStudentBuilder setAge(String age);

    IStudentBuilder setSex(String sex);

    IStudentBuilder setPhone(String phone);

    IStudentBuilder setEmail(String email);

    IStudentBuilder setAddress(String address);

    IStudentBuilder setSchool(School school);

    Student build();
}
