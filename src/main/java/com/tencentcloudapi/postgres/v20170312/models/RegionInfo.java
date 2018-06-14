package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RegionInfo  extends AbstractModel{


    /**
    * 该地域对应的英文名称
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 该地域对应的中文名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 该地域对应的数字编号
    */
    @SerializedName("RegionId")
    @Expose
    private Integer RegionId;

    /**
    * 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
     * 获取该地域对应的英文名称
     * @return Region 该地域对应的英文名称
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置该地域对应的英文名称
     * @param Region 该地域对应的英文名称
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取该地域对应的中文名称
     * @return RegionName 该地域对应的中文名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * 设置该地域对应的中文名称
     * @param RegionName 该地域对应的中文名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * 获取该地域对应的数字编号
     * @return RegionId 该地域对应的数字编号
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置该地域对应的数字编号
     * @param RegionId 该地域对应的数字编号
     */
    public void setRegionId(Integer RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 获取可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
     * @return RegionState 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * 设置可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
     * @param RegionState 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
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
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);

    }
}

