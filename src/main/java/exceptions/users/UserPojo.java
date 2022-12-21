package exceptions.users;

public class UserPojo {
    private int id;
    private String userName;
    private String password;
    private boolean active;
    private boolean signedIn;
    private static int sayac = 101;

    public UserPojo() {
    }

    public UserPojo(String userName,String password) {
        setId();
        this.userName = userName;
        this.password=password;
        setActive(true);
        setSignedIn(true);

    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = sayac++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User Info ==>" +"id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                "\n";
    }
}
