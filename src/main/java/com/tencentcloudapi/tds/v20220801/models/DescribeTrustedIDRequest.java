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
package com.tencentcloudapi.tds.v20220801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrustedIDRequest extends AbstractModel{

    /**
    * 客户端通过SDK获取的设备Token
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
     * Get 客户端通过SDK获取的设备Token 
     * @return DeviceToken 客户端通过SDK获取的设备Token
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set 客户端通过SDK获取的设备Token
     * @param DeviceToken 客户端通过SDK获取的设备Token
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    public DescribeTrustedIDRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrustedIDRequest(DescribeTrustedIDRequest source) {
        if (source.DeviceToken != null) {
            this.DeviceToken = new String(source.DeviceToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);

    }
}

