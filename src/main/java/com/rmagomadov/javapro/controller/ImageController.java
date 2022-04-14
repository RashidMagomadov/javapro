package com.rmagomadov.javapro.controller;

import com.rmagomadov.javapro.dto.ImageRequest;
import com.rmagomadov.javapro.dto.ImageResponse;
import com.rmagomadov.javapro.model.Permission;
import com.rmagomadov.javapro.model.Permissions;
import com.rmagomadov.javapro.service.api.ImageApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class ImageController {

    private final ImageApiService imageApiService;

    @Permissions(Permission.IMAGE_CREATE)
    @PostMapping("/image")
    public ImageResponse saveImage(@RequestBody ImageRequest request) {
        return imageApiService.saveImage(request);
    }

    @GetMapping("/images/{id}")
    public byte[] getImage(@PathVariable String id) {
        return imageApiService.getImage(id);
    }
}
