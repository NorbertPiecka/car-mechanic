package pw.norbert.car.mechanic.model;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Float price;
    private Integer millage;
    private String yearbook;
    private String color;
    private String vin;
    private String photo;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "gearbox_id", referencedColumnName = "id")
    private Gearbox gearbox;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "engine_id", referencedColumnName = "id")
    private Engine engine;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getMillage() {
        return millage;
    }

    public void setMillage(Integer millage) {
        this.millage = millage;
    }

    public String getYearbook() {
        return yearbook;
    }

    public void setYearbook(String yearbook) {
        this.yearbook = yearbook;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
