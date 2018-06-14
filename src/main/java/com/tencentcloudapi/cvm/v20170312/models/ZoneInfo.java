package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ZoneInfo  extends AbstractModel{


    /**
    * 可用区名称，例如，ap-guangzhou-3
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区描述，例如，广州三区
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 可用区状态
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
     * 获取可用区名称，例如，ap-guangzhou-3
     * @return Zone 可用区名称，例如，ap-guangzhou-3
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区名称，例如，ap-guangzhou-3
     * @param Zone 可用区名称，例如，ap-guangzhou-3
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取可用区描述，例如，广州三区
     * @return ZoneName 可用区描述，例如，广州三区
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * 设置可用区描述，例如，广州三区
     * @param ZoneName 可用区描述，例如，广州三区
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * 获取可用区ID
     * @return ZoneId 可用区ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取可用区状态
     * @return ZoneState 可用区状态
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * 设置可用区状态
     * @param ZoneState 可用区状态
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);

    }
}

