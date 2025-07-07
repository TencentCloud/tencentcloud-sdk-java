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

public class DescribeCommonServiceWorkOrderDetailResponse extends AbstractModel {

    /**
    * 进度
    */
    @SerializedName("StepSet")
    @Expose
    private OrderStep [] StepSet;

    /**
    * 基本信息
    */
    @SerializedName("BaseInfo")
    @Expose
    private CommonServiceBaseInfo BaseInfo;

    /**
    * 设备信息
    */
    @SerializedName("DeviceSet")
    @Expose
    private DevicePosition [] DeviceSet;

    /**
    * 工单状态
    */
    @SerializedName("OrderStatus")
    @Expose
    private String OrderStatus;

    /**
    * 拒绝原因
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
     * Get 进度 
     * @return StepSet 进度
     */
    public OrderStep [] getStepSet() {
        return this.StepSet;
    }

    /**
     * Set 进度
     * @param StepSet 进度
     */
    public void setStepSet(OrderStep [] StepSet) {
        this.StepSet = StepSet;
    }

    /**
     * Get 基本信息 
     * @return BaseInfo 基本信息
     */
    public CommonServiceBaseInfo getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set 基本信息
     * @param BaseInfo 基本信息
     */
    public void setBaseInfo(CommonServiceBaseInfo BaseInfo) {
        this.BaseInfo = BaseInfo;
    }

    /**
     * Get 设备信息 
     * @return DeviceSet 设备信息
     */
    public DevicePosition [] getDeviceSet() {
        return this.DeviceSet;
    }

    /**
     * Set 设备信息
     * @param DeviceSet 设备信息
     */
    public void setDeviceSet(DevicePosition [] DeviceSet) {
        this.DeviceSet = DeviceSet;
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
     * Get 拒绝原因 
     * @return RejectReason 拒绝原因
     */
    public String getRejectReason() {
        return this.RejectReason;
    }

    /**
     * Set 拒绝原因
     * @param RejectReason 拒绝原因
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

    public DescribeCommonServiceWorkOrderDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCommonServiceWorkOrderDetailResponse(DescribeCommonServiceWorkOrderDetailResponse source) {
        if (source.StepSet != null) {
            this.StepSet = new OrderStep[source.StepSet.length];
            for (int i = 0; i < source.StepSet.length; i++) {
                this.StepSet[i] = new OrderStep(source.StepSet[i]);
            }
        }
        if (source.BaseInfo != null) {
            this.BaseInfo = new CommonServiceBaseInfo(source.BaseInfo);
        }
        if (source.DeviceSet != null) {
            this.DeviceSet = new DevicePosition[source.DeviceSet.length];
            for (int i = 0; i < source.DeviceSet.length; i++) {
                this.DeviceSet[i] = new DevicePosition(source.DeviceSet[i]);
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
        this.setParamArrayObj(map, prefix + "DeviceSet.", this.DeviceSet);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "RejectReason", this.RejectReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

