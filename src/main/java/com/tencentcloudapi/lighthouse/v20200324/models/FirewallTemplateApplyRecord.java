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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirewallTemplateApplyRecord extends AbstractModel {

    /**
    * 任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 应用模板的时间。
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * 模板规则列表。
    */
    @SerializedName("TemplateRuleSet")
    @Expose
    private FirewallTemplateRule [] TemplateRuleSet;

    /**
    * 应用模板的执行状态。

- SUCCESS：成功
- RUNNING：运行中
- FAILED：失败
    */
    @SerializedName("ApplyState")
    @Expose
    private String ApplyState;

    /**
    * 应用成功的实例数量。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 应用失败的实例数量。
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * 正在应用中的实例数量。
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * 应用模板的执行细节。
    */
    @SerializedName("ApplyDetailSet")
    @Expose
    private FirewallTemplateApplyRecordDetail [] ApplyDetailSet;

    /**
     * Get 任务ID。 
     * @return TaskId 任务ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID。
     * @param TaskId 任务ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 应用模板的时间。 
     * @return ApplyTime 应用模板的时间。
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 应用模板的时间。
     * @param ApplyTime 应用模板的时间。
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 模板规则列表。 
     * @return TemplateRuleSet 模板规则列表。
     */
    public FirewallTemplateRule [] getTemplateRuleSet() {
        return this.TemplateRuleSet;
    }

    /**
     * Set 模板规则列表。
     * @param TemplateRuleSet 模板规则列表。
     */
    public void setTemplateRuleSet(FirewallTemplateRule [] TemplateRuleSet) {
        this.TemplateRuleSet = TemplateRuleSet;
    }

    /**
     * Get 应用模板的执行状态。

- SUCCESS：成功
- RUNNING：运行中
- FAILED：失败 
     * @return ApplyState 应用模板的执行状态。

- SUCCESS：成功
- RUNNING：运行中
- FAILED：失败
     */
    public String getApplyState() {
        return this.ApplyState;
    }

    /**
     * Set 应用模板的执行状态。

- SUCCESS：成功
- RUNNING：运行中
- FAILED：失败
     * @param ApplyState 应用模板的执行状态。

- SUCCESS：成功
- RUNNING：运行中
- FAILED：失败
     */
    public void setApplyState(String ApplyState) {
        this.ApplyState = ApplyState;
    }

    /**
     * Get 应用成功的实例数量。 
     * @return SuccessCount 应用成功的实例数量。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 应用成功的实例数量。
     * @param SuccessCount 应用成功的实例数量。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 应用失败的实例数量。 
     * @return FailedCount 应用失败的实例数量。
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 应用失败的实例数量。
     * @param FailedCount 应用失败的实例数量。
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 正在应用中的实例数量。 
     * @return RunningCount 正在应用中的实例数量。
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set 正在应用中的实例数量。
     * @param RunningCount 正在应用中的实例数量。
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get 应用模板的执行细节。 
     * @return ApplyDetailSet 应用模板的执行细节。
     */
    public FirewallTemplateApplyRecordDetail [] getApplyDetailSet() {
        return this.ApplyDetailSet;
    }

    /**
     * Set 应用模板的执行细节。
     * @param ApplyDetailSet 应用模板的执行细节。
     */
    public void setApplyDetailSet(FirewallTemplateApplyRecordDetail [] ApplyDetailSet) {
        this.ApplyDetailSet = ApplyDetailSet;
    }

    public FirewallTemplateApplyRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirewallTemplateApplyRecord(FirewallTemplateApplyRecord source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.TemplateRuleSet != null) {
            this.TemplateRuleSet = new FirewallTemplateRule[source.TemplateRuleSet.length];
            for (int i = 0; i < source.TemplateRuleSet.length; i++) {
                this.TemplateRuleSet[i] = new FirewallTemplateRule(source.TemplateRuleSet[i]);
            }
        }
        if (source.ApplyState != null) {
            this.ApplyState = new String(source.ApplyState);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.RunningCount != null) {
            this.RunningCount = new Long(source.RunningCount);
        }
        if (source.ApplyDetailSet != null) {
            this.ApplyDetailSet = new FirewallTemplateApplyRecordDetail[source.ApplyDetailSet.length];
            for (int i = 0; i < source.ApplyDetailSet.length; i++) {
                this.ApplyDetailSet[i] = new FirewallTemplateApplyRecordDetail(source.ApplyDetailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamArrayObj(map, prefix + "TemplateRuleSet.", this.TemplateRuleSet);
        this.setParamSimple(map, prefix + "ApplyState", this.ApplyState);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamArrayObj(map, prefix + "ApplyDetailSet.", this.ApplyDetailSet);

    }
}

