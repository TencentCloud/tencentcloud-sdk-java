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

public class ModifyCloudNativeAPIGatewayConsumerRequest extends AbstractModel {

    /**
    * <p>网关实例id</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>消费者 ID。</p>
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * <p>消费者名称，最长 60 字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul>
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * <p>消费者描述。最长 200 字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>网关实例id</p> 
     * @return GatewayId <p>网关实例id</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例id</p>
     * @param GatewayId <p>网关实例id</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>消费者 ID。</p> 
     * @return ConsumerId <p>消费者 ID。</p>
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set <p>消费者 ID。</p>
     * @param ConsumerId <p>消费者 ID。</p>
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get <p>消费者名称，最长 60 字符。</p> 
     * @return Name <p>消费者名称，最长 60 字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>消费者名称，最长 60 字符。</p>
     * @param Name <p>消费者名称，最长 60 字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul> 
     * @return Priority <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul>
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul>
     * @param Priority <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul>
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>消费者描述。最长 200 字符。</p> 
     * @return Description <p>消费者描述。最长 200 字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>消费者描述。最长 200 字符。</p>
     * @param Description <p>消费者描述。最长 200 字符。</p>
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
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
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
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

