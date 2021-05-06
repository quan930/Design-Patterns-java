package cn.lilq.designmode.builder;

/**
 * @auther: Li Liangquan
 * @date: 2021/5/6 22:43
 */
public class Book {
    private String name;
    private Double price;

    public Book() {
    }

    public static Book.Builder builder() {
        return new Book.Builder();
    }

    private Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static class Builder{
        private String name;
        private Double price;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public Book build(){
            return new Book(name,price);
        }
    }
}
