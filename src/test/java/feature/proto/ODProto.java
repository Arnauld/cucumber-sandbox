package feature.proto;

import api.OD;
import feature.context.Context;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class ODProto {

    public String departure;
    public String arrival;
    public String comfortClass;
    public String when;

    public void checkProperty(OD od) {
        if (departure != null)
            assertThat(od.getDeparture()).isEqualTo(departure);
        if (arrival != null)
            assertThat(od.getArrival()).isEqualTo(arrival);
    }

    public void applyOn(Context context, OD od) {
        if (departure != null)
            od.setDeparture(departure);
        if (arrival != null)
            od.setArrival(arrival);
        if(when !=null)
            od.setWhen(context.parseDate(when));
    }
}
