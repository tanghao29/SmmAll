package com.sxt.business.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sxt.business.domain.Course;
import com.sxt.business.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hao
 * @since 2020-03-24
 */
@Controller
@RequestMapping("/business/course")
public class CourseController {

    @Autowired
    private ICourseService iCourseService;

    @ResponseBody
    @RequestMapping("/query.do")
    public List<Course> queryCourse(){

        QueryWrapper queryWrapper=new QueryWrapper();
        return iCourseService.list(queryWrapper);
    }

}

