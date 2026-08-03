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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateL3CidrRequest extends AbstractModel {

    /**
    * <p>互通规则ID</p>
    */
    @SerializedName("L3ConnId")
    @Expose
    private String L3ConnId;

    /**
    * <p>互通规则CIDR</p>
    */
    @SerializedName("Cidr1")
    @Expose
    private String Cidr1;

    /**
    * <p>互通设备ID</p>
    */
    @SerializedName("DeviceId1")
    @Expose
    private String DeviceId1;

    /**
    * <p>互通设备ID</p>
    */
    @SerializedName("DeviceId2")
    @Expose
    private String DeviceId2;

    /**
    * <p>互通规则CIDR</p>
    */
    @SerializedName("Cidr2")
    @Expose
    private String Cidr2;

    /**
     * Get <p>互通规则ID</p> 
     * @return L3ConnId <p>互通规则ID</p>
     */
    public String getL3ConnId() {
        return this.L3ConnId;
    }

    /**
     * Set <p>互通规则ID</p>
     * @param L3ConnId <p>互通规则ID</p>
     */
    public void setL3ConnId(String L3ConnId) {
        this.L3ConnId = L3ConnId;
    }

    /**
     * Get <p>互通规则CIDR</p> 
     * @return Cidr1 <p>互通规则CIDR</p>
     */
    public String getCidr1() {
        return this.Cidr1;
    }

    /**
     * Set <p>互通规则CIDR</p>
     * @param Cidr1 <p>互通规则CIDR</p>
     */
    public void setCidr1(String Cidr1) {
        this.Cidr1 = Cidr1;
    }

    /**
     * Get <p>互通设备ID</p> 
     * @return DeviceId1 <p>互通设备ID</p>
     */
    public String getDeviceId1() {
        return this.DeviceId1;
    }

    /**
     * Set <p>互通设备ID</p>
     * @param DeviceId1 <p>互通设备ID</p>
     */
    public void setDeviceId1(String DeviceId1) {
        this.DeviceId1 = DeviceId1;
    }

    /**
     * Get <p>互通设备ID</p> 
     * @return DeviceId2 <p>互通设备ID</p>
     */
    public String getDeviceId2() {
        return this.DeviceId2;
    }

    /**
     * Set <p>互通设备ID</p>
     * @param DeviceId2 <p>互通设备ID</p>
     */
    public void setDeviceId2(String DeviceId2) {
        this.DeviceId2 = DeviceId2;
    }

    /**
     * Get <p>互通规则CIDR</p> 
     * @return Cidr2 <p>互通规则CIDR</p>
     */
    public String getCidr2() {
        return this.Cidr2;
    }

    /**
     * Set <p>互通规则CIDR</p>
     * @param Cidr2 <p>互通规则CIDR</p>
     */
    public void setCidr2(String Cidr2) {
        this.Cidr2 = Cidr2;
    }

    public UpdateL3CidrRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateL3CidrRequest(UpdateL3CidrRequest source) {
        if (source.L3ConnId != null) {
            this.L3ConnId = new String(source.L3ConnId);
        }
        if (source.Cidr1 != null) {
            this.Cidr1 = new String(source.Cidr1);
        }
        if (source.DeviceId1 != null) {
            this.DeviceId1 = new String(source.DeviceId1);
        }
        if (source.DeviceId2 != null) {
            this.DeviceId2 = new String(source.DeviceId2);
        }
        if (source.Cidr2 != null) {
            this.Cidr2 = new String(source.Cidr2);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "L3ConnId", this.L3ConnId);
        this.setParamSimple(map, prefix + "Cidr1", this.Cidr1);
        this.setParamSimple(map, prefix + "DeviceId1", this.DeviceId1);
        this.setParamSimple(map, prefix + "DeviceId2", this.DeviceId2);
        this.setParamSimple(map, prefix + "Cidr2", this.Cidr2);

    }
}

