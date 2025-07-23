package collectiondemo;

import java.util.Comparator;

public class CustomerPhoneComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getPhone().compareTo(o2.getPhone());
    }
}
