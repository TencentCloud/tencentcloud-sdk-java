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

public class AddCloudNativeAPIGatewayConsumerInGroupRequest extends AbstractModel {

    /**
    * 网关实例id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 消费者组ID
    */
    @SerializedName("ConsumerGroupId")
    @Expose
    private String ConsumerGroupId;

    /**
    * 消费者ID
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
     * Get 消费者组ID 
     * @return ConsumerGroupId 消费者组ID
     */
    public String getConsumerGroupId() {
        return this.ConsumerGroupId;
    }

    /**
     * Set 消费者组ID
     * @param ConsumerGroupId 消费者组ID
     */
    public void setConsumerGroupId(String ConsumerGroupId) {
        this.ConsumerGroupId = ConsumerGroupId;
    }

    /**
     * Get 消费者ID 
     * @return ConsumerIds 消费者ID
     */
    public String [] getConsumerIds() {
        return this.ConsumerIds;
    }

    /**
     * Set 消费者ID
     * @param ConsumerIds 消费者ID
     */
    public void setConsumerIds(String [] ConsumerIds) {
        this.ConsumerIds = ConsumerIds;
    }

    public AddCloudNativeAPIGatewayConsumerInGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCloudNativeAPIGatewayConsumerInGroupRequest(AddCloudNativeAPIGatewayConsumerInGroupRequest source) {
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

