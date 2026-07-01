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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteJobConfigsRequest extends AbstractModel {

    /**
    * <p>作业ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>作业配置版本数组</p>
    */
    @SerializedName("JobConfigVersions")
    @Expose
    private Long [] JobConfigVersions;

    /**
    * <p>工作空间 SerialId</p>
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * <p>配置更新范围 0=全量(默认) 1=仅开发 2=仅运维</p><p>取值范围：[0, 2]</p>
    */
    @SerializedName("ConfigScope")
    @Expose
    private Long ConfigScope;

    /**
     * Get <p>作业ID</p> 
     * @return JobId <p>作业ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业ID</p>
     * @param JobId <p>作业ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>作业配置版本数组</p> 
     * @return JobConfigVersions <p>作业配置版本数组</p>
     */
    public Long [] getJobConfigVersions() {
        return this.JobConfigVersions;
    }

    /**
     * Set <p>作业配置版本数组</p>
     * @param JobConfigVersions <p>作业配置版本数组</p>
     */
    public void setJobConfigVersions(Long [] JobConfigVersions) {
        this.JobConfigVersions = JobConfigVersions;
    }

    /**
     * Get <p>工作空间 SerialId</p> 
     * @return WorkSpaceId <p>工作空间 SerialId</p>
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>工作空间 SerialId</p>
     * @param WorkSpaceId <p>工作空间 SerialId</p>
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get <p>配置更新范围 0=全量(默认) 1=仅开发 2=仅运维</p><p>取值范围：[0, 2]</p> 
     * @return ConfigScope <p>配置更新范围 0=全量(默认) 1=仅开发 2=仅运维</p><p>取值范围：[0, 2]</p>
     */
    public Long getConfigScope() {
        return this.ConfigScope;
    }

    /**
     * Set <p>配置更新范围 0=全量(默认) 1=仅开发 2=仅运维</p><p>取值范围：[0, 2]</p>
     * @param ConfigScope <p>配置更新范围 0=全量(默认) 1=仅开发 2=仅运维</p><p>取值范围：[0, 2]</p>
     */
    public void setConfigScope(Long ConfigScope) {
        this.ConfigScope = ConfigScope;
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
        if (source.ConfigScope != null) {
            this.ConfigScope = new Long(source.ConfigScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArraySimple(map, prefix + "JobConfigVersions.", this.JobConfigVersions);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "ConfigScope", this.ConfigScope);

    }
}

