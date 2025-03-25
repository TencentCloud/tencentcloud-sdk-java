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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkOrderData extends AbstractModel {

    /**
    * 工单号
    */
    @SerializedName("WorkOrderId")
    @Expose
    private String WorkOrderId;

    /**
    * 服务类型，一个服务可能会产生多个工单
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 工单类型
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 工单状态
    */
    @SerializedName("OrderStatus")
    @Expose
    private String OrderStatus;

    /**
    * 工单创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 工单创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 工单完成时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get 工单号 
     * @return WorkOrderId 工单号
     */
    public String getWorkOrderId() {
        return this.WorkOrderId;
    }

    /**
     * Set 工单号
     * @param WorkOrderId 工单号
     */
    public void setWorkOrderId(String WorkOrderId) {
        this.WorkOrderId = WorkOrderId;
    }

    /**
     * Get 服务类型，一个服务可能会产生多个工单 
     * @return ServiceType 服务类型，一个服务可能会产生多个工单
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务类型，一个服务可能会产生多个工单
     * @param ServiceType 服务类型，一个服务可能会产生多个工单
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 工单类型 
     * @return OrderType 工单类型
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 工单类型
     * @param OrderType 工单类型
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 工单状态 
     * @return OrderStatus 工单状态
     */
    public String getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set 工单状态
     * @param OrderStatus 工单状态
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get 工单创建人 
     * @return Creator 工单创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 工单创建人
     * @param Creator 工单创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 工单创建时间 
     * @return CreateTime 工单创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 工单创建时间
     * @param CreateTime 工单创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 工单完成时间 
     * @return FinishTime 工单完成时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 工单完成时间
     * @param FinishTime 工单完成时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
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

    }
}

