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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivateTWeCallLicenseResponse extends AbstractModel {

    /**
    * 设备激活返回数据
    */
    @SerializedName("DeviceList")
    @Expose
    private DeviceActiveResult [] DeviceList;

    /**
    * 设备激活失败返回数据
    */
    @SerializedName("FailureList")
    @Expose
    private DeviceActiveResult [] FailureList;

    /**
    * 设备激活成功返回数据
    */
    @SerializedName("SuccessList")
    @Expose
    private DeviceActiveResult [] SuccessList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 设备激活返回数据 
     * @return DeviceList 设备激活返回数据
     * @deprecated
     */
    @Deprecated
    public DeviceActiveResult [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set 设备激活返回数据
     * @param DeviceList 设备激活返回数据
     * @deprecated
     */
    @Deprecated
    public void setDeviceList(DeviceActiveResult [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    /**
     * Get 设备激活失败返回数据 
     * @return FailureList 设备激活失败返回数据
     */
    public DeviceActiveResult [] getFailureList() {
        return this.FailureList;
    }

    /**
     * Set 设备激活失败返回数据
     * @param FailureList 设备激活失败返回数据
     */
    public void setFailureList(DeviceActiveResult [] FailureList) {
        this.FailureList = FailureList;
    }

    /**
     * Get 设备激活成功返回数据 
     * @return SuccessList 设备激活成功返回数据
     */
    public DeviceActiveResult [] getSuccessList() {
        return this.SuccessList;
    }

    /**
     * Set 设备激活成功返回数据
     * @param SuccessList 设备激活成功返回数据
     */
    public void setSuccessList(DeviceActiveResult [] SuccessList) {
        this.SuccessList = SuccessList;
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

    public ActivateTWeCallLicenseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivateTWeCallLicenseResponse(ActivateTWeCallLicenseResponse source) {
        if (source.DeviceList != null) {
            this.DeviceList = new DeviceActiveResult[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new DeviceActiveResult(source.DeviceList[i]);
            }
        }
        if (source.FailureList != null) {
            this.FailureList = new DeviceActiveResult[source.FailureList.length];
            for (int i = 0; i < source.FailureList.length; i++) {
                this.FailureList[i] = new DeviceActiveResult(source.FailureList[i]);
            }
        }
        if (source.SuccessList != null) {
            this.SuccessList = new DeviceActiveResult[source.SuccessList.length];
            for (int i = 0; i < source.SuccessList.length; i++) {
                this.SuccessList[i] = new DeviceActiveResult(source.SuccessList[i]);
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
        this.setParamArrayObj(map, prefix + "DeviceList.", this.DeviceList);
        this.setParamArrayObj(map, prefix + "FailureList.", this.FailureList);
        this.setParamArrayObj(map, prefix + "SuccessList.", this.SuccessList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

