package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SpecInfo  extends AbstractModel{


    /**
    * 地域英文编码，对应RegionSet的Region字段
    */
    @SerializedName("Region")
    @Expose
    private String Region;
    

    /**
    * 区域英文编码，对应ZoneSet的Zone字段
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;
    

    /**
    * 规格详细信息列表
    */
    @SerializedName("SpecItemInfoList")
    @Expose
    private SpecItemInfo [] SpecItemInfoList;
    

    /**
     * 获取地域英文编码，对应RegionSet的Region字段
     * @return Region 地域英文编码，对应RegionSet的Region字段
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域英文编码，对应RegionSet的Region字段
     * @param Region 地域英文编码，对应RegionSet的Region字段
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取区域英文编码，对应ZoneSet的Zone字段
     * @return Zone 区域英文编码，对应ZoneSet的Zone字段
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置区域英文编码，对应ZoneSet的Zone字段
     * @param Zone 区域英文编码，对应ZoneSet的Zone字段
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取规格详细信息列表
     * @return SpecItemInfoList 规格详细信息列表
     */
    public SpecItemInfo [] getSpecItemInfoList() {
        return this.SpecItemInfoList;
    }

    /**
     * 设置规格详细信息列表
     * @param SpecItemInfoList 规格详细信息列表
     */
    public void setSpecItemInfoList(SpecItemInfo [] SpecItemInfoList) {
        this.SpecItemInfoList = SpecItemInfoList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SpecItemInfoList.", this.SpecItemInfoList);

    }
}

