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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Relabeling extends AbstractModel {

    /**
    * 基于正则表达式匹配执行的动作。
- replace: Label替换, 必填: SourceLabels, Separator, Regex, TargetLabel, Replacement
- labeldrop: 丢弃Label, 必填: Regex
- labelkeep: 保留Label, 必填: Regex
- lowercase: 小写化, 必填: SourceLabels, Separator, TargetLabel
- uppercase: 大写化, 必填: SourceLabels, Separator, TargetLabel
- dropequal: 丢弃指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- keepequal: 保留指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- drop: 丢弃指标-正则匹配, 必填: SourceLabels, Separator, Regex
- keep: 保留指标-正则匹配, 必填: SourceLabels, Separator, Regex
- hashmod:哈希取模, 必填: SourceLabels, Separator, TargetLabel, Modulus
- labelmap:Label映射, 必填: Regex, Replacement
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 原始label
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceLabels")
    @Expose
    private String [] SourceLabels;

    /**
    * 原始label连接符。 必填时不能为空串， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Separator")
    @Expose
    private String Separator;

    /**
    * 目标label。必填时不能为空串，校验格式：`^[a-zA-Z_][a-zA-Z0-9_]*$` ， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetLabel")
    @Expose
    private String TargetLabel;

    /**
    * 替换值。如果正则表达式匹配，则对其执行替换操作。
- 必填时不能为空串，长度不能超过256
- 当action为LabelMap时， Replacement 校验格式：`^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replacement")
    @Expose
    private String Replacement;

    /**
    * 正则表达式。提取与之匹配值。必填时不能为空串，校验必须是一个合法的 RE2 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * 获取源标签值的哈希值。必填时不能为空,不能为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Modulus")
    @Expose
    private Long Modulus;

    /**
     * Get 基于正则表达式匹配执行的动作。
- replace: Label替换, 必填: SourceLabels, Separator, Regex, TargetLabel, Replacement
- labeldrop: 丢弃Label, 必填: Regex
- labelkeep: 保留Label, 必填: Regex
- lowercase: 小写化, 必填: SourceLabels, Separator, TargetLabel
- uppercase: 大写化, 必填: SourceLabels, Separator, TargetLabel
- dropequal: 丢弃指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- keepequal: 保留指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- drop: 丢弃指标-正则匹配, 必填: SourceLabels, Separator, Regex
- keep: 保留指标-正则匹配, 必填: SourceLabels, Separator, Regex
- hashmod:哈希取模, 必填: SourceLabels, Separator, TargetLabel, Modulus
- labelmap:Label映射, 必填: Regex, Replacement
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 基于正则表达式匹配执行的动作。
- replace: Label替换, 必填: SourceLabels, Separator, Regex, TargetLabel, Replacement
- labeldrop: 丢弃Label, 必填: Regex
- labelkeep: 保留Label, 必填: Regex
- lowercase: 小写化, 必填: SourceLabels, Separator, TargetLabel
- uppercase: 大写化, 必填: SourceLabels, Separator, TargetLabel
- dropequal: 丢弃指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- keepequal: 保留指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- drop: 丢弃指标-正则匹配, 必填: SourceLabels, Separator, Regex
- keep: 保留指标-正则匹配, 必填: SourceLabels, Separator, Regex
- hashmod:哈希取模, 必填: SourceLabels, Separator, TargetLabel, Modulus
- labelmap:Label映射, 必填: Regex, Replacement
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 基于正则表达式匹配执行的动作。
- replace: Label替换, 必填: SourceLabels, Separator, Regex, TargetLabel, Replacement
- labeldrop: 丢弃Label, 必填: Regex
- labelkeep: 保留Label, 必填: Regex
- lowercase: 小写化, 必填: SourceLabels, Separator, TargetLabel
- uppercase: 大写化, 必填: SourceLabels, Separator, TargetLabel
- dropequal: 丢弃指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- keepequal: 保留指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- drop: 丢弃指标-正则匹配, 必填: SourceLabels, Separator, Regex
- keep: 保留指标-正则匹配, 必填: SourceLabels, Separator, Regex
- hashmod:哈希取模, 必填: SourceLabels, Separator, TargetLabel, Modulus
- labelmap:Label映射, 必填: Regex, Replacement
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 基于正则表达式匹配执行的动作。
- replace: Label替换, 必填: SourceLabels, Separator, Regex, TargetLabel, Replacement
- labeldrop: 丢弃Label, 必填: Regex
- labelkeep: 保留Label, 必填: Regex
- lowercase: 小写化, 必填: SourceLabels, Separator, TargetLabel
- uppercase: 大写化, 必填: SourceLabels, Separator, TargetLabel
- dropequal: 丢弃指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- keepequal: 保留指标-完全匹配, 必填: SourceLabels, Separator, TargetLabel
- drop: 丢弃指标-正则匹配, 必填: SourceLabels, Separator, Regex
- keep: 保留指标-正则匹配, 必填: SourceLabels, Separator, Regex
- hashmod:哈希取模, 必填: SourceLabels, Separator, TargetLabel, Modulus
- labelmap:Label映射, 必填: Regex, Replacement
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 原始label
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceLabels 原始label
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSourceLabels() {
        return this.SourceLabels;
    }

    /**
     * Set 原始label
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceLabels 原始label
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceLabels(String [] SourceLabels) {
        this.SourceLabels = SourceLabels;
    }

    /**
     * Get 原始label连接符。 必填时不能为空串， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Separator 原始label连接符。 必填时不能为空串， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeparator() {
        return this.Separator;
    }

    /**
     * Set 原始label连接符。 必填时不能为空串， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。
     * @param Separator 原始label连接符。 必填时不能为空串， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeparator(String Separator) {
        this.Separator = Separator;
    }

    /**
     * Get 目标label。必填时不能为空串，校验格式：`^[a-zA-Z_][a-zA-Z0-9_]*$` ， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetLabel 目标label。必填时不能为空串，校验格式：`^[a-zA-Z_][a-zA-Z0-9_]*$` ， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetLabel() {
        return this.TargetLabel;
    }

    /**
     * Set 目标label。必填时不能为空串，校验格式：`^[a-zA-Z_][a-zA-Z0-9_]*$` ， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetLabel 目标label。必填时不能为空串，校验格式：`^[a-zA-Z_][a-zA-Z0-9_]*$` ， 长度不能超过256
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetLabel(String TargetLabel) {
        this.TargetLabel = TargetLabel;
    }

    /**
     * Get 替换值。如果正则表达式匹配，则对其执行替换操作。
- 必填时不能为空串，长度不能超过256
- 当action为LabelMap时， Replacement 校验格式：`^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replacement 替换值。如果正则表达式匹配，则对其执行替换操作。
- 必填时不能为空串，长度不能超过256
- 当action为LabelMap时， Replacement 校验格式：`^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplacement() {
        return this.Replacement;
    }

    /**
     * Set 替换值。如果正则表达式匹配，则对其执行替换操作。
- 必填时不能为空串，长度不能超过256
- 当action为LabelMap时， Replacement 校验格式：`^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replacement 替换值。如果正则表达式匹配，则对其执行替换操作。
- 必填时不能为空串，长度不能超过256
- 当action为LabelMap时， Replacement 校验格式：`^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplacement(String Replacement) {
        this.Replacement = Replacement;
    }

    /**
     * Get 正则表达式。提取与之匹配值。必填时不能为空串，校验必须是一个合法的 RE2 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regex 正则表达式。提取与之匹配值。必填时不能为空串，校验必须是一个合法的 RE2 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 正则表达式。提取与之匹配值。必填时不能为空串，校验必须是一个合法的 RE2 
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regex 正则表达式。提取与之匹配值。必填时不能为空串，校验必须是一个合法的 RE2 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get 获取源标签值的哈希值。必填时不能为空,不能为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Modulus 获取源标签值的哈希值。必填时不能为空,不能为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModulus() {
        return this.Modulus;
    }

    /**
     * Set 获取源标签值的哈希值。必填时不能为空,不能为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Modulus 获取源标签值的哈希值。必填时不能为空,不能为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModulus(Long Modulus) {
        this.Modulus = Modulus;
    }

    public Relabeling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Relabeling(Relabeling source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.SourceLabels != null) {
            this.SourceLabels = new String[source.SourceLabels.length];
            for (int i = 0; i < source.SourceLabels.length; i++) {
                this.SourceLabels[i] = new String(source.SourceLabels[i]);
            }
        }
        if (source.Separator != null) {
            this.Separator = new String(source.Separator);
        }
        if (source.TargetLabel != null) {
            this.TargetLabel = new String(source.TargetLabel);
        }
        if (source.Replacement != null) {
            this.Replacement = new String(source.Replacement);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.Modulus != null) {
            this.Modulus = new Long(source.Modulus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "SourceLabels.", this.SourceLabels);
        this.setParamSimple(map, prefix + "Separator", this.Separator);
        this.setParamSimple(map, prefix + "TargetLabel", this.TargetLabel);
        this.setParamSimple(map, prefix + "Replacement", this.Replacement);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "Modulus", this.Modulus);

    }
}

