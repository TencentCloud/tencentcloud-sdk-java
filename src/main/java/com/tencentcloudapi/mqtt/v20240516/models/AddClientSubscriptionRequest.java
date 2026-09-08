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
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>客户端id</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>订阅</p>
    */
    @SerializedName("TopicFilter")
    @Expose
    private String TopicFilter;

    /**
    * <p>服务质量:0,1,2</p>
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>客户端id</p> 
     * @return ClientId <p>客户端id</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>客户端id</p>
     * @param ClientId <p>客户端id</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>订阅</p> 
     * @return TopicFilter <p>订阅</p>
     */
    public String getTopicFilter() {
        return this.TopicFilter;
    }

    /**
     * Set <p>订阅</p>
     * @param TopicFilter <p>订阅</p>
     */
    public void setTopicFilter(String TopicFilter) {
        this.TopicFilter = TopicFilter;
    }

    /**
     * Get <p>服务质量:0,1,2</p> 
     * @return Qos <p>服务质量:0,1,2</p>
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set <p>服务质量:0,1,2</p>
     * @param Qos <p>服务质量:0,1,2</p>
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

