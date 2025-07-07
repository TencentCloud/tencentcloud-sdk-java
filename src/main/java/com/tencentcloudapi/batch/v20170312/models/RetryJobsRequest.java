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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryJobsRequest extends AbstractModel {

    /**
    * 作业ID列表。最大重试作业数100；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
     * Get 作业ID列表。最大重试作业数100；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。 
     * @return JobIds 作业ID列表。最大重试作业数100；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set 作业ID列表。最大重试作业数100；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
     * @param JobIds 作业ID列表。最大重试作业数100；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    public RetryJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryJobsRequest(RetryJobsRequest source) {
        if (source.JobIds != null) {
            this.JobIds = new String[source.JobIds.length];
            for (int i = 0; i < source.JobIds.length; i++) {
                this.JobIds[i] = new String(source.JobIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);

    }
}

