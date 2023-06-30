package converter;

import model.User;
import model.UserRole;
import model.UserStatus;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Ignore
public class UserToStringConverterTest {

    private final UserToStringConverter userToStringConverter = new UserToStringConverter();

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNull() {
        userToStringConverter.convert(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertFieldsNull() {
        User user = new User(null, null, null, null, null, null);

        userToStringConverter.convert(user);
    }

    @Test
    public void testConvert() {
        String expected = "igor=igor_password=ihar=osipov=ADMIN=ACTIVE";
        User user = new User(
                "igor",
                "igor_password",
                "ihar",
                "osipov",
                UserRole.ADMIN,
                UserStatus.ACTIVE,
        "email", id);

        String actual = userToStringConverter.convert(user);

        assertNotNull(actual);
        assertEquals(expected, actual);
    }
}
