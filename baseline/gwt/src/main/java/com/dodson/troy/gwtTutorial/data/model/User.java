package com.dodson.troy.gwtTutorial.data.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * TODO: Documentation
 *
 * @author troy.dodson@mincom.com
 * @since 0.1
 */
@Entity
public class User implements Serializable
{
    @Id
    private long id;
}
