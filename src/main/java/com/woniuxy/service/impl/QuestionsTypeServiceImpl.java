package com.woniuxy.service.impl;

import com.woniuxy.mapper.QuestionTypeMapper;
import com.woniuxy.pojo.QuestionType;
import com.woniuxy.service.IQuestionTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class QuestionsTypeServiceImpl implements IQuestionTypeService {
    @Resource
    private QuestionTypeMapper questionTypeMapper;
    @Override
    public List<QuestionType> findAll() {
        return null;
    }

    @Override
    public void save(QuestionType questionType) {

    }

    @Override
    public void delete(Integer questionTypeId) {

    }

    @Override
    public void update(QuestionType questionType) {

    }

    @Override
    public QuestionType findOne(Integer questionTypeId) {
        return null;
    }

    @Override
    public QuestionType findByName(String name) {
        return questionTypeMapper.findByName(name);
    }
}
