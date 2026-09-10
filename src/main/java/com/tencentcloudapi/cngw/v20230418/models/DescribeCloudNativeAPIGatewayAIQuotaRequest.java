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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayAIQuotaRequest extends AbstractModel {

    /**
    * <p>网关实例Id</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>配额 id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get <p>网关实例Id</p> 
     * @return GatewayId <p>网关实例Id</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例Id</p>
     * @param GatewayId <p>网关实例Id</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>配额 id</p> 
     * @return Id <p>配额 id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>配额 id</p>
     * @param Id <p>配额 id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DescribeCloudNativeAPIGatewayAIQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayAIQuotaRequest(DescribeCloudNativeAPIGatewayAIQuotaRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

