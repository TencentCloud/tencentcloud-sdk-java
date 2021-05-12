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
package com.tencentcloudapi.cii.v20201210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStructCompareDataResponse extends AbstractModel{

    /**
    * 保单号
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 结构化任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 客户号
    */
    @SerializedName("CustomerId")
    @Expose
    private String CustomerId;

    /**
    * 客户姓名
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 复核时间
    */
    @SerializedName("ReviewTime")
    @Expose
    private String ReviewTime;

    /**
    * 算法识别结果
    */
    @SerializedName("MachineResult")
    @Expose
    private String MachineResult;

    /**
    * 人工复核结果
    */
    @SerializedName("ManualResult")
    @Expose
    private String ManualResult;

    /**
    * 结构化对比指标数据
    */
    @SerializedName("Metrics")
    @Expose
    private CompareMetricsData Metrics;

    /**
    * 新增项
    */
    @SerializedName("NewItems")
    @Expose
    private String NewItems;

    /**
    * 修改项
    */
    @SerializedName("ModifyItems")
    @Expose
    private String ModifyItems;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 保单号 
     * @return PolicyId 保单号
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 保单号
     * @param PolicyId 保单号
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 结构化任务ID 
     * @return TaskId 结构化任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 结构化任务ID
     * @param TaskId 结构化任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 客户号 
     * @return CustomerId 客户号
     */
    public String getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 客户号
     * @param CustomerId 客户号
     */
    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 客户姓名 
     * @return CustomerName 客户姓名
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 客户姓名
     * @param CustomerName 客户姓名
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 复核时间 
     * @return ReviewTime 复核时间
     */
    public String getReviewTime() {
        return this.ReviewTime;
    }

    /**
     * Set 复核时间
     * @param ReviewTime 复核时间
     */
    public void setReviewTime(String ReviewTime) {
        this.ReviewTime = ReviewTime;
    }

    /**
     * Get 算法识别结果 
     * @return MachineResult 算法识别结果
     */
    public String getMachineResult() {
        return this.MachineResult;
    }

    /**
     * Set 算法识别结果
     * @param MachineResult 算法识别结果
     */
    public void setMachineResult(String MachineResult) {
        this.MachineResult = MachineResult;
    }

    /**
     * Get 人工复核结果 
     * @return ManualResult 人工复核结果
     */
    public String getManualResult() {
        return this.ManualResult;
    }

    /**
     * Set 人工复核结果
     * @param ManualResult 人工复核结果
     */
    public void setManualResult(String ManualResult) {
        this.ManualResult = ManualResult;
    }

    /**
     * Get 结构化对比指标数据 
     * @return Metrics 结构化对比指标数据
     */
    public CompareMetricsData getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 结构化对比指标数据
     * @param Metrics 结构化对比指标数据
     */
    public void setMetrics(CompareMetricsData Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 新增项 
     * @return NewItems 新增项
     */
    public String getNewItems() {
        return this.NewItems;
    }

    /**
     * Set 新增项
     * @param NewItems 新增项
     */
    public void setNewItems(String NewItems) {
        this.NewItems = NewItems;
    }

    /**
     * Get 修改项 
     * @return ModifyItems 修改项
     */
    public String getModifyItems() {
        return this.ModifyItems;
    }

    /**
     * Set 修改项
     * @param ModifyItems 修改项
     */
    public void setModifyItems(String ModifyItems) {
        this.ModifyItems = ModifyItems;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeStructCompareDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStructCompareDataResponse(DescribeStructCompareDataResponse source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CustomerId != null) {
            this.CustomerId = new String(source.CustomerId);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.ReviewTime != null) {
            this.ReviewTime = new String(source.ReviewTime);
        }
        if (source.MachineResult != null) {
            this.MachineResult = new String(source.MachineResult);
        }
        if (source.ManualResult != null) {
            this.ManualResult = new String(source.ManualResult);
        }
        if (source.Metrics != null) {
            this.Metrics = new CompareMetricsData(source.Metrics);
        }
        if (source.NewItems != null) {
            this.NewItems = new String(source.NewItems);
        }
        if (source.ModifyItems != null) {
            this.ModifyItems = new String(source.ModifyItems);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "ReviewTime", this.ReviewTime);
        this.setParamSimple(map, prefix + "MachineResult", this.MachineResult);
        this.setParamSimple(map, prefix + "ManualResult", this.ManualResult);
        this.setParamObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "NewItems", this.NewItems);
        this.setParamSimple(map, prefix + "ModifyItems", this.ModifyItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

