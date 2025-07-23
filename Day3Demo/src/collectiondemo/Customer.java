package collectiondemo;

import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

public class Customer implements Closeable {
    private int id;
    private String name;
    private String email;
    private String phone;
    public Customer() {
    }

    public Customer(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name)
                && Objects.equals(email, customer.email)
                && Objects.equals(phone, customer.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phone);
    }


    @Override
    public void close() throws IOException {

    }
}
