package com.woniuxy.service;

import com.woniuxy.pojo.Jianda;

import java.util.List;

public interface IJianDaService {
    List<Jianda> findAll();
    List<Jianda> findByPage(Integer page,Integer limit);
    void save(Jianda jd);
    int delete(Integer jiandaId);
    int update(Jianda jd);
    Jianda findOne(Integer jiandaId);
    //按学科知识点
    List<Jianda> findAllByTwo(String typename,String typename2);
    List<Jianda> findByTwo(String typename,String typename2,Integer page, Integer limit);
    //按学科
    List<Jianda> findAllByType(String typename);
    List<Jianda> findByType(String typename,Integer page,Integer limit);
    //按知识点
    List<Jianda> findAllByQType(String typename);
    List<Jianda> findByQType(String typename,Integer page,Integer limit);
    //按名称
    List<Jianda> findAllByName(String name);
    List<Jianda> findByName(String name, Integer page,Integer limit);
}
