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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddClientSubscriptionRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 客户端id
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 订阅
    */
    @SerializedName("TopicFilter")
    @Expose
    private String TopicFilter;

    /**
    * 服务质量:0,1,2
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 客户端id 
     * @return ClientId 客户端id
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端id
     * @param ClientId 客户端id
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 订阅 
     * @return TopicFilter 订阅
     */
    public String getTopicFilter() {
        return this.TopicFilter;
    }

    /**
     * Set 订阅
     * @param TopicFilter 订阅
     */
    public void setTopicFilter(String TopicFilter) {
        this.TopicFilter = TopicFilter;
    }

    /**
     * Get 服务质量:0,1,2 
     * @return Qos 服务质量:0,1,2
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set 服务质量:0,1,2
     * @param Qos 服务质量:0,1,2
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    public AddClientSubscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddClientSubscriptionRequest(AddClientSubscriptionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.TopicFilter != null) {
            this.TopicFilter = new String(source.TopicFilter);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "TopicFilter", this.TopicFilter);
        this.setParamSimple(map, prefix + "Qos", this.Qos);

    }
}

