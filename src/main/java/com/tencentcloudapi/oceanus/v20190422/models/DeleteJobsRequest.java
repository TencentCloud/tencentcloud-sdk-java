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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteJobsRequest extends AbstractModel {

    /**
    * 作业Id列表
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
    * 工作空间Id
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * 作业名称列表
    */
    @SerializedName("JobNames")
    @Expose
    private String [] JobNames;

    /**
     * Get 作业Id列表 
     * @return JobIds 作业Id列表
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set 作业Id列表
     * @param JobIds 作业Id列表
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    /**
     * Get 工作空间Id 
     * @return WorkSpaceId 工作空间Id
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间Id
     * @param WorkSpaceId 工作空间Id
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 作业名称列表 
     * @return JobNames 作业名称列表
     */
    public String [] getJobNames() {
        return this.JobNames;
    }

    /**
     * Set 作业名称列表
     * @param JobNames 作业名称列表
     */
    public void setJobNames(String [] JobNames) {
        this.JobNames = JobNames;
    }

    public DeleteJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteJobsRequest(DeleteJobsRequest source) {
        if (source.JobIds != null) {
            this.JobIds = new String[source.JobIds.length];
            for (int i = 0; i < source.JobIds.length; i++) {
                this.JobIds[i] = new String(source.JobIds[i]);
            }
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.JobNames != null) {
            this.JobNames = new String[source.JobNames.length];
            for (int i = 0; i < source.JobNames.length; i++) {
                this.JobNames[i] = new String(source.JobNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamArraySimple(map, prefix + "JobNames.", this.JobNames);

    }
}

