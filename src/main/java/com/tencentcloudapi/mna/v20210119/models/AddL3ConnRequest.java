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

public class AddL3ConnRequest extends AbstractModel {

    /**
    * 设置互通网段CIDR1，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255
    */
    @SerializedName("Cidr1")
    @Expose
    private String Cidr1;

    /**
    * 设置互通网段CIDR2，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255
    */
    @SerializedName("Cidr2")
    @Expose
    private String Cidr2;

    /**
    * CIDR1对应的设备ID
    */
    @SerializedName("DeviceId1")
    @Expose
    private String DeviceId1;

    /**
    * CIDR2对应的设备ID
    */
    @SerializedName("DeviceId2")
    @Expose
    private String DeviceId2;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 设置互通网段CIDR1，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255 
     * @return Cidr1 设置互通网段CIDR1，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255
     */
    public String getCidr1() {
        return this.Cidr1;
    }

    /**
     * Set 设置互通网段CIDR1，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255
     * @param Cidr1 设置互通网段CIDR1，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255
     */
    public void setCidr1(String Cidr1) {
        this.Cidr1 = Cidr1;
    }

    /**
     * Get 设置互通网段CIDR2，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255 
     * @return Cidr2 设置互通网段CIDR2，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255
     */
    public String getCidr2() {
        return this.Cidr2;
    }

    /**
     * Set 设置互通网段CIDR2，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255
     * @param Cidr2 设置互通网段CIDR2，支持： 10.0.0.0 - 10.255.255.255，172.16.0.0 - 172.31.255.255，192.168.0.0 - 192.168.255.255
     */
    public void setCidr2(String Cidr2) {
        this.Cidr2 = Cidr2;
    }

    /**
     * Get CIDR1对应的设备ID 
     * @return DeviceId1 CIDR1对应的设备ID
     */
    public String getDeviceId1() {
        return this.DeviceId1;
    }

    /**
     * Set CIDR1对应的设备ID
     * @param DeviceId1 CIDR1对应的设备ID
     */
    public void setDeviceId1(String DeviceId1) {
        this.DeviceId1 = DeviceId1;
    }

    /**
     * Get CIDR2对应的设备ID 
     * @return DeviceId2 CIDR2对应的设备ID
     */
    public String getDeviceId2() {
        return this.DeviceId2;
    }

    /**
     * Set CIDR2对应的设备ID
     * @param DeviceId2 CIDR2对应的设备ID
     */
    public void setDeviceId2(String DeviceId2) {
        this.DeviceId2 = DeviceId2;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AddL3ConnRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddL3ConnRequest(AddL3ConnRequest source) {
        if (source.Cidr1 != null) {
            this.Cidr1 = new String(source.Cidr1);
        }
        if (source.Cidr2 != null) {
            this.Cidr2 = new String(source.Cidr2);
        }
        if (source.DeviceId1 != null) {
            this.DeviceId1 = new String(source.DeviceId1);
        }
        if (source.DeviceId2 != null) {
            this.DeviceId2 = new String(source.DeviceId2);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cidr1", this.Cidr1);
        this.setParamSimple(map, prefix + "Cidr2", this.Cidr2);
        this.setParamSimple(map, prefix + "DeviceId1", this.DeviceId1);
        this.setParamSimple(map, prefix + "DeviceId2", this.DeviceId2);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

