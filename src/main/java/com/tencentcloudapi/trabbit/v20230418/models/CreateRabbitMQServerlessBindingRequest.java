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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRabbitMQServerlessBindingRequest extends AbstractModel {

    /**
    * <p>实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Vhost参数</p>
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * <p>源exchange</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>目标类型,取值queue或exchange</p>
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * <p>目标队列或者交换机</p>
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * <p>绑定key</p>
    */
    @SerializedName("RoutingKey")
    @Expose
    private String RoutingKey;

    /**
    * <p>创建 Header 类型 Exchange 的 Binding 时，可以传入参数。其它类型 Exchange 无需传入</p>
    */
    @SerializedName("Arguments")
    @Expose
    private RabbitMQServerlessKeyValuePair [] Arguments;

    /**
     * Get <p>实例Id</p> 
     * @return InstanceId <p>实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例Id</p>
     * @param InstanceId <p>实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Vhost参数</p> 
     * @return VirtualHost <p>Vhost参数</p>
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set <p>Vhost参数</p>
     * @param VirtualHost <p>Vhost参数</p>
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get <p>源exchange</p> 
     * @return Source <p>源exchange</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>源exchange</p>
     * @param Source <p>源exchange</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>目标类型,取值queue或exchange</p> 
     * @return DestinationType <p>目标类型,取值queue或exchange</p>
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set <p>目标类型,取值queue或exchange</p>
     * @param DestinationType <p>目标类型,取值queue或exchange</p>
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get <p>目标队列或者交换机</p> 
     * @return Destination <p>目标队列或者交换机</p>
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>目标队列或者交换机</p>
     * @param Destination <p>目标队列或者交换机</p>
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get <p>绑定key</p> 
     * @return RoutingKey <p>绑定key</p>
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set <p>绑定key</p>
     * @param RoutingKey <p>绑定key</p>
     */
    public void setRoutingKey(String RoutingKey) {
        this.RoutingKey = RoutingKey;
    }

    /**
     * Get <p>创建 Header 类型 Exchange 的 Binding 时，可以传入参数。其它类型 Exchange 无需传入</p> 
     * @return Arguments <p>创建 Header 类型 Exchange 的 Binding 时，可以传入参数。其它类型 Exchange 无需传入</p>
     */
    public RabbitMQServerlessKeyValuePair [] getArguments() {
        return this.Arguments;
    }

    /**
     * Set <p>创建 Header 类型 Exchange 的 Binding 时，可以传入参数。其它类型 Exchange 无需传入</p>
     * @param Arguments <p>创建 Header 类型 Exchange 的 Binding 时，可以传入参数。其它类型 Exchange 无需传入</p>
     */
    public void setArguments(RabbitMQServerlessKeyValuePair [] Arguments) {
        this.Arguments = Arguments;
    }

    public CreateRabbitMQServerlessBindingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQServerlessBindingRequest(CreateRabbitMQServerlessBindingRequest source) {
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
        if (source.Arguments != null) {
            this.Arguments = new RabbitMQServerlessKeyValuePair[source.Arguments.length];
            for (int i = 0; i < source.Arguments.length; i++) {
                this.Arguments[i] = new RabbitMQServerlessKeyValuePair(source.Arguments[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Arguments.", this.Arguments);

    }
}

