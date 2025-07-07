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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCheckSyncJobResultRequest extends AbstractModel {

    /**
    * 同步实例id（即标识一个同步作业），形如sync-werwfs23，此值必填
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
     * Get 同步实例id（即标识一个同步作业），形如sync-werwfs23，此值必填 
     * @return JobId 同步实例id（即标识一个同步作业），形如sync-werwfs23，此值必填
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 同步实例id（即标识一个同步作业），形如sync-werwfs23，此值必填
     * @param JobId 同步实例id（即标识一个同步作业），形如sync-werwfs23，此值必填
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    public DescribeCheckSyncJobResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCheckSyncJobResultRequest(DescribeCheckSyncJobResultRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

