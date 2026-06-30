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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRunJobLogRequest extends AbstractModel {

    /**
    * <p>任务Uuid。</p>
    */
    @SerializedName("RunUuid")
    @Expose
    private String RunUuid;

    /**
    * <p>子任务id</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>日志类型</p><p>枚举值：</p><ul><li>stdout： 标准输出</li><li>stderr： 标准错误</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>项目ID。<br>（不填使用指定地域下的默认项目）</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>子任务路径，无子任务可填空</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get <p>任务Uuid。</p> 
     * @return RunUuid <p>任务Uuid。</p>
     */
    public String getRunUuid() {
        return this.RunUuid;
    }

    /**
     * Set <p>任务Uuid。</p>
     * @param RunUuid <p>任务Uuid。</p>
     */
    public void setRunUuid(String RunUuid) {
        this.RunUuid = RunUuid;
    }

    /**
     * Get <p>子任务id</p> 
     * @return JobId <p>子任务id</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>子任务id</p>
     * @param JobId <p>子任务id</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>日志类型</p><p>枚举值：</p><ul><li>stdout： 标准输出</li><li>stderr： 标准错误</li></ul> 
     * @return LogType <p>日志类型</p><p>枚举值：</p><ul><li>stdout： 标准输出</li><li>stderr： 标准错误</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型</p><p>枚举值：</p><ul><li>stdout： 标准输出</li><li>stderr： 标准错误</li></ul>
     * @param LogType <p>日志类型</p><p>枚举值：</p><ul><li>stdout： 标准输出</li><li>stderr： 标准错误</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>项目ID。<br>（不填使用指定地域下的默认项目）</p> 
     * @return ProjectId <p>项目ID。<br>（不填使用指定地域下的默认项目）</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID。<br>（不填使用指定地域下的默认项目）</p>
     * @param ProjectId <p>项目ID。<br>（不填使用指定地域下的默认项目）</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>子任务路径，无子任务可填空</p> 
     * @return Path <p>子任务路径，无子任务可填空</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>子任务路径，无子任务可填空</p>
     * @param Path <p>子任务路径，无子任务可填空</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public GetRunJobLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRunJobLogRequest(GetRunJobLogRequest source) {
        if (source.RunUuid != null) {
            this.RunUuid = new String(source.RunUuid);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunUuid", this.RunUuid);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

