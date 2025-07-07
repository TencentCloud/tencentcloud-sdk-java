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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceDataInfo extends AbstractModel {

    /**
    * 设备ID， wid
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备类型Id
    */
    @SerializedName("DeviceTypeCode")
    @Expose
    private String DeviceTypeCode;

    /**
    * 设备类型名称
    */
    @SerializedName("DeviceTypeName")
    @Expose
    private String DeviceTypeName;

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。
    */
    @SerializedName("ProductAbility")
    @Expose
    private Long ProductAbility;

    /**
    * 设备位置信息
    */
    @SerializedName("SpaceInfoSet")
    @Expose
    private DeviceSpaceInfo [] SpaceInfoSet;

    /**
    * 模型id
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 设备标签名，非必填
    */
    @SerializedName("DeviceTagSet")
    @Expose
    private String [] DeviceTagSet;

    /**
    * 激活状态（1激活、0未激活）
    */
    @SerializedName("IsActive")
    @Expose
    private Long IsActive;

    /**
    *  激活时间
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * 推流状态（推流中、未推流） 仅摄像机有的状态
    */
    @SerializedName("IsLive")
    @Expose
    private Boolean IsLive;

    /**
    * 设备所属父设备id（子设备才有）
    */
    @SerializedName("ParentWID")
    @Expose
    private String ParentWID;

    /**
    * 设备所有父设备名称（子设备才有）
    */
    @SerializedName("ParentWIDName")
    @Expose
    private String ParentWIDName;

    /**
    * 序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 设备点位坐标值
    */
    @SerializedName("Location")
    @Expose
    private DeviceLocation Location;

    /**
    * 自定义字段
    */
    @SerializedName("FieldList")
    @Expose
    private CustomFieldInfo [] FieldList;

    /**
    * 分组信息
    */
    @SerializedName("GroupInfo")
    @Expose
    private String GroupInfo;

    /**
    * 通信在/离线状态（online=normal+fault，offline）
    */
    @SerializedName("DeviceStatus")
    @Expose
    private String DeviceStatus;

    /**
    * 设备业务状态（normal、fault、offline）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 设备ID， wid 
     * @return WID 设备ID， wid
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备ID， wid
     * @param WID 设备ID， wid
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备类型Id 
     * @return DeviceTypeCode 设备类型Id
     */
    public String getDeviceTypeCode() {
        return this.DeviceTypeCode;
    }

    /**
     * Set 设备类型Id
     * @param DeviceTypeCode 设备类型Id
     */
    public void setDeviceTypeCode(String DeviceTypeCode) {
        this.DeviceTypeCode = DeviceTypeCode;
    }

    /**
     * Get 设备类型名称 
     * @return DeviceTypeName 设备类型名称
     */
    public String getDeviceTypeName() {
        return this.DeviceTypeName;
    }

    /**
     * Set 设备类型名称
     * @param DeviceTypeName 设备类型名称
     */
    public void setDeviceTypeName(String DeviceTypeName) {
        this.DeviceTypeName = DeviceTypeName;
    }

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。 
     * @return ProductAbility 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。
     */
    public Long getProductAbility() {
        return this.ProductAbility;
    }

    /**
     * Set 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。
     * @param ProductAbility 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。
     */
    public void setProductAbility(Long ProductAbility) {
        this.ProductAbility = ProductAbility;
    }

    /**
     * Get 设备位置信息 
     * @return SpaceInfoSet 设备位置信息
     */
    public DeviceSpaceInfo [] getSpaceInfoSet() {
        return this.SpaceInfoSet;
    }

    /**
     * Set 设备位置信息
     * @param SpaceInfoSet 设备位置信息
     */
    public void setSpaceInfoSet(DeviceSpaceInfo [] SpaceInfoSet) {
        this.SpaceInfoSet = SpaceInfoSet;
    }

    /**
     * Get 模型id 
     * @return ModelId 模型id
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型id
     * @param ModelId 模型id
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 模型名称 
     * @return ModelName 模型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
     * @param ModelName 模型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 设备标签名，非必填 
     * @return DeviceTagSet 设备标签名，非必填
     */
    public String [] getDeviceTagSet() {
        return this.DeviceTagSet;
    }

    /**
     * Set 设备标签名，非必填
     * @param DeviceTagSet 设备标签名，非必填
     */
    public void setDeviceTagSet(String [] DeviceTagSet) {
        this.DeviceTagSet = DeviceTagSet;
    }

    /**
     * Get 激活状态（1激活、0未激活） 
     * @return IsActive 激活状态（1激活、0未激活）
     */
    public Long getIsActive() {
        return this.IsActive;
    }

    /**
     * Set 激活状态（1激活、0未激活）
     * @param IsActive 激活状态（1激活、0未激活）
     */
    public void setIsActive(Long IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * Get  激活时间 
     * @return ActiveTime  激活时间
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set  激活时间
     * @param ActiveTime  激活时间
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 推流状态（推流中、未推流） 仅摄像机有的状态 
     * @return IsLive 推流状态（推流中、未推流） 仅摄像机有的状态
     */
    public Boolean getIsLive() {
        return this.IsLive;
    }

    /**
     * Set 推流状态（推流中、未推流） 仅摄像机有的状态
     * @param IsLive 推流状态（推流中、未推流） 仅摄像机有的状态
     */
    public void setIsLive(Boolean IsLive) {
        this.IsLive = IsLive;
    }

    /**
     * Get 设备所属父设备id（子设备才有） 
     * @return ParentWID 设备所属父设备id（子设备才有）
     */
    public String getParentWID() {
        return this.ParentWID;
    }

    /**
     * Set 设备所属父设备id（子设备才有）
     * @param ParentWID 设备所属父设备id（子设备才有）
     */
    public void setParentWID(String ParentWID) {
        this.ParentWID = ParentWID;
    }

    /**
     * Get 设备所有父设备名称（子设备才有） 
     * @return ParentWIDName 设备所有父设备名称（子设备才有）
     */
    public String getParentWIDName() {
        return this.ParentWIDName;
    }

    /**
     * Set 设备所有父设备名称（子设备才有）
     * @param ParentWIDName 设备所有父设备名称（子设备才有）
     */
    public void setParentWIDName(String ParentWIDName) {
        this.ParentWIDName = ParentWIDName;
    }

    /**
     * Get 序列号 
     * @return SN 序列号
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 序列号
     * @param SN 序列号
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get 设备点位坐标值 
     * @return Location 设备点位坐标值
     */
    public DeviceLocation getLocation() {
        return this.Location;
    }

    /**
     * Set 设备点位坐标值
     * @param Location 设备点位坐标值
     */
    public void setLocation(DeviceLocation Location) {
        this.Location = Location;
    }

    /**
     * Get 自定义字段 
     * @return FieldList 自定义字段
     */
    public CustomFieldInfo [] getFieldList() {
        return this.FieldList;
    }

    /**
     * Set 自定义字段
     * @param FieldList 自定义字段
     */
    public void setFieldList(CustomFieldInfo [] FieldList) {
        this.FieldList = FieldList;
    }

    /**
     * Get 分组信息 
     * @return GroupInfo 分组信息
     */
    public String getGroupInfo() {
        return this.GroupInfo;
    }

    /**
     * Set 分组信息
     * @param GroupInfo 分组信息
     */
    public void setGroupInfo(String GroupInfo) {
        this.GroupInfo = GroupInfo;
    }

    /**
     * Get 通信在/离线状态（online=normal+fault，offline） 
     * @return DeviceStatus 通信在/离线状态（online=normal+fault，offline）
     */
    public String getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * Set 通信在/离线状态（online=normal+fault，offline）
     * @param DeviceStatus 通信在/离线状态（online=normal+fault，offline）
     */
    public void setDeviceStatus(String DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * Get 设备业务状态（normal、fault、offline） 
     * @return Status 设备业务状态（normal、fault、offline）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 设备业务状态（normal、fault、offline）
     * @param Status 设备业务状态（normal、fault、offline）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DeviceDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceDataInfo(DeviceDataInfo source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceTypeCode != null) {
            this.DeviceTypeCode = new String(source.DeviceTypeCode);
        }
        if (source.DeviceTypeName != null) {
            this.DeviceTypeName = new String(source.DeviceTypeName);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductAbility != null) {
            this.ProductAbility = new Long(source.ProductAbility);
        }
        if (source.SpaceInfoSet != null) {
            this.SpaceInfoSet = new DeviceSpaceInfo[source.SpaceInfoSet.length];
            for (int i = 0; i < source.SpaceInfoSet.length; i++) {
                this.SpaceInfoSet[i] = new DeviceSpaceInfo(source.SpaceInfoSet[i]);
            }
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.DeviceTagSet != null) {
            this.DeviceTagSet = new String[source.DeviceTagSet.length];
            for (int i = 0; i < source.DeviceTagSet.length; i++) {
                this.DeviceTagSet[i] = new String(source.DeviceTagSet[i]);
            }
        }
        if (source.IsActive != null) {
            this.IsActive = new Long(source.IsActive);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.IsLive != null) {
            this.IsLive = new Boolean(source.IsLive);
        }
        if (source.ParentWID != null) {
            this.ParentWID = new String(source.ParentWID);
        }
        if (source.ParentWIDName != null) {
            this.ParentWIDName = new String(source.ParentWIDName);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.Location != null) {
            this.Location = new DeviceLocation(source.Location);
        }
        if (source.FieldList != null) {
            this.FieldList = new CustomFieldInfo[source.FieldList.length];
            for (int i = 0; i < source.FieldList.length; i++) {
                this.FieldList[i] = new CustomFieldInfo(source.FieldList[i]);
            }
        }
        if (source.GroupInfo != null) {
            this.GroupInfo = new String(source.GroupInfo);
        }
        if (source.DeviceStatus != null) {
            this.DeviceStatus = new String(source.DeviceStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceTypeCode", this.DeviceTypeCode);
        this.setParamSimple(map, prefix + "DeviceTypeName", this.DeviceTypeName);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductAbility", this.ProductAbility);
        this.setParamArrayObj(map, prefix + "SpaceInfoSet.", this.SpaceInfoSet);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArraySimple(map, prefix + "DeviceTagSet.", this.DeviceTagSet);
        this.setParamSimple(map, prefix + "IsActive", this.IsActive);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "IsLive", this.IsLive);
        this.setParamSimple(map, prefix + "ParentWID", this.ParentWID);
        this.setParamSimple(map, prefix + "ParentWIDName", this.ParentWIDName);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamArrayObj(map, prefix + "FieldList.", this.FieldList);
        this.setParamSimple(map, prefix + "GroupInfo", this.GroupInfo);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

