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

public class DescribeResourceUsageResponse extends AbstractModel {

    /**
    * 托管服务器数量
    */
    @SerializedName("HostingServerCount")
    @Expose
    private Long HostingServerCount;

    /**
    * 租用服务器数量
    */
    @SerializedName("RentServerCount")
    @Expose
    private Long RentServerCount;

    /**
    * 网络设备数量
    */
    @SerializedName("NetDeviceCount")
    @Expose
    private Long NetDeviceCount;

    /**
    * 机架总数
    */
    @SerializedName("RackTotalCount")
    @Expose
    private Long RackTotalCount;

    /**
    * 开电机架总数
    */
    @SerializedName("RackPowerOnCount")
    @Expose
    private Long RackPowerOnCount;

    /**
    * 机位使用数量
    */
    @SerializedName("PositionUsedCount")
    @Expose
    private Long PositionUsedCount;

    /**
    * 机位总数
    */
    @SerializedName("PositionTotalCount")
    @Expose
    private Long PositionTotalCount;

    /**
    * 机架开电率，保留一位小数
    */
    @SerializedName("RackPowerOnRate")
    @Expose
    private String RackPowerOnRate;

    /**
    * 机位使用率，
    */
    @SerializedName("PositionUsedRate")
    @Expose
    private String PositionUsedRate;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 托管服务器数量 
     * @return HostingServerCount 托管服务器数量
     */
    public Long getHostingServerCount() {
        return this.HostingServerCount;
    }

    /**
     * Set 托管服务器数量
     * @param HostingServerCount 托管服务器数量
     */
    public void setHostingServerCount(Long HostingServerCount) {
        this.HostingServerCount = HostingServerCount;
    }

    /**
     * Get 租用服务器数量 
     * @return RentServerCount 租用服务器数量
     */
    public Long getRentServerCount() {
        return this.RentServerCount;
    }

    /**
     * Set 租用服务器数量
     * @param RentServerCount 租用服务器数量
     */
    public void setRentServerCount(Long RentServerCount) {
        this.RentServerCount = RentServerCount;
    }

    /**
     * Get 网络设备数量 
     * @return NetDeviceCount 网络设备数量
     */
    public Long getNetDeviceCount() {
        return this.NetDeviceCount;
    }

    /**
     * Set 网络设备数量
     * @param NetDeviceCount 网络设备数量
     */
    public void setNetDeviceCount(Long NetDeviceCount) {
        this.NetDeviceCount = NetDeviceCount;
    }

    /**
     * Get 机架总数 
     * @return RackTotalCount 机架总数
     */
    public Long getRackTotalCount() {
        return this.RackTotalCount;
    }

    /**
     * Set 机架总数
     * @param RackTotalCount 机架总数
     */
    public void setRackTotalCount(Long RackTotalCount) {
        this.RackTotalCount = RackTotalCount;
    }

    /**
     * Get 开电机架总数 
     * @return RackPowerOnCount 开电机架总数
     */
    public Long getRackPowerOnCount() {
        return this.RackPowerOnCount;
    }

    /**
     * Set 开电机架总数
     * @param RackPowerOnCount 开电机架总数
     */
    public void setRackPowerOnCount(Long RackPowerOnCount) {
        this.RackPowerOnCount = RackPowerOnCount;
    }

    /**
     * Get 机位使用数量 
     * @return PositionUsedCount 机位使用数量
     */
    public Long getPositionUsedCount() {
        return this.PositionUsedCount;
    }

    /**
     * Set 机位使用数量
     * @param PositionUsedCount 机位使用数量
     */
    public void setPositionUsedCount(Long PositionUsedCount) {
        this.PositionUsedCount = PositionUsedCount;
    }

    /**
     * Get 机位总数 
     * @return PositionTotalCount 机位总数
     */
    public Long getPositionTotalCount() {
        return this.PositionTotalCount;
    }

    /**
     * Set 机位总数
     * @param PositionTotalCount 机位总数
     */
    public void setPositionTotalCount(Long PositionTotalCount) {
        this.PositionTotalCount = PositionTotalCount;
    }

    /**
     * Get 机架开电率，保留一位小数 
     * @return RackPowerOnRate 机架开电率，保留一位小数
     */
    public String getRackPowerOnRate() {
        return this.RackPowerOnRate;
    }

    /**
     * Set 机架开电率，保留一位小数
     * @param RackPowerOnRate 机架开电率，保留一位小数
     */
    public void setRackPowerOnRate(String RackPowerOnRate) {
        this.RackPowerOnRate = RackPowerOnRate;
    }

    /**
     * Get 机位使用率， 
     * @return PositionUsedRate 机位使用率，
     */
    public String getPositionUsedRate() {
        return this.PositionUsedRate;
    }

    /**
     * Set 机位使用率，
     * @param PositionUsedRate 机位使用率，
     */
    public void setPositionUsedRate(String PositionUsedRate) {
        this.PositionUsedRate = PositionUsedRate;
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

    public DescribeResourceUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceUsageResponse(DescribeResourceUsageResponse source) {
        if (source.HostingServerCount != null) {
            this.HostingServerCount = new Long(source.HostingServerCount);
        }
        if (source.RentServerCount != null) {
            this.RentServerCount = new Long(source.RentServerCount);
        }
        if (source.NetDeviceCount != null) {
            this.NetDeviceCount = new Long(source.NetDeviceCount);
        }
        if (source.RackTotalCount != null) {
            this.RackTotalCount = new Long(source.RackTotalCount);
        }
        if (source.RackPowerOnCount != null) {
            this.RackPowerOnCount = new Long(source.RackPowerOnCount);
        }
        if (source.PositionUsedCount != null) {
            this.PositionUsedCount = new Long(source.PositionUsedCount);
        }
        if (source.PositionTotalCount != null) {
            this.PositionTotalCount = new Long(source.PositionTotalCount);
        }
        if (source.RackPowerOnRate != null) {
            this.RackPowerOnRate = new String(source.RackPowerOnRate);
        }
        if (source.PositionUsedRate != null) {
            this.PositionUsedRate = new String(source.PositionUsedRate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostingServerCount", this.HostingServerCount);
        this.setParamSimple(map, prefix + "RentServerCount", this.RentServerCount);
        this.setParamSimple(map, prefix + "NetDeviceCount", this.NetDeviceCount);
        this.setParamSimple(map, prefix + "RackTotalCount", this.RackTotalCount);
        this.setParamSimple(map, prefix + "RackPowerOnCount", this.RackPowerOnCount);
        this.setParamSimple(map, prefix + "PositionUsedCount", this.PositionUsedCount);
        this.setParamSimple(map, prefix + "PositionTotalCount", this.PositionTotalCount);
        this.setParamSimple(map, prefix + "RackPowerOnRate", this.RackPowerOnRate);
        this.setParamSimple(map, prefix + "PositionUsedRate", this.PositionUsedRate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

