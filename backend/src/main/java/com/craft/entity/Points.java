package com.craft.entity;

import java.time.LocalDateTime;

public class Points {
    private Long id;
    private Long userId;
    private Integer points;
    private String reason;
    private LocalDateTime createTime;

    /* === Getter/Setter 自动生成 === */
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public Integer getPoints() { return points; }
    public void setPoints(Integer points) { this.points = points; }
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
    public LocalDateTime getCreateTime() { return createTime; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }
}