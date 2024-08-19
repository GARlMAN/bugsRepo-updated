package com.hsbc.models;

import java.time.LocalDateTime;

public class Bug {
    private int bugId;
    private String bugMessage;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BugStatus bugStatus;
    private BugSeverity bugSeverity;
    private int projectId;

    public Bug() {}

    public Bug(int bugId, String bugMessage, LocalDateTime createdAt, LocalDateTime updatedAt,
               BugStatus bugStatus, BugSeverity bugSeverity, int projectId) {
        this.bugId = bugId;
        this.bugMessage = bugMessage;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.bugStatus = bugStatus;
        this.bugSeverity = bugSeverity;
        this.projectId = projectId;
    }

}
