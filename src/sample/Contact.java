package sample;

/**
 * Created by scofieldservices on 11/30/16.
 */
public class Contact {

    String name;
    String phone;
    String email;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
