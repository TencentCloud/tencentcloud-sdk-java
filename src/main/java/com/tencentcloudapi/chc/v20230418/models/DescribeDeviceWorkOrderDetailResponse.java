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
    * <p>工单ID</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>服务类型</p>
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
    * <p>工单流程状态</p>
    */
    @SerializedName("StepSet")
    @Expose
    private OrderStep [] StepSet;

    /**
    * <p>工单设备信息</p>
    */
    @SerializedName("DeviceSet")
    @Expose
    private DeviceHistory [] DeviceSet;

    /**
    * <p>工单的入参信息</p>
    */
    @SerializedName("BaseInfo")
    @Expose
    private DeviceOrderBaseInfo BaseInfo;

    /**
    * <p>工单的拒绝原因，工单状态为reject的时候返回</p>
    */
    @SerializedName("RejectReason")
    @Expose
    private String RejectReason;

    /**
    * <p>工单 SLA 信息</p>
    */
    @SerializedName("SLAInfo")
    @Expose
    private SLAInfo SLAInfo;

    /**
    * <p>前序未完成的工单号</p>
    */
    @SerializedName("PreOrderSet")
    @Expose
    private String [] PreOrderSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>工单ID</p> 
     * @return OrderId <p>工单ID</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>工单ID</p>
     * @param OrderId <p>工单ID</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>服务类型</p> 
     * @return ServiceType <p>服务类型</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型</p>
     * @param ServiceType <p>服务类型</p>
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
     * Get <p>工单流程状态</p> 
     * @return StepSet <p>工单流程状态</p>
     */
    public OrderStep [] getStepSet() {
        return this.StepSet;
    }

    /**
     * Set <p>工单流程状态</p>
     * @param StepSet <p>工单流程状态</p>
     */
    public void setStepSet(OrderStep [] StepSet) {
        this.StepSet = StepSet;
    }

    /**
     * Get <p>工单设备信息</p> 
     * @return DeviceSet <p>工单设备信息</p>
     */
    public DeviceHistory [] getDeviceSet() {
        return this.DeviceSet;
    }

    /**
     * Set <p>工单设备信息</p>
     * @param DeviceSet <p>工单设备信息</p>
     */
    public void setDeviceSet(DeviceHistory [] DeviceSet) {
        this.DeviceSet = DeviceSet;
    }

    /**
     * Get <p>工单的入参信息</p> 
     * @return BaseInfo <p>工单的入参信息</p>
     */
    public DeviceOrderBaseInfo getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set <p>工单的入参信息</p>
     * @param BaseInfo <p>工单的入参信息</p>
     */
    public void setBaseInfo(DeviceOrderBaseInfo BaseInfo) {
        this.BaseInfo = BaseInfo;
    }

    /**
     * Get <p>工单的拒绝原因，工单状态为reject的时候返回</p> 
     * @return RejectReason <p>工单的拒绝原因，工单状态为reject的时候返回</p>
     */
    public String getRejectReason() {
        return this.RejectReason;
    }

    /**
     * Set <p>工单的拒绝原因，工单状态为reject的时候返回</p>
     * @param RejectReason <p>工单的拒绝原因，工单状态为reject的时候返回</p>
     */
    public void setRejectReason(String RejectReason) {
        this.RejectReason = RejectReason;
    }

    /**
     * Get <p>工单 SLA 信息</p> 
     * @return SLAInfo <p>工单 SLA 信息</p>
     */
    public SLAInfo getSLAInfo() {
        return this.SLAInfo;
    }

    /**
     * Set <p>工单 SLA 信息</p>
     * @param SLAInfo <p>工单 SLA 信息</p>
     */
    public void setSLAInfo(SLAInfo SLAInfo) {
        this.SLAInfo = SLAInfo;
    }

    /**
     * Get <p>前序未完成的工单号</p> 
     * @return PreOrderSet <p>前序未完成的工单号</p>
     */
    public String [] getPreOrderSet() {
        return this.PreOrderSet;
    }

    /**
     * Set <p>前序未完成的工单号</p>
     * @param PreOrderSet <p>前序未完成的工单号</p>
     */
    public void setPreOrderSet(String [] PreOrderSet) {
        this.PreOrderSet = PreOrderSet;
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
        if (source.SLAInfo != null) {
            this.SLAInfo = new SLAInfo(source.SLAInfo);
        }
        if (source.PreOrderSet != null) {
            this.PreOrderSet = new String[source.PreOrderSet.length];
            for (int i = 0; i < source.PreOrderSet.length; i++) {
                this.PreOrderSet[i] = new String(source.PreOrderSet[i]);
            }
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
        this.setParamObj(map, prefix + "SLAInfo.", this.SLAInfo);
        this.setParamArraySimple(map, prefix + "PreOrderSet.", this.PreOrderSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

