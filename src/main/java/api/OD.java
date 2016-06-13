package api;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class OD {
    public String departure;
    public String arrival;

    public OD(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
}
