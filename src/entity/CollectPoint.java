package entity;

public class CollectPoint {

    private final Double latitude;
    private final Double longitute;
    private final String nome;
    private final String email;
    private final String cidade;
    private final String tipoResiduo;
    private int id;

    public CollectPoint(String nome, String email, String cidade, String tipoResiduo, Double latitude, Double longitude) {

        this.id = id;
        this.latitude = latitude;
        this.longitute = longitude;
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.tipoResiduo = tipoResiduo;
    }

    public CollectPoint(String nome, Double latitude, Double longitude) {

        this.latitude = latitude;
        this.nome = nome;
        this.longitute = longitude;

    }

    public int getId() {
        return id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitute() {
        return longitute;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCidade() {
        return cidade;
    }

    public String getTipoResiduo() {
        return tipoResiduo;
    }

}
