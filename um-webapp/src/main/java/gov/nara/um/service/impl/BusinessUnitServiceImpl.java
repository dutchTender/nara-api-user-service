package gov.nara.um.service.impl;

import gov.nara.common.persistence.service.AbstractService;
import gov.nara.um.persistence.dao.IBusinessUnitDao;
import gov.nara.um.persistence.model.BusinessUnit;
import gov.nara.um.service.IBusinessUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
public class BusinessUnitServiceImpl extends AbstractService<BusinessUnit> implements IBusinessUnitService {

    @Autowired
    private IBusinessUnitDao dao;




    public BusinessUnitServiceImpl() {
        super();
    }

    // API
    // find

    @Override
    @Transactional(readOnly = true)
    public BusinessUnit findByName(final String name) {
        return dao.findByName(name);
    }

    // other


    // remove user



    // Spring

    @Override
    protected final IBusinessUnitDao getDao() {
        return dao;
    }

    @Override
    protected JpaSpecificationExecutor<BusinessUnit> getSpecificationExecutor() {
        return dao;
    }
}
