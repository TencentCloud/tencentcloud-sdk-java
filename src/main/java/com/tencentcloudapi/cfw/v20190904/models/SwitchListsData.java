/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchListsData extends AbstractModel{

    /**
    * 公网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntranetIp")
    @Expose
    private String IntranetIp;

    /**
    * 实例名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 防火墙开关
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * id值
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpType")
    @Expose
    private Long PublicIpType;

    /**
    * 风险端口数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PortTimes")
    @Expose
    private Long PortTimes;

    /**
    * 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 扫描深度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanMode")
    @Expose
    private String ScanMode;

    /**
    * 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
     * Get 公网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntranetIp 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntranetIp() {
        return this.IntranetIp;
    }

    /**
     * Set 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntranetIp 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntranetIp(String IntranetIp) {
        this.IntranetIp = IntranetIp;
    }

    /**
     * Get 实例名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 防火墙开关 
     * @return Switch 防火墙开关
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set 防火墙开关
     * @param Switch 防火墙开关
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * Get id值 
     * @return Id id值
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id值
     * @param Id id值
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpType 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublicIpType() {
        return this.PublicIpType;
    }

    /**
     * Set 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpType 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpType(Long PublicIpType) {
        this.PublicIpType = PublicIpType;
    }

    /**
     * Get 风险端口数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PortTimes 风险端口数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPortTimes() {
        return this.PortTimes;
    }

    /**
     * Set 风险端口数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PortTimes 风险端口数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPortTimes(Long PortTimes) {
        this.PortTimes = PortTimes;
    }

    /**
     * Get 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 扫描深度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanMode 扫描深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanMode() {
        return this.ScanMode;
    }

    /**
     * Set 扫描深度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanMode 扫描深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanMode(String ScanMode) {
        this.ScanMode = ScanMode;
    }

    /**
     * Get 扫描状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanStatus 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanStatus 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    public SwitchListsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchListsData(SwitchListsData source) {
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.IntranetIp != null) {
            this.IntranetIp = new String(source.IntranetIp);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Switch != null) {
            this.Switch = new Long(source.Switch);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PublicIpType != null) {
            this.PublicIpType = new Long(source.PublicIpType);
        }
        if (source.PortTimes != null) {
            this.PortTimes = new Long(source.PortTimes);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.ScanMode != null) {
            this.ScanMode = new String(source.ScanMode);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "IntranetIp", this.IntranetIp);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PublicIpType", this.PublicIpType);
        this.setParamSimple(map, prefix + "PortTimes", this.PortTimes);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "ScanMode", this.ScanMode);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);

    }
}

