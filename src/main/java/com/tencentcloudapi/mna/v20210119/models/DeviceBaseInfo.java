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

public class DeviceBaseInfo extends AbstractModel{

    /**
    * 设备唯一ID
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
    * 设备创建的时间，单位：ms
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 设备最后在线时间，单位：ms
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 设备的备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 设备唯一ID 
     * @return DeviceId 设备唯一ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一ID
     * @param DeviceId 设备唯一ID
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
     * Get 设备创建的时间，单位：ms 
     * @return CreateTime 设备创建的时间，单位：ms
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 设备创建的时间，单位：ms
     * @param CreateTime 设备创建的时间，单位：ms
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 设备最后在线时间，单位：ms 
     * @return LastTime 设备最后在线时间，单位：ms
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 设备最后在线时间，单位：ms
     * @param LastTime 设备最后在线时间，单位：ms
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 设备的备注 
     * @return Remark 设备的备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 设备的备注
     * @param Remark 设备的备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public DeviceBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceBaseInfo(DeviceBaseInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

