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

public class RabbitMQBindingListInfo extends AbstractModel {

    /**
    * <p>路由关系id</p>
    */
    @SerializedName("BindingId")
    @Expose
    private Long BindingId;

    /**
    * <p>Vhost参数</p>
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * <p>源exchange名称</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>目标类型,queue或exchange</p>
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * <p>目标资源名称</p>
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
    * <p>源exchange类型</p>
    */
    @SerializedName("SourceExchangeType")
    @Expose
    private String SourceExchangeType;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>绑定参数，header类型的Exchange绑定时，可以传入参数。其它类型 Exchange 无需传入</p>
    */
    @SerializedName("Arguments")
    @Expose
    private RabbitMQServerlessKeyValuePair [] Arguments;

    /**
     * Get <p>路由关系id</p> 
     * @return BindingId <p>路由关系id</p>
     */
    public Long getBindingId() {
        return this.BindingId;
    }

    /**
     * Set <p>路由关系id</p>
     * @param BindingId <p>路由关系id</p>
     */
    public void setBindingId(Long BindingId) {
        this.BindingId = BindingId;
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
     * Get <p>源exchange名称</p> 
     * @return Source <p>源exchange名称</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>源exchange名称</p>
     * @param Source <p>源exchange名称</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>目标类型,queue或exchange</p> 
     * @return DestinationType <p>目标类型,queue或exchange</p>
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set <p>目标类型,queue或exchange</p>
     * @param DestinationType <p>目标类型,queue或exchange</p>
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get <p>目标资源名称</p> 
     * @return Destination <p>目标资源名称</p>
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>目标资源名称</p>
     * @param Destination <p>目标资源名称</p>
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
     * Get <p>源exchange类型</p> 
     * @return SourceExchangeType <p>源exchange类型</p>
     */
    public String getSourceExchangeType() {
        return this.SourceExchangeType;
    }

    /**
     * Set <p>源exchange类型</p>
     * @param SourceExchangeType <p>源exchange类型</p>
     */
    public void setSourceExchangeType(String SourceExchangeType) {
        this.SourceExchangeType = SourceExchangeType;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>绑定参数，header类型的Exchange绑定时，可以传入参数。其它类型 Exchange 无需传入</p> 
     * @return Arguments <p>绑定参数，header类型的Exchange绑定时，可以传入参数。其它类型 Exchange 无需传入</p>
     */
    public RabbitMQServerlessKeyValuePair [] getArguments() {
        return this.Arguments;
    }

    /**
     * Set <p>绑定参数，header类型的Exchange绑定时，可以传入参数。其它类型 Exchange 无需传入</p>
     * @param Arguments <p>绑定参数，header类型的Exchange绑定时，可以传入参数。其它类型 Exchange 无需传入</p>
     */
    public void setArguments(RabbitMQServerlessKeyValuePair [] Arguments) {
        this.Arguments = Arguments;
    }

    public RabbitMQBindingListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQBindingListInfo(RabbitMQBindingListInfo source) {
        if (source.BindingId != null) {
            this.BindingId = new Long(source.BindingId);
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
        if (source.SourceExchangeType != null) {
            this.SourceExchangeType = new String(source.SourceExchangeType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
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
        this.setParamSimple(map, prefix + "BindingId", this.BindingId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "DestinationType", this.DestinationType);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);
        this.setParamSimple(map, prefix + "SourceExchangeType", this.SourceExchangeType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArrayObj(map, prefix + "Arguments.", this.Arguments);

    }
}

