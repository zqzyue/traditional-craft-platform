package com.craft.entity;

import java.time.LocalDateTime;

public class Post {
    private Long id;
    private String title;
    private String coverImg;
    private Long authorId;
    private LocalDateTime createTime;

    // Getter/Setter 自动生成：在 VS Code 按 Alt+Shift+S → Generate Getters and Setters 全选
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCoverImg() { return coverImg; }
    public void setCoverImg(String coverImg) { this.coverImg = coverImg; }
    public Long getAuthorId() { return authorId; }
    public void setAuthorId(Long authorId) { this.authorId = authorId; }
    public LocalDateTime getCreateTime() { return createTime; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }
}