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

public class DescribeModelEvaluationWorkOrderDetailResponse extends AbstractModel {

    /**
    * 工单进度
    */
    @SerializedName("StepSet")
    @Expose
    private OrderStep [] StepSet;

    /**
    * 工单详情
    */
    @SerializedName("BaseInfo")
    @Expose
    private ModelEvaluationBaseInfo BaseInfo;

    /**
    * 评估中的网络设备型号详情
    */
    @SerializedName("NetDeviceModelSet")
    @Expose
    private ModelVersionDetail [] NetDeviceModelSet;

    /**
    * 评估中的服务器型号详情
    */
    @SerializedName("ServerModelSet")
    @Expose
    private ModelVersionDetail [] ServerModelSet;

    /**
    * 订单状态, process 处理中 ，reject 已拒绝 ，finish 已完成，exception 异常
    */
    @SerializedName("OrderStatus")
    @Expose
    private String OrderStatus;

    /**
    * 工单拒绝原因
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
     * Get 工单进度 
     * @return StepSet 工单进度
     */
    public OrderStep [] getStepSet() {
        return this.StepSet;
    }

    /**
     * Set 工单进度
     * @param StepSet 工单进度
     */
    public void setStepSet(OrderStep [] StepSet) {
        this.StepSet = StepSet;
    }

    /**
     * Get 工单详情 
     * @return BaseInfo 工单详情
     */
    public ModelEvaluationBaseInfo getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set 工单详情
     * @param BaseInfo 工单详情
     */
    public void setBaseInfo(ModelEvaluationBaseInfo BaseInfo) {
        this.BaseInfo = BaseInfo;
    }

    /**
     * Get 评估中的网络设备型号详情 
     * @return NetDeviceModelSet 评估中的网络设备型号详情
     */
    public ModelVersionDetail [] getNetDeviceModelSet() {
        return this.NetDeviceModelSet;
    }

    /**
     * Set 评估中的网络设备型号详情
     * @param NetDeviceModelSet 评估中的网络设备型号详情
     */
    public void setNetDeviceModelSet(ModelVersionDetail [] NetDeviceModelSet) {
        this.NetDeviceModelSet = NetDeviceModelSet;
    }

    /**
     * Get 评估中的服务器型号详情 
     * @return ServerModelSet 评估中的服务器型号详情
     */
    public ModelVersionDetail [] getServerModelSet() {
        return this.ServerModelSet;
    }

    /**
     * Set 评估中的服务器型号详情
     * @param ServerModelSet 评估中的服务器型号详情
     */
    public void setServerModelSet(ModelVersionDetail [] ServerModelSet) {
        this.ServerModelSet = ServerModelSet;
    }

    /**
     * Get 订单状态, process 处理中 ，reject 已拒绝 ，finish 已完成，exception 异常 
     * @return OrderStatus 订单状态, process 处理中 ，reject 已拒绝 ，finish 已完成，exception 异常
     */
    public String getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set 订单状态, process 处理中 ，reject 已拒绝 ，finish 已完成，exception 异常
     * @param OrderStatus 订单状态, process 处理中 ，reject 已拒绝 ，finish 已完成，exception 异常
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get 工单拒绝原因 
     * @return RejectReason 工单拒绝原因
     */
    public String getRejectReason() {
        return this.RejectReason;
    }

    /**
     * Set 工单拒绝原因
     * @param RejectReason 工单拒绝原因
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

    public DescribeModelEvaluationWorkOrderDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelEvaluationWorkOrderDetailResponse(DescribeModelEvaluationWorkOrderDetailResponse source) {
        if (source.StepSet != null) {
            this.StepSet = new OrderStep[source.StepSet.length];
            for (int i = 0; i < source.StepSet.length; i++) {
                this.StepSet[i] = new OrderStep(source.StepSet[i]);
            }
        }
        if (source.BaseInfo != null) {
            this.BaseInfo = new ModelEvaluationBaseInfo(source.BaseInfo);
        }
        if (source.NetDeviceModelSet != null) {
            this.NetDeviceModelSet = new ModelVersionDetail[source.NetDeviceModelSet.length];
            for (int i = 0; i < source.NetDeviceModelSet.length; i++) {
                this.NetDeviceModelSet[i] = new ModelVersionDetail(source.NetDeviceModelSet[i]);
            }
        }
        if (source.ServerModelSet != null) {
            this.ServerModelSet = new ModelVersionDetail[source.ServerModelSet.length];
            for (int i = 0; i < source.ServerModelSet.length; i++) {
                this.ServerModelSet[i] = new ModelVersionDetail(source.ServerModelSet[i]);
            }
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new String(source.OrderStatus);
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
        this.setParamArrayObj(map, prefix + "StepSet.", this.StepSet);
        this.setParamObj(map, prefix + "BaseInfo.", this.BaseInfo);
        this.setParamArrayObj(map, prefix + "NetDeviceModelSet.", this.NetDeviceModelSet);
        this.setParamArrayObj(map, prefix + "ServerModelSet.", this.ServerModelSet);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "RejectReason", this.RejectReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

