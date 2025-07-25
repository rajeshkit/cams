package generics;

public interface Complete<T> {
    public T append(T a,T b);
}
class Sample implements  Complete<Byte>{

    @Override
    public Byte append(Byte a, Byte b) {
        return 0;
    }
}
class Sample1 implements  Complete<String>{
    @Override
    public String append(String a, String b) {
        return "";
    }
}
class Sample2 implements  Complete<Character>{

    @Override
    public Character append(Character a, Character b) {
        return null;
    }
}
/*public interface Complete<Long> {
    public Long append(Long a,Long b);
}*/
//public interface Complete<Short> {
//    public Short append(Short a,Short b);
//}

//class Sample implements Complete<Long>{
//
//    @Override
//    public Long append(Long a, Long b) {
//        return 0L;
//    }
//}
//class Sample1 implements  Complete<Short>{
//
//    @Override
//    public Short append(Short a, Short b) {
//        return 0;
//    }
//}