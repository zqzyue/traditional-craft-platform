package com.craft.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PostDTO {
    @NotBlank(message = "标题不能为空")
    @Size(max = 120, message = "标题不超过120字")
    private String title;

    // 封面图 URL（先传外链，明天做本地上传）
    private String coverImg;

    /* === Getter/Setter 自动生成 === */
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCoverImg() { return coverImg; }
    public void setCoverImg(String coverImg) { this.coverImg = coverImg; }
}