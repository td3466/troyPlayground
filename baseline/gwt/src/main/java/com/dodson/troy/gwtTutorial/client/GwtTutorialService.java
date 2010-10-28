package com.dodson.troy.gwtTutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import org.workingonit.gwtbridge.GwtRemoteService;

import static com.dodson.troy.gwtTutorial.client.Constants.PATH_PREFIX;
import static com.dodson.troy.gwtTutorial.client.GwtTutorialService.SERVICE_NAME;

@RemoteServiceRelativePath( PATH_PREFIX + SERVICE_NAME )
@GwtRemoteService( SERVICE_NAME )
public interface GwtTutorialService extends RemoteService
{
    String SERVICE_NAME = "GwtTutorialService";

    // Sample interface method of remote interface
    String getMessage( String msg );

    /**
     * Utility/Convenience class.
     * Use GwtTutorialService.App.getInstance() to access static instance of GwtTutorialServiceAsync
     */
    public static class App
    {
        private static GwtTutorialServiceAsync ourInstance = GWT.create( GwtTutorialService.class );

        public static synchronized GwtTutorialServiceAsync getInstance()
        {
            return ourInstance;
        }
    }
}
