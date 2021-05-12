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

public class LoRaGatewayItem extends AbstractModel{

    /**
    * LoRa 网关Id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 是否是公开网关
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * 网关描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 网关名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网关位置信息
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 网关位置详情
    */
    @SerializedName("PositionDetails")
    @Expose
    private String PositionDetails;

    /**
    * LoRa 网关位置坐标
    */
    @SerializedName("Location")
    @Expose
    private LoRaGatewayLocation Location;

    /**
    * 最后更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 最后上报时间
    */
    @SerializedName("LastSeenAt")
    @Expose
    private String LastSeenAt;

    /**
    * 频点ID
    */
    @SerializedName("FrequencyId")
    @Expose
    private String FrequencyId;

    /**
     * Get LoRa 网关Id 
     * @return GatewayId LoRa 网关Id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set LoRa 网关Id
     * @param GatewayId LoRa 网关Id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 是否是公开网关 
     * @return IsPublic 是否是公开网关
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否是公开网关
     * @param IsPublic 是否是公开网关
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 网关描述 
     * @return Description 网关描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 网关描述
     * @param Description 网关描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 网关名称 
     * @return Name 网关名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网关名称
     * @param Name 网关名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网关位置信息 
     * @return Position 网关位置信息
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 网关位置信息
     * @param Position 网关位置信息
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 网关位置详情 
     * @return PositionDetails 网关位置详情
     */
    public String getPositionDetails() {
        return this.PositionDetails;
    }

    /**
     * Set 网关位置详情
     * @param PositionDetails 网关位置详情
     */
    public void setPositionDetails(String PositionDetails) {
        this.PositionDetails = PositionDetails;
    }

    /**
     * Get LoRa 网关位置坐标 
     * @return Location LoRa 网关位置坐标
     */
    public LoRaGatewayLocation getLocation() {
        return this.Location;
    }

    /**
     * Set LoRa 网关位置坐标
     * @param Location LoRa 网关位置坐标
     */
    public void setLocation(LoRaGatewayLocation Location) {
        this.Location = Location;
    }

    /**
     * Get 最后更新时间 
     * @return UpdatedAt 最后更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 最后更新时间
     * @param UpdatedAt 最后更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 最后上报时间 
     * @return LastSeenAt 最后上报时间
     */
    public String getLastSeenAt() {
        return this.LastSeenAt;
    }

    /**
     * Set 最后上报时间
     * @param LastSeenAt 最后上报时间
     */
    public void setLastSeenAt(String LastSeenAt) {
        this.LastSeenAt = LastSeenAt;
    }

    /**
     * Get 频点ID 
     * @return FrequencyId 频点ID
     */
    public String getFrequencyId() {
        return this.FrequencyId;
    }

    /**
     * Set 频点ID
     * @param FrequencyId 频点ID
     */
    public void setFrequencyId(String FrequencyId) {
        this.FrequencyId = FrequencyId;
    }

    public LoRaGatewayItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoRaGatewayItem(LoRaGatewayItem source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.PositionDetails != null) {
            this.PositionDetails = new String(source.PositionDetails);
        }
        if (source.Location != null) {
            this.Location = new LoRaGatewayLocation(source.Location);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.LastSeenAt != null) {
            this.LastSeenAt = new String(source.LastSeenAt);
        }
        if (source.FrequencyId != null) {
            this.FrequencyId = new String(source.FrequencyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "PositionDetails", this.PositionDetails);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "LastSeenAt", this.LastSeenAt);
        this.setParamSimple(map, prefix + "FrequencyId", this.FrequencyId);

    }
}

