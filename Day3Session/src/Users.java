import java.time.LocalDateTime;

public class Users {
    int userId=45;
    public void userData(){

    }
    public static void main(String[] args) {
       Post post=new Post();
       post.setId(3455);
       post.setMessage("Welcome");
       post.setWhen(LocalDateTime.now());
       System.out.println(post.toString());
        System.out.println(post.hashCode());
    }
}
