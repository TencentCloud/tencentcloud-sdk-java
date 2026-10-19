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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMSdkAccessItem extends AbstractModel {

    /**
    * <p>服务id</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>服务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>SDK接入来源，可不填</p>
    */
    @SerializedName("SdkSource")
    @Expose
    private String SdkSource;

    /**
    * <p>总开关</p>
    */
    @SerializedName("MainStatus")
    @Expose
    private Boolean MainStatus;

    /**
    * <p>限速开关</p>
    */
    @SerializedName("LimitRuleStatus")
    @Expose
    private Boolean LimitRuleStatus;

    /**
    * <p>内容安全开关</p>
    */
    @SerializedName("ContentRuleStatus")
    @Expose
    private Boolean ContentRuleStatus;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>限流规则数量</p>
    */
    @SerializedName("LimitRuleCount")
    @Expose
    private Long LimitRuleCount;

    /**
    * <p>内容安全规则数量</p>
    */
    @SerializedName("ContentRuleCount")
    @Expose
    private Long ContentRuleCount;

    /**
    * <p>toolcall防护开关</p>
    */
    @SerializedName("ToolCallStatus")
    @Expose
    private Boolean ToolCallStatus;

    /**
    * <p>llm推理防护开关</p>
    */
    @SerializedName("LLMProtectStatus")
    @Expose
    private Boolean LLMProtectStatus;

    /**
    * <p>内容合规检测开关</p>
    */
    @SerializedName("ContentComplianceStatus")
    @Expose
    private Boolean ContentComplianceStatus;

    /**
    * <p>dlp防护开关</p>
    */
    @SerializedName("DLPStatus")
    @Expose
    private Boolean DLPStatus;

    /**
    * <p>skills防护开关</p>
    */
    @SerializedName("SkillsStatus")
    @Expose
    private Boolean SkillsStatus;

    /**
    * <p>意图识别检测开关</p>
    */
    @SerializedName("IntentStatus")
    @Expose
    private Boolean IntentStatus;

    /**
    * <p>恶意URL检测开关</p>
    */
    @SerializedName("UrlDetectStatus")
    @Expose
    private Boolean UrlDetectStatus;

    /**
    * <p>生效规则数量</p>
    */
    @SerializedName("EffectiveRules")
    @Expose
    private Long EffectiveRules;

    /**
     * Get <p>服务id</p> 
     * @return Domain <p>服务id</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>服务id</p>
     * @param Domain <p>服务id</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>服务名称</p> 
     * @return Name <p>服务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务名称</p>
     * @param Name <p>服务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>SDK接入来源，可不填</p> 
     * @return SdkSource <p>SDK接入来源，可不填</p>
     */
    public String getSdkSource() {
        return this.SdkSource;
    }

    /**
     * Set <p>SDK接入来源，可不填</p>
     * @param SdkSource <p>SDK接入来源，可不填</p>
     */
    public void setSdkSource(String SdkSource) {
        this.SdkSource = SdkSource;
    }

    /**
     * Get <p>总开关</p> 
     * @return MainStatus <p>总开关</p>
     */
    public Boolean getMainStatus() {
        return this.MainStatus;
    }

    /**
     * Set <p>总开关</p>
     * @param MainStatus <p>总开关</p>
     */
    public void setMainStatus(Boolean MainStatus) {
        this.MainStatus = MainStatus;
    }

    /**
     * Get <p>限速开关</p> 
     * @return LimitRuleStatus <p>限速开关</p>
     */
    public Boolean getLimitRuleStatus() {
        return this.LimitRuleStatus;
    }

    /**
     * Set <p>限速开关</p>
     * @param LimitRuleStatus <p>限速开关</p>
     */
    public void setLimitRuleStatus(Boolean LimitRuleStatus) {
        this.LimitRuleStatus = LimitRuleStatus;
    }

    /**
     * Get <p>内容安全开关</p> 
     * @return ContentRuleStatus <p>内容安全开关</p>
     */
    public Boolean getContentRuleStatus() {
        return this.ContentRuleStatus;
    }

    /**
     * Set <p>内容安全开关</p>
     * @param ContentRuleStatus <p>内容安全开关</p>
     */
    public void setContentRuleStatus(Boolean ContentRuleStatus) {
        this.ContentRuleStatus = ContentRuleStatus;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return UpdateTime <p>修改时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param UpdateTime <p>修改时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>限流规则数量</p> 
     * @return LimitRuleCount <p>限流规则数量</p>
     */
    public Long getLimitRuleCount() {
        return this.LimitRuleCount;
    }

    /**
     * Set <p>限流规则数量</p>
     * @param LimitRuleCount <p>限流规则数量</p>
     */
    public void setLimitRuleCount(Long LimitRuleCount) {
        this.LimitRuleCount = LimitRuleCount;
    }

    /**
     * Get <p>内容安全规则数量</p> 
     * @return ContentRuleCount <p>内容安全规则数量</p>
     */
    public Long getContentRuleCount() {
        return this.ContentRuleCount;
    }

    /**
     * Set <p>内容安全规则数量</p>
     * @param ContentRuleCount <p>内容安全规则数量</p>
     */
    public void setContentRuleCount(Long ContentRuleCount) {
        this.ContentRuleCount = ContentRuleCount;
    }

    /**
     * Get <p>toolcall防护开关</p> 
     * @return ToolCallStatus <p>toolcall防护开关</p>
     */
    public Boolean getToolCallStatus() {
        return this.ToolCallStatus;
    }

    /**
     * Set <p>toolcall防护开关</p>
     * @param ToolCallStatus <p>toolcall防护开关</p>
     */
    public void setToolCallStatus(Boolean ToolCallStatus) {
        this.ToolCallStatus = ToolCallStatus;
    }

    /**
     * Get <p>llm推理防护开关</p> 
     * @return LLMProtectStatus <p>llm推理防护开关</p>
     */
    public Boolean getLLMProtectStatus() {
        return this.LLMProtectStatus;
    }

    /**
     * Set <p>llm推理防护开关</p>
     * @param LLMProtectStatus <p>llm推理防护开关</p>
     */
    public void setLLMProtectStatus(Boolean LLMProtectStatus) {
        this.LLMProtectStatus = LLMProtectStatus;
    }

    /**
     * Get <p>内容合规检测开关</p> 
     * @return ContentComplianceStatus <p>内容合规检测开关</p>
     */
    public Boolean getContentComplianceStatus() {
        return this.ContentComplianceStatus;
    }

    /**
     * Set <p>内容合规检测开关</p>
     * @param ContentComplianceStatus <p>内容合规检测开关</p>
     */
    public void setContentComplianceStatus(Boolean ContentComplianceStatus) {
        this.ContentComplianceStatus = ContentComplianceStatus;
    }

    /**
     * Get <p>dlp防护开关</p> 
     * @return DLPStatus <p>dlp防护开关</p>
     */
    public Boolean getDLPStatus() {
        return this.DLPStatus;
    }

    /**
     * Set <p>dlp防护开关</p>
     * @param DLPStatus <p>dlp防护开关</p>
     */
    public void setDLPStatus(Boolean DLPStatus) {
        this.DLPStatus = DLPStatus;
    }

    /**
     * Get <p>skills防护开关</p> 
     * @return SkillsStatus <p>skills防护开关</p>
     */
    public Boolean getSkillsStatus() {
        return this.SkillsStatus;
    }

    /**
     * Set <p>skills防护开关</p>
     * @param SkillsStatus <p>skills防护开关</p>
     */
    public void setSkillsStatus(Boolean SkillsStatus) {
        this.SkillsStatus = SkillsStatus;
    }

    /**
     * Get <p>意图识别检测开关</p> 
     * @return IntentStatus <p>意图识别检测开关</p>
     */
    public Boolean getIntentStatus() {
        return this.IntentStatus;
    }

    /**
     * Set <p>意图识别检测开关</p>
     * @param IntentStatus <p>意图识别检测开关</p>
     */
    public void setIntentStatus(Boolean IntentStatus) {
        this.IntentStatus = IntentStatus;
    }

    /**
     * Get <p>恶意URL检测开关</p> 
     * @return UrlDetectStatus <p>恶意URL检测开关</p>
     */
    public Boolean getUrlDetectStatus() {
        return this.UrlDetectStatus;
    }

    /**
     * Set <p>恶意URL检测开关</p>
     * @param UrlDetectStatus <p>恶意URL检测开关</p>
     */
    public void setUrlDetectStatus(Boolean UrlDetectStatus) {
        this.UrlDetectStatus = UrlDetectStatus;
    }

    /**
     * Get <p>生效规则数量</p> 
     * @return EffectiveRules <p>生效规则数量</p>
     */
    public Long getEffectiveRules() {
        return this.EffectiveRules;
    }

    /**
     * Set <p>生效规则数量</p>
     * @param EffectiveRules <p>生效规则数量</p>
     */
    public void setEffectiveRules(Long EffectiveRules) {
        this.EffectiveRules = EffectiveRules;
    }

    public LLMSdkAccessItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMSdkAccessItem(LLMSdkAccessItem source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SdkSource != null) {
            this.SdkSource = new String(source.SdkSource);
        }
        if (source.MainStatus != null) {
            this.MainStatus = new Boolean(source.MainStatus);
        }
        if (source.LimitRuleStatus != null) {
            this.LimitRuleStatus = new Boolean(source.LimitRuleStatus);
        }
        if (source.ContentRuleStatus != null) {
            this.ContentRuleStatus = new Boolean(source.ContentRuleStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.LimitRuleCount != null) {
            this.LimitRuleCount = new Long(source.LimitRuleCount);
        }
        if (source.ContentRuleCount != null) {
            this.ContentRuleCount = new Long(source.ContentRuleCount);
        }
        if (source.ToolCallStatus != null) {
            this.ToolCallStatus = new Boolean(source.ToolCallStatus);
        }
        if (source.LLMProtectStatus != null) {
            this.LLMProtectStatus = new Boolean(source.LLMProtectStatus);
        }
        if (source.ContentComplianceStatus != null) {
            this.ContentComplianceStatus = new Boolean(source.ContentComplianceStatus);
        }
        if (source.DLPStatus != null) {
            this.DLPStatus = new Boolean(source.DLPStatus);
        }
        if (source.SkillsStatus != null) {
            this.SkillsStatus = new Boolean(source.SkillsStatus);
        }
        if (source.IntentStatus != null) {
            this.IntentStatus = new Boolean(source.IntentStatus);
        }
        if (source.UrlDetectStatus != null) {
            this.UrlDetectStatus = new Boolean(source.UrlDetectStatus);
        }
        if (source.EffectiveRules != null) {
            this.EffectiveRules = new Long(source.EffectiveRules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SdkSource", this.SdkSource);
        this.setParamSimple(map, prefix + "MainStatus", this.MainStatus);
        this.setParamSimple(map, prefix + "LimitRuleStatus", this.LimitRuleStatus);
        this.setParamSimple(map, prefix + "ContentRuleStatus", this.ContentRuleStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LimitRuleCount", this.LimitRuleCount);
        this.setParamSimple(map, prefix + "ContentRuleCount", this.ContentRuleCount);
        this.setParamSimple(map, prefix + "ToolCallStatus", this.ToolCallStatus);
        this.setParamSimple(map, prefix + "LLMProtectStatus", this.LLMProtectStatus);
        this.setParamSimple(map, prefix + "ContentComplianceStatus", this.ContentComplianceStatus);
        this.setParamSimple(map, prefix + "DLPStatus", this.DLPStatus);
        this.setParamSimple(map, prefix + "SkillsStatus", this.SkillsStatus);
        this.setParamSimple(map, prefix + "IntentStatus", this.IntentStatus);
        this.setParamSimple(map, prefix + "UrlDetectStatus", this.UrlDetectStatus);
        this.setParamSimple(map, prefix + "EffectiveRules", this.EffectiveRules);

    }
}

