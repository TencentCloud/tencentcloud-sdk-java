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

public class DescribeJobSavepointRequest extends AbstractModel {

    /**
    * 作业 SerialId
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 分页参数，单页总数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * 2 是checkpoint
1 是触发savepoint
3 停止触发的savepoint
    */
    @SerializedName("RecordTypes")
    @Expose
    private Long [] RecordTypes;

    /**
     * Get 作业 SerialId 
     * @return JobId 作业 SerialId
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业 SerialId
     * @param JobId 作业 SerialId
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 分页参数，单页总数 
     * @return Limit 分页参数，单页总数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，单页总数
     * @param Limit 分页参数，单页总数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，偏移量 
     * @return Offset 分页参数，偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，偏移量
     * @param Offset 分页参数，偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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

    /**
     * Get 2 是checkpoint
1 是触发savepoint
3 停止触发的savepoint 
     * @return RecordTypes 2 是checkpoint
1 是触发savepoint
3 停止触发的savepoint
     */
    public Long [] getRecordTypes() {
        return this.RecordTypes;
    }

    /**
     * Set 2 是checkpoint
1 是触发savepoint
3 停止触发的savepoint
     * @param RecordTypes 2 是checkpoint
1 是触发savepoint
3 停止触发的savepoint
     */
    public void setRecordTypes(Long [] RecordTypes) {
        this.RecordTypes = RecordTypes;
    }

    public DescribeJobSavepointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobSavepointRequest(DescribeJobSavepointRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.RecordTypes != null) {
            this.RecordTypes = new Long[source.RecordTypes.length];
            for (int i = 0; i < source.RecordTypes.length; i++) {
                this.RecordTypes[i] = new Long(source.RecordTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamArraySimple(map, prefix + "RecordTypes.", this.RecordTypes);

    }
}

