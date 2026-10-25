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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTDEMFieldTransformRuleRequest extends AbstractModel {

    /**
    * <p>规则 ID（必填）</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>应用 ID（必填）</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>目标字段（必填）</p>
    */
    @SerializedName("TargetField")
    @Expose
    private String TargetField;

    /**
    * <p>匹配方式（必填）：exact / prefix / contains / regex</p>
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * <p>匹配模式（必填）</p>
    */
    @SerializedName("MatchPattern")
    @Expose
    private String MatchPattern;

    /**
    * <p>替换动作（必填）：replace / regex_replace / mask</p>
    */
    @SerializedName("TransformAction")
    @Expose
    private String TransformAction;

    /**
    * <p>规则名称（可选）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>替换值</p>
    */
    @SerializedName("ReplaceValue")
    @Expose
    private String ReplaceValue;

    /**
    * <p>优先级</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>规则 ID（必填）</p> 
     * @return Id <p>规则 ID（必填）</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>规则 ID（必填）</p>
     * @param Id <p>规则 ID（必填）</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>应用 ID（必填）</p> 
     * @return AppId <p>应用 ID（必填）</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（必填）</p>
     * @param AppId <p>应用 ID（必填）</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>目标字段（必填）</p> 
     * @return TargetField <p>目标字段（必填）</p>
     */
    public String getTargetField() {
        return this.TargetField;
    }

    /**
     * Set <p>目标字段（必填）</p>
     * @param TargetField <p>目标字段（必填）</p>
     */
    public void setTargetField(String TargetField) {
        this.TargetField = TargetField;
    }

    /**
     * Get <p>匹配方式（必填）：exact / prefix / contains / regex</p> 
     * @return MatchType <p>匹配方式（必填）：exact / prefix / contains / regex</p>
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set <p>匹配方式（必填）：exact / prefix / contains / regex</p>
     * @param MatchType <p>匹配方式（必填）：exact / prefix / contains / regex</p>
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get <p>匹配模式（必填）</p> 
     * @return MatchPattern <p>匹配模式（必填）</p>
     */
    public String getMatchPattern() {
        return this.MatchPattern;
    }

    /**
     * Set <p>匹配模式（必填）</p>
     * @param MatchPattern <p>匹配模式（必填）</p>
     */
    public void setMatchPattern(String MatchPattern) {
        this.MatchPattern = MatchPattern;
    }

    /**
     * Get <p>替换动作（必填）：replace / regex_replace / mask</p> 
     * @return TransformAction <p>替换动作（必填）：replace / regex_replace / mask</p>
     */
    public String getTransformAction() {
        return this.TransformAction;
    }

    /**
     * Set <p>替换动作（必填）：replace / regex_replace / mask</p>
     * @param TransformAction <p>替换动作（必填）：replace / regex_replace / mask</p>
     */
    public void setTransformAction(String TransformAction) {
        this.TransformAction = TransformAction;
    }

    /**
     * Get <p>规则名称（可选）</p> 
     * @return Name <p>规则名称（可选）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>规则名称（可选）</p>
     * @param Name <p>规则名称（可选）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>替换值</p> 
     * @return ReplaceValue <p>替换值</p>
     */
    public String getReplaceValue() {
        return this.ReplaceValue;
    }

    /**
     * Set <p>替换值</p>
     * @param ReplaceValue <p>替换值</p>
     */
    public void setReplaceValue(String ReplaceValue) {
        this.ReplaceValue = ReplaceValue;
    }

    /**
     * Get <p>优先级</p> 
     * @return Priority <p>优先级</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级</p>
     * @param Priority <p>优先级</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>是否启用</p> 
     * @return Enabled <p>是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用</p>
     * @param Enabled <p>是否启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ModifyTDEMFieldTransformRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTDEMFieldTransformRuleRequest(ModifyTDEMFieldTransformRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.TargetField != null) {
            this.TargetField = new String(source.TargetField);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.MatchPattern != null) {
            this.MatchPattern = new String(source.MatchPattern);
        }
        if (source.TransformAction != null) {
            this.TransformAction = new String(source.TransformAction);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ReplaceValue != null) {
            this.ReplaceValue = new String(source.ReplaceValue);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TargetField", this.TargetField);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "MatchPattern", this.MatchPattern);
        this.setParamSimple(map, prefix + "TransformAction", this.TransformAction);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ReplaceValue", this.ReplaceValue);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

