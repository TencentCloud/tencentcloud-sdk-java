package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CommentInfo  extends AbstractModel{


    /**
    * 用户评论内容
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 评论的时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * 获取用户评论内容
     * @return Comment 用户评论内容
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * 设置用户评论内容
     * @param Comment 用户评论内容
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * 获取评论的时间
     * @return Date 评论的时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置评论的时间
     * @param Date 评论的时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

