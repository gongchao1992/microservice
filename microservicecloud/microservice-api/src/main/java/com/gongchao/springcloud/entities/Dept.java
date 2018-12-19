package com.gongchao.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author gongchao
 * @date 11:14 2018/12/2
 */
@Accessors(chain = true)
@NoArgsConstructor
@Data
public class Dept {
    private Integer id;
    private String dname;
    private String dbSource;
}
