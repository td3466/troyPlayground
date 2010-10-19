package com.dodson.troy.gwtTutorial.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.dodson.troy.gwtTutorial.client.GwtTutorialService;

public class GwtTutorialServiceImpl extends RemoteServiceServlet
    implements GwtTutorialService
{
    // Implementation of sample interface method
    public String getMessage( String msg )
    {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}