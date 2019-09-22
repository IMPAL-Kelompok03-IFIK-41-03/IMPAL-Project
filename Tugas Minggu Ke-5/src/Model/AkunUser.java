package Model;

/**
 *
 * @author Ifdhal Hadi
 * 
 */
public class AkunUser {
    private String email;
    private String password;
    private String user;

    public AkunUser(String email, String password, String user) {
        this.email = email;
        this.password = password;
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public void registrasi() {
        
    }
}
