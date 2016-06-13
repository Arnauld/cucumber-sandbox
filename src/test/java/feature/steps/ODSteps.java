package feature.steps;

import api.OD;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import feature.context.ODContext;
import feature.context.PersonaFactory;
import feature.proto.ODProto;

import java.util.List;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class ODSteps {

    private final ODContext odContext;

    public ODSteps(ODContext odContext) {
        this.odContext = odContext;
    }

    @Given("^an standard OD$")
    public void an_standard_OD() throws Throwable {
        OD od = new PersonaFactory().createStandardOD();
        odContext.set(od);
    }

    @Given("^an standard OD with the following specifics:$")
    public void an_standard_OD_with_the_following_specifics(List<ODProto> protoss) throws Throwable {

    }
}
