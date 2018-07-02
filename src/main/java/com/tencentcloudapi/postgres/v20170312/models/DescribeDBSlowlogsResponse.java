package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBSlowlogsResponse  extends AbstractModel{


    /**
    * 本次返回多少条数据
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 慢查询日志详情
    */
    @SerializedName("Detail")
    @Expose
    private SlowlogDetail Detail;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取本次返回多少条数据
     * @return TotalCount 本次返回多少条数据
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置本次返回多少条数据
     * @param TotalCount 本次返回多少条数据
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取慢查询日志详情
     * @return Detail 慢查询日志详情
     */
    public SlowlogDetail getDetail() {
        return this.Detail;
    }

    /**
     * 设置慢查询日志详情
     * @param Detail 慢查询日志详情
     */
    public void setDetail(SlowlogDetail Detail) {
        this.Detail = Detail;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

