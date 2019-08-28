package com.woniuxy.controller;

import com.woniuxy.pojo.QuestionType;
import com.woniuxy.service.IQuestionTypeService;
import com.woniuxy.service.impl.QuestionsTypeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("qt")
public class QuestionTypeController {
//    @Resource
//    private IQuestionTypeService questionTypeServiceImpl;


    @RequestMapping("/findByType")
    //按科目
    public @ResponseBody Map<String,Object> findByType(@RequestParam(defaultValue="1")int page, @RequestParam(defaultValue="5")int limit, String typename){
//        List<QuestionType> countdata = questionTypeServiceImpl.findAll();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
//        map.put("count",countdata.size());

        return map;
}
}