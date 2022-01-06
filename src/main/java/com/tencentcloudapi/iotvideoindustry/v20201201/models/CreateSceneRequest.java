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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSceneRequest extends AbstractModel{

    /**
    * 场景名称
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * 场景触发规则
    */
    @SerializedName("SceneTrigger")
    @Expose
    private String SceneTrigger;

    /**
    * 录制时长 (秒)
    */
    @SerializedName("RecordDuration")
    @Expose
    private Long RecordDuration;

    /**
    * 录像存储时长(天)
    */
    @SerializedName("StoreDuration")
    @Expose
    private Long StoreDuration;

    /**
    * 设备列表(不推荐使用)
    */
    @SerializedName("Devices")
    @Expose
    private DeviceItem [] Devices;

    /**
    * 通道列表
    */
    @SerializedName("Channels")
    @Expose
    private ChannelItem [] Channels;

    /**
     * Get 场景名称 
     * @return SceneName 场景名称
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set 场景名称
     * @param SceneName 场景名称
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get 场景触发规则 
     * @return SceneTrigger 场景触发规则
     */
    public String getSceneTrigger() {
        return this.SceneTrigger;
    }

    /**
     * Set 场景触发规则
     * @param SceneTrigger 场景触发规则
     */
    public void setSceneTrigger(String SceneTrigger) {
        this.SceneTrigger = SceneTrigger;
    }

    /**
     * Get 录制时长 (秒) 
     * @return RecordDuration 录制时长 (秒)
     */
    public Long getRecordDuration() {
        return this.RecordDuration;
    }

    /**
     * Set 录制时长 (秒)
     * @param RecordDuration 录制时长 (秒)
     */
    public void setRecordDuration(Long RecordDuration) {
        this.RecordDuration = RecordDuration;
    }

    /**
     * Get 录像存储时长(天) 
     * @return StoreDuration 录像存储时长(天)
     */
    public Long getStoreDuration() {
        return this.StoreDuration;
    }

    /**
     * Set 录像存储时长(天)
     * @param StoreDuration 录像存储时长(天)
     */
    public void setStoreDuration(Long StoreDuration) {
        this.StoreDuration = StoreDuration;
    }

    /**
     * Get 设备列表(不推荐使用) 
     * @return Devices 设备列表(不推荐使用)
     */
    public DeviceItem [] getDevices() {
        return this.Devices;
    }

    /**
     * Set 设备列表(不推荐使用)
     * @param Devices 设备列表(不推荐使用)
     */
    public void setDevices(DeviceItem [] Devices) {
        this.Devices = Devices;
    }

    /**
     * Get 通道列表 
     * @return Channels 通道列表
     */
    public ChannelItem [] getChannels() {
        return this.Channels;
    }

    /**
     * Set 通道列表
     * @param Channels 通道列表
     */
    public void setChannels(ChannelItem [] Channels) {
        this.Channels = Channels;
    }

    public CreateSceneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSceneRequest(CreateSceneRequest source) {
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.SceneTrigger != null) {
            this.SceneTrigger = new String(source.SceneTrigger);
        }
        if (source.RecordDuration != null) {
            this.RecordDuration = new Long(source.RecordDuration);
        }
        if (source.StoreDuration != null) {
            this.StoreDuration = new Long(source.StoreDuration);
        }
        if (source.Devices != null) {
            this.Devices = new DeviceItem[source.Devices.length];
            for (int i = 0; i < source.Devices.length; i++) {
                this.Devices[i] = new DeviceItem(source.Devices[i]);
            }
        }
        if (source.Channels != null) {
            this.Channels = new ChannelItem[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new ChannelItem(source.Channels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "SceneTrigger", this.SceneTrigger);
        this.setParamSimple(map, prefix + "RecordDuration", this.RecordDuration);
        this.setParamSimple(map, prefix + "StoreDuration", this.StoreDuration);
        this.setParamArrayObj(map, prefix + "Devices.", this.Devices);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);

    }
}

