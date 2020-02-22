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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Deal extends AbstractModel{

    /**
    * 订单号
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 所属账号
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 商品数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 关联的流程 Id，可用于查询流程执行状态
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 付费模式，0后付费/1预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get 订单号 
     * @return DealName 订单号
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单号
     * @param DealName 订单号
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 所属账号 
     * @return OwnerUin 所属账号
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 所属账号
     * @param OwnerUin 所属账号
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 商品数量 
     * @return Count 商品数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 商品数量
     * @param Count 商品数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 关联的流程 Id，可用于查询流程执行状态 
     * @return FlowId 关联的流程 Id，可用于查询流程执行状态
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 关联的流程 Id，可用于查询流程执行状态
     * @param FlowId 关联的流程 Id，可用于查询流程执行状态
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIds 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIds 只有创建实例的订单会填充该字段，表示该订单创建的实例的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 付费模式，0后付费/1预付费 
     * @return PayMode 付费模式，0后付费/1预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式，0后付费/1预付费
     * @param PayMode 付费模式，0后付费/1预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

