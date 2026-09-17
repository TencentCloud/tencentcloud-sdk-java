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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpnGatewaySslClientRequest extends AbstractModel {

    /**
    * <p>SSL-VPN-SERVER 实例ID。</p>
    */
    @SerializedName("SslVpnServerId")
    @Expose
    private String SslVpnServerId;

    /**
    * <p>SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。</p>
    */
    @SerializedName("SslVpnClientName")
    @Expose
    private String SslVpnClientName;

    /**
    * <p>SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。</p>
    */
    @SerializedName("SslVpnClientNames")
    @Expose
    private String [] SslVpnClientNames;

    /**
    * <p>指定绑定的标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>SSL-VPN-SERVER 实例ID。</p> 
     * @return SslVpnServerId <p>SSL-VPN-SERVER 实例ID。</p>
     */
    public String getSslVpnServerId() {
        return this.SslVpnServerId;
    }

    /**
     * Set <p>SSL-VPN-SERVER 实例ID。</p>
     * @param SslVpnServerId <p>SSL-VPN-SERVER 实例ID。</p>
     */
    public void setSslVpnServerId(String SslVpnServerId) {
        this.SslVpnServerId = SslVpnServerId;
    }

    /**
     * Get <p>SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。</p> 
     * @return SslVpnClientName <p>SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。</p>
     */
    public String getSslVpnClientName() {
        return this.SslVpnClientName;
    }

    /**
     * Set <p>SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。</p>
     * @param SslVpnClientName <p>SSL-VPN-CLIENT实例Name。不可和SslVpnClientNames同时使用。</p>
     */
    public void setSslVpnClientName(String SslVpnClientName) {
        this.SslVpnClientName = SslVpnClientName;
    }

    /**
     * Get <p>SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。</p> 
     * @return SslVpnClientNames <p>SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。</p>
     */
    public String [] getSslVpnClientNames() {
        return this.SslVpnClientNames;
    }

    /**
     * Set <p>SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。</p>
     * @param SslVpnClientNames <p>SSL-VPN-CLIENT实例Name数字。批量创建时使用。不可和SslVpnClientName同时使用。</p>
     */
    public void setSslVpnClientNames(String [] SslVpnClientNames) {
        this.SslVpnClientNames = SslVpnClientNames;
    }

    /**
     * Get <p>指定绑定的标签列表</p> 
     * @return Tags <p>指定绑定的标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>指定绑定的标签列表</p>
     * @param Tags <p>指定绑定的标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

