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

public class RemoveCloudNativeAPIGatewayConsumerInGroupRequest extends AbstractModel {

    /**
    * 网关实例id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>消费者组 ID（以 cg- 开头）。</p>
    */
    @SerializedName("ConsumerGroupId")
    @Expose
    private String ConsumerGroupId;

    /**
    * <p>消费者 ID 列表，长度 1-10。</p>
    */
    @SerializedName("ConsumerIds")
    @Expose
    private String [] ConsumerIds;

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
     * Get <p>消费者组 ID（以 cg- 开头）。</p> 
     * @return ConsumerGroupId <p>消费者组 ID（以 cg- 开头）。</p>
     */
    public String getConsumerGroupId() {
        return this.ConsumerGroupId;
    }

    /**
     * Set <p>消费者组 ID（以 cg- 开头）。</p>
     * @param ConsumerGroupId <p>消费者组 ID（以 cg- 开头）。</p>
     */
    public void setConsumerGroupId(String ConsumerGroupId) {
        this.ConsumerGroupId = ConsumerGroupId;
    }

    /**
     * Get <p>消费者 ID 列表，长度 1-10。</p> 
     * @return ConsumerIds <p>消费者 ID 列表，长度 1-10。</p>
     */
    public String [] getConsumerIds() {
        return this.ConsumerIds;
    }

    /**
     * Set <p>消费者 ID 列表，长度 1-10。</p>
     * @param ConsumerIds <p>消费者 ID 列表，长度 1-10。</p>
     */
    public void setConsumerIds(String [] ConsumerIds) {
        this.ConsumerIds = ConsumerIds;
    }

    public RemoveCloudNativeAPIGatewayConsumerInGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveCloudNativeAPIGatewayConsumerInGroupRequest(RemoveCloudNativeAPIGatewayConsumerInGroupRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ConsumerGroupId != null) {
            this.ConsumerGroupId = new String(source.ConsumerGroupId);
        }
        if (source.ConsumerIds != null) {
            this.ConsumerIds = new String[source.ConsumerIds.length];
            for (int i = 0; i < source.ConsumerIds.length; i++) {
                this.ConsumerIds[i] = new String(source.ConsumerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ConsumerGroupId", this.ConsumerGroupId);
        this.setParamArraySimple(map, prefix + "ConsumerIds.", this.ConsumerIds);

    }
}

