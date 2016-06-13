package feature.context;

import java.util.Date;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class Context {

    public Date parseDate(String date) {
        if (date.startsWith("<") && date.endsWith(">"))
            return interpretDate(date);
        return new Date();
    }

    private Date interpretDate(String date) {
        if (date.equalsIgnoreCase("<now>"))
            return new Date();
        throw new IllegalArgumentException();
    }
}
