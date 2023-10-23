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

public class DeleteJobConfigsRequest extends AbstractModel {

    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业配置版本数组
    */
    @SerializedName("JobConfigVersions")
    @Expose
    private Long [] JobConfigVersions;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 作业ID 
     * @return JobId 作业ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID
     * @param JobId 作业ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 作业配置版本数组 
     * @return JobConfigVersions 作业配置版本数组
     */
    public Long [] getJobConfigVersions() {
        return this.JobConfigVersions;
    }

    /**
     * Set 作业配置版本数组
     * @param JobConfigVersions 作业配置版本数组
     */
    public void setJobConfigVersions(Long [] JobConfigVersions) {
        this.JobConfigVersions = JobConfigVersions;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public DeleteJobConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteJobConfigsRequest(DeleteJobConfigsRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobConfigVersions != null) {
            this.JobConfigVersions = new Long[source.JobConfigVersions.length];
            for (int i = 0; i < source.JobConfigVersions.length; i++) {
                this.JobConfigVersions[i] = new Long(source.JobConfigVersions[i]);
            }
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArraySimple(map, prefix + "JobConfigVersions.", this.JobConfigVersions);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

