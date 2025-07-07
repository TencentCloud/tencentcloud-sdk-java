/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel {

    /**
    * 设备 SN 码
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * 设备型号版本
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 设备固资号。只有设备类型为服务器时才返回
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 0 自有，1 租用。只有设备类型为服务器时才返回
    */
    @SerializedName("SvrIsSpecial")
    @Expose
    private Long SvrIsSpecial;

    /**
    * IP。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 设备所属的机房名称
    */
    @SerializedName("IdcName")
    @Expose
    private String IdcName;

    /**
    * 设备所属的机房ID
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 设备所属的机房管理单元ID
    */
    @SerializedName("IdcUnitId")
    @Expose
    private Long IdcUnitId;

    /**
    * 设备所属的机房管理单元名称
    */
    @SerializedName("IdcUnitName")
    @Expose
    private String IdcUnitName;

    /**
    * 已上架设备所在的机架ID，未上架设备不返回
    */
    @SerializedName("RackId")
    @Expose
    private Long RackId;

    /**
    * 服务器类型， 1 代表服务器， 7 代表 2U4S。只有设备类型为服务器时才返回
    */
    @SerializedName("ServerTypeId")
    @Expose
    private Long ServerTypeId;

    /**
    * 已上架设备所在的机架名称，未上架设备不返回
    */
    @SerializedName("RackName")
    @Expose
    private String RackName;

    /**
    * 已上架设备所在的机位编号，未上架设备不返回。只有设备类型为服务器时才返回
    */
    @SerializedName("PositionCode")
    @Expose
    private Long PositionCode;

    /**
    * 设备状态：POWER_ON 已开电 POWER_OFF 未开电 RACK_OFF 未上架 MOVING 搬迁中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 设备最近一次的开电时间，YYYY-MM-DD 格式。
    */
    @SerializedName("PowerOnTime")
    @Expose
    private String PowerOnTime;

    /**
    * 设备最近一次的上架时间，YYYY-MM-DD 格式。
    */
    @SerializedName("OnshelfDate")
    @Expose
    private String OnshelfDate;

    /**
    * 设备类型 server 服务器，netDevice 网络设备
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 厂商
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 其他设备-设备子类型
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 硬件备注
    */
    @SerializedName("HardwareMemo")
    @Expose
    private String HardwareMemo;

    /**
     * Get 设备 SN 码 
     * @return Sn 设备 SN 码
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set 设备 SN 码
     * @param Sn 设备 SN 码
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get 设备型号版本 
     * @return ModelVersion 设备型号版本
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 设备型号版本
     * @param ModelVersion 设备型号版本
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 设备固资号。只有设备类型为服务器时才返回 
     * @return AssetId 设备固资号。只有设备类型为服务器时才返回
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 设备固资号。只有设备类型为服务器时才返回
     * @param AssetId 设备固资号。只有设备类型为服务器时才返回
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 0 自有，1 租用。只有设备类型为服务器时才返回 
     * @return SvrIsSpecial 0 自有，1 租用。只有设备类型为服务器时才返回
     */
    public Long getSvrIsSpecial() {
        return this.SvrIsSpecial;
    }

    /**
     * Set 0 自有，1 租用。只有设备类型为服务器时才返回
     * @param SvrIsSpecial 0 自有，1 租用。只有设备类型为服务器时才返回
     */
    public void setSvrIsSpecial(Long SvrIsSpecial) {
        this.SvrIsSpecial = SvrIsSpecial;
    }

    /**
     * Get IP。 
     * @return Ip IP。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP。
     * @param Ip IP。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 设备所属的机房名称 
     * @return IdcName 设备所属的机房名称
     */
    public String getIdcName() {
        return this.IdcName;
    }

    /**
     * Set 设备所属的机房名称
     * @param IdcName 设备所属的机房名称
     */
    public void setIdcName(String IdcName) {
        this.IdcName = IdcName;
    }

    /**
     * Get 设备所属的机房ID 
     * @return IdcId 设备所属的机房ID
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 设备所属的机房ID
     * @param IdcId 设备所属的机房ID
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get 设备所属的机房管理单元ID 
     * @return IdcUnitId 设备所属的机房管理单元ID
     */
    public Long getIdcUnitId() {
        return this.IdcUnitId;
    }

    /**
     * Set 设备所属的机房管理单元ID
     * @param IdcUnitId 设备所属的机房管理单元ID
     */
    public void setIdcUnitId(Long IdcUnitId) {
        this.IdcUnitId = IdcUnitId;
    }

    /**
     * Get 设备所属的机房管理单元名称 
     * @return IdcUnitName 设备所属的机房管理单元名称
     */
    public String getIdcUnitName() {
        return this.IdcUnitName;
    }

    /**
     * Set 设备所属的机房管理单元名称
     * @param IdcUnitName 设备所属的机房管理单元名称
     */
    public void setIdcUnitName(String IdcUnitName) {
        this.IdcUnitName = IdcUnitName;
    }

    /**
     * Get 已上架设备所在的机架ID，未上架设备不返回 
     * @return RackId 已上架设备所在的机架ID，未上架设备不返回
     */
    public Long getRackId() {
        return this.RackId;
    }

    /**
     * Set 已上架设备所在的机架ID，未上架设备不返回
     * @param RackId 已上架设备所在的机架ID，未上架设备不返回
     */
    public void setRackId(Long RackId) {
        this.RackId = RackId;
    }

    /**
     * Get 服务器类型， 1 代表服务器， 7 代表 2U4S。只有设备类型为服务器时才返回 
     * @return ServerTypeId 服务器类型， 1 代表服务器， 7 代表 2U4S。只有设备类型为服务器时才返回
     */
    public Long getServerTypeId() {
        return this.ServerTypeId;
    }

    /**
     * Set 服务器类型， 1 代表服务器， 7 代表 2U4S。只有设备类型为服务器时才返回
     * @param ServerTypeId 服务器类型， 1 代表服务器， 7 代表 2U4S。只有设备类型为服务器时才返回
     */
    public void setServerTypeId(Long ServerTypeId) {
        this.ServerTypeId = ServerTypeId;
    }

    /**
     * Get 已上架设备所在的机架名称，未上架设备不返回 
     * @return RackName 已上架设备所在的机架名称，未上架设备不返回
     */
    public String getRackName() {
        return this.RackName;
    }

    /**
     * Set 已上架设备所在的机架名称，未上架设备不返回
     * @param RackName 已上架设备所在的机架名称，未上架设备不返回
     */
    public void setRackName(String RackName) {
        this.RackName = RackName;
    }

    /**
     * Get 已上架设备所在的机位编号，未上架设备不返回。只有设备类型为服务器时才返回 
     * @return PositionCode 已上架设备所在的机位编号，未上架设备不返回。只有设备类型为服务器时才返回
     */
    public Long getPositionCode() {
        return this.PositionCode;
    }

    /**
     * Set 已上架设备所在的机位编号，未上架设备不返回。只有设备类型为服务器时才返回
     * @param PositionCode 已上架设备所在的机位编号，未上架设备不返回。只有设备类型为服务器时才返回
     */
    public void setPositionCode(Long PositionCode) {
        this.PositionCode = PositionCode;
    }

    /**
     * Get 设备状态：POWER_ON 已开电 POWER_OFF 未开电 RACK_OFF 未上架 MOVING 搬迁中 
     * @return Status 设备状态：POWER_ON 已开电 POWER_OFF 未开电 RACK_OFF 未上架 MOVING 搬迁中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 设备状态：POWER_ON 已开电 POWER_OFF 未开电 RACK_OFF 未上架 MOVING 搬迁中
     * @param Status 设备状态：POWER_ON 已开电 POWER_OFF 未开电 RACK_OFF 未上架 MOVING 搬迁中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 设备最近一次的开电时间，YYYY-MM-DD 格式。 
     * @return PowerOnTime 设备最近一次的开电时间，YYYY-MM-DD 格式。
     */
    public String getPowerOnTime() {
        return this.PowerOnTime;
    }

    /**
     * Set 设备最近一次的开电时间，YYYY-MM-DD 格式。
     * @param PowerOnTime 设备最近一次的开电时间，YYYY-MM-DD 格式。
     */
    public void setPowerOnTime(String PowerOnTime) {
        this.PowerOnTime = PowerOnTime;
    }

    /**
     * Get 设备最近一次的上架时间，YYYY-MM-DD 格式。 
     * @return OnshelfDate 设备最近一次的上架时间，YYYY-MM-DD 格式。
     */
    public String getOnshelfDate() {
        return this.OnshelfDate;
    }

    /**
     * Set 设备最近一次的上架时间，YYYY-MM-DD 格式。
     * @param OnshelfDate 设备最近一次的上架时间，YYYY-MM-DD 格式。
     */
    public void setOnshelfDate(String OnshelfDate) {
        this.OnshelfDate = OnshelfDate;
    }

    /**
     * Get 设备类型 server 服务器，netDevice 网络设备 
     * @return DeviceType 设备类型 server 服务器，netDevice 网络设备
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型 server 服务器，netDevice 网络设备
     * @param DeviceType 设备类型 server 服务器，netDevice 网络设备
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 厂商 
     * @return Manufacturer 厂商
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 厂商
     * @param Manufacturer 厂商
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 其他设备-设备子类型 
     * @return TypeName 其他设备-设备子类型
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 其他设备-设备子类型
     * @param TypeName 其他设备-设备子类型
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 硬件备注 
     * @return HardwareMemo 硬件备注
     */
    public String getHardwareMemo() {
        return this.HardwareMemo;
    }

    /**
     * Set 硬件备注
     * @param HardwareMemo 硬件备注
     */
    public void setHardwareMemo(String HardwareMemo) {
        this.HardwareMemo = HardwareMemo;
    }

    public Device() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Device(Device source) {
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.SvrIsSpecial != null) {
            this.SvrIsSpecial = new Long(source.SvrIsSpecial);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.IdcName != null) {
            this.IdcName = new String(source.IdcName);
        }
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.IdcUnitId != null) {
            this.IdcUnitId = new Long(source.IdcUnitId);
        }
        if (source.IdcUnitName != null) {
            this.IdcUnitName = new String(source.IdcUnitName);
        }
        if (source.RackId != null) {
            this.RackId = new Long(source.RackId);
        }
        if (source.ServerTypeId != null) {
            this.ServerTypeId = new Long(source.ServerTypeId);
        }
        if (source.RackName != null) {
            this.RackName = new String(source.RackName);
        }
        if (source.PositionCode != null) {
            this.PositionCode = new Long(source.PositionCode);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PowerOnTime != null) {
            this.PowerOnTime = new String(source.PowerOnTime);
        }
        if (source.OnshelfDate != null) {
            this.OnshelfDate = new String(source.OnshelfDate);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.HardwareMemo != null) {
            this.HardwareMemo = new String(source.HardwareMemo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sn", this.Sn);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "SvrIsSpecial", this.SvrIsSpecial);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "IdcName", this.IdcName);
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "IdcUnitId", this.IdcUnitId);
        this.setParamSimple(map, prefix + "IdcUnitName", this.IdcUnitName);
        this.setParamSimple(map, prefix + "RackId", this.RackId);
        this.setParamSimple(map, prefix + "ServerTypeId", this.ServerTypeId);
        this.setParamSimple(map, prefix + "RackName", this.RackName);
        this.setParamSimple(map, prefix + "PositionCode", this.PositionCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PowerOnTime", this.PowerOnTime);
        this.setParamSimple(map, prefix + "OnshelfDate", this.OnshelfDate);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "HardwareMemo", this.HardwareMemo);

    }
}

