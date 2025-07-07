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

public class GetRunStatusRequest extends AbstractModel {

    /**
    * 任务Uuid。
    */
    @SerializedName("RunUuid")
    @Expose
    private String RunUuid;

    /**
    * 项目ID。
（不填使用指定地域下的默认项目）
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
（不填使用指定地域下的默认项目） 
     * @return ProjectId 项目ID。
（不填使用指定地域下的默认项目）
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
（不填使用指定地域下的默认项目）
     * @param ProjectId 项目ID。
（不填使用指定地域下的默认项目）
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public GetRunStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRunStatusRequest(GetRunStatusRequest source) {
        if (source.RunUuid != null) {
            this.RunUuid = new String(source.RunUuid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunUuid", this.RunUuid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

