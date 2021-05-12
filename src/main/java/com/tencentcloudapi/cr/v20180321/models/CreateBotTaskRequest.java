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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBotTaskRequest extends AbstractModel{

    /**
    * 模块名。默认值（固定）：AiApi
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名。默认值（固定）：CreateTask
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 任务名称
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
    * 对话流ID
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 是否禁止拨打，默认Y
    */
    @SerializedName("BanCall")
    @Expose
    private String BanCall;

    /**
    * 拨打线路集合
    */
    @SerializedName("PhoneCollection")
    @Expose
    private String PhoneCollection;

    /**
    * 产品拨打时间集合
    */
    @SerializedName("CallTimeCollection")
    @Expose
    private CallTimeDict CallTimeCollection;

    /**
    * 禁止拨打起始时间。默认130000
    */
    @SerializedName("StartTimeBan")
    @Expose
    private String StartTimeBan;

    /**
    * 禁止拨打结束时间。默认140000
    */
    @SerializedName("EndTimeBan")
    @Expose
    private String EndTimeBan;

    /**
    * 重播方式，NON：未接通、LABEL：意向分级，可多选，用竖线分隔：NON|LABEL
    */
    @SerializedName("CodeType")
    @Expose
    private String CodeType;

    /**
    * 重播值集合，A：强意向、B：中意向、C：低意向、D：无意向、E：在忙、F：未接通、G：无效号码，可多选，用竖线分隔：A|B|C|D|E|F|G
    */
    @SerializedName("CodeCollection")
    @Expose
    private String CodeCollection;

    /**
    * 继续拨打次数
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
    * 拨打间隔
    */
    @SerializedName("CallInterval")
    @Expose
    private Long CallInterval;

    /**
    * 未接通引用短信签名ID
    */
    @SerializedName("SmsSignId")
    @Expose
    private String SmsSignId;

    /**
    * 未接通引用短信模板ID
    */
    @SerializedName("SmsTemplateId")
    @Expose
    private String SmsTemplateId;

    /**
    * 拨打方式。NORMAL - 正常拨打；TIMER - 定时拨打
    */
    @SerializedName("CallType")
    @Expose
    private String CallType;

    /**
    * 拨打开始日期。CallType=TIMER时有值，yyyy-MM-dd
    */
    @SerializedName("CallStartDate")
    @Expose
    private String CallStartDate;

    /**
    * 拨打结束日期。CallType=PERIOD 时有值，yyyy-MM-dd
    */
    @SerializedName("CallEndDate")
    @Expose
    private String CallEndDate;

    /**
     * Get 模块名。默认值（固定）：AiApi 
     * @return Module 模块名。默认值（固定）：AiApi
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名。默认值（固定）：AiApi
     * @param Module 模块名。默认值（固定）：AiApi
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名。默认值（固定）：CreateTask 
     * @return Operation 操作名。默认值（固定）：CreateTask
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名。默认值（固定）：CreateTask
     * @param Operation 操作名。默认值（固定）：CreateTask
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 任务名称 
     * @return BotName 任务名称
     */
    public String getBotName() {
        return this.BotName;
    }

    /**
     * Set 任务名称
     * @param BotName 任务名称
     */
    public void setBotName(String BotName) {
        this.BotName = BotName;
    }

    /**
     * Get 对话流ID 
     * @return FlowId 对话流ID
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 对话流ID
     * @param FlowId 对话流ID
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 是否禁止拨打，默认Y 
     * @return BanCall 是否禁止拨打，默认Y
     */
    public String getBanCall() {
        return this.BanCall;
    }

    /**
     * Set 是否禁止拨打，默认Y
     * @param BanCall 是否禁止拨打，默认Y
     */
    public void setBanCall(String BanCall) {
        this.BanCall = BanCall;
    }

    /**
     * Get 拨打线路集合 
     * @return PhoneCollection 拨打线路集合
     */
    public String getPhoneCollection() {
        return this.PhoneCollection;
    }

    /**
     * Set 拨打线路集合
     * @param PhoneCollection 拨打线路集合
     */
    public void setPhoneCollection(String PhoneCollection) {
        this.PhoneCollection = PhoneCollection;
    }

    /**
     * Get 产品拨打时间集合 
     * @return CallTimeCollection 产品拨打时间集合
     */
    public CallTimeDict getCallTimeCollection() {
        return this.CallTimeCollection;
    }

    /**
     * Set 产品拨打时间集合
     * @param CallTimeCollection 产品拨打时间集合
     */
    public void setCallTimeCollection(CallTimeDict CallTimeCollection) {
        this.CallTimeCollection = CallTimeCollection;
    }

    /**
     * Get 禁止拨打起始时间。默认130000 
     * @return StartTimeBan 禁止拨打起始时间。默认130000
     */
    public String getStartTimeBan() {
        return this.StartTimeBan;
    }

    /**
     * Set 禁止拨打起始时间。默认130000
     * @param StartTimeBan 禁止拨打起始时间。默认130000
     */
    public void setStartTimeBan(String StartTimeBan) {
        this.StartTimeBan = StartTimeBan;
    }

    /**
     * Get 禁止拨打结束时间。默认140000 
     * @return EndTimeBan 禁止拨打结束时间。默认140000
     */
    public String getEndTimeBan() {
        return this.EndTimeBan;
    }

    /**
     * Set 禁止拨打结束时间。默认140000
     * @param EndTimeBan 禁止拨打结束时间。默认140000
     */
    public void setEndTimeBan(String EndTimeBan) {
        this.EndTimeBan = EndTimeBan;
    }

    /**
     * Get 重播方式，NON：未接通、LABEL：意向分级，可多选，用竖线分隔：NON|LABEL 
     * @return CodeType 重播方式，NON：未接通、LABEL：意向分级，可多选，用竖线分隔：NON|LABEL
     */
    public String getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 重播方式，NON：未接通、LABEL：意向分级，可多选，用竖线分隔：NON|LABEL
     * @param CodeType 重播方式，NON：未接通、LABEL：意向分级，可多选，用竖线分隔：NON|LABEL
     */
    public void setCodeType(String CodeType) {
        this.CodeType = CodeType;
    }

    /**
     * Get 重播值集合，A：强意向、B：中意向、C：低意向、D：无意向、E：在忙、F：未接通、G：无效号码，可多选，用竖线分隔：A|B|C|D|E|F|G 
     * @return CodeCollection 重播值集合，A：强意向、B：中意向、C：低意向、D：无意向、E：在忙、F：未接通、G：无效号码，可多选，用竖线分隔：A|B|C|D|E|F|G
     */
    public String getCodeCollection() {
        return this.CodeCollection;
    }

    /**
     * Set 重播值集合，A：强意向、B：中意向、C：低意向、D：无意向、E：在忙、F：未接通、G：无效号码，可多选，用竖线分隔：A|B|C|D|E|F|G
     * @param CodeCollection 重播值集合，A：强意向、B：中意向、C：低意向、D：无意向、E：在忙、F：未接通、G：无效号码，可多选，用竖线分隔：A|B|C|D|E|F|G
     */
    public void setCodeCollection(String CodeCollection) {
        this.CodeCollection = CodeCollection;
    }

    /**
     * Get 继续拨打次数 
     * @return CallCount 继续拨打次数
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set 继续拨打次数
     * @param CallCount 继续拨打次数
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get 拨打间隔 
     * @return CallInterval 拨打间隔
     */
    public Long getCallInterval() {
        return this.CallInterval;
    }

    /**
     * Set 拨打间隔
     * @param CallInterval 拨打间隔
     */
    public void setCallInterval(Long CallInterval) {
        this.CallInterval = CallInterval;
    }

    /**
     * Get 未接通引用短信签名ID 
     * @return SmsSignId 未接通引用短信签名ID
     */
    public String getSmsSignId() {
        return this.SmsSignId;
    }

    /**
     * Set 未接通引用短信签名ID
     * @param SmsSignId 未接通引用短信签名ID
     */
    public void setSmsSignId(String SmsSignId) {
        this.SmsSignId = SmsSignId;
    }

    /**
     * Get 未接通引用短信模板ID 
     * @return SmsTemplateId 未接通引用短信模板ID
     */
    public String getSmsTemplateId() {
        return this.SmsTemplateId;
    }

    /**
     * Set 未接通引用短信模板ID
     * @param SmsTemplateId 未接通引用短信模板ID
     */
    public void setSmsTemplateId(String SmsTemplateId) {
        this.SmsTemplateId = SmsTemplateId;
    }

    /**
     * Get 拨打方式。NORMAL - 正常拨打；TIMER - 定时拨打 
     * @return CallType 拨打方式。NORMAL - 正常拨打；TIMER - 定时拨打
     */
    public String getCallType() {
        return this.CallType;
    }

    /**
     * Set 拨打方式。NORMAL - 正常拨打；TIMER - 定时拨打
     * @param CallType 拨打方式。NORMAL - 正常拨打；TIMER - 定时拨打
     */
    public void setCallType(String CallType) {
        this.CallType = CallType;
    }

    /**
     * Get 拨打开始日期。CallType=TIMER时有值，yyyy-MM-dd 
     * @return CallStartDate 拨打开始日期。CallType=TIMER时有值，yyyy-MM-dd
     */
    public String getCallStartDate() {
        return this.CallStartDate;
    }

    /**
     * Set 拨打开始日期。CallType=TIMER时有值，yyyy-MM-dd
     * @param CallStartDate 拨打开始日期。CallType=TIMER时有值，yyyy-MM-dd
     */
    public void setCallStartDate(String CallStartDate) {
        this.CallStartDate = CallStartDate;
    }

    /**
     * Get 拨打结束日期。CallType=PERIOD 时有值，yyyy-MM-dd 
     * @return CallEndDate 拨打结束日期。CallType=PERIOD 时有值，yyyy-MM-dd
     */
    public String getCallEndDate() {
        return this.CallEndDate;
    }

    /**
     * Set 拨打结束日期。CallType=PERIOD 时有值，yyyy-MM-dd
     * @param CallEndDate 拨打结束日期。CallType=PERIOD 时有值，yyyy-MM-dd
     */
    public void setCallEndDate(String CallEndDate) {
        this.CallEndDate = CallEndDate;
    }

    public CreateBotTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBotTaskRequest(CreateBotTaskRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.BotName != null) {
            this.BotName = new String(source.BotName);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.BanCall != null) {
            this.BanCall = new String(source.BanCall);
        }
        if (source.PhoneCollection != null) {
            this.PhoneCollection = new String(source.PhoneCollection);
        }
        if (source.CallTimeCollection != null) {
            this.CallTimeCollection = new CallTimeDict(source.CallTimeCollection);
        }
        if (source.StartTimeBan != null) {
            this.StartTimeBan = new String(source.StartTimeBan);
        }
        if (source.EndTimeBan != null) {
            this.EndTimeBan = new String(source.EndTimeBan);
        }
        if (source.CodeType != null) {
            this.CodeType = new String(source.CodeType);
        }
        if (source.CodeCollection != null) {
            this.CodeCollection = new String(source.CodeCollection);
        }
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
        if (source.CallInterval != null) {
            this.CallInterval = new Long(source.CallInterval);
        }
        if (source.SmsSignId != null) {
            this.SmsSignId = new String(source.SmsSignId);
        }
        if (source.SmsTemplateId != null) {
            this.SmsTemplateId = new String(source.SmsTemplateId);
        }
        if (source.CallType != null) {
            this.CallType = new String(source.CallType);
        }
        if (source.CallStartDate != null) {
            this.CallStartDate = new String(source.CallStartDate);
        }
        if (source.CallEndDate != null) {
            this.CallEndDate = new String(source.CallEndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "BotName", this.BotName);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "BanCall", this.BanCall);
        this.setParamSimple(map, prefix + "PhoneCollection", this.PhoneCollection);
        this.setParamObj(map, prefix + "CallTimeCollection.", this.CallTimeCollection);
        this.setParamSimple(map, prefix + "StartTimeBan", this.StartTimeBan);
        this.setParamSimple(map, prefix + "EndTimeBan", this.EndTimeBan);
        this.setParamSimple(map, prefix + "CodeType", this.CodeType);
        this.setParamSimple(map, prefix + "CodeCollection", this.CodeCollection);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "CallInterval", this.CallInterval);
        this.setParamSimple(map, prefix + "SmsSignId", this.SmsSignId);
        this.setParamSimple(map, prefix + "SmsTemplateId", this.SmsTemplateId);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "CallStartDate", this.CallStartDate);
        this.setParamSimple(map, prefix + "CallEndDate", this.CallEndDate);

    }
}

