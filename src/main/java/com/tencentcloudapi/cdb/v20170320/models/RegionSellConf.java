package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RegionSellConf  extends AbstractModel{


    /**
    * 地域中文名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;
    

    /**
    * 所属大区
    */
    @SerializedName("Area")
    @Expose
    private String Area;
    

    /**
    * 是否为默认地域
    */
    @SerializedName("IsDefaultRegion")
    @Expose
    private Integer IsDefaultRegion;
    

    /**
    * 地域名称
    */
    @SerializedName("Region")
    @Expose
    private String Region;
    

    /**
    * 可用区售卖配置
    */
    @SerializedName("ZonesConf")
    @Expose
    private ZoneSellConf [] ZonesConf;
    

    /**
     * 获取地域中文名称
     * @return RegionName 地域中文名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * 设置地域中文名称
     * @param RegionName 地域中文名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * 获取所属大区
     * @return Area 所属大区
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * 设置所属大区
     * @param Area 所属大区
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * 获取是否为默认地域
     * @return IsDefaultRegion 是否为默认地域
     */
    public Integer getIsDefaultRegion() {
        return this.IsDefaultRegion;
    }

    /**
     * 设置是否为默认地域
     * @param IsDefaultRegion 是否为默认地域
     */
    public void setIsDefaultRegion(Integer IsDefaultRegion) {
        this.IsDefaultRegion = IsDefaultRegion;
    }

    /**
     * 获取地域名称
     * @return Region 地域名称
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域名称
     * @param Region 地域名称
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取可用区售卖配置
     * @return ZonesConf 可用区售卖配置
     */
    public ZoneSellConf [] getZonesConf() {
        return this.ZonesConf;
    }

    /**
     * 设置可用区售卖配置
     * @param ZonesConf 可用区售卖配置
     */
    public void setZonesConf(ZoneSellConf [] ZonesConf) {
        this.ZonesConf = ZonesConf;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "IsDefaultRegion", this.IsDefaultRegion);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "ZonesConf.", this.ZonesConf);

    }
}

