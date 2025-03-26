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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAutoCalloutTaskRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 任务起始时间戳，Unix 秒级时间戳
    */
    @SerializedName("NotBefore")
    @Expose
    private Long NotBefore;

    /**
    * 被叫号码列表
    */
    @SerializedName("Callees")
    @Expose
    private String [] Callees;

    /**
    * 主叫号码列表
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 呼叫使用的 IVR Id，不填时需要填写 AIAgentId
    */
    @SerializedName("IvrId")
    @Expose
    private Long IvrId;

    /**
    * 任务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 任务停止时间戳，Unix 秒级时间戳
    */
    @SerializedName("NotAfter")
    @Expose
    private Long NotAfter;

    /**
    * 最大尝试次数，1-3 次
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * 自定义变量（仅高级版支持）
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * UUI
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
    * IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * 可用时间段
    */
    @SerializedName("AvailableTime")
    @Expose
    private TimeRange [] AvailableTime;

    /**
    * 智能体 ID，不填写时需要填写 IvrId
    */
    @SerializedName("AIAgentId")
    @Expose
    private Long AIAgentId;

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
     * Get 任务起始时间戳，Unix 秒级时间戳 
     * @return NotBefore 任务起始时间戳，Unix 秒级时间戳
     */
    public Long getNotBefore() {
        return this.NotBefore;
    }

    /**
     * Set 任务起始时间戳，Unix 秒级时间戳
     * @param NotBefore 任务起始时间戳，Unix 秒级时间戳
     */
    public void setNotBefore(Long NotBefore) {
        this.NotBefore = NotBefore;
    }

    /**
     * Get 被叫号码列表 
     * @return Callees 被叫号码列表
     */
    public String [] getCallees() {
        return this.Callees;
    }

    /**
     * Set 被叫号码列表
     * @param Callees 被叫号码列表
     */
    public void setCallees(String [] Callees) {
        this.Callees = Callees;
    }

    /**
     * Get 主叫号码列表 
     * @return Callers 主叫号码列表
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫号码列表
     * @param Callers 主叫号码列表
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 呼叫使用的 IVR Id，不填时需要填写 AIAgentId 
     * @return IvrId 呼叫使用的 IVR Id，不填时需要填写 AIAgentId
     */
    public Long getIvrId() {
        return this.IvrId;
    }

    /**
     * Set 呼叫使用的 IVR Id，不填时需要填写 AIAgentId
     * @param IvrId 呼叫使用的 IVR Id，不填时需要填写 AIAgentId
     */
    public void setIvrId(Long IvrId) {
        this.IvrId = IvrId;
    }

    /**
     * Get 任务名 
     * @return Name 任务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名
     * @param Name 任务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务描述 
     * @return Description 任务描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述
     * @param Description 任务描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 任务停止时间戳，Unix 秒级时间戳 
     * @return NotAfter 任务停止时间戳，Unix 秒级时间戳
     */
    public Long getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set 任务停止时间戳，Unix 秒级时间戳
     * @param NotAfter 任务停止时间戳，Unix 秒级时间戳
     */
    public void setNotAfter(Long NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get 最大尝试次数，1-3 次 
     * @return Tries 最大尝试次数，1-3 次
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set 最大尝试次数，1-3 次
     * @param Tries 最大尝试次数，1-3 次
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get 自定义变量（仅高级版支持） 
     * @return Variables 自定义变量（仅高级版支持）
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set 自定义变量（仅高级版支持）
     * @param Variables 自定义变量（仅高级版支持）
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get UUI 
     * @return UUI UUI
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set UUI
     * @param UUI UUI
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

    /**
     * Get IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones 
     * @return TimeZone IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones
     * @param TimeZone IANA 时区名称，参考 https://datatracker.ietf.org/doc/html/draft-ietf-netmod-iana-timezones
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 可用时间段 
     * @return AvailableTime 可用时间段
     */
    public TimeRange [] getAvailableTime() {
        return this.AvailableTime;
    }

    /**
     * Set 可用时间段
     * @param AvailableTime 可用时间段
     */
    public void setAvailableTime(TimeRange [] AvailableTime) {
        this.AvailableTime = AvailableTime;
    }

    /**
     * Get 智能体 ID，不填写时需要填写 IvrId 
     * @return AIAgentId 智能体 ID，不填写时需要填写 IvrId
     */
    public Long getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * Set 智能体 ID，不填写时需要填写 IvrId
     * @param AIAgentId 智能体 ID，不填写时需要填写 IvrId
     */
    public void setAIAgentId(Long AIAgentId) {
        this.AIAgentId = AIAgentId;
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

    }
}

