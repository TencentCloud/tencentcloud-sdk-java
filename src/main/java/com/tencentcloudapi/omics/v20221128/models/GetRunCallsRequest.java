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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRunCallsRequest extends AbstractModel{

    /**
    * 任务Uuid。
    */
    @SerializedName("RunUuid")
    @Expose
    private String RunUuid;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 作业路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get 任务Uuid。 
     * @return RunUuid 任务Uuid。
     */
    public String getRunUuid() {
        return this.RunUuid;
    }

    /**
     * Set 任务Uuid。
     * @param RunUuid 任务Uuid。
     */
    public void setRunUuid(String RunUuid) {
        this.RunUuid = RunUuid;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 作业路径 
     * @return Path 作业路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 作业路径
     * @param Path 作业路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public GetRunCallsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRunCallsRequest(GetRunCallsRequest source) {
        if (source.RunUuid != null) {
            this.RunUuid = new String(source.RunUuid);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

