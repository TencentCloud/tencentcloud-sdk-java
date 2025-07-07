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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOsInfoRequest extends AbstractModel {

    /**
    * 设备类型代号。 可以从DescribeDeviceClass查询设备类型列表
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
     * Get 设备类型代号。 可以从DescribeDeviceClass查询设备类型列表 
     * @return DeviceClassCode 设备类型代号。 可以从DescribeDeviceClass查询设备类型列表
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * Set 设备类型代号。 可以从DescribeDeviceClass查询设备类型列表
     * @param DeviceClassCode 设备类型代号。 可以从DescribeDeviceClass查询设备类型列表
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    public DescribeOsInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOsInfoRequest(DescribeOsInfoRequest source) {
        if (source.DeviceClassCode != null) {
            this.DeviceClassCode = new String(source.DeviceClassCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);

    }
}

