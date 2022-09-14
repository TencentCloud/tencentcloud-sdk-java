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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDeviceRequest extends AbstractModel{

    /**
    * 设备id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 更新设备网络信息
    */
    @SerializedName("UpdateNetInfo")
    @Expose
    private UpdateNetInfo [] UpdateNetInfo;

    /**
     * Get 设备id 
     * @return DeviceId 设备id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备id
     * @param DeviceId 设备id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
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
     * Get 设备备注 
     * @return Remark 设备备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 设备备注
     * @param Remark 设备备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 更新设备网络信息 
     * @return UpdateNetInfo 更新设备网络信息
     */
    public UpdateNetInfo [] getUpdateNetInfo() {
        return this.UpdateNetInfo;
    }

    /**
     * Set 更新设备网络信息
     * @param UpdateNetInfo 更新设备网络信息
     */
    public void setUpdateNetInfo(UpdateNetInfo [] UpdateNetInfo) {
        this.UpdateNetInfo = UpdateNetInfo;
    }

    public UpdateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDeviceRequest(UpdateDeviceRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UpdateNetInfo != null) {
            this.UpdateNetInfo = new UpdateNetInfo[source.UpdateNetInfo.length];
            for (int i = 0; i < source.UpdateNetInfo.length; i++) {
                this.UpdateNetInfo[i] = new UpdateNetInfo(source.UpdateNetInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "UpdateNetInfo.", this.UpdateNetInfo);

    }
}

