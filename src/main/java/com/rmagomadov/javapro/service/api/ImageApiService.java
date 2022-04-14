package com.rmagomadov.javapro.service.api;

import com.rmagomadov.javapro.dto.ImageRequest;
import com.rmagomadov.javapro.dto.ImageResponse;
import com.rmagomadov.javapro.mapper.ImageToImageResponseMapper;
import com.rmagomadov.javapro.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ImageApiService {

    private final ImageService imageService;
    private final ImageToImageResponseMapper imageToImageResponseMapper;

    public ImageResponse saveImage(ImageRequest imageRequest) {
        return imageToImageResponseMapper.convert(imageService.saveImage(imageRequest.getSrc(), imageRequest.getArticleId()));
    }

    public byte[] getImage(String id) {
        return imageService.get(id);
    }

}
