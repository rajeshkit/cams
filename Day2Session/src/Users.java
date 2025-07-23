import java.time.LocalDateTime;

public class Users {
    public void display(Post p){

    }
    public static void main(String[] args) {
          SocialMedia socialMedia=new SocialMedia();
//        socialMedia.facebook1(100,"Happy Birthday",LocalDateTime.now());
//        //pass by value
        Post post=new Post(); //10101010
        post.setPostId(100);
        post.setPostMessage("Happy Birthday");
        post.setWhen(LocalDateTime.now());
                        //  10101010
        Users user=new Users();
        user.display(post);
       // socialMedia.facebook(post);// pass by reference
        Post post1=new Post(); //20202020
        post1.setPostId(101);
        post1.setPostMessage("congradulations");
        post1.setWhen(LocalDateTime.now());
        //socialMedia.facebook(post1);
        Post post2=new Post(); //20202020
        post2.setPostId(101);
        post2.setPostMessage("Best Wishes");
        post2.setWhen(LocalDateTime.now());
       // socialMedia.facebook(post2);

        Post[] listOfPosts=new Post[3];
        listOfPosts[0]=post;
        listOfPosts[1]=post1;
        listOfPosts[2]=post2;

        socialMedia.facebook(listOfPosts);

    }
}
