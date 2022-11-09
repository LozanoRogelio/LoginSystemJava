import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("Roger", "pizza");
        logininfo.put("Rogelio", "ham");
        logininfo.put("Roy", "abc123");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}

