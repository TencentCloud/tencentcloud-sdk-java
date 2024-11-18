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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedClusterOrder extends AbstractModel {

    /**
    * 专用集群id
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * 专用集群类型id（移到下一层级，已经废弃，后续将删除）
    */
    @SerializedName("DedicatedClusterTypeId")
    @Expose
    private String DedicatedClusterTypeId;

    /**
    * 支持的存储类型列表（移到下一层级，已经废弃，后续将删除）
    */
    @SerializedName("SupportedStorageType")
    @Expose
    private String [] SupportedStorageType;

    /**
    * 支持的上连交换机的链路传输速率(GiB)（移到下一层级，已经废弃，后续将删除）
    */
    @SerializedName("SupportedUplinkSpeed")
    @Expose
    private Long [] SupportedUplinkSpeed;

    /**
    * 支持的实例族列表（移到下一层级，已经废弃，后续将删除）
    */
    @SerializedName("SupportedInstanceFamily")
    @Expose
    private String [] SupportedInstanceFamily;

    /**
    * 地板承重要求(KG)
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 功率要求(KW)
    */
    @SerializedName("PowerDraw")
    @Expose
    private Float PowerDraw;

    /**
    * 订单状态
    */
    @SerializedName("OrderStatus")
    @Expose
    private String OrderStatus;

    /**
    * 订单创建的时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 大订单ID
    */
    @SerializedName("DedicatedClusterOrderId")
    @Expose
    private String DedicatedClusterOrderId;

    /**
    * 订单类型，创建CREATE或扩容EXTEND
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 子订单详情列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DedicatedClusterOrderItems")
    @Expose
    private DedicatedClusterOrderItem [] DedicatedClusterOrderItems;

    /**
    * cpu值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * mem值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * gpu值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 0代表未支付，1代表已支付
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayStatus")
    @Expose
    private Long PayStatus;

    /**
    * 支付方式，一次性、按月、按年
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 购买时长的单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 购买时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 订单类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 验收状态
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * 交付预期时间
    */
    @SerializedName("DeliverExpectTime")
    @Expose
    private String DeliverExpectTime;

    /**
    * 交付实际完成时间
    */
    @SerializedName("DeliverFinishTime")
    @Expose
    private String DeliverFinishTime;

    /**
    * 验收预期时间
    */
    @SerializedName("CheckExpectTime")
    @Expose
    private String CheckExpectTime;

    /**
    * 验收实际完成时间
    */
    @SerializedName("CheckFinishTime")
    @Expose
    private String CheckFinishTime;

    /**
    * 订单SLA
    */
    @SerializedName("OrderSLA")
    @Expose
    private String OrderSLA;

    /**
    * 订单支付计划
    */
    @SerializedName("OrderPayPlan")
    @Expose
    private String OrderPayPlan;

    /**
     * Get 专用集群id 
     * @return DedicatedClusterId 专用集群id
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set 专用集群id
     * @param DedicatedClusterId 专用集群id
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get 专用集群类型id（移到下一层级，已经废弃，后续将删除） 
     * @return DedicatedClusterTypeId 专用集群类型id（移到下一层级，已经废弃，后续将删除）
     */
    public String getDedicatedClusterTypeId() {
        return this.DedicatedClusterTypeId;
    }

    /**
     * Set 专用集群类型id（移到下一层级，已经废弃，后续将删除）
     * @param DedicatedClusterTypeId 专用集群类型id（移到下一层级，已经废弃，后续将删除）
     */
    public void setDedicatedClusterTypeId(String DedicatedClusterTypeId) {
        this.DedicatedClusterTypeId = DedicatedClusterTypeId;
    }

    /**
     * Get 支持的存储类型列表（移到下一层级，已经废弃，后续将删除） 
     * @return SupportedStorageType 支持的存储类型列表（移到下一层级，已经废弃，后续将删除）
     */
    public String [] getSupportedStorageType() {
        return this.SupportedStorageType;
    }

    /**
     * Set 支持的存储类型列表（移到下一层级，已经废弃，后续将删除）
     * @param SupportedStorageType 支持的存储类型列表（移到下一层级，已经废弃，后续将删除）
     */
    public void setSupportedStorageType(String [] SupportedStorageType) {
        this.SupportedStorageType = SupportedStorageType;
    }

    /**
     * Get 支持的上连交换机的链路传输速率(GiB)（移到下一层级，已经废弃，后续将删除） 
     * @return SupportedUplinkSpeed 支持的上连交换机的链路传输速率(GiB)（移到下一层级，已经废弃，后续将删除）
     */
    public Long [] getSupportedUplinkSpeed() {
        return this.SupportedUplinkSpeed;
    }

    /**
     * Set 支持的上连交换机的链路传输速率(GiB)（移到下一层级，已经废弃，后续将删除）
     * @param SupportedUplinkSpeed 支持的上连交换机的链路传输速率(GiB)（移到下一层级，已经废弃，后续将删除）
     */
    public void setSupportedUplinkSpeed(Long [] SupportedUplinkSpeed) {
        this.SupportedUplinkSpeed = SupportedUplinkSpeed;
    }

    /**
     * Get 支持的实例族列表（移到下一层级，已经废弃，后续将删除） 
     * @return SupportedInstanceFamily 支持的实例族列表（移到下一层级，已经废弃，后续将删除）
     */
    public String [] getSupportedInstanceFamily() {
        return this.SupportedInstanceFamily;
    }

    /**
     * Set 支持的实例族列表（移到下一层级，已经废弃，后续将删除）
     * @param SupportedInstanceFamily 支持的实例族列表（移到下一层级，已经废弃，后续将删除）
     */
    public void setSupportedInstanceFamily(String [] SupportedInstanceFamily) {
        this.SupportedInstanceFamily = SupportedInstanceFamily;
    }

    /**
     * Get 地板承重要求(KG) 
     * @return Weight 地板承重要求(KG)
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 地板承重要求(KG)
     * @param Weight 地板承重要求(KG)
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 功率要求(KW) 
     * @return PowerDraw 功率要求(KW)
     */
    public Float getPowerDraw() {
        return this.PowerDraw;
    }

    /**
     * Set 功率要求(KW)
     * @param PowerDraw 功率要求(KW)
     */
    public void setPowerDraw(Float PowerDraw) {
        this.PowerDraw = PowerDraw;
    }

    /**
     * Get 订单状态 
     * @return OrderStatus 订单状态
     */
    public String getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set 订单状态
     * @param OrderStatus 订单状态
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get 订单创建的时间 
     * @return CreateTime 订单创建的时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 订单创建的时间
     * @param CreateTime 订单创建的时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 大订单ID 
     * @return DedicatedClusterOrderId 大订单ID
     */
    public String getDedicatedClusterOrderId() {
        return this.DedicatedClusterOrderId;
    }

    /**
     * Set 大订单ID
     * @param DedicatedClusterOrderId 大订单ID
     */
    public void setDedicatedClusterOrderId(String DedicatedClusterOrderId) {
        this.DedicatedClusterOrderId = DedicatedClusterOrderId;
    }

    /**
     * Get 订单类型，创建CREATE或扩容EXTEND 
     * @return Action 订单类型，创建CREATE或扩容EXTEND
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 订单类型，创建CREATE或扩容EXTEND
     * @param Action 订单类型，创建CREATE或扩容EXTEND
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 子订单详情列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DedicatedClusterOrderItems 子订单详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DedicatedClusterOrderItem [] getDedicatedClusterOrderItems() {
        return this.DedicatedClusterOrderItems;
    }

    /**
     * Set 子订单详情列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DedicatedClusterOrderItems 子订单详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDedicatedClusterOrderItems(DedicatedClusterOrderItem [] DedicatedClusterOrderItems) {
        this.DedicatedClusterOrderItems = DedicatedClusterOrderItems;
    }

    /**
     * Get cpu值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu cpu值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu cpu值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get mem值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mem mem值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set mem值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mem mem值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get gpu值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gpu gpu值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set gpu值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gpu gpu值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 0代表未支付，1代表已支付
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayStatus 0代表未支付，1代表已支付
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayStatus() {
        return this.PayStatus;
    }

    /**
     * Set 0代表未支付，1代表已支付
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayStatus 0代表未支付，1代表已支付
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayStatus(Long PayStatus) {
        this.PayStatus = PayStatus;
    }

    /**
     * Get 支付方式，一次性、按月、按年
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayType 支付方式，一次性、按月、按年
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 支付方式，一次性、按月、按年
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayType 支付方式，一次性、按月、按年
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 购买时长的单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUnit 购买时长的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买时长的单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUnit 购买时长的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 购买时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeSpan 购买时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeSpan 购买时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 订单类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderType 订单类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 订单类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderType 订单类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 验收状态 
     * @return CheckStatus 验收状态
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 验收状态
     * @param CheckStatus 验收状态
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 交付预期时间 
     * @return DeliverExpectTime 交付预期时间
     */
    public String getDeliverExpectTime() {
        return this.DeliverExpectTime;
    }

    /**
     * Set 交付预期时间
     * @param DeliverExpectTime 交付预期时间
     */
    public void setDeliverExpectTime(String DeliverExpectTime) {
        this.DeliverExpectTime = DeliverExpectTime;
    }

    /**
     * Get 交付实际完成时间 
     * @return DeliverFinishTime 交付实际完成时间
     */
    public String getDeliverFinishTime() {
        return this.DeliverFinishTime;
    }

    /**
     * Set 交付实际完成时间
     * @param DeliverFinishTime 交付实际完成时间
     */
    public void setDeliverFinishTime(String DeliverFinishTime) {
        this.DeliverFinishTime = DeliverFinishTime;
    }

    /**
     * Get 验收预期时间 
     * @return CheckExpectTime 验收预期时间
     */
    public String getCheckExpectTime() {
        return this.CheckExpectTime;
    }

    /**
     * Set 验收预期时间
     * @param CheckExpectTime 验收预期时间
     */
    public void setCheckExpectTime(String CheckExpectTime) {
        this.CheckExpectTime = CheckExpectTime;
    }

    /**
     * Get 验收实际完成时间 
     * @return CheckFinishTime 验收实际完成时间
     */
    public String getCheckFinishTime() {
        return this.CheckFinishTime;
    }

    /**
     * Set 验收实际完成时间
     * @param CheckFinishTime 验收实际完成时间
     */
    public void setCheckFinishTime(String CheckFinishTime) {
        this.CheckFinishTime = CheckFinishTime;
    }

    /**
     * Get 订单SLA 
     * @return OrderSLA 订单SLA
     */
    public String getOrderSLA() {
        return this.OrderSLA;
    }

    /**
     * Set 订单SLA
     * @param OrderSLA 订单SLA
     */
    public void setOrderSLA(String OrderSLA) {
        this.OrderSLA = OrderSLA;
    }

    /**
     * Get 订单支付计划 
     * @return OrderPayPlan 订单支付计划
     */
    public String getOrderPayPlan() {
        return this.OrderPayPlan;
    }

    /**
     * Set 订单支付计划
     * @param OrderPayPlan 订单支付计划
     */
    public void setOrderPayPlan(String OrderPayPlan) {
        this.OrderPayPlan = OrderPayPlan;
    }

    public DedicatedClusterOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterOrder(DedicatedClusterOrder source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.DedicatedClusterTypeId != null) {
            this.DedicatedClusterTypeId = new String(source.DedicatedClusterTypeId);
        }
        if (source.SupportedStorageType != null) {
            this.SupportedStorageType = new String[source.SupportedStorageType.length];
            for (int i = 0; i < source.SupportedStorageType.length; i++) {
                this.SupportedStorageType[i] = new String(source.SupportedStorageType[i]);
            }
        }
        if (source.SupportedUplinkSpeed != null) {
            this.SupportedUplinkSpeed = new Long[source.SupportedUplinkSpeed.length];
            for (int i = 0; i < source.SupportedUplinkSpeed.length; i++) {
                this.SupportedUplinkSpeed[i] = new Long(source.SupportedUplinkSpeed[i]);
            }
        }
        if (source.SupportedInstanceFamily != null) {
            this.SupportedInstanceFamily = new String[source.SupportedInstanceFamily.length];
            for (int i = 0; i < source.SupportedInstanceFamily.length; i++) {
                this.SupportedInstanceFamily[i] = new String(source.SupportedInstanceFamily[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.PowerDraw != null) {
            this.PowerDraw = new Float(source.PowerDraw);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new String(source.OrderStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DedicatedClusterOrderId != null) {
            this.DedicatedClusterOrderId = new String(source.DedicatedClusterOrderId);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.DedicatedClusterOrderItems != null) {
            this.DedicatedClusterOrderItems = new DedicatedClusterOrderItem[source.DedicatedClusterOrderItems.length];
            for (int i = 0; i < source.DedicatedClusterOrderItems.length; i++) {
                this.DedicatedClusterOrderItems[i] = new DedicatedClusterOrderItem(source.DedicatedClusterOrderItems[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.PayStatus != null) {
            this.PayStatus = new Long(source.PayStatus);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.DeliverExpectTime != null) {
            this.DeliverExpectTime = new String(source.DeliverExpectTime);
        }
        if (source.DeliverFinishTime != null) {
            this.DeliverFinishTime = new String(source.DeliverFinishTime);
        }
        if (source.CheckExpectTime != null) {
            this.CheckExpectTime = new String(source.CheckExpectTime);
        }
        if (source.CheckFinishTime != null) {
            this.CheckFinishTime = new String(source.CheckFinishTime);
        }
        if (source.OrderSLA != null) {
            this.OrderSLA = new String(source.OrderSLA);
        }
        if (source.OrderPayPlan != null) {
            this.OrderPayPlan = new String(source.OrderPayPlan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "DedicatedClusterTypeId", this.DedicatedClusterTypeId);
        this.setParamArraySimple(map, prefix + "SupportedStorageType.", this.SupportedStorageType);
        this.setParamArraySimple(map, prefix + "SupportedUplinkSpeed.", this.SupportedUplinkSpeed);
        this.setParamArraySimple(map, prefix + "SupportedInstanceFamily.", this.SupportedInstanceFamily);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "PowerDraw", this.PowerDraw);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DedicatedClusterOrderId", this.DedicatedClusterOrderId);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArrayObj(map, prefix + "DedicatedClusterOrderItems.", this.DedicatedClusterOrderItems);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "PayStatus", this.PayStatus);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "DeliverExpectTime", this.DeliverExpectTime);
        this.setParamSimple(map, prefix + "DeliverFinishTime", this.DeliverFinishTime);
        this.setParamSimple(map, prefix + "CheckExpectTime", this.CheckExpectTime);
        this.setParamSimple(map, prefix + "CheckFinishTime", this.CheckFinishTime);
        this.setParamSimple(map, prefix + "OrderSLA", this.OrderSLA);
        this.setParamSimple(map, prefix + "OrderPayPlan", this.OrderPayPlan);

    }
}

