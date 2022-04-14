package com.rmagomadov.javapro.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("IMAGE")
@Accessors(chain = true)
@Data
public class Image {

    private String id;
    private String articleId;
    private byte[] content;

}
