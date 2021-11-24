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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AMQPRouteRelation extends AbstractModel{

    /**
    * 路由关系ID
    */
    @SerializedName("RouteRelationId")
    @Expose
    private String RouteRelationId;

    /**
    * 源Exchange
    */
    @SerializedName("SourceExchange")
    @Expose
    private String SourceExchange;

    /**
    * 目标类型:Queue|Exchange
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 目标值
    */
    @SerializedName("DestValue")
    @Expose
    private String DestValue;

    /**
    * 绑定key
    */
    @SerializedName("RoutingKey")
    @Expose
    private String RoutingKey;

    /**
    * 源路由类型:Direct|Topic|Fanout
    */
    @SerializedName("SourceExchangeType")
    @Expose
    private String SourceExchangeType;

    /**
    * 创建时间，以毫秒为单位
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间，以毫秒为单位
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 说明信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 路由关系ID 
     * @return RouteRelationId 路由关系ID
     */
    public String getRouteRelationId() {
        return this.RouteRelationId;
    }

    /**
     * Set 路由关系ID
     * @param RouteRelationId 路由关系ID
     */
    public void setRouteRelationId(String RouteRelationId) {
        this.RouteRelationId = RouteRelationId;
    }

    /**
     * Get 源Exchange 
     * @return SourceExchange 源Exchange
     */
    public String getSourceExchange() {
        return this.SourceExchange;
    }

    /**
     * Set 源Exchange
     * @param SourceExchange 源Exchange
     */
    public void setSourceExchange(String SourceExchange) {
        this.SourceExchange = SourceExchange;
    }

    /**
     * Get 目标类型:Queue|Exchange 
     * @return DestType 目标类型:Queue|Exchange
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 目标类型:Queue|Exchange
     * @param DestType 目标类型:Queue|Exchange
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get 目标值 
     * @return DestValue 目标值
     */
    public String getDestValue() {
        return this.DestValue;
    }

    /**
     * Set 目标值
     * @param DestValue 目标值
     */
    public void setDestValue(String DestValue) {
        this.DestValue = DestValue;
    }

    /**
     * Get 绑定key 
     * @return RoutingKey 绑定key
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set 绑定key
     * @param RoutingKey 绑定key
     */
    public void setRoutingKey(String RoutingKey) {
        this.RoutingKey = RoutingKey;
    }

    /**
     * Get 源路由类型:Direct|Topic|Fanout 
     * @return SourceExchangeType 源路由类型:Direct|Topic|Fanout
     */
    public String getSourceExchangeType() {
        return this.SourceExchangeType;
    }

    /**
     * Set 源路由类型:Direct|Topic|Fanout
     * @param SourceExchangeType 源路由类型:Direct|Topic|Fanout
     */
    public void setSourceExchangeType(String SourceExchangeType) {
        this.SourceExchangeType = SourceExchangeType;
    }

    /**
     * Get 创建时间，以毫秒为单位 
     * @return CreateTime 创建时间，以毫秒为单位
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，以毫秒为单位
     * @param CreateTime 创建时间，以毫秒为单位
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间，以毫秒为单位 
     * @return UpdateTime 修改时间，以毫秒为单位
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间，以毫秒为单位
     * @param UpdateTime 修改时间，以毫秒为单位
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 说明信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AMQPRouteRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AMQPRouteRelation(AMQPRouteRelation source) {
        if (source.RouteRelationId != null) {
            this.RouteRelationId = new String(source.RouteRelationId);
        }
        if (source.SourceExchange != null) {
            this.SourceExchange = new String(source.SourceExchange);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.DestValue != null) {
            this.DestValue = new String(source.DestValue);
        }
        if (source.RoutingKey != null) {
            this.RoutingKey = new String(source.RoutingKey);
        }
        if (source.SourceExchangeType != null) {
            this.SourceExchangeType = new String(source.SourceExchangeType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteRelationId", this.RouteRelationId);
        this.setParamSimple(map, prefix + "SourceExchange", this.SourceExchange);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "DestValue", this.DestValue);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);
        this.setParamSimple(map, prefix + "SourceExchangeType", this.SourceExchangeType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

