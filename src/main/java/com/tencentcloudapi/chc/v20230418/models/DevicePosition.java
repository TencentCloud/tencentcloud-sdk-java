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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DevicePosition extends AbstractModel {

    /**
    * 设备SN
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * 机架名称
    */
    @SerializedName("RackName")
    @Expose
    private String RackName;

    /**
    * 机房管理单元ID
    */
    @SerializedName("IdcUnitId")
    @Expose
    private Long IdcUnitId;

    /**
    * 机房名称
    */
    @SerializedName("IdcName")
    @Expose
    private String IdcName;

    /**
    * 机房管理单元名称
    */
    @SerializedName("IdcUnitName")
    @Expose
    private String IdcUnitName;

    /**
    * 设备固资。只有服务器设备才需要这个值
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 机位编号，只有服务器设备才需要传这个值
    */
    @SerializedName("PositionCode")
    @Expose
    private Long PositionCode;

    /**
    * server 代表服务器，netDevice 代表网络设备
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 设备SN 
     * @return Sn 设备SN
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set 设备SN
     * @param Sn 设备SN
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get 机架名称 
     * @return RackName 机架名称
     */
    public String getRackName() {
        return this.RackName;
    }

    /**
     * Set 机架名称
     * @param RackName 机架名称
     */
    public void setRackName(String RackName) {
        this.RackName = RackName;
    }

    /**
     * Get 机房管理单元ID 
     * @return IdcUnitId 机房管理单元ID
     */
    public Long getIdcUnitId() {
        return this.IdcUnitId;
    }

    /**
     * Set 机房管理单元ID
     * @param IdcUnitId 机房管理单元ID
     */
    public void setIdcUnitId(Long IdcUnitId) {
        this.IdcUnitId = IdcUnitId;
    }

    /**
     * Get 机房名称 
     * @return IdcName 机房名称
     */
    public String getIdcName() {
        return this.IdcName;
    }

    /**
     * Set 机房名称
     * @param IdcName 机房名称
     */
    public void setIdcName(String IdcName) {
        this.IdcName = IdcName;
    }

    /**
     * Get 机房管理单元名称 
     * @return IdcUnitName 机房管理单元名称
     */
    public String getIdcUnitName() {
        return this.IdcUnitName;
    }

    /**
     * Set 机房管理单元名称
     * @param IdcUnitName 机房管理单元名称
     */
    public void setIdcUnitName(String IdcUnitName) {
        this.IdcUnitName = IdcUnitName;
    }

    /**
     * Get 设备固资。只有服务器设备才需要这个值 
     * @return AssetId 设备固资。只有服务器设备才需要这个值
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 设备固资。只有服务器设备才需要这个值
     * @param AssetId 设备固资。只有服务器设备才需要这个值
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 机位编号，只有服务器设备才需要传这个值 
     * @return PositionCode 机位编号，只有服务器设备才需要传这个值
     */
    public Long getPositionCode() {
        return this.PositionCode;
    }

    /**
     * Set 机位编号，只有服务器设备才需要传这个值
     * @param PositionCode 机位编号，只有服务器设备才需要传这个值
     */
    public void setPositionCode(Long PositionCode) {
        this.PositionCode = PositionCode;
    }

    /**
     * Get server 代表服务器，netDevice 代表网络设备 
     * @return DeviceType server 代表服务器，netDevice 代表网络设备
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set server 代表服务器，netDevice 代表网络设备
     * @param DeviceType server 代表服务器，netDevice 代表网络设备
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public DevicePosition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DevicePosition(DevicePosition source) {
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
        if (source.RackName != null) {
            this.RackName = new String(source.RackName);
        }
        if (source.IdcUnitId != null) {
            this.IdcUnitId = new Long(source.IdcUnitId);
        }
        if (source.IdcName != null) {
            this.IdcName = new String(source.IdcName);
        }
        if (source.IdcUnitName != null) {
            this.IdcUnitName = new String(source.IdcUnitName);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.PositionCode != null) {
            this.PositionCode = new Long(source.PositionCode);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sn", this.Sn);
        this.setParamSimple(map, prefix + "RackName", this.RackName);
        this.setParamSimple(map, prefix + "IdcUnitId", this.IdcUnitId);
        this.setParamSimple(map, prefix + "IdcName", this.IdcName);
        this.setParamSimple(map, prefix + "IdcUnitName", this.IdcUnitName);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "PositionCode", this.PositionCode);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

