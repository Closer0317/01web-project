package com.liyu.service.impl;

import com.liyu.mapper.MsMapper;
import com.liyu.pojo.Ms;
import com.liyu.service.MsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsServiceImpl implements MsService {

    @Autowired
    private MsMapper msMapper;
    @Override
    public List<Ms> findAll() {
       return msMapper.findAll();
    }

    @Override
    public void addMs(Ms ms) {
        msMapper.add(ms);
    }
}
