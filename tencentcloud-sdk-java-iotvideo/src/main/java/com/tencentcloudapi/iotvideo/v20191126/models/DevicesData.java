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

public class DevicesData extends AbstractModel{

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
    * 激活时间 0代表未激活
    */
    @SerializedName("ActiveTime")
    @Expose
    private Long ActiveTime;

    /**
    * 设备是否被禁用
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * 设备推流状态
    */
    @SerializedName("StreamStatus")
    @Expose
    private Boolean StreamStatus;

    /**
    * 固件版本
    */
    @SerializedName("OtaVersion")
    @Expose
    private String OtaVersion;

    /**
    * 设备在线状态
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private Long LastOnlineTime;

    /**
    * 物模型json数据
    */
    @SerializedName("IotModel")
    @Expose
    private String IotModel;

    /**
    * 设备固件最新更新时间，UNIX时间戳，单位秒
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

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
     * Get 激活时间 0代表未激活 
     * @return ActiveTime 激活时间 0代表未激活
     */
    public Long getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 激活时间 0代表未激活
     * @param ActiveTime 激活时间 0代表未激活
     */
    public void setActiveTime(Long ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 设备是否被禁用 
     * @return Disabled 设备是否被禁用
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 设备是否被禁用
     * @param Disabled 设备是否被禁用
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get 设备推流状态 
     * @return StreamStatus 设备推流状态
     */
    public Boolean getStreamStatus() {
        return this.StreamStatus;
    }

    /**
     * Set 设备推流状态
     * @param StreamStatus 设备推流状态
     */
    public void setStreamStatus(Boolean StreamStatus) {
        this.StreamStatus = StreamStatus;
    }

    /**
     * Get 固件版本 
     * @return OtaVersion 固件版本
     */
    public String getOtaVersion() {
        return this.OtaVersion;
    }

    /**
     * Set 固件版本
     * @param OtaVersion 固件版本
     */
    public void setOtaVersion(String OtaVersion) {
        this.OtaVersion = OtaVersion;
    }

    /**
     * Get 设备在线状态 
     * @return Online 设备在线状态
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 设备在线状态
     * @param Online 设备在线状态
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒 
     * @return LastOnlineTime 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒
     */
    public Long getLastOnlineTime() {
        return this.LastOnlineTime;
    }

    /**
     * Set 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒
     * @param LastOnlineTime 设备最后上线时间（mqtt连接成功时间），UNIX时间戳，单位秒
     */
    public void setLastOnlineTime(Long LastOnlineTime) {
        this.LastOnlineTime = LastOnlineTime;
    }

    /**
     * Get 物模型json数据 
     * @return IotModel 物模型json数据
     */
    public String getIotModel() {
        return this.IotModel;
    }

    /**
     * Set 物模型json数据
     * @param IotModel 物模型json数据
     */
    public void setIotModel(String IotModel) {
        this.IotModel = IotModel;
    }

    /**
     * Get 设备固件最新更新时间，UNIX时间戳，单位秒 
     * @return LastUpdateTime 设备固件最新更新时间，UNIX时间戳，单位秒
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 设备固件最新更新时间，UNIX时间戳，单位秒
     * @param LastUpdateTime 设备固件最新更新时间，UNIX时间戳，单位秒
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "StreamStatus", this.StreamStatus);
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "LastOnlineTime", this.LastOnlineTime);
        this.setParamSimple(map, prefix + "IotModel", this.IotModel);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

