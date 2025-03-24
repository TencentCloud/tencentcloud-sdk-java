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

public class Position extends AbstractModel {

    /**
    * 机位ID
    */
    @SerializedName("PositionId")
    @Expose
    private Long PositionId;

    /**
    * 机位高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 机位编号
    */
    @SerializedName("PositionCode")
    @Expose
    private String PositionCode;

    /**
    * 机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留
    */
    @SerializedName("PositionStatus")
    @Expose
    private Long PositionStatus;

    /**
    * 设备规划类型ID
    */
    @SerializedName("PlanDeviceType")
    @Expose
    private Long PlanDeviceType;

    /**
    * 机位所属的机房管理单元ID
    */
    @SerializedName("IdcUnitId")
    @Expose
    private Long IdcUnitId;

    /**
    * 机位所属的机架ID
    */
    @SerializedName("RackId")
    @Expose
    private Long RackId;

    /**
    * 机位所属的机架名称
    */
    @SerializedName("RackName")
    @Expose
    private String RackName;

    /**
    * 机位所属的机房管理单元名称
    */
    @SerializedName("IdcUnitName")
    @Expose
    private String IdcUnitName;

    /**
    * 机位所属的机房名称
    */
    @SerializedName("IdcName")
    @Expose
    private String IdcName;

    /**
    * 机位所属的机房ID
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 机位上如果有设备，该字段代表设备的 SN 码，如果是空闲机位，不返回该字段。
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * 机位上如果有设备，该字段代表设备的固资号，如果是空闲机位，不返回该字段。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 机位上如果有设备，该字段代表设备的设备型号加版本号，如果是空闲机位，不返回该字段。
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
     * Get 机位ID 
     * @return PositionId 机位ID
     */
    public Long getPositionId() {
        return this.PositionId;
    }

    /**
     * Set 机位ID
     * @param PositionId 机位ID
     */
    public void setPositionId(Long PositionId) {
        this.PositionId = PositionId;
    }

    /**
     * Get 机位高度 
     * @return Height 机位高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 机位高度
     * @param Height 机位高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 机位编号 
     * @return PositionCode 机位编号
     */
    public String getPositionCode() {
        return this.PositionCode;
    }

    /**
     * Set 机位编号
     * @param PositionCode 机位编号
     */
    public void setPositionCode(String PositionCode) {
        this.PositionCode = PositionCode;
    }

    /**
     * Get 机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留 
     * @return PositionStatus 机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留
     */
    public Long getPositionStatus() {
        return this.PositionStatus;
    }

    /**
     * Set 机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留
     * @param PositionStatus 机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留
     */
    public void setPositionStatus(Long PositionStatus) {
        this.PositionStatus = PositionStatus;
    }

    /**
     * Get 设备规划类型ID 
     * @return PlanDeviceType 设备规划类型ID
     */
    public Long getPlanDeviceType() {
        return this.PlanDeviceType;
    }

    /**
     * Set 设备规划类型ID
     * @param PlanDeviceType 设备规划类型ID
     */
    public void setPlanDeviceType(Long PlanDeviceType) {
        this.PlanDeviceType = PlanDeviceType;
    }

    /**
     * Get 机位所属的机房管理单元ID 
     * @return IdcUnitId 机位所属的机房管理单元ID
     */
    public Long getIdcUnitId() {
        return this.IdcUnitId;
    }

    /**
     * Set 机位所属的机房管理单元ID
     * @param IdcUnitId 机位所属的机房管理单元ID
     */
    public void setIdcUnitId(Long IdcUnitId) {
        this.IdcUnitId = IdcUnitId;
    }

    /**
     * Get 机位所属的机架ID 
     * @return RackId 机位所属的机架ID
     */
    public Long getRackId() {
        return this.RackId;
    }

    /**
     * Set 机位所属的机架ID
     * @param RackId 机位所属的机架ID
     */
    public void setRackId(Long RackId) {
        this.RackId = RackId;
    }

    /**
     * Get 机位所属的机架名称 
     * @return RackName 机位所属的机架名称
     */
    public String getRackName() {
        return this.RackName;
    }

