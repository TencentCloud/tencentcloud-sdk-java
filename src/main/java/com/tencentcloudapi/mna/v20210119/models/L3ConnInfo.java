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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L3ConnInfo extends AbstractModel {

    /**
    * 互通规则ID
    */
    @SerializedName("L3ConnId")
    @Expose
    private String L3ConnId;

    /**
    * 互通设备ID
    */
    @SerializedName("DeviceId1")
    @Expose
    private String DeviceId1;

    /**
    * 互通规则CIDR
    */
    @SerializedName("Cidr1")
    @Expose
    private String Cidr1;

    /**
    * 互通设备ID
    */
    @SerializedName("DeviceId2")
    @Expose
    private String DeviceId2;

    /**
    * 互通规则CIDR
    */
    @SerializedName("Cidr2")
    @Expose
    private String Cidr2;

    /**
    * 互通规则启用状态
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 互通规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 互通规则ID 
     * @return L3ConnId 互通规则ID
     */
    public String getL3ConnId() {
        return this.L3ConnId;
    }

    /**
     * Set 互通规则ID
     * @param L3ConnId 互通规则ID
     */
    public void setL3ConnId(String L3ConnId) {
        this.L3ConnId = L3ConnId;
    }

    /**
     * Get 互通设备ID 
     * @return DeviceId1 互通设备ID
     */
    public String getDeviceId1() {
        return this.DeviceId1;
    }

    /**
     * Set 互通设备ID
     * @param DeviceId1 互通设备ID
     */
    public void setDeviceId1(String DeviceId1) {
        this.DeviceId1 = DeviceId1;
    }

    /**
     * Get 互通规则CIDR 
     * @return Cidr1 互通规则CIDR
     */
    public String getCidr1() {
        return this.Cidr1;
    }

    /**
     * Set 互通规则CIDR
     * @param Cidr1 互通规则CIDR
     */
    public void setCidr1(String Cidr1) {
        this.Cidr1 = Cidr1;
    }

    /**
     * Get 互通设备ID 
     * @return DeviceId2 互通设备ID
     */
    public String getDeviceId2() {
        return this.DeviceId2;
    }

    /**
     * Set 互通设备ID
     * @param DeviceId2 互通设备ID
     */
    public void setDeviceId2(String DeviceId2) {
        this.DeviceId2 = DeviceId2;
    }

    /**
     * Get 互通规则CIDR 
     * @return Cidr2 互通规则CIDR
     */
    public String getCidr2() {
        return this.Cidr2;
    }

    /**
     * Set 互通规则CIDR
     * @param Cidr2 互通规则CIDR
     */
    public void setCidr2(String Cidr2) {
        this.Cidr2 = Cidr2;
    }

    /**
     * Get 互通规则启用状态 
     * @return Enable 互通规则启用状态
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 互通规则启用状态
     * @param Enable 互通规则启用状态
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 互通规则描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 互通规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 互通规则描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 互通规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public L3ConnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L3ConnInfo(L3ConnInfo source) {
        if (source.L3ConnId != null) {
            this.L3ConnId = new String(source.L3ConnId);
        }
        if (source.DeviceId1 != null) {
            this.DeviceId1 = new String(source.DeviceId1);
        }
        if (source.Cidr1 != null) {
            this.Cidr1 = new String(source.Cidr1);
        }
        if (source.DeviceId2 != null) {
            this.DeviceId2 = new String(source.DeviceId2);
        }
        if (source.Cidr2 != null) {
            this.Cidr2 = new String(source.Cidr2);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "L3ConnId", this.L3ConnId);
        this.setParamSimple(map, prefix + "DeviceId1", this.DeviceId1);
        this.setParamSimple(map, prefix + "Cidr1", this.Cidr1);
        this.setParamSimple(map, prefix + "DeviceId2", this.DeviceId2);
        this.setParamSimple(map, prefix + "Cidr2", this.Cidr2);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

