package feature.context;

import api.OD;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class PersonaFactory {
    public OD createStandardOD() {
        OD od = new OD("Paris", "Marseille");
        return od;
    }
}
