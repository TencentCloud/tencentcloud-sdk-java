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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpnGatewaySslClientRequest extends AbstractModel{

    /**
    * SSL-VPN-SERVER 实例ID。
    */
    @SerializedName("SslVpnServerId")
    @Expose
    private String SslVpnServerId;

    /**
    * SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。
    */
    @SerializedName("SslVpnClientName")
    @Expose
    private String SslVpnClientName;

    /**
    * SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。
    */
    @SerializedName("SslVpnClientNames")
    @Expose
    private String [] SslVpnClientNames;

    /**
     * Get SSL-VPN-SERVER 实例ID。 
     * @return SslVpnServerId SSL-VPN-SERVER 实例ID。
     */
    public String getSslVpnServerId() {
        return this.SslVpnServerId;
    }

    /**
     * Set SSL-VPN-SERVER 实例ID。
     * @param SslVpnServerId SSL-VPN-SERVER 实例ID。
     */
    public void setSslVpnServerId(String SslVpnServerId) {
        this.SslVpnServerId = SslVpnServerId;
    }

    /**
     * Get SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。 
     * @return SslVpnClientName SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。
     */
    public String getSslVpnClientName() {
        return this.SslVpnClientName;
    }

    /**
     * Set SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。
     * @param SslVpnClientName SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。
     */
    public void setSslVpnClientName(String SslVpnClientName) {
        this.SslVpnClientName = SslVpnClientName;
    }

    /**
     * Get SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。 
     * @return SslVpnClientNames SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。
     */
    public String [] getSslVpnClientNames() {
        return this.SslVpnClientNames;
    }

    /**
     * Set SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。
     * @param SslVpnClientNames SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。
     */
    public void setSslVpnClientNames(String [] SslVpnClientNames) {
        this.SslVpnClientNames = SslVpnClientNames;
    }

    public CreateVpnGatewaySslClientRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpnGatewaySslClientRequest(CreateVpnGatewaySslClientRequest source) {
        if (source.SslVpnServerId != null) {
            this.SslVpnServerId = new String(source.SslVpnServerId);
        }
        if (source.SslVpnClientName != null) {
            this.SslVpnClientName = new String(source.SslVpnClientName);
        }
        if (source.SslVpnClientNames != null) {
            this.SslVpnClientNames = new String[source.SslVpnClientNames.length];
            for (int i = 0; i < source.SslVpnClientNames.length; i++) {
                this.SslVpnClientNames[i] = new String(source.SslVpnClientNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SslVpnServerId", this.SslVpnServerId);
        this.setParamSimple(map, prefix + "SslVpnClientName", this.SslVpnClientName);
        this.setParamArraySimple(map, prefix + "SslVpnClientNames.", this.SslVpnClientNames);

    }
}

