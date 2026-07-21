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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccessLogStatusRequest extends AbstractModel {

    /**
    * <p>日志唯一Id</p>
    */
    @SerializedName("LogPushTaskId")
    @Expose
    private String LogPushTaskId;

    /**
    * <p>状态（启动START， 停止STOP）</p><p>枚举值：</p><ul><li>START： 启动</li><li>STOP： 停止</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>GA实例唯一Id</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
     * Get <p>日志唯一Id</p> 
     * @return LogPushTaskId <p>日志唯一Id</p>
     */
    public String getLogPushTaskId() {
        return this.LogPushTaskId;
    }

    /**
     * Set <p>日志唯一Id</p>
     * @param LogPushTaskId <p>日志唯一Id</p>
     */
    public void setLogPushTaskId(String LogPushTaskId) {
        this.LogPushTaskId = LogPushTaskId;
    }

    /**
     * Get <p>状态（启动START， 停止STOP）</p><p>枚举值：</p><ul><li>START： 启动</li><li>STOP： 停止</li></ul> 
     * @return Status <p>状态（启动START， 停止STOP）</p><p>枚举值：</p><ul><li>START： 启动</li><li>STOP： 停止</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态（启动START， 停止STOP）</p><p>枚举值：</p><ul><li>START： 启动</li><li>STOP： 停止</li></ul>
     * @param Status <p>状态（启动START， 停止STOP）</p><p>枚举值：</p><ul><li>START： 启动</li><li>STOP： 停止</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>GA实例唯一Id</p> 
     * @return GlobalAcceleratorId <p>GA实例唯一Id</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>GA实例唯一Id</p>
     * @param GlobalAcceleratorId <p>GA实例唯一Id</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    public ModifyAccessLogStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccessLogStatusRequest(ModifyAccessLogStatusRequest source) {
        if (source.LogPushTaskId != null) {
            this.LogPushTaskId = new String(source.LogPushTaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogPushTaskId", this.LogPushTaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);

    }
}

