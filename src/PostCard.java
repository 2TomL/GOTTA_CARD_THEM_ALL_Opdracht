import java.util.Objects;

public class PostCard {
    private String country;
    private String continent;

    public PostCard(String country, String continent) {
        this.country = country;
        this.continent = continent;
    }

    public String getCountry() {

        return country;
    }

    public String getContinent() {

        return continent;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public void setContinent(String continent) {

        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//if (o==null || getClass() !=o.getClass())return false;
//PostCard postCard = (PostCard) o;
        if (!(o instanceof PostCard postCard)) return false;
//        return Objects.equals(postCard.country) &&
//                Objects.equals(postCard.continent);
        return country.equals(postCard.country) &&
                continent.equals(postCard.continent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country, continent);
    }

    @Override
    public String toString() {
        return "PostCard{" +
                "country='" + country + '\'' +
                ", continent='" + continent + '\'' +
                '}'+"\n";
    }
}
