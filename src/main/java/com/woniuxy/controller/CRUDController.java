package com.woniuxy.controller;

import com.woniuxy.pojo.*;
import com.woniuxy.service.*;
import com.woniuxy.service.impl.MultipleChoiceServiceImpl;

import com.woniuxy.service.impl.QuestionsTypeServiceImpl;
import com.woniuxy.service.impl.TestQuestionsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping("/CRUD/")
public class CRUDController {
    @Resource
    private IJianDaService jiandaServiceImpl;

//    @Resource
//    private ITrueOrFalseService trueOrFalseService;
//
//    @Resource
//    private ITiankongService tiankongService;
//
//    @Resource
//    private IMultipleChoiceService multipleChoiceService;

    @Resource
    private QuestionsTypeServiceImpl questionTypeService;

    @RequestMapping("findByName")
    public @ResponseBody Map findByName(@RequestParam("coursename")String coursename,
                                        @RequestParam(("kemu")) String kemu,
                                        @RequestParam("Qtype")String Qtype,
                                        @RequestParam(defaultValue="1")Integer page,
                                        @RequestParam(defaultValue="5")Integer limit
                                        ){
        page=(page-1)*limit;
        List<Jianda> countdata = null;
        List<Jianda> data = null;
        if ("选择题".equals(Qtype)) {
//            multipleChoiceServiceImpl.findAllByQType(coursename);
//            multipleChoiceServiceImpl.findByQType(coursename, page, limit);
        }else if ("填空题".equals(Qtype)) {
//            tiankongServiceImpl.findAllByQType(coursename);
//            tiankongServiceImpl.findByQType(coursename, page, limit);
        }else if ("判断题".equals(Qtype)) {
//            countdata = trueOrFalseServiceImpl.findAllByQType(coursename);
//            data =  trueOrFalseServiceImpl.findByQType(coursename, page, limit);
        }else if ("简答题".equals(Qtype)) {
           countdata = jiandaServiceImpl.findAllByName(coursename);
           data = jiandaServiceImpl.findByName(coursename,page,limit);
        }
        System.out.println(page+"   "+limit);
        System.out.println(data.size()+"  "+countdata.size());
        System.out.println(coursename+"  "+Qtype+"  "+kemu);
        Map<String,Object> map = new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }

    @RequestMapping("deleteById")
    public @ResponseBody int deleteone(@RequestParam("id")Integer id,@RequestParam("type")String type){

        int code = 0;
        if ("选择题".equals(type)) {

        }else if ("填空题".equals(type)) {

        }else if ("判断题".equals(type)) {

        }else if ("简答题".equals(type)) {
           code = jiandaServiceImpl.delete(id);
        }
        return code;
    }

    @RequestMapping("updata")
    public  @ResponseBody int updata(@RequestParam("id") Integer id,@RequestParam("title") String name,@RequestParam("kemu") String kemu,@RequestParam("type") String type){
        //System.out.println(id+"   "+name+"   "+ type+"   "+kemu);
        QuestionType km = questionTypeService.findByName(kemu);
        int kmid = km.getTypeid();
        int code = 999999;

        if ("选择题".equals(type)) {

        }else if ("填空题".equals(type)) {

        }else if ("判断题".equals(type)) {

        }else if ("简答题".equals(type)) {
            Jianda jd = new Jianda();
            jd.setId(id);
            jd.setTitle(name);
            jd.setTypeid(kmid);
            code = jiandaServiceImpl.update(jd);
        }
        System.out.println(code);
        return code;
    }
   //
    @RequestMapping("add")
    public @ResponseBody int Add (@RequestParam("coursename")String name,
                                  @RequestParam("answer")String answer,
                                  @RequestParam("kemu")String kemu,
                                  @RequestParam("Qtype")String Qtype,
                                  @RequestParam("kaodian")String kaodian){
        Jianda jainda=new Jianda();
        Trueorfalse trueorfalse = new Trueorfalse();
        MultipleChoice multipleChoice = new MultipleChoice();
        Tiankong tiankong = new Tiankong();

        if ("选择题".equals(Qtype)) {

        }else if ("填空题".equals(Qtype)) {

        }else if ("判断题".equals(Qtype)) {

        }else if ("简答题".equals(Qtype)) {
           jainda.setId(null);
           jainda.setTitle(name);
           jainda.setAnswer(answer);
           jainda.setTypeid(1);
           jainda.setTestQuestionId(1);
           jainda.setType(null);
           jiandaServiceImpl.save(jainda);
        }
        return 1;
    }
}
