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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceRequest extends AbstractModel{

    /**
    * 要修改设备归属项目的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 要修改设备的设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 修改后的设备名称，不填则不修改
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 修改后的设备认证口令，不填则不修改
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
     * Get 要修改设备归属项目的项目ID 
     * @return ProjectId 要修改设备归属项目的项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 要修改设备归属项目的项目ID
     * @param ProjectId 要修改设备归属项目的项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 要修改设备的设备ID 
     * @return DeviceId 要修改设备的设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 要修改设备的设备ID
     * @param DeviceId 要修改设备的设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 修改后的设备名称，不填则不修改 
     * @return DeviceName 修改后的设备名称，不填则不修改
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 修改后的设备名称，不填则不修改
     * @param DeviceName 修改后的设备名称，不填则不修改
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 修改后的设备认证口令，不填则不修改 
     * @return DeviceToken 修改后的设备认证口令，不填则不修改
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set 修改后的设备认证口令，不填则不修改
     * @param DeviceToken 修改后的设备认证口令，不填则不修改
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    public ModifyDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceRequest(ModifyDeviceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceToken != null) {
            this.DeviceToken = new String(source.DeviceToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);

    }
}

