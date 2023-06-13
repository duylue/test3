package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {
  private int cid;
  private String fullName;
  private String address;
  private String phone;

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Customer() {
    }

    public Customer(int cid, String fullName, String address, String phone) {
        this.cid = cid;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
    }
}
