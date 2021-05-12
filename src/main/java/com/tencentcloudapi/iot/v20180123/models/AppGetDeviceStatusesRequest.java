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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppGetDeviceStatusesRequest extends AbstractModel{

    /**
    * 访问Token
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * 设备Id列表（单次限制1000个设备）
    */
    @SerializedName("DeviceIds")
    @Expose
    private String [] DeviceIds;

    /**
     * Get 访问Token 
     * @return AccessToken 访问Token
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set 访问Token
     * @param AccessToken 访问Token
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * Get 设备Id列表（单次限制1000个设备） 
     * @return DeviceIds 设备Id列表（单次限制1000个设备）
     */
    public String [] getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set 设备Id列表（单次限制1000个设备）
     * @param DeviceIds 设备Id列表（单次限制1000个设备）
     */
    public void setDeviceIds(String [] DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    public AppGetDeviceStatusesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppGetDeviceStatusesRequest(AppGetDeviceStatusesRequest source) {
        if (source.AccessToken != null) {
            this.AccessToken = new String(source.AccessToken);
        }
        if (source.DeviceIds != null) {
            this.DeviceIds = new String[source.DeviceIds.length];
            for (int i = 0; i < source.DeviceIds.length; i++) {
                this.DeviceIds[i] = new String(source.DeviceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamArraySimple(map, prefix + "DeviceIds.", this.DeviceIds);

    }
}

