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

public class RemoveCloudNativeAPIGatewayConsumerGroupAuthRequest extends AbstractModel {

    /**
    * 网关实例id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 资源类型:

- ModelAPI: 模型API
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源ID
    */
    @SerializedName("ConsumerGroupIds")
    @Expose
    private String [] ConsumerGroupIds;

    /**
     * Get 网关实例id 
     * @return GatewayId 网关实例id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例id
     * @param GatewayId 网关实例id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 资源类型:

- ModelAPI: 模型API 
     * @return ResourceType 资源类型:

- ModelAPI: 模型API
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型:

- ModelAPI: 模型API
     * @param ResourceType 资源类型:

- ModelAPI: 模型API
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源ID 
     * @return ConsumerGroupIds 资源ID
     */
    public String [] getConsumerGroupIds() {
        return this.ConsumerGroupIds;
    }

    /**
     * Set 资源ID
     * @param ConsumerGroupIds 资源ID
     */
    public void setConsumerGroupIds(String [] ConsumerGroupIds) {
        this.ConsumerGroupIds = ConsumerGroupIds;
    }

    public RemoveCloudNativeAPIGatewayConsumerGroupAuthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveCloudNativeAPIGatewayConsumerGroupAuthRequest(RemoveCloudNativeAPIGatewayConsumerGroupAuthRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ConsumerGroupIds != null) {
            this.ConsumerGroupIds = new String[source.ConsumerGroupIds.length];
            for (int i = 0; i < source.ConsumerGroupIds.length; i++) {
                this.ConsumerGroupIds[i] = new String(source.ConsumerGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "ConsumerGroupIds.", this.ConsumerGroupIds);

    }
}

