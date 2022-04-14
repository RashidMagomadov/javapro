package com.rmagomadov.javapro.mapper;

import com.rmagomadov.javapro.dto.ImageResponse;
import com.rmagomadov.javapro.model.Image;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageToImageResponseMapper {

    ImageResponse convert(Image image);
}
