import org.apache.commons.codec.digest.DigestUtils;

public class test {
    public static void main(String[] args) {
        String password="admin";
        String slat = "serein!@#";

        password = DigestUtils.md5Hex(password+slat);

        System.out.println(password);

    }
}
