package hcs.web.test.model;

/**
 * Created by Leon on 2015/12/30.
 */
public class UserEntity {
    private String user = "guest";
    private String pwd = "";

    private boolean valid = false;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}

