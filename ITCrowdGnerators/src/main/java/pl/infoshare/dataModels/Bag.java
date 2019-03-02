package pl.infoshare.dataModels;

public class Bag {
    private String category;
    private String collection;
    private String name;
    private Boolean avaliable;
    private Integer price;
    private Integer weight;
    private Integer height;
    private Integer width;
    private Integer lenght;

    public Bag(String category, String  collection, String name, Boolean avaliable, Integer price, Integer weight, Integer height, Integer width, Integer lenght) {
        this.category = category;
        this.collection = collection;
        this.name = name;
        this.avaliable = avaliable;
        this.price = price;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }

    public String bagItem() {
        return "Bag{" +
                "category=" + category + '\n' +
                ", collection='" + collection + '\n' +
                ", name='" + name + '\n' +
                ", avaliable='" + avaliable + '\n' +
                ", price='" + price + '\n' +
                ", weight='" + price + '\n' +
                ", height='" + price + '\n' +
                ", width='" + width + '\n' +
                ", lenght='" + lenght + '\n' +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public String getCollection() {
        return collection;
    }
}
