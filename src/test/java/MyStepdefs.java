import cucumber.api.PendingException;
import cucumber.api.java.en.Given;


public class MyStepdefs {
    @Given("^this is done$")
    public void this_is_done() throws Throwable {
        System.out.print("sheetal");
    }
}
