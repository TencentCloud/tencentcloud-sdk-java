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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableModelVersion extends AbstractModel {

    /**
    * 带有版本号的设备型号
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 设备高度
    */
    @SerializedName("DevHeight")
    @Expose
    private String DevHeight;

    /**
    * 设备类型，server 服务器，netDevice 网络设备
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 带有版本号的设备型号 
     * @return ModelVersion 带有版本号的设备型号
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 带有版本号的设备型号
     * @param ModelVersion 带有版本号的设备型号
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 设备高度 
     * @return DevHeight 设备高度
     */
    public String getDevHeight() {
        return this.DevHeight;
    }

    /**
     * Set 设备高度
     * @param DevHeight 设备高度
     */
    public void setDevHeight(String DevHeight) {
        this.DevHeight = DevHeight;
    }

    /**
     * Get 设备类型，server 服务器，netDevice 网络设备 
     * @return DeviceType 设备类型，server 服务器，netDevice 网络设备
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型，server 服务器，netDevice 网络设备
     * @param DeviceType 设备类型，server 服务器，netDevice 网络设备
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public AvailableModelVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableModelVersion(AvailableModelVersion source) {
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.DevHeight != null) {
            this.DevHeight = new String(source.DevHeight);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "DevHeight", this.DevHeight);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

