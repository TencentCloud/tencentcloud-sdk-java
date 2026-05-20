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

public class ModifyCloudNativeAPIGatewayConsumerRequest extends AbstractModel {

    /**
    * 网关实例id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 消费者ID
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * 新的消费者名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 新的消费者描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get 消费者ID 
     * @return ConsumerId 消费者ID
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set 消费者ID
     * @param ConsumerId 消费者ID
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get 新的消费者名称 
     * @return Name 新的消费者名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 新的消费者名称
     * @param Name 新的消费者名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 新的消费者描述 
     * @return Description 新的消费者描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 新的消费者描述
     * @param Description 新的消费者描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyCloudNativeAPIGatewayConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayConsumerRequest(ModifyCloudNativeAPIGatewayConsumerRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

