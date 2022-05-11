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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayBindDevicesResponse extends AbstractModel{

    /**
    * 子设备总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 子设备信息
    */
    @SerializedName("Devices")
    @Expose
    private BindDeviceInfo [] Devices;

    /**
    * 子设备所属的产品名
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 子设备总数 
     * @return TotalCount 子设备总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 子设备总数
     * @param TotalCount 子设备总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 子设备信息 
     * @return Devices 子设备信息
     */
    public BindDeviceInfo [] getDevices() {
        return this.Devices;
    }

    /**
     * Set 子设备信息
     * @param Devices 子设备信息
     */
    public void setDevices(BindDeviceInfo [] Devices) {
        this.Devices = Devices;
    }

    /**
     * Get 子设备所属的产品名 
     * @return ProductName 子设备所属的产品名
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 子设备所属的产品名
     * @param ProductName 子设备所属的产品名
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
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

    public DescribeGatewayBindDevicesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayBindDevicesResponse(DescribeGatewayBindDevicesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Devices != null) {
            this.Devices = new BindDeviceInfo[source.Devices.length];
            for (int i = 0; i < source.Devices.length; i++) {
                this.Devices[i] = new BindDeviceInfo(source.Devices[i]);
            }
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Devices.", this.Devices);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

