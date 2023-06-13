package service.impl;

import file.MyFile;
import model.Customer;
import service.CustomerService;

import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService {
    private MyFile myFile;
    private ArrayList<Customer> customerList;

    public CustomerServiceImpl() {
        try {
            myFile = new MyFile();
            customerList = myFile.getCusFromFile();
        } catch (Exception e) {
            customerList = new ArrayList<>();

        }

    }

    @Override
    public ArrayList<Customer> read() {
        if (!customerList.isEmpty()) {
            customerList = myFile.getCusFromFile();
        }else {
            myFile.wireCusToFile(customerList);
        }
        return customerList;
    }

    @Override
    public void create(Customer customer) {
        if (customerList.isEmpty()){
            myFile.wireCusToFile(customerList);

        }
        customerList.add(customer);
        myFile.wireCusToFile(customerList);

    }

    @Override
    public void update(Customer customer) {
        if (customerList.isEmpty()){
            System.out.println("No Data");
            return;
        }
        for (Customer c : customerList
        ) {
            if (c.getCid() == customer.getCid()) {
                c.setPhone(customer.getPhone());
                c.setFullName(customer.getFullName());
                c.setAddress(customer.getAddress());
            }
        }
        myFile.wireCusToFile(customerList);

    }

    @Override
    public Customer findById(int cid) {
        if (customerList.isEmpty()){
            System.out.println("No Data");
            return null;
        }
        for (Customer c : customerList
        ) {
            if (c.getCid() == cid) {
            return c;
            }
        }
        return null;
    }

    @Override
    public void del(int cid) {
        if (customerList.isEmpty()){
            System.out.println("No Data");
            return;
        }
        for (int i = 0; i < customerList.size(); i++) {
            if (cid == customerList.get(i).getCid()) {
                customerList.remove(i);
                break;
            }
        }
        myFile.wireCusToFile(customerList);
    }


}
