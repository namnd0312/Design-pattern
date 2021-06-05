package builderPattern;

/**
 * @author nam.nd
 * @created 05/06/2021 - 11:34 PM
 */
public class Test {

    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .setName("NAM")
                .setPhone("0975051376")
                .setAddress("Dong Anh - Ha Noi")
                .setAge("25")
                .setSex("Male")
                .setEmail("namnd@gmail.com")
                .setSchool(new School())
                .build();

        System.out.println(student.toString());
    }
}
