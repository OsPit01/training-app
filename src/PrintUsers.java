import java.util.Set;

public class PrintUsers {
    public void commandPrintUsers() {

        Set<String> userNames = UserContainer.getUsers().keySet();
        for (String userName : userNames) {
            System.out.print("username" + " " + userName  + "\n");
        }
    }
}
