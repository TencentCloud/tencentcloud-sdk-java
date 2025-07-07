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

public class UpdatePredictiveDialingCampaignRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 生成的任务 ID
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 被叫列表，支持 E.164 或不带国家码形式的号码
    */
    @SerializedName("Callees")
    @Expose
    private String [] Callees;

    /**
    * 主叫列表，使用管理端展示的号码格式
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 被叫呼叫顺序 0 随机 1 顺序
    */
    @SerializedName("CallOrder")
    @Expose
    private Long CallOrder;

    /**
    * 使用的座席技能组 ID
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * 相同应用内多个任务运行优先级，从高到底 1 - 5
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 预期呼损率，百分比，5 - 50	
    */
    @SerializedName("ExpectedAbandonRate")
    @Expose
    private Long ExpectedAbandonRate;

    /**
    * 呼叫重试间隔时间，单位秒，60 - 86400
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * 任务启动时间，Unix 时间戳，到此时间后会自动启动任务
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 任务结束时间，Unix 时间戳，到此时间后会自动终止任务
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 指定的 IVR ID
    */
    @SerializedName("IVRId")
    @Expose
    private Long IVRId;

    /**
    * 呼叫重试次数，0 - 2
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * 自定义变量
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * 	UUI
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * 被叫属性
    */
    @SerializedName("CalleeAttributes")
    @Expose
    private CalleeAttribute [] CalleeAttributes;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 生成的任务 ID 
     * @return CampaignId 生成的任务 ID
     */
    public Long getCampaignId() {
        return this.CampaignId;
    }

    /**
     * Set 生成的任务 ID
     * @param CampaignId 生成的任务 ID
     */
    public void setCampaignId(Long CampaignId) {
        this.CampaignId = CampaignId;
    }

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 被叫列表，支持 E.164 或不带国家码形式的号码 
     * @return Callees 被叫列表，支持 E.164 或不带国家码形式的号码
     */
    public String [] getCallees() {
        return this.Callees;
    }

    /**
     * Set 被叫列表，支持 E.164 或不带国家码形式的号码
     * @param Callees 被叫列表，支持 E.164 或不带国家码形式的号码
     */
    public void setCallees(String [] Callees) {
        this.Callees = Callees;
    }

    /**
     * Get 主叫列表，使用管理端展示的号码格式 
     * @return Callers 主叫列表，使用管理端展示的号码格式
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫列表，使用管理端展示的号码格式
     * @param Callers 主叫列表，使用管理端展示的号码格式
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 被叫呼叫顺序 0 随机 1 顺序 
     * @return CallOrder 被叫呼叫顺序 0 随机 1 顺序
     */
    public Long getCallOrder() {
        return this.CallOrder;
    }

    /**
     * Set 被叫呼叫顺序 0 随机 1 顺序
     * @param CallOrder 被叫呼叫顺序 0 随机 1 顺序
     */
    public void setCallOrder(Long CallOrder) {
        this.CallOrder = CallOrder;
    }

    /**
     * Get 使用的座席技能组 ID 
     * @return SkillGroupId 使用的座席技能组 ID
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 使用的座席技能组 ID
     * @param SkillGroupId 使用的座席技能组 ID
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get 相同应用内多个任务运行优先级，从高到底 1 - 5 
     * @return Priority 相同应用内多个任务运行优先级，从高到底 1 - 5
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 相同应用内多个任务运行优先级，从高到底 1 - 5
     * @param Priority 相同应用内多个任务运行优先级，从高到底 1 - 5
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 预期呼损率，百分比，5 - 50	 
     * @return ExpectedAbandonRate 预期呼损率，百分比，5 - 50	
     */
    public Long getExpectedAbandonRate() {
        return this.ExpectedAbandonRate;
    }

    /**
     * Set 预期呼损率，百分比，5 - 50	
     * @param ExpectedAbandonRate 预期呼损率，百分比，5 - 50	
     */
    public void setExpectedAbandonRate(Long ExpectedAbandonRate) {
        this.ExpectedAbandonRate = ExpectedAbandonRate;
    }

    /**
     * Get 呼叫重试间隔时间，单位秒，60 - 86400 
     * @return RetryInterval 呼叫重试间隔时间，单位秒，60 - 86400
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set 呼叫重试间隔时间，单位秒，60 - 86400
     * @param RetryInterval 呼叫重试间隔时间，单位秒，60 - 86400
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get 任务启动时间，Unix 时间戳，到此时间后会自动启动任务 
     * @return StartTime 任务启动时间，Unix 时间戳，到此时间后会自动启动任务
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务启动时间，Unix 时间戳，到此时间后会自动启动任务
     * @param StartTime 任务启动时间，Unix 时间戳，到此时间后会自动启动任务
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间，Unix 时间戳，到此时间后会自动终止任务 
     * @return EndTime 任务结束时间，Unix 时间戳，到此时间后会自动终止任务
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间，Unix 时间戳，到此时间后会自动终止任务
     * @param EndTime 任务结束时间，Unix 时间戳，到此时间后会自动终止任务
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指定的 IVR ID 
     * @return IVRId 指定的 IVR ID
     */
    public Long getIVRId() {
        return this.IVRId;
    }

    /**
     * Set 指定的 IVR ID
     * @param IVRId 指定的 IVR ID
     */
    public void setIVRId(Long IVRId) {
        this.IVRId = IVRId;
    }

    /**
     * Get 呼叫重试次数，0 - 2 
     * @return RetryTimes 呼叫重试次数，0 - 2
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set 呼叫重试次数，0 - 2
     * @param RetryTimes 呼叫重试次数，0 - 2
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
    }

    /**
     * Get 自定义变量 
     * @return Variables 自定义变量
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set 自定义变量
     * @param Variables 自定义变量
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get 	UUI 
     * @return UUI 	UUI
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set 	UUI
     * @param UUI 	UUI
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get 被叫属性 
     * @return CalleeAttributes 被叫属性
     */
    public CalleeAttribute [] getCalleeAttributes() {
        return this.CalleeAttributes;
    }

    /**
     * Set 被叫属性
     * @param CalleeAttributes 被叫属性
     */
    public void setCalleeAttributes(CalleeAttribute [] CalleeAttributes) {
        this.CalleeAttributes = CalleeAttributes;
    }

    public UpdatePredictiveDialingCampaignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePredictiveDialingCampaignRequest(UpdatePredictiveDialingCampaignRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.CampaignId != null) {
            this.CampaignId = new Long(source.CampaignId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Callees != null) {
            this.Callees = new String[source.Callees.length];
            for (int i = 0; i < source.Callees.length; i++) {
                this.Callees[i] = new String(source.Callees[i]);
            }
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.CallOrder != null) {
            this.CallOrder = new Long(source.CallOrder);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.ExpectedAbandonRate != null) {
            this.ExpectedAbandonRate = new Long(source.ExpectedAbandonRate);
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
        if (source.IVRId != null) {
            this.IVRId = new Long(source.IVRId);
        }
        if (source.RetryTimes != null) {
            this.RetryTimes = new Long(source.RetryTimes);
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
        if (source.CalleeAttributes != null) {
            this.CalleeAttributes = new CalleeAttribute[source.CalleeAttributes.length];
            for (int i = 0; i < source.CalleeAttributes.length; i++) {
                this.CalleeAttributes[i] = new CalleeAttribute(source.CalleeAttributes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "CampaignId", this.CampaignId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Callees.", this.Callees);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "CallOrder", this.CallOrder);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "ExpectedAbandonRate", this.ExpectedAbandonRate);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IVRId", this.IVRId);
        this.setParamSimple(map, prefix + "RetryTimes", this.RetryTimes);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamArrayObj(map, prefix + "CalleeAttributes.", this.CalleeAttributes);

    }
}

