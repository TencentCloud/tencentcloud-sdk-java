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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpInfo extends AbstractModel {

    /**
    * 10.100.0.20
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * epn-asdfghjkl
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * epm-asdfghjkl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Unbound
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Ipv4
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 2026-04-07T00:00:00
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 2026-04-07T00:00:00
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 10.100.0.20 
     * @return Ip 10.100.0.20
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 10.100.0.20
     * @param Ip 10.100.0.20
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get epn-asdfghjkl 
     * @return NetworkInstanceId epn-asdfghjkl
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set epn-asdfghjkl
     * @param NetworkInstanceId epn-asdfghjkl
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get epm-asdfghjkl 
     * @return InstanceId epm-asdfghjkl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set epm-asdfghjkl
     * @param InstanceId epm-asdfghjkl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Unbound 
     * @return State Unbound
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Unbound
     * @param State Unbound
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Ipv4 
     * @return Type Ipv4
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Ipv4
     * @param Type Ipv4
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 2026-04-07T00:00:00 
     * @return CreatedAt 2026-04-07T00:00:00
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 2026-04-07T00:00:00
     * @param CreatedAt 2026-04-07T00:00:00
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 2026-04-07T00:00:00 
     * @return UpdatedAt 2026-04-07T00:00:00
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 2026-04-07T00:00:00
     * @param UpdatedAt 2026-04-07T00:00:00
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public IpInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpInfo(IpInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

