package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeSiteQuotaResponse  extends AbstractModel{


    /**
    * 已购买的站点数。
    */
    @SerializedName("Total")
    @Expose
    private Integer Total;
    

    /**
    * 已使用的站点数。
    */
    @SerializedName("Used")
    @Expose
    private Integer Used;
    

    /**
    * 剩余可用的站点数。
    */
    @SerializedName("Available")
    @Expose
    private Integer Available;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取已购买的站点数。
     * @return Total 已购买的站点数。
     */
    public Integer getTotal() {
        return this.Total;
    }

    /**
     * 设置已购买的站点数。
     * @param Total 已购买的站点数。
     */
    public void setTotal(Integer Total) {
        this.Total = Total;
    }

    /**
     * 获取已使用的站点数。
     * @return Used 已使用的站点数。
     */
    public Integer getUsed() {
        return this.Used;
    }

    /**
     * 设置已使用的站点数。
     * @param Used 已使用的站点数。
     */
    public void setUsed(Integer Used) {
        this.Used = Used;
    }

    /**
     * 获取剩余可用的站点数。
     * @return Available 剩余可用的站点数。
     */
    public Integer getAvailable() {
        return this.Available;
    }

    /**
     * 设置剩余可用的站点数。
     * @param Available 剩余可用的站点数。
     */
    public void setAvailable(Integer Available) {
        this.Available = Available;
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

