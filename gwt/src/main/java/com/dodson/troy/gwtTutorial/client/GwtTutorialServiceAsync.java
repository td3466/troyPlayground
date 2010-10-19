package com.dodson.troy.gwtTutorial.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GwtTutorialServiceAsync
{
    void getMessage( String msg, AsyncCallback<String> async );
}
