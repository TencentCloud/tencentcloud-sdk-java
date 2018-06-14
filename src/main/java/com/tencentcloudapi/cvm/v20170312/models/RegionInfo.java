package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RegionInfo  extends AbstractModel{


    /**
    * 地域名称，例如，ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域描述，例如，华南地区(广州)
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域是否可用状态
    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
     * 获取地域名称，例如，ap-guangzhou
     * @return Region 地域名称，例如，ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域名称，例如，ap-guangzhou
     * @param Region 地域名称，例如，ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取地域描述，例如，华南地区(广州)
     * @return RegionName 地域描述，例如，华南地区(广州)
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * 设置地域描述，例如，华南地区(广州)
     * @param RegionName 地域描述，例如，华南地区(广州)
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * 获取地域是否可用状态
     * @return RegionState 地域是否可用状态
     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * 设置地域是否可用状态
     * @param RegionState 地域是否可用状态
     */
    public void setRegionState(String RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);

    }
}

