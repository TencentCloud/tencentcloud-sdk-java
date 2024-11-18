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

public class RabbitMQBindingListInfo extends AbstractModel {

    /**
    * 路由关系id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindingId")
    @Expose
    private Long BindingId;

    /**
    * Vhost参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 源exchange名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标类型,queue或exchange
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * 目标资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * 绑定key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutingKey")
    @Expose
    private String RoutingKey;

    /**
    * 源exchange类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceExchangeType")
    @Expose
    private String SourceExchangeType;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 路由关系id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindingId 路由关系id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBindingId() {
        return this.BindingId;
    }

    /**
     * Set 路由关系id
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindingId 路由关系id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindingId(Long BindingId) {
        this.BindingId = BindingId;
    }

    /**
     * Get Vhost参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualHost Vhost参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualHost Vhost参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 源exchange名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 源exchange名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源exchange名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 源exchange名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标类型,queue或exchange
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestinationType 目标类型,queue或exchange
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set 目标类型,queue或exchange
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestinationType 目标类型,queue或exchange
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get 目标资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destination 目标资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set 目标资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destination 目标资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get 绑定key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutingKey 绑定key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set 绑定key
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutingKey 绑定key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutingKey(String RoutingKey) {
        this.RoutingKey = RoutingKey;
    }

    /**
     * Get 源exchange类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceExchangeType 源exchange类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceExchangeType() {
        return this.SourceExchangeType;
    }

    /**
     * Set 源exchange类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceExchangeType 源exchange类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceExchangeType(String SourceExchangeType) {
        this.SourceExchangeType = SourceExchangeType;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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

    }
}

