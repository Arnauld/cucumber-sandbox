package feature.context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class PersonaFactory {
    public ODBuilder createStandardOD() {
        ODBuilder od = new ODBuilder("Paris", "Marseille");
        return od;
    }

    public ODBuilder aRandomMonoSeg() {
        ODBuilder od = new ODBuilder("Paris", pickOne(Arrays.asList("Marseille", "Nantes", "Toulouse")));
        return od;
    }

    private static <T> T pickOne(List<T> values) {
        List<T> rs = new ArrayList<T>(values);
        Collections.shuffle(rs);
        return rs.get(0);
    }
}
