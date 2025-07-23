import java.time.LocalDateTime;

public class SocialMedia {
                        //10101010
    public void facebook(Post p){
        // logic to post message into the facebook
        System.out.println("facebook has posted your message");
        System.out.println(p.getPostId());
        System.out.println(p.getPostMessage());
        System.out.println(p.getWhen());

    }
    public void facebook(Post[] p){
        // logic to post message into the facebook
        System.out.println("facebook has posted your message");
        for (int i = 0; i < p.length-1 ; i++) {
            System.out.println(p[i].getPostId());
            System.out.println(p[i].getPostMessage());
            System.out.println(p[i].getWhen());
        }


    }
    public void facebook1(int pId, String pMessage, LocalDateTime w){
        // logic to post message into the facebook
        System.out.println("facebook1 has posted your message");
        System.out.println(pId);
        System.out.println(pMessage);
        System.out.println(w);

    }
//    public void instagram(Post p){
//        // logic to post message into the facebook
//        System.out.println("instagram has posted your message");
//        System.out.println(p.getPostId());
//        System.out.println(p.getPostMessage());
//        System.out.println(p.getWhen());
//
//    }
}
