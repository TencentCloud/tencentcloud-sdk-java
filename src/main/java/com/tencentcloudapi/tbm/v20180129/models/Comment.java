package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Comment  extends AbstractModel{


    /**
    * 评论的日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 差评的个数
    */
    @SerializedName("NegCommentCount")
    @Expose
    private Integer NegCommentCount;

    /**
    * 好评的个数
    */
    @SerializedName("PosCommentCount")
    @Expose
    private Integer PosCommentCount;

    /**
     * 获取评论的日期
     * @return Date 评论的日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置评论的日期
     * @param Date 评论的日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取差评的个数
     * @return NegCommentCount 差评的个数
     */
    public Integer getNegCommentCount() {
        return this.NegCommentCount;
    }

    /**
     * 设置差评的个数
     * @param NegCommentCount 差评的个数
     */
    public void setNegCommentCount(Integer NegCommentCount) {
        this.NegCommentCount = NegCommentCount;
    }

    /**
     * 获取好评的个数
     * @return PosCommentCount 好评的个数
     */
    public Integer getPosCommentCount() {
        return this.PosCommentCount;
    }

    /**
     * 设置好评的个数
     * @param PosCommentCount 好评的个数
     */
    public void setPosCommentCount(Integer PosCommentCount) {
        this.PosCommentCount = PosCommentCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "NegCommentCount", this.NegCommentCount);
        this.setParamSimple(map, prefix + "PosCommentCount", this.PosCommentCount);

    }
}

