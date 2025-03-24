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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelTemplateRequest extends AbstractModel {

    /**
    * 型号类型，只支持传入 server 和 netDevice
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 型号类型，只支持传入 server 和 netDevice 
     * @return DeviceType 型号类型，只支持传入 server 和 netDevice
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 型号类型，只支持传入 server 和 netDevice
     * @param DeviceType 型号类型，只支持传入 server 和 netDevice
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public DescribeModelTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelTemplateRequest(DescribeModelTemplateRequest source) {
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

