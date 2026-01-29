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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskIdentificationTaskFeedbackRequest extends AbstractModel {

    /**
    * 执行合同审查任务的员工信息。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同审查任务ID，该参数通过调用接口[批量创建合同智能提取任务](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchInformationExtractionTask)获取。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 执行合同审查任务的员工信息。 
     * @return Operator 执行合同审查任务的员工信息。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行合同审查任务的员工信息。
     * @param Operator 执行合同审查任务的员工信息。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同审查任务ID，该参数通过调用接口[批量创建合同智能提取任务](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchInformationExtractionTask)获取。 
     * @return TaskId 合同审查任务ID，该参数通过调用接口[批量创建合同智能提取任务](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchInformationExtractionTask)获取。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 合同审查任务ID，该参数通过调用接口[批量创建合同智能提取任务](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchInformationExtractionTask)获取。
     * @param TaskId 合同审查任务ID，该参数通过调用接口[批量创建合同智能提取任务](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchInformationExtractionTask)获取。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeRiskIdentificationTaskFeedbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskIdentificationTaskFeedbackRequest(DescribeRiskIdentificationTaskFeedbackRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

