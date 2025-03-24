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

public class WorkOrderTinyInfo extends AbstractModel {

    /**
    * 工单id
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
     * Get 工单id 
     * @return WorkOrderId 工单id
     */
    public String getWorkOrderId() {
        return this.WorkOrderId;
    }

    /**
     * Set 工单id
     * @param WorkOrderId 工单id
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

    public WorkOrderTinyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkOrderTinyInfo(WorkOrderTinyInfo source) {
        if (source.WorkOrderId != null) {
            this.WorkOrderId = new String(source.WorkOrderId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkOrderId", this.WorkOrderId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

