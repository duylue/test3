package service;

import model.Customer;

import java.util.ArrayList;

public interface CustomerService {
    void create(Customer customer);

    void update(Customer customer);
    void del(int cid);
    ArrayList<Customer> read();

    Customer findById(int cid);


}
