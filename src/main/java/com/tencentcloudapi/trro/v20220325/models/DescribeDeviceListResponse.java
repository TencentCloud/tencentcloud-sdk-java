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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceListResponse extends AbstractModel{

    /**
    * 设备信息列表
    */
    @SerializedName("Devices")
    @Expose
    private DeviceInfo [] Devices;

    /**
    * 设备总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 本次返回的设备数
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 设备信息列表 
     * @return Devices 设备信息列表
     */
    public DeviceInfo [] getDevices() {
        return this.Devices;
    }

    /**
     * Set 设备信息列表
     * @param Devices 设备信息列表
     */
    public void setDevices(DeviceInfo [] Devices) {
        this.Devices = Devices;
    }

    /**
     * Get 设备总数 
     * @return Total 设备总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 设备总数
     * @param Total 设备总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 本次返回的设备数 
     * @return Num 本次返回的设备数
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 本次返回的设备数
     * @param Num 本次返回的设备数
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceListResponse(DescribeDeviceListResponse source) {
        if (source.Devices != null) {
            this.Devices = new DeviceInfo[source.Devices.length];
            for (int i = 0; i < source.Devices.length; i++) {
                this.Devices[i] = new DeviceInfo(source.Devices[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Devices.", this.Devices);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

