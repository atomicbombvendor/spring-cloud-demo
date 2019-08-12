package com.test.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data // get set
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptNo;

    private String dname;

    /**
     * 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息存储到不用的数据库
     */
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
