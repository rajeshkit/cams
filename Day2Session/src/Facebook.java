public class Facebook {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<0){
            this.id=0;
        }else {
            this.id = id;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username.contains("@")){
            this.username="USER";
        }else {
            this.username = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.contains("%")){
            this.password="123";
        }else {
            this.password = password;
        }
    }
}
