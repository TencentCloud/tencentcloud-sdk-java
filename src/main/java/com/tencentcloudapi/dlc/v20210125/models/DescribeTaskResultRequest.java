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

public class DescribeTaskResultRequest extends AbstractModel{

    /**
    * 任务唯一ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 上一次请求响应返回的分页信息。第一次可以不带，从头开始返回数据，每次返回1000行数据。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 返回结果的最大行数，范围0~1000，默认为1000.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
     * Get 任务唯一ID 
     * @return TaskId 任务唯一ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务唯一ID
     * @param TaskId 任务唯一ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 上一次请求响应返回的分页信息。第一次可以不带，从头开始返回数据，每次返回1000行数据。 
     * @return NextToken 上一次请求响应返回的分页信息。第一次可以不带，从头开始返回数据，每次返回1000行数据。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 上一次请求响应返回的分页信息。第一次可以不带，从头开始返回数据，每次返回1000行数据。
     * @param NextToken 上一次请求响应返回的分页信息。第一次可以不带，从头开始返回数据，每次返回1000行数据。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 返回结果的最大行数，范围0~1000，默认为1000. 
     * @return MaxResults 返回结果的最大行数，范围0~1000，默认为1000.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 返回结果的最大行数，范围0~1000，默认为1000.
     * @param MaxResults 返回结果的最大行数，范围0~1000，默认为1000.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    public DescribeTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskResultRequest(DescribeTaskResultRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);

    }
}

