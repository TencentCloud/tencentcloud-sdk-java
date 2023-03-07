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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselinePolicyDetect extends AbstractModel{

    /**
    * 策略Id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 检测任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 关联主机数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 成功主机数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败主技数
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * 失败主机数
    */
    @SerializedName("TimeoutCount")
    @Expose
    private Long TimeoutCount;

    /**
    * 1:检测中 2:检测完成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyDetectStatus")
    @Expose
    private Long PolicyDetectStatus;

    /**
     * Get 策略Id 
     * @return PolicyId 策略Id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略Id
     * @param PolicyId 策略Id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 检测任务Id 
     * @return TaskId 检测任务Id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 检测任务Id
     * @param TaskId 检测任务Id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 关联主机数 
     * @return HostCount 关联主机数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 关联主机数
     * @param HostCount 关联主机数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return FinishTime 结束时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 结束时间
     * @param FinishTime 结束时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 策略名称 
     * @return PolicyName 策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
     * @param PolicyName 策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 成功主机数 
     * @return SuccessCount 成功主机数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功主机数
     * @param SuccessCount 成功主机数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败主技数 
     * @return FailedCount 失败主技数
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 失败主技数
     * @param FailedCount 失败主技数
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 失败主机数 
     * @return TimeoutCount 失败主机数
     */
    public Long getTimeoutCount() {
        return this.TimeoutCount;
    }

    /**
     * Set 失败主机数
     * @param TimeoutCount 失败主机数
     */
    public void setTimeoutCount(Long TimeoutCount) {
        this.TimeoutCount = TimeoutCount;
    }

    /**
     * Get 1:检测中 2:检测完成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyDetectStatus 1:检测中 2:检测完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyDetectStatus() {
        return this.PolicyDetectStatus;
    }

    /**
     * Set 1:检测中 2:检测完成
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyDetectStatus 1:检测中 2:检测完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyDetectStatus(Long PolicyDetectStatus) {
        this.PolicyDetectStatus = PolicyDetectStatus;
    }

    public BaselinePolicyDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicyDetect(BaselinePolicyDetect source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.TimeoutCount != null) {
            this.TimeoutCount = new Long(source.TimeoutCount);
        }
        if (source.PolicyDetectStatus != null) {
            this.PolicyDetectStatus = new Long(source.PolicyDetectStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "TimeoutCount", this.TimeoutCount);
        this.setParamSimple(map, prefix + "PolicyDetectStatus", this.PolicyDetectStatus);

    }
}

