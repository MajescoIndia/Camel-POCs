import org.junit.Test;

/**
 * Created by BIPLAB on 9/27/2015.
 */
public class TestLength {

    @Test
    public void testLengt() {
        String a = "{\"salutation\":\"Mr\",\"firstName\":\"Biplab\",\"lastName\":\"Nayak\",\"userName\":\"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\",\"email\":\"biplab.nayak@majesco.com\",\"gender\":\"Male\",\"dob\":\"16-09-1990\",\"address\":{\"addressLine\":\"Address Line\",\"city\":\"Mumbai\",\"state\":\"Maharastra\",\"country\":\"In";
        String b = "{\"salutation\":\"Mr\",\"firstName\":\"Biplab\",\"lastName\":\"Nayak\",\"userName\":\"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\",\"email\":\"biplab.\",\"gender\":\"Male\",\"dob\":\"16-09-1990\",\"address\":{\"addressLine\":\"Address Line\",\"city\":\"Mumbai\",\"state\":\"Maharastra\",\"countr";
        System.out.println(a.length());
    }
}
