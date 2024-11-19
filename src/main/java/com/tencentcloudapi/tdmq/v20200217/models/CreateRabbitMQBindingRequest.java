/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRabbitMQBindingRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost名称
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 源exchange
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标类型,取值queue或exchange
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * 目标
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * 路由键
    */
    @SerializedName("RoutingKey")
    @Expose
    private String RoutingKey;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost名称 
     * @return VirtualHost Vhost名称
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost名称
     * @param VirtualHost Vhost名称
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 源exchange 
     * @return Source 源exchange
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源exchange
     * @param Source 源exchange
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标类型,取值queue或exchange 
     * @return DestinationType 目标类型,取值queue或exchange
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set 目标类型,取值queue或exchange
     * @param DestinationType 目标类型,取值queue或exchange
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get 目标 
     * @return Destination 目标
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set 目标
     * @param Destination 目标
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get 路由键 
     * @return RoutingKey 路由键
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set 路由键
     * @param RoutingKey 路由键
     */
    public void setRoutingKey(String RoutingKey) {
        this.RoutingKey = RoutingKey;
    }

    public CreateRabbitMQBindingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQBindingRequest(CreateRabbitMQBindingRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.DestinationType != null) {
            this.DestinationType = new String(source.DestinationType);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
        if (source.RoutingKey != null) {
            this.RoutingKey = new String(source.RoutingKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "DestinationType", this.DestinationType);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);

    }
}