    /**
     * Set 机位所属的机架名称
     * @param RackName 机位所属的机架名称
     */
    public void setRackName(String RackName) {
        this.RackName = RackName;
    }

    /**
     * Get 机位所属的机房管理单元名称 
     * @return IdcUnitName 机位所属的机房管理单元名称
     */
    public String getIdcUnitName() {
        return this.IdcUnitName;
    }

    /**
     * Set 机位所属的机房管理单元名称
     * @param IdcUnitName 机位所属的机房管理单元名称
     */
    public void setIdcUnitName(String IdcUnitName) {
        this.IdcUnitName = IdcUnitName;
    }

    /**
     * Get 机位所属的机房名称 
     * @return IdcName 机位所属的机房名称
     */
    public String getIdcName() {
        return this.IdcName;
    }

    /**
     * Set 机位所属的机房名称
     * @param IdcName 机位所属的机房名称
     */
    public void setIdcName(String IdcName) {
        this.IdcName = IdcName;
    }

    /**
     * Get 机位所属的机房ID 
     * @return IdcId 机位所属的机房ID
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 机位所属的机房ID
     * @param IdcId 机位所属的机房ID
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get 机位上如果有设备，该字段代表设备的 SN 码，如果是空闲机位，不返回该字段。 
     * @return Sn 机位上如果有设备，该字段代表设备的 SN 码，如果是空闲机位，不返回该字段。
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set 机位上如果有设备，该字段代表设备的 SN 码，如果是空闲机位，不返回该字段。
     * @param Sn 机位上如果有设备，该字段代表设备的 SN 码，如果是空闲机位，不返回该字段。
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get 机位上如果有设备，该字段代表设备的固资号，如果是空闲机位，不返回该字段。 
     * @return AssetId 机位上如果有设备，该字段代表设备的固资号，如果是空闲机位，不返回该字段。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 机位上如果有设备，该字段代表设备的固资号，如果是空闲机位，不返回该字段。
     * @param AssetId 机位上如果有设备，该字段代表设备的固资号，如果是空闲机位，不返回该字段。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 机位上如果有设备，该字段代表设备的设备型号加版本号，如果是空闲机位，不返回该字段。 
     * @return ModelVersion 机位上如果有设备，该字段代表设备的设备型号加版本号，如果是空闲机位，不返回该字段。
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 机位上如果有设备，该字段代表设备的设备型号加版本号，如果是空闲机位，不返回该字段。
     * @param ModelVersion 机位上如果有设备，该字段代表设备的设备型号加版本号，如果是空闲机位，不返回该字段。
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    public Position() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Position(Position source) {
        if (source.PositionId != null) {
            this.PositionId = new Long(source.PositionId);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.PositionCode != null) {
            this.PositionCode = new String(source.PositionCode);
        }
        if (source.PositionStatus != null) {
            this.PositionStatus = new Long(source.PositionStatus);
        }
        if (source.PlanDeviceType != null) {
            this.PlanDeviceType = new Long(source.PlanDeviceType);
        }
        if (source.IdcUnitId != null) {
            this.IdcUnitId = new Long(source.IdcUnitId);
        }
        if (source.RackId != null) {
            this.RackId = new Long(source.RackId);
        }
        if (source.RackName != null) {
            this.RackName = new String(source.RackName);
        }
        if (source.IdcUnitName != null) {
            this.IdcUnitName = new String(source.IdcUnitName);
        }
        if (source.IdcName != null) {
            this.IdcName = new String(source.IdcName);
        }
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PositionId", this.PositionId);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PositionCode", this.PositionCode);
        this.setParamSimple(map, prefix + "PositionStatus", this.PositionStatus);
        this.setParamSimple(map, prefix + "PlanDeviceType", this.PlanDeviceType);
        this.setParamSimple(map, prefix + "IdcUnitId", this.IdcUnitId);
        this.setParamSimple(map, prefix + "RackId", this.RackId);
        this.setParamSimple(map, prefix + "RackName", this.RackName);
        this.setParamSimple(map, prefix + "IdcUnitName", this.IdcUnitName);
        this.setParamSimple(map, prefix + "IdcName", this.IdcName);
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "Sn", this.Sn);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);

    }
}

