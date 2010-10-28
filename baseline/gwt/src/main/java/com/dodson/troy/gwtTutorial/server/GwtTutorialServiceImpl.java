package com.dodson.troy.gwtTutorial.server;

import com.dodson.troy.gwtTutorial.client.GwtTutorialService;
import javax.inject.Named;

import static com.dodson.troy.gwtTutorial.client.GwtTutorialService.SERVICE_NAME;

@Named( SERVICE_NAME )
public class GwtTutorialServiceImpl implements GwtTutorialService
{
    // Implementation of sample interface method
    public String getMessage( String msg )
    {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}