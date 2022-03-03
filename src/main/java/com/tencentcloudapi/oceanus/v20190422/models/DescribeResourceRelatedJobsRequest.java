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

public class DescribeResourceRelatedJobsRequest extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 默认0;   1： 按照作业版本创建时间降序
    */
    @SerializedName("DESCByJobConfigCreateTime")
    @Expose
    private Long DESCByJobConfigCreateTime;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资源版本号
    */
    @SerializedName("ResourceConfigVersion")
    @Expose
    private Long ResourceConfigVersion;

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
     * Get 默认0;   1： 按照作业版本创建时间降序 
     * @return DESCByJobConfigCreateTime 默认0;   1： 按照作业版本创建时间降序
     */
    public Long getDESCByJobConfigCreateTime() {
        return this.DESCByJobConfigCreateTime;
    }

    /**
     * Set 默认0;   1： 按照作业版本创建时间降序
     * @param DESCByJobConfigCreateTime 默认0;   1： 按照作业版本创建时间降序
     */
    public void setDESCByJobConfigCreateTime(Long DESCByJobConfigCreateTime) {
        this.DESCByJobConfigCreateTime = DESCByJobConfigCreateTime;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，默认为20，最大值为100 
     * @return Limit 分页大小，默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认为20，最大值为100
     * @param Limit 分页大小，默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 资源版本号 
     * @return ResourceConfigVersion 资源版本号
     */
    public Long getResourceConfigVersion() {
        return this.ResourceConfigVersion;
    }

    /**
     * Set 资源版本号
     * @param ResourceConfigVersion 资源版本号
     */
    public void setResourceConfigVersion(Long ResourceConfigVersion) {
        this.ResourceConfigVersion = ResourceConfigVersion;
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

    public DescribeResourceRelatedJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceRelatedJobsRequest(DescribeResourceRelatedJobsRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.DESCByJobConfigCreateTime != null) {
            this.DESCByJobConfigCreateTime = new Long(source.DESCByJobConfigCreateTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ResourceConfigVersion != null) {
            this.ResourceConfigVersion = new Long(source.ResourceConfigVersion);
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
        this.setParamSimple(map, prefix + "DESCByJobConfigCreateTime", this.DESCByJobConfigCreateTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ResourceConfigVersion", this.ResourceConfigVersion);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

