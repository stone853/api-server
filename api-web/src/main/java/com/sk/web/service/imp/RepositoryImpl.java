package com.sk.web.service.imp;

import com.sk.web.mapper.RepositoryMapper;
import com.sk.web.model.Repository;
import com.sk.web.model.RepositoryExample;
import com.sk.web.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositoryImpl extends BaseImpl<Repository, RepositoryExample> implements RepositoryService{

    @Autowired
    public void setMapper(RepositoryMapper<Repository> mapper) {
        this.mapper = mapper;
    }
}
