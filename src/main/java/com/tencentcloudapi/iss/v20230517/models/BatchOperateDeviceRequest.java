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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOperateDeviceRequest extends AbstractModel{

    /**
    * 设备 ID 数组（从获取设备列表接口ListDevices中获取）
    */
    @SerializedName("DeviceIds")
    @Expose
    private String [] DeviceIds;

    /**
    * 操作命令（enable：启用；disable：禁用；delete：删除）
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
     * Get 设备 ID 数组（从获取设备列表接口ListDevices中获取） 
     * @return DeviceIds 设备 ID 数组（从获取设备列表接口ListDevices中获取）
     */
    public String [] getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set 设备 ID 数组（从获取设备列表接口ListDevices中获取）
     * @param DeviceIds 设备 ID 数组（从获取设备列表接口ListDevices中获取）
     */
    public void setDeviceIds(String [] DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    /**
     * Get 操作命令（enable：启用；disable：禁用；delete：删除） 
     * @return Cmd 操作命令（enable：启用；disable：禁用；delete：删除）
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 操作命令（enable：启用；disable：禁用；delete：删除）
     * @param Cmd 操作命令（enable：启用；disable：禁用；delete：删除）
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    public BatchOperateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOperateDeviceRequest(BatchOperateDeviceRequest source) {
        if (source.DeviceIds != null) {
            this.DeviceIds = new String[source.DeviceIds.length];
            for (int i = 0; i < source.DeviceIds.length; i++) {
                this.DeviceIds[i] = new String(source.DeviceIds[i]);
            }
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeviceIds.", this.DeviceIds);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);

    }
}

