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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealInfo  extends AbstractModel{

    /**
    * 订单名
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 商品数量
    */
    @SerializedName("Count")
    @Expose
    private Integer Count;

    /**
    * 关联的流程 Id，可用于查询流程执行状态
    */
    @SerializedName("FlowId")
    @Expose
    private Integer FlowId;

    /**
    * 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 所属账号
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 实例付费类型
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
     * 获取订单名
     * @return DealName 订单名
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * 设置订单名
     * @param DealName 订单名
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * 获取商品数量
     * @return Count 商品数量
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置商品数量
     * @param Count 商品数量
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

    /**
     * 获取关联的流程 Id，可用于查询流程执行状态
     * @return FlowId 关联的流程 Id，可用于查询流程执行状态
     */
    public Integer getFlowId() {
        return this.FlowId;
    }

    /**
     * 设置关联的流程 Id，可用于查询流程执行状态
     * @param FlowId 关联的流程 Id，可用于查询流程执行状态
     */
    public void setFlowId(Integer FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * 获取只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
     * @return InstanceIdSet 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * 设置只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
     * @param InstanceIdSet 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * 获取所属账号
     * @return OwnerUin 所属账号
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * 设置所属账号
     * @param OwnerUin 所属账号
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * 获取实例付费类型
     * @return InstanceChargeType 实例付费类型
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * 设置实例付费类型
     * @param InstanceChargeType 实例付费类型
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);

    }
}

