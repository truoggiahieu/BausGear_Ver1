package model;

/**
 *
 * @author tanks
 */
public class Orders {

    private int id;
    private String customersname;
    private int orderstatus;
    private int total;
    private boolean payment;
    private String date;
    private int idcus;
    private String enddate;
    private String phone;
    private String address;
    private String email;
    private int idAdmin;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdcus() {
        return idcus;
    }

    public void setIdcus(int idcus) {
        this.idcus = idcus;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomersname() {
        return customersname;
    }

    public void setCustomersname(String customersname) {
        this.customersname = customersname;
    }

    public int isOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(int orderstatus) {
        this.orderstatus = orderstatus;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Orders() {
    }

    public Orders(int id, String customersname, int orderstatus, int total, boolean payment, String date, int idcus, String enddate, String phone, String address, String email, int idAdmin) {
        this.id = id;
        this.customersname = customersname;
        this.orderstatus = orderstatus;
        this.total = total;
        this.payment = payment;
        this.date = date;
        this.idcus = idcus;
        this.enddate = enddate;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.idAdmin = idAdmin;
    }

    public Orders(String customersname, int orderstatus, int total, boolean payment, String date, int idcus, String enddate, String phone, String address, String email, int idAdmin) {

        this.customersname = customersname;
        this.orderstatus = orderstatus;
        this.total = total;
        this.payment = payment;
        this.date = date;
        this.idcus = idcus;
        this.enddate = enddate;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.idAdmin = idAdmin;
    }

    public Orders(int id, String customersname, String status, int total, boolean payment, String date, int idcus, String enddate, String phone, String address, String email, int idAdmin) {
        this.id = id;
        this.customersname = customersname;
        this.status = status;
        this.total = total;
        this.payment = payment;
        this.date = date;
        this.idcus = idcus;
        this.enddate = enddate;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.idAdmin = idAdmin;
    }
}