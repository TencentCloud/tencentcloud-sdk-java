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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkOrderData extends AbstractModel {

    /**
    * <p>工单号</p>
    */
    @SerializedName("WorkOrderId")
    @Expose
    private String WorkOrderId;

    /**
    * <p>服务类型，一个服务可能会产生多个工单</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>工单类型</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>工单状态</p>
    */
    @SerializedName("OrderStatus")
    @Expose
    private String OrderStatus;

    /**
    * <p>工单创建人</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>工单创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>工单完成时间</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>工单关联的dcops单号</p>
    */
    @SerializedName("TicketId")
    @Expose
    private String TicketId;

    /**
    * <p>SLA</p>
    */
    @SerializedName("SLAInfo")
    @Expose
    private SLAInfo SLAInfo;

    /**
     * Get <p>工单号</p> 
     * @return WorkOrderId <p>工单号</p>
     */
    public String getWorkOrderId() {
        return this.WorkOrderId;
    }

    /**
     * Set <p>工单号</p>
     * @param WorkOrderId <p>工单号</p>
     */
    public void setWorkOrderId(String WorkOrderId) {
        this.WorkOrderId = WorkOrderId;
    }

    /**
     * Get <p>服务类型，一个服务可能会产生多个工单</p> 
     * @return ServiceType <p>服务类型，一个服务可能会产生多个工单</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型，一个服务可能会产生多个工单</p>
     * @param ServiceType <p>服务类型，一个服务可能会产生多个工单</p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>工单类型</p> 
     * @return OrderType <p>工单类型</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>工单类型</p>
     * @param OrderType <p>工单类型</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>工单状态</p> 
     * @return OrderStatus <p>工单状态</p>
     */
    public String getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set <p>工单状态</p>
     * @param OrderStatus <p>工单状态</p>
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get <p>工单创建人</p> 
     * @return Creator <p>工单创建人</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>工单创建人</p>
     * @param Creator <p>工单创建人</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>工单创建时间</p> 
     * @return CreateTime <p>工单创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>工单创建时间</p>
     * @param CreateTime <p>工单创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>工单完成时间</p> 
     * @return FinishTime <p>工单完成时间</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>工单完成时间</p>
     * @param FinishTime <p>工单完成时间</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>工单关联的dcops单号</p> 
     * @return TicketId <p>工单关联的dcops单号</p>
     */
    public String getTicketId() {
        return this.TicketId;
    }

    /**
     * Set <p>工单关联的dcops单号</p>
     * @param TicketId <p>工单关联的dcops单号</p>
     */
    public void setTicketId(String TicketId) {
        this.TicketId = TicketId;
    }

    /**
     * Get <p>SLA</p> 
     * @return SLAInfo <p>SLA</p>
     */
    public SLAInfo getSLAInfo() {
        return this.SLAInfo;
    }

    /**
     * Set <p>SLA</p>
     * @param SLAInfo <p>SLA</p>
     */
    public void setSLAInfo(SLAInfo SLAInfo) {
        this.SLAInfo = SLAInfo;
    }

    public WorkOrderData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkOrderData(WorkOrderData source) {
        if (source.WorkOrderId != null) {
            this.WorkOrderId = new String(source.WorkOrderId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new String(source.OrderStatus);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.TicketId != null) {
            this.TicketId = new String(source.TicketId);
        }
        if (source.SLAInfo != null) {
            this.SLAInfo = new SLAInfo(source.SLAInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkOrderId", this.WorkOrderId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "TicketId", this.TicketId);
        this.setParamObj(map, prefix + "SLAInfo.", this.SLAInfo);

    }
}

