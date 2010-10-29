package com.dodson.troy.gwtTutorial.data.service;

import com.dodson.troy.gwtTutorial.data.model.service.impl.Repository;

/**
 * TODO: Documentation
 *
 * @author troy.dodson@mincom.com
 * @since 0.1
 */
public interface RepositoryFactory
{
    String BEAN_ID = "RepositoryFactory";

    /**
     * TODO: Documentation
     *
     */
    Repository create();
}
