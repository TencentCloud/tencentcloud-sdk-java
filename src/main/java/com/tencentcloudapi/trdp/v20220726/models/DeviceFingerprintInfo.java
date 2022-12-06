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
package com.tencentcloudapi.trdp.v20220726.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceFingerprintInfo extends AbstractModel{

    /**
    * 设备指纹Token
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * 设备指纹的客户端SDK对应渠道
    */
    @SerializedName("SdkChannel")
    @Expose
    private String SdkChannel;

    /**
     * Get 设备指纹Token 
     * @return DeviceToken 设备指纹Token
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set 设备指纹Token
     * @param DeviceToken 设备指纹Token
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get 设备指纹的客户端SDK对应渠道 
     * @return SdkChannel 设备指纹的客户端SDK对应渠道
     */
    public String getSdkChannel() {
        return this.SdkChannel;
    }

    /**
     * Set 设备指纹的客户端SDK对应渠道
     * @param SdkChannel 设备指纹的客户端SDK对应渠道
     */
    public void setSdkChannel(String SdkChannel) {
        this.SdkChannel = SdkChannel;
    }

    public DeviceFingerprintInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceFingerprintInfo(DeviceFingerprintInfo source) {
        if (source.DeviceToken != null) {
            this.DeviceToken = new String(source.DeviceToken);
        }
        if (source.SdkChannel != null) {
            this.SdkChannel = new String(source.SdkChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);
        this.setParamSimple(map, prefix + "SdkChannel", this.SdkChannel);

    }
}

