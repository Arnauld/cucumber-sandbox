package feature.steps;

import api.OD;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import feature.context.Context;
import feature.context.ODContext;
import feature.context.PersonaFactory;
import feature.proto.ODProto;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class ODSteps {

    private final Context context;
    private final ODContext odContext;

    public ODSteps(Context context, ODContext odContext) {
        this.context = context;
        this.odContext = odContext;
    }

    @Given("^an standard OD$")
    public OD an_standard_OD() throws Throwable {
        OD od = new PersonaFactory().createStandardOD();
        odContext.set(od);
        return od;
    }

    @Given("^a standard OD with the following specifics:$")
    public void an_standard_OD_with_the_following_specifics(List<ODProto> protoss) throws Throwable {
        assertThat(protoss).describedAs("Only one line is supported").hasSize(1);
        OD od = an_standard_OD();
        protoss.get(0).applyOn(context, od);
    }


    @Then("^the OD should have the following specifics$")
    public void the_OD_should_have_the_following_specifics(List<ODProto> protoss) throws Throwable {
        assertThat(protoss).describedAs("Only one line is supported").hasSize(1);
        protoss.get(0).checkProperty(odContext.get());
    }
}
