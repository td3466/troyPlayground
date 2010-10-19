package com.dodson.troy.gwtTutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath( "GwtTutorialService" )
public interface GwtTutorialService extends RemoteService
{
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
