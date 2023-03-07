package home_work_3.project_tv;

import java.util.Objects;

public class TV {
    private String manufacturer;
    private String model;
    private int releaseYear;
    private int diagonal;
    private int price;

    public TV(String manufacturer, String model, int releaseYear, int diagonal, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.releaseYear = releaseYear;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return releaseYear == tv.releaseYear && diagonal == tv.diagonal && price == tv.price
                && Objects.equals(manufacturer, tv.manufacturer) && Objects.equals(model, tv.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, releaseYear, diagonal, price);
    }
}
