package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeMonitorsResponse  extends AbstractModel{


    /**
    * 监控任务列表。
    */
    @SerializedName("Monitors")
    @Expose
    private MonitorsDetail [] Monitors;

    /**
    * 监控任务数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取监控任务列表。
     * @return Monitors 监控任务列表。
     */
    public MonitorsDetail [] getMonitors() {
        return this.Monitors;
    }

    /**
     * 设置监控任务列表。
     * @param Monitors 监控任务列表。
     */
    public void setMonitors(MonitorsDetail [] Monitors) {
        this.Monitors = Monitors;
    }

    /**
     * 获取监控任务数量。
     * @return TotalCount 监控任务数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置监控任务数量。
     * @param TotalCount 监控任务数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
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
        this.setParamArrayObj(map, prefix + "Monitors.", this.Monitors);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

