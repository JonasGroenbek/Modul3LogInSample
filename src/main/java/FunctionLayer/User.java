package FunctionLayer;

public class User {

    public User( String email, String password, int role ) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    private int id; 
    private String email;
    private String password; 
    private int role;

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole( int role ) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + '}';
    }

}
