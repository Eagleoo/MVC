package dao.vo;

public class Order {
    private String order_id;
    private String username;
    private String mall_id;
    private String order_count;
    private String order_allprice;
    private String consignee;
    private String cellnumber;
    private String address;
    private String ispay;
    private String issend;
    private String isreceive;

    public Order() {
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMall_id() {
        return mall_id;
    }

    public void setMall_id(String mall_id) {
        this.mall_id = mall_id;
    }

    public String getOrder_count() {
        return order_count;
    }

    public void setOrder_count(String order_count) {
        this.order_count = order_count;
    }

    public String getOrder_allprice() {
        return order_allprice;
    }

    public void setOrder_allprice(String order_allprice) {
        this.order_allprice = order_allprice;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getCellnumber() {
        return cellnumber;
    }

    public void setCellnumber(String cellnumber) {
        this.cellnumber = cellnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIspay() {
        return ispay;
    }

    public void setIspay(String ispay) {
        this.ispay = ispay;
    }

    public String getIssend() {
        return issend;
    }

    public void setIssend(String issend) {
        this.issend = issend;
    }

    public String getIsreceive() {
        return isreceive;
    }

    public void setIsreceive(String isreceive) {
        this.isreceive = isreceive;
    }
}
