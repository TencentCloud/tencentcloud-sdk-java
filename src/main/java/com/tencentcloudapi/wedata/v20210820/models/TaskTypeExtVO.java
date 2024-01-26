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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskTypeExtVO extends AbstractModel {

    /**
    * 类型ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 属性名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropName")
    @Expose
    private String PropName;

    /**
    * 属性标签(ui展示用)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropLabel")
    @Expose
    private String PropLabel;

    /**
    * 缺省标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultFlag")
    @Expose
    private Long DefaultFlag;

    /**
    * 可视标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VisibleFlag")
    @Expose
    private Long VisibleFlag;

    /**
    * 属性描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropDesc")
    @Expose
    private String PropDesc;

    /**
    * 排列id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RankId")
    @Expose
    private Long RankId;

    /**
    * 控件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 值类型(integer，string)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * 缺省值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 候选值列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CandidateValues")
    @Expose
    private String CandidateValues;

    /**
    * 是否必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsMandatory")
    @Expose
    private Long IsMandatory;

    /**
    * 最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxValue")
    @Expose
    private Long MaxValue;

    /**
    * 最小值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinValue")
    @Expose
    private Long MinValue;

    /**
    * 配置等级(1-普通，2-高级，3-管理员)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfLevel")
    @Expose
    private Long ConfLevel;

    /**
    * 候选文本列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CandidateTexts")
    @Expose
    private String CandidateTexts;

    /**
    * 复制时是否需要修改
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CopyKey")
    @Expose
    private Long CopyKey;

    /**
    * 字段正则表达式校验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * 字段正则表达式校验证提示tip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tip")
    @Expose
    private String Tip;

    /**
     * Get 类型ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeId 类型ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 类型ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeId 类型ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 属性名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropName 属性名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropName() {
        return this.PropName;
    }

    /**
     * Set 属性名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropName 属性名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropName(String PropName) {
        this.PropName = PropName;
    }

    /**
     * Get 属性标签(ui展示用)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropLabel 属性标签(ui展示用)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropLabel() {
        return this.PropLabel;
    }

    /**
     * Set 属性标签(ui展示用)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropLabel 属性标签(ui展示用)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropLabel(String PropLabel) {
        this.PropLabel = PropLabel;
    }

    /**
     * Get 缺省标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultFlag 缺省标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultFlag() {
        return this.DefaultFlag;
    }

    /**
     * Set 缺省标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultFlag 缺省标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultFlag(Long DefaultFlag) {
        this.DefaultFlag = DefaultFlag;
    }

    /**
     * Get 可视标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VisibleFlag 可视标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVisibleFlag() {
        return this.VisibleFlag;
    }

    /**
     * Set 可视标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param VisibleFlag 可视标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVisibleFlag(Long VisibleFlag) {
        this.VisibleFlag = VisibleFlag;
    }

    /**
     * Get 属性描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropDesc 属性描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropDesc() {
        return this.PropDesc;
    }

    /**
     * Set 属性描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropDesc 属性描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropDesc(String PropDesc) {
        this.PropDesc = PropDesc;
    }

    /**
     * Get 排列id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RankId 排列id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRankId() {
        return this.RankId;
    }

    /**
     * Set 排列id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RankId 排列id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRankId(Long RankId) {
        this.RankId = RankId;
    }

    /**
     * Get 控件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputType 控件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 控件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputType 控件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 值类型(integer，string)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueType 值类型(integer，string)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 值类型(integer，string)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueType 值类型(integer，string)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get 缺省值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValue 缺省值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 缺省值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValue 缺省值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 候选值列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CandidateValues 候选值列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCandidateValues() {
        return this.CandidateValues;
    }

    /**
     * Set 候选值列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CandidateValues 候选值列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCandidateValues(String CandidateValues) {
        this.CandidateValues = CandidateValues;
    }

    /**
     * Get 是否必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsMandatory 是否必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsMandatory() {
        return this.IsMandatory;
    }

    /**
     * Set 是否必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsMandatory 是否必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsMandatory(Long IsMandatory) {
        this.IsMandatory = IsMandatory;
    }

    /**
     * Get 最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxValue 最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set 最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxValue 最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxValue(Long MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get 最小值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinValue 最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinValue() {
        return this.MinValue;
    }

    /**
     * Set 最小值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinValue 最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinValue(Long MinValue) {
        this.MinValue = MinValue;
    }

    /**
     * Get 配置等级(1-普通，2-高级，3-管理员)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfLevel 配置等级(1-普通，2-高级，3-管理员)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfLevel() {
        return this.ConfLevel;
    }

    /**
     * Set 配置等级(1-普通，2-高级，3-管理员)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfLevel 配置等级(1-普通，2-高级，3-管理员)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfLevel(Long ConfLevel) {
        this.ConfLevel = ConfLevel;
    }

    /**
     * Get 候选文本列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CandidateTexts 候选文本列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCandidateTexts() {
        return this.CandidateTexts;
    }

    /**
     * Set 候选文本列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CandidateTexts 候选文本列表(，分隔)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCandidateTexts(String CandidateTexts) {
        this.CandidateTexts = CandidateTexts;
    }

    /**
     * Get 复制时是否需要修改
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CopyKey 复制时是否需要修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCopyKey() {
        return this.CopyKey;
    }

    /**
     * Set 复制时是否需要修改
注意：此字段可能返回 null，表示取不到有效值。
     * @param CopyKey 复制时是否需要修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCopyKey(Long CopyKey) {
        this.CopyKey = CopyKey;
    }

    /**
     * Get 字段正则表达式校验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regex 字段正则表达式校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 字段正则表达式校验
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regex 字段正则表达式校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get 字段正则表达式校验证提示tip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tip 字段正则表达式校验证提示tip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTip() {
        return this.Tip;
    }

    /**
     * Set 字段正则表达式校验证提示tip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tip 字段正则表达式校验证提示tip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTip(String Tip) {
        this.Tip = Tip;
    }

    public TaskTypeExtVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeExtVO(TaskTypeExtVO source) {
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.PropName != null) {
            this.PropName = new String(source.PropName);
        }
        if (source.PropLabel != null) {
            this.PropLabel = new String(source.PropLabel);
        }
        if (source.DefaultFlag != null) {
            this.DefaultFlag = new Long(source.DefaultFlag);
        }
        if (source.VisibleFlag != null) {
            this.VisibleFlag = new Long(source.VisibleFlag);
        }
        if (source.PropDesc != null) {
            this.PropDesc = new String(source.PropDesc);
        }
        if (source.RankId != null) {
            this.RankId = new Long(source.RankId);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.CandidateValues != null) {
            this.CandidateValues = new String(source.CandidateValues);
        }
        if (source.IsMandatory != null) {
            this.IsMandatory = new Long(source.IsMandatory);
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Long(source.MaxValue);
        }
        if (source.MinValue != null) {
            this.MinValue = new Long(source.MinValue);
        }
        if (source.ConfLevel != null) {
            this.ConfLevel = new Long(source.ConfLevel);
        }
        if (source.CandidateTexts != null) {
            this.CandidateTexts = new String(source.CandidateTexts);
        }
        if (source.CopyKey != null) {
            this.CopyKey = new Long(source.CopyKey);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.Tip != null) {
            this.Tip = new String(source.Tip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "PropName", this.PropName);
        this.setParamSimple(map, prefix + "PropLabel", this.PropLabel);
        this.setParamSimple(map, prefix + "DefaultFlag", this.DefaultFlag);
        this.setParamSimple(map, prefix + "VisibleFlag", this.VisibleFlag);
        this.setParamSimple(map, prefix + "PropDesc", this.PropDesc);
        this.setParamSimple(map, prefix + "RankId", this.RankId);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "CandidateValues", this.CandidateValues);
        this.setParamSimple(map, prefix + "IsMandatory", this.IsMandatory);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "MinValue", this.MinValue);
        this.setParamSimple(map, prefix + "ConfLevel", this.ConfLevel);
        this.setParamSimple(map, prefix + "CandidateTexts", this.CandidateTexts);
        this.setParamSimple(map, prefix + "CopyKey", this.CopyKey);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "Tip", this.Tip);

    }
}

