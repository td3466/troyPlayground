package com.dodson.troy.gwtTutorial.data.service.impl;

import com.dodson.troy.gwtTutorial.data.service.RepositoryFactory;
import javax.inject.Named;

/**
 * TODO: Documentation
 *
 * @author troy.dodson@mincom.com
 * @since 0.1
 */
@Named( RepositoryFactory.BEAN_ID)
public class RepositoryFactoryImpl implements RepositoryFactory
{
    public Repository create()
    {
         //To change body of implemented methods use File | Settings | File Templates.
         return new Repository(); 
    }
}
