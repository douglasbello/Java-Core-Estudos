package entities;

public class Bla {
    private String name;
    private Double umdoistres;

    public Bla(String name, Double umdoistres) {
        this.name = name;
        this.umdoistres = umdoistres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUmdoistres() {
        return umdoistres;
    }

    public void setUmdoistres(Double umdoistres) {
        this.umdoistres = umdoistres;
    }
}
