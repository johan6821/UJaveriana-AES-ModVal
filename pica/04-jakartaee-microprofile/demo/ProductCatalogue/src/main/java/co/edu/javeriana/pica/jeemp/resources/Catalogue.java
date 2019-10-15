package co.edu.javeriana.pica.jeemp.resources;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Catalogue {

    @Id
    private long id;
    private String brand;
    private String product;
    private long price;

    public Catalogue(String brand, String product, long price) {
        this.brand = brand;
        this.product = product;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getProduct() {
        return product;
    }

    public long getPrice() {
        return price;
    }
}
