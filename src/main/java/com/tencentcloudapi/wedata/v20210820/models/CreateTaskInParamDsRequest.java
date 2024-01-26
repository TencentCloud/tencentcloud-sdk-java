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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskInParamDsRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 参数key
    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * 参数描述
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * 来源任务id
    */
    @SerializedName("FromTaskId")
    @Expose
    private String FromTaskId;

    /**
    * 来源任务key
    */
    @SerializedName("FromParamKey")
    @Expose
    private String FromParamKey;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 参数key 
     * @return ParamKey 参数key
     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set 参数key
     * @param ParamKey 参数key
     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get 参数描述 
     * @return ParamDesc 参数描述
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set 参数描述
     * @param ParamDesc 参数描述
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get 来源任务id 
     * @return FromTaskId 来源任务id
     */
    public String getFromTaskId() {
        return this.FromTaskId;
    }

    /**
     * Set 来源任务id
     * @param FromTaskId 来源任务id
     */
    public void setFromTaskId(String FromTaskId) {
        this.FromTaskId = FromTaskId;
    }

    /**
     * Get 来源任务key 
     * @return FromParamKey 来源任务key
     */
    public String getFromParamKey() {
        return this.FromParamKey;
    }

    /**
     * Set 来源任务key
     * @param FromParamKey 来源任务key
     */
    public void setFromParamKey(String FromParamKey) {
        this.FromParamKey = FromParamKey;
    }

    public CreateTaskInParamDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskInParamDsRequest(CreateTaskInParamDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ParamKey != null) {
            this.ParamKey = new String(source.ParamKey);
        }
        if (source.ParamDesc != null) {
            this.ParamDesc = new String(source.ParamDesc);
        }
        if (source.FromTaskId != null) {
            this.FromTaskId = new String(source.FromTaskId);
        }
        if (source.FromParamKey != null) {
            this.FromParamKey = new String(source.FromParamKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ParamKey", this.ParamKey);
        this.setParamSimple(map, prefix + "ParamDesc", this.ParamDesc);
        this.setParamSimple(map, prefix + "FromTaskId", this.FromTaskId);
        this.setParamSimple(map, prefix + "FromParamKey", this.FromParamKey);

    }
}

