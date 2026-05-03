package com.liyu.service;

import com.liyu.pojo.Ms;

import java.util.List;

public interface MsService {
    List<Ms> findAll();

    void addMs(Ms ms);
}
