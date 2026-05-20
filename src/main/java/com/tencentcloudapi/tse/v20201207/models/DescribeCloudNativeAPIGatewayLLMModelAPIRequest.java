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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayLLMModelAPIRequest extends AbstractModel {

    /**
    * 网关 id。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 模型 API ID，全局唯一标识。
    */
    @SerializedName("ModelAPIId")
    @Expose
    private String ModelAPIId;

    /**
     * Get 网关 id。 
     * @return GatewayId 网关 id。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关 id。
     * @param GatewayId 网关 id。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 模型 API ID，全局唯一标识。 
     * @return ModelAPIId 模型 API ID，全局唯一标识。
     */
    public String getModelAPIId() {
        return this.ModelAPIId;
    }

    /**
     * Set 模型 API ID，全局唯一标识。
     * @param ModelAPIId 模型 API ID，全局唯一标识。
     */
    public void setModelAPIId(String ModelAPIId) {
        this.ModelAPIId = ModelAPIId;
    }

    public DescribeCloudNativeAPIGatewayLLMModelAPIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayLLMModelAPIRequest(DescribeCloudNativeAPIGatewayLLMModelAPIRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ModelAPIId != null) {
            this.ModelAPIId = new String(source.ModelAPIId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ModelAPIId", this.ModelAPIId);

    }
}

