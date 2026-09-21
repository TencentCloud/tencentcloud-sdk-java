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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOperateDeviceRequest extends AbstractModel {

    /**
    * <p>设备 ID 数组（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p>
    */
    @SerializedName("DeviceIds")
    @Expose
    private String [] DeviceIds;

    /**
    * <p>操作命令</p><p>枚举值：</p><ul><li>enable： 启用</li><li>disable： 禁用</li><li>delete： 删除</li><li>sync： 同步设备通道</li></ul>
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
     * Get <p>设备 ID 数组（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p> 
     * @return DeviceIds <p>设备 ID 数组（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p>
     */
    public String [] getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set <p>设备 ID 数组（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p>
     * @param DeviceIds <p>设备 ID 数组（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p>
     */
    public void setDeviceIds(String [] DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    /**
     * Get <p>操作命令</p><p>枚举值：</p><ul><li>enable： 启用</li><li>disable： 禁用</li><li>delete： 删除</li><li>sync： 同步设备通道</li></ul> 
     * @return Cmd <p>操作命令</p><p>枚举值：</p><ul><li>enable： 启用</li><li>disable： 禁用</li><li>delete： 删除</li><li>sync： 同步设备通道</li></ul>
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>操作命令</p><p>枚举值：</p><ul><li>enable： 启用</li><li>disable： 禁用</li><li>delete： 删除</li><li>sync： 同步设备通道</li></ul>
     * @param Cmd <p>操作命令</p><p>枚举值：</p><ul><li>enable： 启用</li><li>disable： 禁用</li><li>delete： 删除</li><li>sync： 同步设备通道</li></ul>
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

