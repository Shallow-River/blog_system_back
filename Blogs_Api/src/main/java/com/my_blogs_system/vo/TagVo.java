package com.my_blogs_system.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data
public class TagVo {
    private String id;
    private String avatar;
    private String tagName;
}
