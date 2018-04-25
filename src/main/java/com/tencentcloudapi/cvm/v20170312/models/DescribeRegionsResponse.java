package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeRegionsResponse  extends AbstractModel{


    /**
    * 地域数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;
    

    /**
    * 地域列表信息
    */
    @SerializedName("RegionSet")
    @Expose
    private RegionInfo [] RegionSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取地域数量
     * @return TotalCount 地域数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置地域数量
     * @param TotalCount 地域数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取地域列表信息
     * @return RegionSet 地域列表信息
     */
    public RegionInfo [] getRegionSet() {
        return this.RegionSet;
    }

    /**
     * 设置地域列表信息
     * @param RegionSet 地域列表信息
     */
    public void setRegionSet(RegionInfo [] RegionSet) {
        this.RegionSet = RegionSet;
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
        this.setParamArrayObj(map, prefix + "RegionSet.", this.RegionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

