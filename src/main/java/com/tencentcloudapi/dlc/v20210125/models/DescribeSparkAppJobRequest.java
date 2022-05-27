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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkAppJobRequest extends AbstractModel{

    /**
    * spark作业Id，与JobName同时存在时，JobName无效
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * spark作业名
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
     * Get spark作业Id，与JobName同时存在时，JobName无效 
     * @return JobId spark作业Id，与JobName同时存在时，JobName无效
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set spark作业Id，与JobName同时存在时，JobName无效
     * @param JobId spark作业Id，与JobName同时存在时，JobName无效
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get spark作业名 
     * @return JobName spark作业名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set spark作业名
     * @param JobName spark作业名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    public DescribeSparkAppJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppJobRequest(DescribeSparkAppJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);

    }
}

