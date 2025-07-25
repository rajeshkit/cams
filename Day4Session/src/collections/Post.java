package collections;

import jdk.jfr.ContentType;
import jdk.jfr.Enabled;

import java.lang.annotation.Inherited;
import java.lang.annotation.Native;
import java.time.LocalDateTime;
@SuppressWarnings("dfdnfn")
@Mark
public class Post {
    @Native
    @Mark
    private int k;
    private int id;
    private String msg;
    private LocalDateTime when;
    @Mark
    public Post() {
    }
    @Deprecated(since = "java 8",forRemoval = true)
    public Post(int id, String msg, LocalDateTime when) {
        this.id = id;
        this.msg = msg;
        this.when = when;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getWhen() {
        return when;
    }
    public void setWhen(LocalDateTime when) {
        this.when = when;
    }
    @Mark
    @Override // Meta data about your method
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", when=" + when +
                '}';
    }


}
