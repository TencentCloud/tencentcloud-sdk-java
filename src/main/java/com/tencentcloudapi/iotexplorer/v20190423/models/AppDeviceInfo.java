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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppDeviceInfo extends AbstractModel{

    /**
    * 产品ID/设备名
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备别名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * icon地址
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 家庭ID
    */
    @SerializedName("FamilyId")
    @Expose
    private String FamilyId;

    /**
    * 房间ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 产品ID/设备名 
     * @return DeviceId 产品ID/设备名
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 产品ID/设备名
     * @param DeviceId 产品ID/设备名
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备别名 
     * @return AliasName 设备别名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 设备别名
     * @param AliasName 设备别名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get icon地址 
     * @return IconUrl icon地址
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set icon地址
     * @param IconUrl icon地址
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 家庭ID 
     * @return FamilyId 家庭ID
     */
    public String getFamilyId() {
        return this.FamilyId;
    }

    /**
     * Set 家庭ID
     * @param FamilyId 家庭ID
     */
    public void setFamilyId(String FamilyId) {
        this.FamilyId = FamilyId;
    }

    /**
     * Get 房间ID 
     * @return RoomId 房间ID
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID
     * @param RoomId 房间ID
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 设备类型 
     * @return DeviceType 设备类型
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型
     * @param DeviceType 设备类型
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AppDeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppDeviceInfo(AppDeviceInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.FamilyId != null) {
            this.FamilyId = new String(source.FamilyId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "FamilyId", this.FamilyId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

