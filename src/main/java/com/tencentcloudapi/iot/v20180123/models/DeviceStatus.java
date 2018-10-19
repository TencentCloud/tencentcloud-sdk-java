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

public class DeviceStatus  extends AbstractModel{

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备状态（inactive, online, offline）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 首次上线时间
    */
    @SerializedName("FirstOnline")
    @Expose
    private String FirstOnline;

    /**
    * 最后上线时间
    */
    @SerializedName("LastOnline")
    @Expose
    private String LastOnline;

    /**
    * 上线次数
    */
    @SerializedName("OnlineTimes")
    @Expose
    private Integer OnlineTimes;

    /**
     * 获取设备名称
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * 设置设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 获取设备状态（inactive, online, offline）
     * @return Status 设备状态（inactive, online, offline）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置设备状态（inactive, online, offline）
     * @param Status 设备状态（inactive, online, offline）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取首次上线时间
     * @return FirstOnline 首次上线时间
     */
    public String getFirstOnline() {
        return this.FirstOnline;
    }

    /**
     * 设置首次上线时间
     * @param FirstOnline 首次上线时间
     */
    public void setFirstOnline(String FirstOnline) {
        this.FirstOnline = FirstOnline;
    }

    /**
     * 获取最后上线时间
     * @return LastOnline 最后上线时间
     */
    public String getLastOnline() {
        return this.LastOnline;
    }

    /**
     * 设置最后上线时间
     * @param LastOnline 最后上线时间
     */
    public void setLastOnline(String LastOnline) {
        this.LastOnline = LastOnline;
    }

    /**
     * 获取上线次数
     * @return OnlineTimes 上线次数
     */
    public Integer getOnlineTimes() {
        return this.OnlineTimes;
    }

    /**
     * 设置上线次数
     * @param OnlineTimes 上线次数
     */
    public void setOnlineTimes(Integer OnlineTimes) {
        this.OnlineTimes = OnlineTimes;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FirstOnline", this.FirstOnline);
        this.setParamSimple(map, prefix + "LastOnline", this.LastOnline);
        this.setParamSimple(map, prefix + "OnlineTimes", this.OnlineTimes);

    }
}

