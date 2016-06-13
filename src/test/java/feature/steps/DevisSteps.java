package feature.steps;

import api.OD;
import cucumber.api.java.en.When;
import feature.context.ODContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class DevisSteps {

    private final ODContext odContext;

    public DevisSteps(ODContext odContext) {
        this.odContext = odContext;
    }


    @When("^I create the devis$")
    public void i_create_the_devis() throws Throwable {
        OD od = odContext.get();
        assertThat(od).describedAs("No OD defined....").isNotNull();

        //devisService.invoke(od);
    }
}
