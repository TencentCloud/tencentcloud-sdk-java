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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompareTasksRequest extends AbstractModel{

    /**
    * 迁移任务 Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 分页设置，表示每页显示多少条任务，默认为 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 迁移任务 Id 
     * @return JobId 迁移任务 Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 迁移任务 Id
     * @param JobId 迁移任务 Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 分页设置，表示每页显示多少条任务，默认为 20 
     * @return Limit 分页设置，表示每页显示多少条任务，默认为 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页设置，表示每页显示多少条任务，默认为 20
     * @param Limit 分页设置，表示每页显示多少条任务，默认为 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCompareTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompareTasksRequest(DescribeCompareTasksRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

