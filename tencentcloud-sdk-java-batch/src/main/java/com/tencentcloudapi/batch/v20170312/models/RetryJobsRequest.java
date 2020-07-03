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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryJobsRequest extends AbstractModel{

    /**
    * 作业ID列表。
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
     * Get 作业ID列表。 
     * @return JobIds 作业ID列表。
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set 作业ID列表。
     * @param JobIds 作业ID列表。
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);

    }
}

