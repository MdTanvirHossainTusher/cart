package com.example.cart.config;

import com.example.cart.entity.file.FileStorageProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
@EnableConfigurationProperties(FileStorageProperties.class)
public class FileUploadConfig {

    @Bean
    public Path uploadLocation(FileStorageProperties fileStorageProperties) {
        String uploadDir = fileStorageProperties.getUploadDir();
        if (uploadDir == null || uploadDir.trim().isEmpty()) {
            throw new IllegalStateException("Upload directory must be configured using 'file.upload-dir'");
        }
        return Paths.get(uploadDir)
                .toAbsolutePath()
                .normalize();
    }
}