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

public class DeleteGatewayRequest extends AbstractModel {

    /**
    * <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>网关ID。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>网关内网IP。</p>
    */
    @SerializedName("GatewayIp")
    @Expose
    private String GatewayIp;

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
     * Get <p>网关ID。</p> 
     * @return GatewayId <p>网关ID。</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关ID。</p>
     * @param GatewayId <p>网关ID。</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>网关内网IP。</p> 
     * @return GatewayIp <p>网关内网IP。</p>
     */
    public String getGatewayIp() {
        return this.GatewayIp;
    }

    /**
     * Set <p>网关内网IP。</p>
     * @param GatewayIp <p>网关内网IP。</p>
     */
    public void setGatewayIp(String GatewayIp) {
        this.GatewayIp = GatewayIp;
    }

    public DeleteGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGatewayRequest(DeleteGatewayRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayIp != null) {
            this.GatewayIp = new String(source.GatewayIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayIp", this.GatewayIp);

    }
}

