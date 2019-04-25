package com.example.ratemysinging;

public class Comments {
    private String UserId;
    private String CommentText;
    private long TimeStamp;

    public Comments(){

    }

    public Comments(String UserId,String CommentText,long Timestamp){
        this.UserId=UserId;
        this.CommentText=CommentText;
        this.TimeStamp=Timestamp;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getCommentText() {
        return CommentText;
    }

    public void setCommentText(String commentText) {
        CommentText = commentText;
    }

    public long getTimeStamp() {
        return TimeStamp;
    }


    public void setTimeStamp(long timeStamp) {
        TimeStamp = timeStamp;
    }
}
