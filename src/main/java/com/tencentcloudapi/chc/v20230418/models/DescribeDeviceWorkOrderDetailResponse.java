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

public class DescribeDeviceWorkOrderDetailResponse extends AbstractModel {

    /**
    * 工单ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 服务类型
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
    * 工单流程状态
    */
    @SerializedName("StepSet")
    @Expose
    private OrderStep [] StepSet;

    /**
    * 工单设备信息
    */
    @SerializedName("DeviceSet")
    @Expose
    private DeviceHistory [] DeviceSet;

    /**
    * 工单的入参信息
    */
    @SerializedName("BaseInfo")
    @Expose
    private DeviceOrderBaseInfo BaseInfo;

    /**
    * 工单的拒绝原因，工单状态为reject的时候返回
    */
    @SerializedName("RejectReason")
    @Expose
    private String RejectReason;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 工单ID 
     * @return OrderId 工单ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 工单ID
     * @param OrderId 工单ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 服务类型 
     * @return ServiceType 服务类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务类型
     * @param ServiceType 服务类型
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
     * Get 工单流程状态 
     * @return StepSet 工单流程状态
     */
    public OrderStep [] getStepSet() {
        return this.StepSet;
    }

    /**
     * Set 工单流程状态
     * @param StepSet 工单流程状态
     */
    public void setStepSet(OrderStep [] StepSet) {
        this.StepSet = StepSet;
    }

    /**
     * Get 工单设备信息 
     * @return DeviceSet 工单设备信息
     */
    public DeviceHistory [] getDeviceSet() {
        return this.DeviceSet;
    }

    /**
     * Set 工单设备信息
     * @param DeviceSet 工单设备信息
     */
    public void setDeviceSet(DeviceHistory [] DeviceSet) {
        this.DeviceSet = DeviceSet;
    }

    /**
     * Get 工单的入参信息 
     * @return BaseInfo 工单的入参信息
     */
    public DeviceOrderBaseInfo getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set 工单的入参信息
     * @param BaseInfo 工单的入参信息
     */
    public void setBaseInfo(DeviceOrderBaseInfo BaseInfo) {
        this.BaseInfo = BaseInfo;
    }

    /**
     * Get 工单的拒绝原因，工单状态为reject的时候返回 
     * @return RejectReason 工单的拒绝原因，工单状态为reject的时候返回
     */
    public String getRejectReason() {
        return this.RejectReason;
    }

    /**
     * Set 工单的拒绝原因，工单状态为reject的时候返回
     * @param RejectReason 工单的拒绝原因，工单状态为reject的时候返回
     */
    public void setRejectReason(String RejectReason) {
        this.RejectReason = RejectReason;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceWorkOrderDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceWorkOrderDetailResponse(DescribeDeviceWorkOrderDetailResponse source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
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
        if (source.StepSet != null) {
            this.StepSet = new OrderStep[source.StepSet.length];
            for (int i = 0; i < source.StepSet.length; i++) {
                this.StepSet[i] = new OrderStep(source.StepSet[i]);
            }
        }
        if (source.DeviceSet != null) {
            this.DeviceSet = new DeviceHistory[source.DeviceSet.length];
            for (int i = 0; i < source.DeviceSet.length; i++) {
                this.DeviceSet[i] = new DeviceHistory(source.DeviceSet[i]);
            }
        }
        if (source.BaseInfo != null) {
            this.BaseInfo = new DeviceOrderBaseInfo(source.BaseInfo);
        }
        if (source.RejectReason != null) {
            this.RejectReason = new String(source.RejectReason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamArrayObj(map, prefix + "StepSet.", this.StepSet);
        this.setParamArrayObj(map, prefix + "DeviceSet.", this.DeviceSet);
        this.setParamObj(map, prefix + "BaseInfo.", this.BaseInfo);
        this.setParamSimple(map, prefix + "RejectReason", this.RejectReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

