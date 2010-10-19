package com.dodson.troy.gwtTutorial.data.service.impl;

import com.dodson.troy.gwtTutorial.data.model.MyClass;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
// import org.springframework.transaction.annotation.Transactional;

/**
 * TODO: Documentation
 *
 * @author troy.dodson@mincom.com
 * @since 0.1
 */
@Named("JobRepository")
public class Repository
{
    @Inject
    private EntityManager entityManager;

//    @Transactional
    public MyClass getJob(String labCode, String job)
    {
        String qlString = "SELECT j FROM MyClass j WHERE j.jobNo = '" + job + "' and j.labCode = '" + labCode + "'";
        Query query = entityManager.createQuery( qlString );
        MyClass singleResult = (MyClass) query.getSingleResult();
        return singleResult;
    }
}
