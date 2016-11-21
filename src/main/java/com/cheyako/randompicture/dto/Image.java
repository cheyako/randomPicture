package com.cheyako.randompicture.dto;

/**
 * Created by ykorotenko on 21.11.16.
 */
public class Image {
    private String title;
    private String imageUrl;

    public Image(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
