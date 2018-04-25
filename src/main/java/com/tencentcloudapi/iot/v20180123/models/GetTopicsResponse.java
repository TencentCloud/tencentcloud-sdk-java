package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetTopicsResponse  extends AbstractModel{


    /**
    * Topic列表
    */
    @SerializedName("Topics")
    @Expose
    private Topic [] Topics;
    

    /**
    * Topic总数
    */
    @SerializedName("Total")
    @Expose
    private Integer Total;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取Topic列表
     * @return Topics Topic列表
     */
    public Topic [] getTopics() {
        return this.Topics;
    }

    /**
     * 设置Topic列表
     * @param Topics Topic列表
     */
    public void setTopics(Topic [] Topics) {
        this.Topics = Topics;
    }

    /**
     * 获取Topic总数
     * @return Total Topic总数
     */
    public Integer getTotal() {
        return this.Total;
    }

    /**
     * 设置Topic总数
     * @param Total Topic总数
     */
    public void setTotal(Integer Total) {
        this.Total = Total;
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
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

