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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceConfigsRequest extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 偏移量，仅当设置 Limit 时该参数有效
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回值大小，不填则返回全量数据
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资源配置Versions集合
    */
    @SerializedName("ResourceConfigVersions")
    @Expose
    private Long [] ResourceConfigVersions;

    /**
    * 作业配置版本
    */
    @SerializedName("JobConfigVersion")
    @Expose
    private Long JobConfigVersion;

    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 偏移量，仅当设置 Limit 时该参数有效 
     * @return Offset 偏移量，仅当设置 Limit 时该参数有效
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，仅当设置 Limit 时该参数有效
     * @param Offset 偏移量，仅当设置 Limit 时该参数有效
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回值大小，不填则返回全量数据 
     * @return Limit 返回值大小，不填则返回全量数据
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回值大小，不填则返回全量数据
     * @param Limit 返回值大小，不填则返回全量数据
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 资源配置Versions集合 
     * @return ResourceConfigVersions 资源配置Versions集合
     */
    public Long [] getResourceConfigVersions() {
        return this.ResourceConfigVersions;
    }

    /**
     * Set 资源配置Versions集合
     * @param ResourceConfigVersions 资源配置Versions集合
     */
    public void setResourceConfigVersions(Long [] ResourceConfigVersions) {
        this.ResourceConfigVersions = ResourceConfigVersions;
    }

    /**
     * Get 作业配置版本 
     * @return JobConfigVersion 作业配置版本
     */
    public Long getJobConfigVersion() {
        return this.JobConfigVersion;
    }

    /**
     * Set 作业配置版本
     * @param JobConfigVersion 作业配置版本
     */
    public void setJobConfigVersion(Long JobConfigVersion) {
        this.JobConfigVersion = JobConfigVersion;
    }

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

    public DescribeResourceConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceConfigsRequest(DescribeResourceConfigsRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ResourceConfigVersions != null) {
            this.ResourceConfigVersions = new Long[source.ResourceConfigVersions.length];
            for (int i = 0; i < source.ResourceConfigVersions.length; i++) {
                this.ResourceConfigVersions[i] = new Long(source.ResourceConfigVersions[i]);
            }
        }
        if (source.JobConfigVersion != null) {
            this.JobConfigVersion = new Long(source.JobConfigVersion);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ResourceConfigVersions.", this.ResourceConfigVersions);
        this.setParamSimple(map, prefix + "JobConfigVersion", this.JobConfigVersion);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

