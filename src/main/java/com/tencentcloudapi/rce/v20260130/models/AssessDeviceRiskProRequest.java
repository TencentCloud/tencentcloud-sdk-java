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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessDeviceRiskProRequest extends AbstractModel {

    /**
    * <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p>
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * <p>客户端 IP 地址（IPv4或IPv6）</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
     * Get <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p> 
     * @return DeviceToken <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p>
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p>
     * @param DeviceToken <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p>
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get <p>客户端 IP 地址（IPv4或IPv6）</p> 
     * @return UserIp <p>客户端 IP 地址（IPv4或IPv6）</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>客户端 IP 地址（IPv4或IPv6）</p>
     * @param UserIp <p>客户端 IP 地址（IPv4或IPv6）</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    public AssessDeviceRiskProRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessDeviceRiskProRequest(AssessDeviceRiskProRequest source) {
        if (source.DeviceToken != null) {
            this.DeviceToken = new String(source.DeviceToken);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);

    }
}

