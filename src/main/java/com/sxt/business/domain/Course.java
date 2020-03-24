package com.sxt.business.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hao
 * @since 2020-03-24
 */

@Service
@TableName("course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private String cid;

    private String cname;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
