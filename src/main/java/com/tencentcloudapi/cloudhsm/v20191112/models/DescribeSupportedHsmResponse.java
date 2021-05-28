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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSupportedHsmResponse extends AbstractModel{

    /**
    * 当前地域所支持的设备列表
    */
    @SerializedName("DeviceTypes")
    @Expose
    private DeviceInfo [] DeviceTypes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前地域所支持的设备列表 
     * @return DeviceTypes 当前地域所支持的设备列表
     */
    public DeviceInfo [] getDeviceTypes() {
        return this.DeviceTypes;
    }

    /**
     * Set 当前地域所支持的设备列表
     * @param DeviceTypes 当前地域所支持的设备列表
     */
    public void setDeviceTypes(DeviceInfo [] DeviceTypes) {
        this.DeviceTypes = DeviceTypes;
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

    public DescribeSupportedHsmResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSupportedHsmResponse(DescribeSupportedHsmResponse source) {
        if (source.DeviceTypes != null) {
            this.DeviceTypes = new DeviceInfo[source.DeviceTypes.length];
            for (int i = 0; i < source.DeviceTypes.length; i++) {
                this.DeviceTypes[i] = new DeviceInfo(source.DeviceTypes[i]);
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
        this.setParamArrayObj(map, prefix + "DeviceTypes.", this.DeviceTypes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

