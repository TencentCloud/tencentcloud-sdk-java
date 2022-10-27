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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResultDownloadRequest extends AbstractModel{

    /**
    * 查询结果任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 下载格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 是否重新生成下载文件，仅当之前任务为 Timout | Error 时有效
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get 查询结果任务Id 
     * @return TaskId 查询结果任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 查询结果任务Id
     * @param TaskId 查询结果任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 下载格式 
     * @return Format 下载格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 下载格式
     * @param Format 下载格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 是否重新生成下载文件，仅当之前任务为 Timout | Error 时有效 
     * @return Force 是否重新生成下载文件，仅当之前任务为 Timout | Error 时有效
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否重新生成下载文件，仅当之前任务为 Timout | Error 时有效
     * @param Force 是否重新生成下载文件，仅当之前任务为 Timout | Error 时有效
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public CreateResultDownloadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResultDownloadRequest(CreateResultDownloadRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

