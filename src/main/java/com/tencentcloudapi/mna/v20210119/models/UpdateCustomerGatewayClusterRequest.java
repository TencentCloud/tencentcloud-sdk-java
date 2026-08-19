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

public class UpdateCustomerGatewayClusterRequest extends AbstractModel {

    /**
    * <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>公网访问 IP。最大 64 字符，需为合法的 IPv4 或 IPv6 地址。</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
     * Get <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p> 
     * @return ClusterId <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p>
     * @param ClusterId <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>公网访问 IP。最大 64 字符，需为合法的 IPv4 或 IPv6 地址。</p> 
     * @return PublicIp <p>公网访问 IP。最大 64 字符，需为合法的 IPv4 或 IPv6 地址。</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网访问 IP。最大 64 字符，需为合法的 IPv4 或 IPv6 地址。</p>
     * @param PublicIp <p>公网访问 IP。最大 64 字符，需为合法的 IPv4 或 IPv6 地址。</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    public UpdateCustomerGatewayClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCustomerGatewayClusterRequest(UpdateCustomerGatewayClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);

    }
}

