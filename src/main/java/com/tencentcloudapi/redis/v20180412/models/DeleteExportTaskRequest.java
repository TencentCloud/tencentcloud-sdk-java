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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteExportTaskRequest extends AbstractModel {

    /**
    * <p>指定删除的日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>指定删除日志的文件名。</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>指定删除的日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul> 
     * @return LogType <p>指定删除的日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>指定删除的日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     * @param LogType <p>指定删除的日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>指定删除日志的文件名。</p> 
     * @return FileName <p>指定删除日志的文件名。</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>指定删除日志的文件名。</p>
     * @param FileName <p>指定删除日志的文件名。</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DeleteExportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteExportTaskRequest(DeleteExportTaskRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

