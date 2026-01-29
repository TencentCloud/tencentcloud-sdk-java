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

public class CreateLMInformationExtractionTaskFieldFeedbackRequest extends AbstractModel {

    /**
    * 执行合同智能提取任务的员工信息。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同智能提取任务结果字段ID值。该参数通过调用接口[获取合同智能提取任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeInformationExtractionTask)返回中的Results. ExtractionFieldResults.Id获取。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 合同智能提取任务反馈信息
    */
    @SerializedName("Feedback")
    @Expose
    private FeedbackInfo Feedback;

    /**
     * Get 执行合同智能提取任务的员工信息。 
     * @return Operator 执行合同智能提取任务的员工信息。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行合同智能提取任务的员工信息。
     * @param Operator 执行合同智能提取任务的员工信息。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同智能提取任务结果字段ID值。该参数通过调用接口[获取合同智能提取任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeInformationExtractionTask)返回中的Results. ExtractionFieldResults.Id获取。 
     * @return Id 合同智能提取任务结果字段ID值。该参数通过调用接口[获取合同智能提取任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeInformationExtractionTask)返回中的Results. ExtractionFieldResults.Id获取。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 合同智能提取任务结果字段ID值。该参数通过调用接口[获取合同智能提取任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeInformationExtractionTask)返回中的Results. ExtractionFieldResults.Id获取。
     * @param Id 合同智能提取任务结果字段ID值。该参数通过调用接口[获取合同智能提取任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeInformationExtractionTask)返回中的Results. ExtractionFieldResults.Id获取。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 合同智能提取任务反馈信息 
     * @return Feedback 合同智能提取任务反馈信息
     */
    public FeedbackInfo getFeedback() {
        return this.Feedback;
    }

    /**
     * Set 合同智能提取任务反馈信息
     * @param Feedback 合同智能提取任务反馈信息
     */
    public void setFeedback(FeedbackInfo Feedback) {
        this.Feedback = Feedback;
    }

    public CreateLMInformationExtractionTaskFieldFeedbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLMInformationExtractionTaskFieldFeedbackRequest(CreateLMInformationExtractionTaskFieldFeedbackRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Feedback != null) {
            this.Feedback = new FeedbackInfo(source.Feedback);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "Feedback.", this.Feedback);

    }
}

