package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeBrandNegCommentsResponse  extends AbstractModel{


    /**
    * 评论列表
    */
    @SerializedName("BrandCommentSet")
    @Expose
    private CommentInfo [] BrandCommentSet;

    /**
    * 总的差评个数
    */
    @SerializedName("TotalComments")
    @Expose
    private Integer TotalComments;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取评论列表
     * @return BrandCommentSet 评论列表
     */
    public CommentInfo [] getBrandCommentSet() {
        return this.BrandCommentSet;
    }

    /**
     * 设置评论列表
     * @param BrandCommentSet 评论列表
     */
    public void setBrandCommentSet(CommentInfo [] BrandCommentSet) {
        this.BrandCommentSet = BrandCommentSet;
    }

    /**
     * 获取总的差评个数
     * @return TotalComments 总的差评个数
     */
    public Integer getTotalComments() {
        return this.TotalComments;
    }

    /**
     * 设置总的差评个数
     * @param TotalComments 总的差评个数
     */
    public void setTotalComments(Integer TotalComments) {
        this.TotalComments = TotalComments;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BrandCommentSet.", this.BrandCommentSet);
        this.setParamSimple(map, prefix + "TotalComments", this.TotalComments);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

