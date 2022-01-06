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

public class ModifyBindSceneDeviceRequest extends AbstractModel{

    /**
    * 场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private Long SceneId;

    /**
    * 1: 绑定 2: 解绑
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 设备列表
    */
    @SerializedName("Devices")
    @Expose
    private DeviceItem [] Devices;

    /**
     * Get 场景ID 
     * @return SceneId 场景ID
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景ID
     * @param SceneId 场景ID
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 1: 绑定 2: 解绑 
     * @return Type 1: 绑定 2: 解绑
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1: 绑定 2: 解绑
     * @param Type 1: 绑定 2: 解绑
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 设备列表 
     * @return Devices 设备列表
     */
    public DeviceItem [] getDevices() {
        return this.Devices;
    }

    /**
     * Set 设备列表
     * @param Devices 设备列表
     */
    public void setDevices(DeviceItem [] Devices) {
        this.Devices = Devices;
    }

    public ModifyBindSceneDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBindSceneDeviceRequest(ModifyBindSceneDeviceRequest source) {
        if (source.SceneId != null) {
            this.SceneId = new Long(source.SceneId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Devices != null) {
            this.Devices = new DeviceItem[source.Devices.length];
            for (int i = 0; i < source.Devices.length; i++) {
                this.Devices[i] = new DeviceItem(source.Devices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Devices.", this.Devices);

    }
}

