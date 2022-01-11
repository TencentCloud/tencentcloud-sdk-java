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

public class FamilySubDevice extends AbstractModel{

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 设备绑定的家庭ID
    */
    @SerializedName("FamilyId")
    @Expose
    private String FamilyId;

    /**
    * 设备所在的房间ID，默认"0"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 图标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * grid图标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IconUrlGrid")
    @Expose
    private String IconUrlGrid;

    /**
    * 设备绑定时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 设备更新时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
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
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasName 设备别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 设备别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasName 设备别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 设备绑定的家庭ID 
     * @return FamilyId 设备绑定的家庭ID
     */
    public String getFamilyId() {
        return this.FamilyId;
    }

    /**
     * Set 设备绑定的家庭ID
     * @param FamilyId 设备绑定的家庭ID
     */
    public void setFamilyId(String FamilyId) {
        this.FamilyId = FamilyId;
    }

    /**
     * Get 设备所在的房间ID，默认"0"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomId 设备所在的房间ID，默认"0"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 设备所在的房间ID，默认"0"
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomId 设备所在的房间ID，默认"0"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 图标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IconUrl 图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 图标
注意：此字段可能返回 null，表示取不到有效值。
     * @param IconUrl 图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get grid图标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IconUrlGrid grid图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIconUrlGrid() {
        return this.IconUrlGrid;
    }

    /**
     * Set grid图标
注意：此字段可能返回 null，表示取不到有效值。
     * @param IconUrlGrid grid图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIconUrlGrid(String IconUrlGrid) {
        this.IconUrlGrid = IconUrlGrid;
    }

    /**
     * Get 设备绑定时间戳 
     * @return CreateTime 设备绑定时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 设备绑定时间戳
     * @param CreateTime 设备绑定时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 设备更新时间戳 
     * @return UpdateTime 设备更新时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 设备更新时间戳
     * @param UpdateTime 设备更新时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public FamilySubDevice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FamilySubDevice(FamilySubDevice source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.FamilyId != null) {
            this.FamilyId = new String(source.FamilyId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.IconUrlGrid != null) {
            this.IconUrlGrid = new String(source.IconUrlGrid);
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
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "FamilyId", this.FamilyId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "IconUrlGrid", this.IconUrlGrid);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

