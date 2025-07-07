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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallISAPIRequest extends AbstractModel {

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * url 资源
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 输入参数
    */
    @SerializedName("InputData")
    @Expose
    private String InputData;

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get url 资源 
     * @return Url url 资源
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set url 资源
     * @param Url url 资源
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 输入参数 
     * @return InputData 输入参数
     */
    public String getInputData() {
        return this.InputData;
    }

    /**
     * Set 输入参数
     * @param InputData 输入参数
     */
    public void setInputData(String InputData) {
        this.InputData = InputData;
    }

    public CallISAPIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallISAPIRequest(CallISAPIRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.InputData != null) {
            this.InputData = new String(source.InputData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "InputData", this.InputData);

    }
}

