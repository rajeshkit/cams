package sortingcollection;

import collections.Post;

import java.util.Comparator;

public class PostMessageComparator implements Comparator<Post> {
    @Override
    public int compare(Post o1, Post o2) {
        return o1.getMsg().compareTo(o2.getMsg());
    }
}
