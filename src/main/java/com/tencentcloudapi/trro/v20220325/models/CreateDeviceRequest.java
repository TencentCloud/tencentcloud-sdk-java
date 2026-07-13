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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeviceRequest extends AbstractModel {

    /**
    * <p>创建设备所归属的项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>创建设备ID，项目内需要唯一，由小写英文字母、数字和下划线构成，长度不超过32</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>创建设备名称，长度小于24, 可包含中文、数字、英文字母和下划线</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>设备类型</p><p>枚举值：</p><ul><li>field： 现场设备（受控设备）</li><li>remote： 远端设备（操控设备）</li></ul>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>设备认证口令，由大小写英文字母和数字构成，须为16位</p>
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
     * Get <p>创建设备所归属的项目ID</p> 
     * @return ProjectId <p>创建设备所归属的项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>创建设备所归属的项目ID</p>
     * @param ProjectId <p>创建设备所归属的项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>创建设备ID，项目内需要唯一，由小写英文字母、数字和下划线构成，长度不超过32</p> 
     * @return DeviceId <p>创建设备ID，项目内需要唯一，由小写英文字母、数字和下划线构成，长度不超过32</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>创建设备ID，项目内需要唯一，由小写英文字母、数字和下划线构成，长度不超过32</p>
     * @param DeviceId <p>创建设备ID，项目内需要唯一，由小写英文字母、数字和下划线构成，长度不超过32</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>创建设备名称，长度小于24, 可包含中文、数字、英文字母和下划线</p> 
     * @return DeviceName <p>创建设备名称，长度小于24, 可包含中文、数字、英文字母和下划线</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>创建设备名称，长度小于24, 可包含中文、数字、英文字母和下划线</p>
     * @param DeviceName <p>创建设备名称，长度小于24, 可包含中文、数字、英文字母和下划线</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>设备类型</p><p>枚举值：</p><ul><li>field： 现场设备（受控设备）</li><li>remote： 远端设备（操控设备）</li></ul> 
     * @return DeviceType <p>设备类型</p><p>枚举值：</p><ul><li>field： 现场设备（受控设备）</li><li>remote： 远端设备（操控设备）</li></ul>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>设备类型</p><p>枚举值：</p><ul><li>field： 现场设备（受控设备）</li><li>remote： 远端设备（操控设备）</li></ul>
     * @param DeviceType <p>设备类型</p><p>枚举值：</p><ul><li>field： 现场设备（受控设备）</li><li>remote： 远端设备（操控设备）</li></ul>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>设备认证口令，由大小写英文字母和数字构成，须为16位</p> 
     * @return DeviceToken <p>设备认证口令，由大小写英文字母和数字构成，须为16位</p>
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set <p>设备认证口令，由大小写英文字母和数字构成，须为16位</p>
     * @param DeviceToken <p>设备认证口令，由大小写英文字母和数字构成，须为16位</p>
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    public CreateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceRequest(CreateDeviceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
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
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);

    }
}

