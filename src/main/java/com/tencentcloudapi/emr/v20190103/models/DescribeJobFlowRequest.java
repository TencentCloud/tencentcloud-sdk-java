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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobFlowRequest extends AbstractModel{

    /**
    * 流程任务Id，RunJobFlow接口返回的值。
    */
    @SerializedName("JobFlowId")
    @Expose
    private Long JobFlowId;

    /**
     * Get 流程任务Id，RunJobFlow接口返回的值。 
     * @return JobFlowId 流程任务Id，RunJobFlow接口返回的值。
     */
    public Long getJobFlowId() {
        return this.JobFlowId;
    }

    /**
     * Set 流程任务Id，RunJobFlow接口返回的值。
     * @param JobFlowId 流程任务Id，RunJobFlow接口返回的值。
     */
    public void setJobFlowId(Long JobFlowId) {
        this.JobFlowId = JobFlowId;
    }

    public DescribeJobFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobFlowRequest(DescribeJobFlowRequest source) {
        if (source.JobFlowId != null) {
            this.JobFlowId = new Long(source.JobFlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobFlowId", this.JobFlowId);

    }
}

