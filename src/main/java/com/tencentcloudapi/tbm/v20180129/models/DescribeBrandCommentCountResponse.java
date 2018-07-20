package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeBrandCommentCountResponse  extends AbstractModel{


    /**
    * 按天统计好评/差评数
    */
    @SerializedName("CommentSet")
    @Expose
    private Comment [] CommentSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取按天统计好评/差评数
     * @return CommentSet 按天统计好评/差评数
     */
    public Comment [] getCommentSet() {
        return this.CommentSet;
    }

    /**
     * 设置按天统计好评/差评数
     * @param CommentSet 按天统计好评/差评数
     */
    public void setCommentSet(Comment [] CommentSet) {
        this.CommentSet = CommentSet;
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
        this.setParamArrayObj(map, prefix + "CommentSet.", this.CommentSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

