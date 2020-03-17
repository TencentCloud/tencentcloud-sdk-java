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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindDevInfo extends AbstractModel{

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceModel")
    @Expose
    private String DeviceModel;

    /**
    * 用户角色，owner：主人，guest：访客
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备型号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceModel 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceModel() {
        return this.DeviceModel;
    }

    /**
     * Set 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceModel 设备型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceModel(String DeviceModel) {
        this.DeviceModel = DeviceModel;
    }

    /**
     * Get 用户角色，owner：主人，guest：访客 
     * @return Role 用户角色，owner：主人，guest：访客
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 用户角色，owner：主人，guest：访客
     * @param Role 用户角色，owner：主人，guest：访客
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceModel", this.DeviceModel);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

