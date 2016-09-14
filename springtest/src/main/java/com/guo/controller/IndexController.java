package com.guo.controller;

import com.guo.dao.IUser;
import com.guo.enums.ApiRequestCode;
import com.guo.model.ResultModel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import java.util.*;


/**
 * Created by MengWen Guo on 2016/09/14.
 * Created Date 2016/09/14.
 */
@Controller
@RequestMapping(produces = "application/json;charset=UTF-8")
public class IndexController {

    private ResultModel result = new ResultModel();

    @Resource
    IUser user;

    /**
     * 返回json格式数据
     */
    @RequestMapping(value = "index", produces = "application/json;charset=UTF-8")
    public ModelAndView index() {
        List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 1);
        map.put("name", "张三");
        map.put("age", 25);
        map.put("sex", "男");
        lst.add(map);
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("id", 2);
        map2.put("name", "李四");
        map2.put("age", 23);
        map2.put("sex", "女");
        lst.add(map2);

        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("id", 2);
        map3.put("name", user.getName());
        map3.put("age", 23);
        map3.put("sex", "女");
        lst.add(map3);

        result.setResult(ApiRequestCode.OK, lst);
        return new ModelAndView(new MappingJackson2JsonView(), result.getMap());
    }
    @RequestMapping(value = "init")
    public ModelAndView Init(int... age){
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("id", 2);
        map3.put("name", user.getName());
        map3.put("age", age);
        map3.put("sex", "女");
        result.setResult(ApiRequestCode.OK, map3);
        return new ModelAndView(new MappingJackson2JsonView(), result.getMap());
    }

}
