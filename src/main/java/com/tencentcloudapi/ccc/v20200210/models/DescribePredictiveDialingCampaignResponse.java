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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePredictiveDialingCampaignResponse extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>被叫呼叫顺序 0 随机 1 顺序</p>
    */
    @SerializedName("CallOrder")
    @Expose
    private Long CallOrder;

    /**
    * <p>使用的座席技能组 ID</p>
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * <p>指定的 IVR ID</p>
    */
    @SerializedName("IVRId")
    @Expose
    private Long IVRId;

    /**
    * <p>相同应用内多个任务运行优先级，从高到底 1 - 5</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>预期呼损率，百分比，5 - 50</p>
    */
    @SerializedName("ExpectedAbandonRate")
    @Expose
    private Long ExpectedAbandonRate;

    /**
    * <p>呼叫重试次数，0 - 2</p>
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * <p>呼叫重试间隔时间，单位秒，60 - 86400</p>
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * <p>任务启动时间，Unix 时间戳，到此时间后会自动启动任务</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>任务结束时间，Unix 时间戳，到此时间后会自动终止任务</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>自定义变量</p>
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * <p>UUI</p>
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>0： 待开始 </li><li>1： 进行中</li><li>2： 已暂停</li><li>3： 已终止</li><li>4： 已完成</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>任务状态原因 0 正常 1 手动结束 2 超时结束</p>
    */
    @SerializedName("StatusReason")
    @Expose
    private Long StatusReason;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务 ID</p> 
     * @return CampaignId <p>任务 ID</p>
     */
    public Long getCampaignId() {
        return this.CampaignId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param CampaignId <p>任务 ID</p>
     */
    public void setCampaignId(Long CampaignId) {
        this.CampaignId = CampaignId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return Name <p>任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称</p>
     * @param Name <p>任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>被叫呼叫顺序 0 随机 1 顺序</p> 
     * @return CallOrder <p>被叫呼叫顺序 0 随机 1 顺序</p>
     */
    public Long getCallOrder() {
        return this.CallOrder;
    }

    /**
     * Set <p>被叫呼叫顺序 0 随机 1 顺序</p>
     * @param CallOrder <p>被叫呼叫顺序 0 随机 1 顺序</p>
     */
    public void setCallOrder(Long CallOrder) {
        this.CallOrder = CallOrder;
    }

    /**
     * Get <p>使用的座席技能组 ID</p> 
     * @return SkillGroupId <p>使用的座席技能组 ID</p>
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set <p>使用的座席技能组 ID</p>
     * @param SkillGroupId <p>使用的座席技能组 ID</p>
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get <p>指定的 IVR ID</p> 
     * @return IVRId <p>指定的 IVR ID</p>
     */
    public Long getIVRId() {
        return this.IVRId;
    }

    /**
     * Set <p>指定的 IVR ID</p>
     * @param IVRId <p>指定的 IVR ID</p>
     */
    public void setIVRId(Long IVRId) {
        this.IVRId = IVRId;
    }

    /**
     * Get <p>相同应用内多个任务运行优先级，从高到底 1 - 5</p> 
     * @return Priority <p>相同应用内多个任务运行优先级，从高到底 1 - 5</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>相同应用内多个任务运行优先级，从高到底 1 - 5</p>
     * @param Priority <p>相同应用内多个任务运行优先级，从高到底 1 - 5</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>预期呼损率，百分比，5 - 50</p> 
     * @return ExpectedAbandonRate <p>预期呼损率，百分比，5 - 50</p>
     */
    public Long getExpectedAbandonRate() {
        return this.ExpectedAbandonRate;
    }

    /**
     * Set <p>预期呼损率，百分比，5 - 50</p>
     * @param ExpectedAbandonRate <p>预期呼损率，百分比，5 - 50</p>
     */
    public void setExpectedAbandonRate(Long ExpectedAbandonRate) {
        this.ExpectedAbandonRate = ExpectedAbandonRate;
    }

    /**
     * Get <p>呼叫重试次数，0 - 2</p> 
     * @return RetryTimes <p>呼叫重试次数，0 - 2</p>
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set <p>呼叫重试次数，0 - 2</p>
     * @param RetryTimes <p>呼叫重试次数，0 - 2</p>
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
    }

    /**
     * Get <p>呼叫重试间隔时间，单位秒，60 - 86400</p> 
     * @return RetryInterval <p>呼叫重试间隔时间，单位秒，60 - 86400</p>
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set <p>呼叫重试间隔时间，单位秒，60 - 86400</p>
     * @param RetryInterval <p>呼叫重试间隔时间，单位秒，60 - 86400</p>
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get <p>任务启动时间，Unix 时间戳，到此时间后会自动启动任务</p> 
     * @return StartTime <p>任务启动时间，Unix 时间戳，到此时间后会自动启动任务</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务启动时间，Unix 时间戳，到此时间后会自动启动任务</p>
     * @param StartTime <p>任务启动时间，Unix 时间戳，到此时间后会自动启动任务</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务结束时间，Unix 时间戳，到此时间后会自动终止任务</p> 
     * @return EndTime <p>任务结束时间，Unix 时间戳，到此时间后会自动终止任务</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务结束时间，Unix 时间戳，到此时间后会自动终止任务</p>
     * @param EndTime <p>任务结束时间，Unix 时间戳，到此时间后会自动终止任务</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>自定义变量</p> 
     * @return Variables <p>自定义变量</p>
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set <p>自定义变量</p>
     * @param Variables <p>自定义变量</p>
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get <p>UUI</p> 
     * @return UUI <p>UUI</p>
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set <p>UUI</p>
     * @param UUI <p>UUI</p>
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>0： 待开始 </li><li>1： 进行中</li><li>2： 已暂停</li><li>3： 已终止</li><li>4： 已完成</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>0： 待开始 </li><li>1： 进行中</li><li>2： 已暂停</li><li>3： 已终止</li><li>4： 已完成</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>0： 待开始 </li><li>1： 进行中</li><li>2： 已暂停</li><li>3： 已终止</li><li>4： 已完成</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>0： 待开始 </li><li>1： 进行中</li><li>2： 已暂停</li><li>3： 已终止</li><li>4： 已完成</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务状态原因 0 正常 1 手动结束 2 超时结束</p> 
     * @return StatusReason <p>任务状态原因 0 正常 1 手动结束 2 超时结束</p>
     */
    public Long getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set <p>任务状态原因 0 正常 1 手动结束 2 超时结束</p>
     * @param StatusReason <p>任务状态原因 0 正常 1 手动结束 2 超时结束</p>
     */
    public void setStatusReason(Long StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePredictiveDialingCampaignResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePredictiveDialingCampaignResponse(DescribePredictiveDialingCampaignResponse source) {
        if (source.CampaignId != null) {
            this.CampaignId = new Long(source.CampaignId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CallOrder != null) {
            this.CallOrder = new Long(source.CallOrder);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.IVRId != null) {
            this.IVRId = new Long(source.IVRId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.ExpectedAbandonRate != null) {
            this.ExpectedAbandonRate = new Long(source.ExpectedAbandonRate);
        }
        if (source.RetryTimes != null) {
            this.RetryTimes = new Long(source.RetryTimes);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Variables != null) {
            this.Variables = new Variable[source.Variables.length];
            for (int i = 0; i < source.Variables.length; i++) {
                this.Variables[i] = new Variable(source.Variables[i]);
            }
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusReason != null) {
            this.StatusReason = new Long(source.StatusReason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CampaignId", this.CampaignId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CallOrder", this.CallOrder);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "IVRId", this.IVRId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "ExpectedAbandonRate", this.ExpectedAbandonRate);
        this.setParamSimple(map, prefix + "RetryTimes", this.RetryTimes);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

