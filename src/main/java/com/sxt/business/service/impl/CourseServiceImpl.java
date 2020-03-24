package com.sxt.business.service.impl;

import com.sxt.business.domain.Course;
import com.sxt.business.mapper.CourseMapper;
import com.sxt.business.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hao
 * @since 2020-03-24
 */
@Service
@Transactional
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

}
