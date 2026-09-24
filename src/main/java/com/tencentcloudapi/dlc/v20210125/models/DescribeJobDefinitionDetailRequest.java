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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobDefinitionDetailRequest extends AbstractModel {

    /**
    * <p>作业定义 ID。必填。</p>
    */
    @SerializedName("JobDefinitionId")
    @Expose
    private String JobDefinitionId;

    /**
     * Get <p>作业定义 ID。必填。</p> 
     * @return JobDefinitionId <p>作业定义 ID。必填。</p>
     */
    public String getJobDefinitionId() {
        return this.JobDefinitionId;
    }

    /**
     * Set <p>作业定义 ID。必填。</p>
     * @param JobDefinitionId <p>作业定义 ID。必填。</p>
     */
    public void setJobDefinitionId(String JobDefinitionId) {
        this.JobDefinitionId = JobDefinitionId;
    }

    public DescribeJobDefinitionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobDefinitionDetailRequest(DescribeJobDefinitionDetailRequest source) {
        if (source.JobDefinitionId != null) {
            this.JobDefinitionId = new String(source.JobDefinitionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobDefinitionId", this.JobDefinitionId);

    }
}

