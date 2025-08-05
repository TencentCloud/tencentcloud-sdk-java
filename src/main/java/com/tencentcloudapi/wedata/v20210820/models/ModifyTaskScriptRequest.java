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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTaskScriptRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 存在脚本的任务必填（shell任务、Hive任务、python任务等），脚本内容 base64编码
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 集成任务脚本配置
    */
    @SerializedName("IntegrationNodeDetails")
    @Expose
    private IntegrationNodeDetail [] IntegrationNodeDetails;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 存在脚本的任务必填（shell任务、Hive任务、python任务等），脚本内容 base64编码 
     * @return ScriptContent 存在脚本的任务必填（shell任务、Hive任务、python任务等），脚本内容 base64编码
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 存在脚本的任务必填（shell任务、Hive任务、python任务等），脚本内容 base64编码
     * @param ScriptContent 存在脚本的任务必填（shell任务、Hive任务、python任务等），脚本内容 base64编码
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 集成任务脚本配置 
     * @return IntegrationNodeDetails 集成任务脚本配置
     */
    public IntegrationNodeDetail [] getIntegrationNodeDetails() {
        return this.IntegrationNodeDetails;
    }

    /**
     * Set 集成任务脚本配置
     * @param IntegrationNodeDetails 集成任务脚本配置
     */
    public void setIntegrationNodeDetails(IntegrationNodeDetail [] IntegrationNodeDetails) {
        this.IntegrationNodeDetails = IntegrationNodeDetails;
    }

    public ModifyTaskScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskScriptRequest(ModifyTaskScriptRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.IntegrationNodeDetails != null) {
            this.IntegrationNodeDetails = new IntegrationNodeDetail[source.IntegrationNodeDetails.length];
            for (int i = 0; i < source.IntegrationNodeDetails.length; i++) {
                this.IntegrationNodeDetails[i] = new IntegrationNodeDetail(source.IntegrationNodeDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamArrayObj(map, prefix + "IntegrationNodeDetails.", this.IntegrationNodeDetails);

    }
}

