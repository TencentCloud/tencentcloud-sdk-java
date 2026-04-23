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

public class CreateAutoCalloutTaskRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>任务起始时间戳，Unix 秒级时间戳</p>
    */
    @SerializedName("NotBefore")
    @Expose
    private Long NotBefore;

    /**
    * <p>被叫号码列表</p>
    */
    @SerializedName("Callees")
    @Expose
    private String [] Callees;

    /**
    * <p>主叫号码列表</p>
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * <p>呼叫使用的 IVR Id，不填时需要填写 AIAgentId</p>
    */
    @SerializedName("IvrId")
    @Expose
    private Long IvrId;

    /**
    * <p>任务名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>任务描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>任务停止时间戳，Unix 秒级时间戳</p>
    */
    @SerializedName("NotAfter")
    @Expose
    private Long NotAfter;

    /**
    * <p>最大尝试次数，1-3 次</p>
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * <p>自定义变量（仅高级版支持），CalleeAttributes 字段中使用相同变量会覆盖此处</p>
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * <p>用户自定义数据，CalleeAttributes 字段中使用 UUI 会覆盖此处</p>
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * <p>被叫属性</p>
    */
    @SerializedName("CalleeAttributes")
    @Expose
    private CalleeAttribute [] CalleeAttributes;

    /**
    * <p>IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>可用时间段</p>
    */
    @SerializedName("AvailableTime")
    @Expose
    private TimeRange [] AvailableTime;

    /**
    * <p>智能体 ID，不填写时需要填写 IvrId</p>
    */
    @SerializedName("AIAgentId")
    @Expose
    private Long AIAgentId;

    /**
    * <p>任务失败重试时间间隔，重试间隔 600秒～86400 秒</p>
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p>
    */
    @SerializedName("MaxRingTimeoutSecond")
    @Expose
    private Long MaxRingTimeoutSecond;

    /**
    * <p>根据限定的挂断原因(可选挂断状态码:202,203,204,205,206,207,208,210,212,213,215,216,217,218,219,221,222,234)进行重试，只对使用AIAgentID的任务有效，挂断状态码说明</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
    */
    @SerializedName("RetryHangupTypes")
    @Expose
    private String [] RetryHangupTypes;

    /**
    * <p>根据限定的话后标签进行重试，只对使用对话模型的AIAgentID任务有效，标签信息可在智能体配置中查询</p>
    */
    @SerializedName("RetryTags")
    @Expose
    private RetryTagItem [] RetryTags;

    /**
    * <p>生效的工作时间配置。建议使用此字段代替AvailableTime 字段，当同时使用时，优先生效AvailableTime。</p>
    */
    @SerializedName("AvailableWorkTimeConfig")
    @Expose
    private AvailableTimeConfig [] AvailableWorkTimeConfig;

    /**
    * <p>触发策略</p>
    */
    @SerializedName("TriggerStrategy")
    @Expose
    private TriggerStrategyItem [] TriggerStrategy;

    /**
     * Get <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p> 
     * @return SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     * @param SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>任务起始时间戳，Unix 秒级时间戳</p> 
     * @return NotBefore <p>任务起始时间戳，Unix 秒级时间戳</p>
     */
    public Long getNotBefore() {
        return this.NotBefore;
    }

    /**
     * Set <p>任务起始时间戳，Unix 秒级时间戳</p>
     * @param NotBefore <p>任务起始时间戳，Unix 秒级时间戳</p>
     */
    public void setNotBefore(Long NotBefore) {
        this.NotBefore = NotBefore;
    }

    /**
     * Get <p>被叫号码列表</p> 
     * @return Callees <p>被叫号码列表</p>
     */
    public String [] getCallees() {
        return this.Callees;
    }

    /**
     * Set <p>被叫号码列表</p>
     * @param Callees <p>被叫号码列表</p>
     */
    public void setCallees(String [] Callees) {
        this.Callees = Callees;
    }

    /**
     * Get <p>主叫号码列表</p> 
     * @return Callers <p>主叫号码列表</p>
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set <p>主叫号码列表</p>
     * @param Callers <p>主叫号码列表</p>
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get <p>呼叫使用的 IVR Id，不填时需要填写 AIAgentId</p> 
     * @return IvrId <p>呼叫使用的 IVR Id，不填时需要填写 AIAgentId</p>
     */
    public Long getIvrId() {
        return this.IvrId;
    }

    /**
     * Set <p>呼叫使用的 IVR Id，不填时需要填写 AIAgentId</p>
     * @param IvrId <p>呼叫使用的 IVR Id，不填时需要填写 AIAgentId</p>
     */
    public void setIvrId(Long IvrId) {
        this.IvrId = IvrId;
    }

    /**
     * Get <p>任务名</p> 
     * @return Name <p>任务名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名</p>
     * @param Name <p>任务名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>任务描述</p> 
     * @return Description <p>任务描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述</p>
     * @param Description <p>任务描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>任务停止时间戳，Unix 秒级时间戳</p> 
     * @return NotAfter <p>任务停止时间戳，Unix 秒级时间戳</p>
     */
    public Long getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set <p>任务停止时间戳，Unix 秒级时间戳</p>
     * @param NotAfter <p>任务停止时间戳，Unix 秒级时间戳</p>
     */
    public void setNotAfter(Long NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get <p>最大尝试次数，1-3 次</p> 
     * @return Tries <p>最大尝试次数，1-3 次</p>
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set <p>最大尝试次数，1-3 次</p>
     * @param Tries <p>最大尝试次数，1-3 次</p>
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get <p>自定义变量（仅高级版支持），CalleeAttributes 字段中使用相同变量会覆盖此处</p> 
     * @return Variables <p>自定义变量（仅高级版支持），CalleeAttributes 字段中使用相同变量会覆盖此处</p>
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set <p>自定义变量（仅高级版支持），CalleeAttributes 字段中使用相同变量会覆盖此处</p>
     * @param Variables <p>自定义变量（仅高级版支持），CalleeAttributes 字段中使用相同变量会覆盖此处</p>
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get <p>用户自定义数据，CalleeAttributes 字段中使用 UUI 会覆盖此处</p> 
     * @return UUI <p>用户自定义数据，CalleeAttributes 字段中使用 UUI 会覆盖此处</p>
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set <p>用户自定义数据，CalleeAttributes 字段中使用 UUI 会覆盖此处</p>
     * @param UUI <p>用户自定义数据，CalleeAttributes 字段中使用 UUI 会覆盖此处</p>
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get <p>被叫属性</p> 
     * @return CalleeAttributes <p>被叫属性</p>
     */
    public CalleeAttribute [] getCalleeAttributes() {
        return this.CalleeAttributes;
    }

    /**
     * Set <p>被叫属性</p>
     * @param CalleeAttributes <p>被叫属性</p>
     */
    public void setCalleeAttributes(CalleeAttribute [] CalleeAttributes) {
        this.CalleeAttributes = CalleeAttributes;
    }

    /**
     * Get <p>IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones</p> 
     * @return TimeZone <p>IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones</p>
     * @param TimeZone <p>IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>可用时间段</p> 
     * @return AvailableTime <p>可用时间段</p>
     */
    public TimeRange [] getAvailableTime() {
        return this.AvailableTime;
    }

    /**
     * Set <p>可用时间段</p>
     * @param AvailableTime <p>可用时间段</p>
     */
    public void setAvailableTime(TimeRange [] AvailableTime) {
        this.AvailableTime = AvailableTime;
    }

    /**
     * Get <p>智能体 ID，不填写时需要填写 IvrId</p> 
     * @return AIAgentId <p>智能体 ID，不填写时需要填写 IvrId</p>
     */
    public Long getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * Set <p>智能体 ID，不填写时需要填写 IvrId</p>
     * @param AIAgentId <p>智能体 ID，不填写时需要填写 IvrId</p>
     */
    public void setAIAgentId(Long AIAgentId) {
        this.AIAgentId = AIAgentId;
    }

    /**
     * Get <p>任务失败重试时间间隔，重试间隔 600秒～86400 秒</p> 
     * @return RetryInterval <p>任务失败重试时间间隔，重试间隔 600秒～86400 秒</p>
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set <p>任务失败重试时间间隔，重试间隔 600秒～86400 秒</p>
     * @param RetryInterval <p>任务失败重试时间间隔，重试间隔 600秒～86400 秒</p>
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p> 
     * @return MaxRingTimeoutSecond <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p>
     */
    public Long getMaxRingTimeoutSecond() {
        return this.MaxRingTimeoutSecond;
    }

    /**
     * Set <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p>
     * @param MaxRingTimeoutSecond <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p>
     */
    public void setMaxRingTimeoutSecond(Long MaxRingTimeoutSecond) {
        this.MaxRingTimeoutSecond = MaxRingTimeoutSecond;
    }

    /**
     * Get <p>根据限定的挂断原因(可选挂断状态码:202,203,204,205,206,207,208,210,212,213,215,216,217,218,219,221,222,234)进行重试，只对使用AIAgentID的任务有效，挂断状态码说明</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p> 
     * @return RetryHangupTypes <p>根据限定的挂断原因(可选挂断状态码:202,203,204,205,206,207,208,210,212,213,215,216,217,218,219,221,222,234)进行重试，只对使用AIAgentID的任务有效，挂断状态码说明</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
     */
    public String [] getRetryHangupTypes() {
        return this.RetryHangupTypes;
    }

    /**
     * Set <p>根据限定的挂断原因(可选挂断状态码:202,203,204,205,206,207,208,210,212,213,215,216,217,218,219,221,222,234)进行重试，只对使用AIAgentID的任务有效，挂断状态码说明</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
     * @param RetryHangupTypes <p>根据限定的挂断原因(可选挂断状态码:202,203,204,205,206,207,208,210,212,213,215,216,217,218,219,221,222,234)进行重试，只对使用AIAgentID的任务有效，挂断状态码说明</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
     */
    public void setRetryHangupTypes(String [] RetryHangupTypes) {
        this.RetryHangupTypes = RetryHangupTypes;
    }

    /**
     * Get <p>根据限定的话后标签进行重试，只对使用对话模型的AIAgentID任务有效，标签信息可在智能体配置中查询</p> 
     * @return RetryTags <p>根据限定的话后标签进行重试，只对使用对话模型的AIAgentID任务有效，标签信息可在智能体配置中查询</p>
     */
    public RetryTagItem [] getRetryTags() {
        return this.RetryTags;
    }

    /**
     * Set <p>根据限定的话后标签进行重试，只对使用对话模型的AIAgentID任务有效，标签信息可在智能体配置中查询</p>
     * @param RetryTags <p>根据限定的话后标签进行重试，只对使用对话模型的AIAgentID任务有效，标签信息可在智能体配置中查询</p>
     */
    public void setRetryTags(RetryTagItem [] RetryTags) {
        this.RetryTags = RetryTags;
    }

    /**
     * Get <p>生效的工作时间配置。建议使用此字段代替AvailableTime 字段，当同时使用时，优先生效AvailableTime。</p> 
     * @return AvailableWorkTimeConfig <p>生效的工作时间配置。建议使用此字段代替AvailableTime 字段，当同时使用时，优先生效AvailableTime。</p>
     */
    public AvailableTimeConfig [] getAvailableWorkTimeConfig() {
        return this.AvailableWorkTimeConfig;
    }

    /**
     * Set <p>生效的工作时间配置。建议使用此字段代替AvailableTime 字段，当同时使用时，优先生效AvailableTime。</p>
     * @param AvailableWorkTimeConfig <p>生效的工作时间配置。建议使用此字段代替AvailableTime 字段，当同时使用时，优先生效AvailableTime。</p>
     */
    public void setAvailableWorkTimeConfig(AvailableTimeConfig [] AvailableWorkTimeConfig) {
        this.AvailableWorkTimeConfig = AvailableWorkTimeConfig;
    }

    /**
     * Get <p>触发策略</p> 
     * @return TriggerStrategy <p>触发策略</p>
     */
    public TriggerStrategyItem [] getTriggerStrategy() {
        return this.TriggerStrategy;
    }

    /**
     * Set <p>触发策略</p>
     * @param TriggerStrategy <p>触发策略</p>
     */
    public void setTriggerStrategy(TriggerStrategyItem [] TriggerStrategy) {
        this.TriggerStrategy = TriggerStrategy;
    }

    public CreateAutoCalloutTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoCalloutTaskRequest(CreateAutoCalloutTaskRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.NotBefore != null) {
            this.NotBefore = new Long(source.NotBefore);
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
        if (source.IvrId != null) {
            this.IvrId = new Long(source.IvrId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NotAfter != null) {
            this.NotAfter = new Long(source.NotAfter);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
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
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.AvailableTime != null) {
            this.AvailableTime = new TimeRange[source.AvailableTime.length];
            for (int i = 0; i < source.AvailableTime.length; i++) {
                this.AvailableTime[i] = new TimeRange(source.AvailableTime[i]);
            }
        }
        if (source.AIAgentId != null) {
            this.AIAgentId = new Long(source.AIAgentId);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
        if (source.MaxRingTimeoutSecond != null) {
            this.MaxRingTimeoutSecond = new Long(source.MaxRingTimeoutSecond);
        }
        if (source.RetryHangupTypes != null) {
            this.RetryHangupTypes = new String[source.RetryHangupTypes.length];
            for (int i = 0; i < source.RetryHangupTypes.length; i++) {
                this.RetryHangupTypes[i] = new String(source.RetryHangupTypes[i]);
            }
        }
        if (source.RetryTags != null) {
            this.RetryTags = new RetryTagItem[source.RetryTags.length];
            for (int i = 0; i < source.RetryTags.length; i++) {
                this.RetryTags[i] = new RetryTagItem(source.RetryTags[i]);
            }
        }
        if (source.AvailableWorkTimeConfig != null) {
            this.AvailableWorkTimeConfig = new AvailableTimeConfig[source.AvailableWorkTimeConfig.length];
            for (int i = 0; i < source.AvailableWorkTimeConfig.length; i++) {
                this.AvailableWorkTimeConfig[i] = new AvailableTimeConfig(source.AvailableWorkTimeConfig[i]);
            }
        }
        if (source.TriggerStrategy != null) {
            this.TriggerStrategy = new TriggerStrategyItem[source.TriggerStrategy.length];
            for (int i = 0; i < source.TriggerStrategy.length; i++) {
                this.TriggerStrategy[i] = new TriggerStrategyItem(source.TriggerStrategy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "NotBefore", this.NotBefore);
        this.setParamArraySimple(map, prefix + "Callees.", this.Callees);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "IvrId", this.IvrId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NotAfter", this.NotAfter);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamArrayObj(map, prefix + "CalleeAttributes.", this.CalleeAttributes);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArrayObj(map, prefix + "AvailableTime.", this.AvailableTime);
        this.setParamSimple(map, prefix + "AIAgentId", this.AIAgentId);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "MaxRingTimeoutSecond", this.MaxRingTimeoutSecond);
        this.setParamArraySimple(map, prefix + "RetryHangupTypes.", this.RetryHangupTypes);
        this.setParamArrayObj(map, prefix + "RetryTags.", this.RetryTags);
        this.setParamArrayObj(map, prefix + "AvailableWorkTimeConfig.", this.AvailableWorkTimeConfig);
        this.setParamArrayObj(map, prefix + "TriggerStrategy.", this.TriggerStrategy);

    }
}

