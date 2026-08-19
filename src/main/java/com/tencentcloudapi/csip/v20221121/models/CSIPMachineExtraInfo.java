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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CSIPMachineExtraInfo extends AbstractModel {

    /**
    * <p>公网IP</p>
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>实例ID（CVM/BM/ECM唯一标识）</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get <p>公网IP</p> 
     * @return WanIP <p>公网IP</p>
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set <p>公网IP</p>
     * @param WanIP <p>公网IP</p>
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get <p>内网IP</p> 
     * @return PrivateIP <p>内网IP</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>内网IP</p>
     * @param PrivateIP <p>内网IP</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>实例ID（CVM/BM/ECM唯一标识）</p> 
     * @return InstanceID <p>实例ID（CVM/BM/ECM唯一标识）</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID（CVM/BM/ECM唯一标识）</p>
     * @param InstanceID <p>实例ID（CVM/BM/ECM唯一标识）</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public CSIPMachineExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CSIPMachineExtraInfo(CSIPMachineExtraInfo source) {
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

