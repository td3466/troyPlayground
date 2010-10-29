package com.dodson.troy.gwtTutorial.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class GwtTutorial
    implements EntryPoint
{

    /**
     * This is the entry point method.
     */
    public void onModuleLoad()
    {
        final Button button = new Button( "Click me" );
        final Label label = new Label();

        button.addClickHandler( new ButtonClickHandler( label ) );

        // Assume that the host HTML has elements defined whose
        // IDs are "slot1", "slot2".  In a real app, you probably would not want
        // to hard-code IDs.  Instead, you could, for example, search for all
        // elements with a particular CSS class and replace them with widgets.
        //
        RootPanel.get( "slot1" ).add( button );
        RootPanel.get( "slot2" ).add( label );
    }

    private static class MyAsyncCallback
        implements AsyncCallback<String>
    {
        private Label label;

        public MyAsyncCallback( Label label )
        {
            this.label = label;
        }

        public void onSuccess( String result )
        {
            label.getElement().setInnerHTML( result );
        }

        public void onFailure( Throwable throwable )
        {
            label.setText( "Failed to receive answer from server!" );
        }
    }

    private static class ButtonClickHandler
        implements ClickHandler
    {
        private final Label label;

        private ButtonClickHandler( Label label )
        {
            this.label = label;
        }

        public final void onClick( ClickEvent event )
        {
            if( label.getText().equals( "" ) )
            {
                GwtTutorialService.App.getInstance().getMessage( "Hello, Baboon!", new MyAsyncCallback( label ) );
            }
            else
            {
                label.setText( "" );
            }
        }
    }
}
