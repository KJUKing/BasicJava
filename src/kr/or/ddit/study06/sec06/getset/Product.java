package kr.or.ddit.study06.sec06.getset;

public class Product {
    // 상품이름, 상품타입 제조년월 상품설명

    private String name;
    private String type;
    private String bir_Day;
    private String prod_Info;

    public Product(String name, String type, String bir_Day, String prod_Info) {
        this.name = name;
        this.type = type;
        this.bir_Day = bir_Day;
        this.prod_Info = prod_Info;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBir_Day() {
        return bir_Day;
    }

    public String getProd_Info() {
        return prod_Info;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", bir_Day='" + bir_Day + '\'' +
                ", prod_Info='" + prod_Info + '\'' +
                '}';
    }
}
