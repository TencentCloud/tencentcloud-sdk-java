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

public class ModifyLoRaGatewayRequest extends AbstractModel{

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * LoRa网关Id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * LoRa网关位置坐标
    */
    @SerializedName("Location")
    @Expose
    private LoRaGatewayLocation Location;

    /**
    * LoRa网关名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否公开可见
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * 位置信息
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 位置详情
    */
    @SerializedName("PositionDetails")
    @Expose
    private String PositionDetails;

    /**
    * 频点ID
    */
    @SerializedName("FrequencyId")
    @Expose
    private String FrequencyId;

    /**
     * Get 描述信息 
     * @return Description 描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
     * @param Description 描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get LoRa网关Id 
     * @return GatewayId LoRa网关Id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set LoRa网关Id
     * @param GatewayId LoRa网关Id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get LoRa网关位置坐标 
     * @return Location LoRa网关位置坐标
     */
    public LoRaGatewayLocation getLocation() {
        return this.Location;
    }

    /**
     * Set LoRa网关位置坐标
     * @param Location LoRa网关位置坐标
     */
    public void setLocation(LoRaGatewayLocation Location) {
        this.Location = Location;
    }

    /**
     * Get LoRa网关名称 
     * @return Name LoRa网关名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set LoRa网关名称
     * @param Name LoRa网关名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否公开可见 
     * @return IsPublic 是否公开可见
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否公开可见
     * @param IsPublic 是否公开可见
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 位置信息 
     * @return Position 位置信息
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 位置信息
     * @param Position 位置信息
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 位置详情 
     * @return PositionDetails 位置详情
     */
    public String getPositionDetails() {
        return this.PositionDetails;
    }

    /**
     * Set 位置详情
     * @param PositionDetails 位置详情
     */
    public void setPositionDetails(String PositionDetails) {
        this.PositionDetails = PositionDetails;
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

    public ModifyLoRaGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoRaGatewayRequest(ModifyLoRaGatewayRequest source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Location != null) {
            this.Location = new LoRaGatewayLocation(source.Location);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.PositionDetails != null) {
            this.PositionDetails = new String(source.PositionDetails);
        }
        if (source.FrequencyId != null) {
            this.FrequencyId = new String(source.FrequencyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "PositionDetails", this.PositionDetails);
        this.setParamSimple(map, prefix + "FrequencyId", this.FrequencyId);

    }
}

