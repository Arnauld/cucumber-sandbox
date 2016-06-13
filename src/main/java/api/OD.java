package api;

import java.util.Date;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class OD {
    private String departure;
    private String arrival;
    private Date when;

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

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setWhen(Date when) {
        this.when = when;
    }
}
