package sortingcollection;

import collections.Post;

import java.util.Comparator;

public class PostIdComparator implements Comparator<Post> {
    @Override
    public int compare(Post o1, Post o2) {
          return o1.getId()-o2.getId();
    }
}


