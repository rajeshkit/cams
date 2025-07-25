package sortingcollection;

import collections.Post;

import java.util.Comparator;

public class PostDateTimeComparator implements Comparator<Post> {
    @Override
    public int compare(Post o1, Post o2) {
        return o1.getWhen().compareTo(o2.getWhen());
    }
}
