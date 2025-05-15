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

public class GetBatchDetailErrorLogRequest extends AbstractModel {

    /**
    * 批量操作ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 资源对象ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 批量操作ID 
     * @return JobId 批量操作ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 批量操作ID
     * @param JobId 批量操作ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 资源对象ID 
     * @return ResourceId 资源对象ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源对象ID
     * @param ResourceId 资源对象ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

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

    public GetBatchDetailErrorLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetBatchDetailErrorLogRequest(GetBatchDetailErrorLogRequest source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

