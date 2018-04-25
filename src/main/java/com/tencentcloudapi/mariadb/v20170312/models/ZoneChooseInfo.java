package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ZoneChooseInfo  extends AbstractModel{


    /**
    * 主可用区
    */
    @SerializedName("MasterZone")
    @Expose
    private ZonesInfo MasterZone;
    

    /**
    * 可选的从可用区
    */
    @SerializedName("SlaveZones")
    @Expose
    private ZonesInfo [] SlaveZones;
    

    /**
     * 获取主可用区
     * @return MasterZone 主可用区
     */
    public ZonesInfo getMasterZone() {
        return this.MasterZone;
    }

    /**
     * 设置主可用区
     * @param MasterZone 主可用区
     */
    public void setMasterZone(ZonesInfo MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * 获取可选的从可用区
     * @return SlaveZones 可选的从可用区
     */
    public ZonesInfo [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * 设置可选的从可用区
     * @param SlaveZones 可选的从可用区
     */
    public void setSlaveZones(ZonesInfo [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MasterZone.", this.MasterZone);
        this.setParamArrayObj(map, prefix + "SlaveZones.", this.SlaveZones);

    }
}

