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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemConfigRule extends AbstractModel {

    /**
    * 规则标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * 规则名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameterForManage [] InputParameter;

    /**
    * 规则触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceCondition")
    @Expose
    private SourceConditionForManage [] SourceCondition;

    /**
    * 支持的资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String [] Label;

    /**
    * 风险等级，1，2，3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 对应的函数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceFunction")
    @Expose
    private String ServiceFunction;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 触发类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String [] TriggerType;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 使用次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReferenceCount")
    @Expose
    private Long ReferenceCount;

    /**
    * 规则类型
    */
    @SerializedName("IdentifierType")
    @Expose
    private String IdentifierType;

    /**
     * Get 规则标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Identifier 规则标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set 规则标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Identifier 规则标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get 规则名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputParameter 规则参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InputParameterForManage [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set 规则参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputParameter 规则参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputParameter(InputParameterForManage [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get 规则触发条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceCondition 规则触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SourceConditionForManage [] getSourceCondition() {
        return this.SourceCondition;
    }

    /**
     * Set 规则触发条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceCondition 规则触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceCondition(SourceConditionForManage [] SourceCondition) {
        this.SourceCondition = SourceCondition;
    }

    /**
     * Get 支持的资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 支持的资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 支持的资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 支持的资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabel() {
        return this.Label;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String [] Label) {
        this.Label = Label;
    }

    /**
     * Get 风险等级，1，2，3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 风险等级，1，2，3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级，1，2，3
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险等级，1，2，3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 对应的函数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceFunction 对应的函数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceFunction() {
        return this.ServiceFunction;
    }

    /**
     * Set 对应的函数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceFunction 对应的函数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceFunction(String ServiceFunction) {
        this.ServiceFunction = ServiceFunction;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 触发类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 使用次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReferenceCount 使用次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReferenceCount() {
        return this.ReferenceCount;
    }

    /**
     * Set 使用次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReferenceCount 使用次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferenceCount(Long ReferenceCount) {
        this.ReferenceCount = ReferenceCount;
    }

    /**
     * Get 规则类型 
     * @return IdentifierType 规则类型
     */
    public String getIdentifierType() {
        return this.IdentifierType;
    }

    /**
     * Set 规则类型
     * @param IdentifierType 规则类型
     */
    public void setIdentifierType(String IdentifierType) {
        this.IdentifierType = IdentifierType;
    }

    public SystemConfigRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemConfigRule(SystemConfigRule source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameterForManage[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameterForManage(source.InputParameter[i]);
            }
        }
        if (source.SourceCondition != null) {
            this.SourceCondition = new SourceConditionForManage[source.SourceCondition.length];
            for (int i = 0; i < source.SourceCondition.length; i++) {
                this.SourceCondition[i] = new SourceConditionForManage(source.SourceCondition[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
        if (source.Label != null) {
            this.Label = new String[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new String(source.Label[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ServiceFunction != null) {
            this.ServiceFunction = new String(source.ServiceFunction);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String[source.TriggerType.length];
            for (int i = 0; i < source.TriggerType.length; i++) {
                this.TriggerType[i] = new String(source.TriggerType[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ReferenceCount != null) {
            this.ReferenceCount = new Long(source.ReferenceCount);
        }
        if (source.IdentifierType != null) {
            this.IdentifierType = new String(source.IdentifierType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamArrayObj(map, prefix + "SourceCondition.", this.SourceCondition);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);
        this.setParamArraySimple(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ServiceFunction", this.ServiceFunction);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "TriggerType.", this.TriggerType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ReferenceCount", this.ReferenceCount);
        this.setParamSimple(map, prefix + "IdentifierType", this.IdentifierType);

    }
}

