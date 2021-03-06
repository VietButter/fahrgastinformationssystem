package fis.railmlparser;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

/*
 * Sometimes XML files generated by external applications are not strictly validated
 * and produce warnings when unmarshalled. This event handler causes JAXB2 to ignore them
 * and continue unmarshalling.
 */
public class CustomValidationEventHandler implements ValidationEventHandler {

    public boolean handleEvent(ValidationEvent event) {
	return true;
    }

}
