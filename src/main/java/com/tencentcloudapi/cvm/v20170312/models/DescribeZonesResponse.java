package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeZonesResponse  extends AbstractModel{


    /**
    * 可用区数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;
    

    /**
    * 可用区列表信息
    */
    @SerializedName("ZoneSet")
    @Expose
    private ZoneInfo [] ZoneSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取可用区数量
     * @return TotalCount 可用区数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置可用区数量
     * @param TotalCount 可用区数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取可用区列表信息
     * @return ZoneSet 可用区列表信息
     */
    public ZoneInfo [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * 设置可用区列表信息
     * @param ZoneSet 可用区列表信息
     */
    public void setZoneSet(ZoneInfo [] ZoneSet) {
        this.ZoneSet = ZoneSet;
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
        this.setParamArrayObj(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

