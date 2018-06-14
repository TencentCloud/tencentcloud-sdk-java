package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class First  extends AbstractModel{


    /**
    * 端口号
    */
    @SerializedName("Vport")
    @Expose
    private Integer Vport;

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 虚拟Ip信息
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * 获取端口号
     * @return Vport 端口号
     */
    public Integer getVport() {
        return this.Vport;
    }

    /**
     * 设置端口号
     * @param Vport 端口号
     */
    public void setVport(Integer Vport) {
        this.Vport = Vport;
    }

    /**
     * 获取地域信息
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取虚拟Ip信息
     * @return Vip 虚拟Ip信息
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置虚拟Ip信息
     * @param Vip 虚拟Ip信息
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * 获取可用区信息
     * @return Zone 可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区信息
     * @param Zone 可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

