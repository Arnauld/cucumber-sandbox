package feature.context;

import api.OD;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class ODContext {

    private OD od;

    public OD get() {
        return od;
    }

    public void set(OD od) {
        this.od = od;
    }
}
