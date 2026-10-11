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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataMaskStrategyInfo extends AbstractModel {

    /**
    * 策略名称，必填，长度 1~128 字符，同一项目下唯一
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 用户组脱敏规则列表，必填，至少包含一条规则。每条规则描述某个用户组对应的脱敏方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Groups")
    @Expose
    private DataMaskGroup [] Groups;

    /**
    * 策略类型，必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 策略描述，可选，最大 512 字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyDesc")
    @Expose
    private String StrategyDesc;

    /**
    * 策略ID
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 该脱敏策略当前绑定的敏感标签列表。使用场景：表详情弹窗回显“此策略关联了哪些敏感标签”，前端可 hover 展示。数据源：catalog-manager 域 meta_label_mask_policy_rel JOIN meta_biz_label，按 policy_id 反查。未关联任何敏感标签时为空数组。前置条件：仅当所在 ColumnInfo.DataMaskStrategyInfo 非空时才有查询意义。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private DataMaskLabelInfo [] Labels;

    /**
     * Get 策略名称，必填，长度 1~128 字符，同一项目下唯一
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyName 策略名称，必填，长度 1~128 字符，同一项目下唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称，必填，长度 1~128 字符，同一项目下唯一
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyName 策略名称，必填，长度 1~128 字符，同一项目下唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 用户组脱敏规则列表，必填，至少包含一条规则。每条规则描述某个用户组对应的脱敏方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Groups 用户组脱敏规则列表，必填，至少包含一条规则。每条规则描述某个用户组对应的脱敏方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataMaskGroup [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 用户组脱敏规则列表，必填，至少包含一条规则。每条规则描述某个用户组对应的脱敏方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param Groups 用户组脱敏规则列表，必填，至少包含一条规则。每条规则描述某个用户组对应的脱敏方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroups(DataMaskGroup [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 策略类型，必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyType 策略类型，必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型，必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏）
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyType 策略类型，必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 策略描述，可选，最大 512 字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyDesc 策略描述，可选，最大 512 字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyDesc() {
        return this.StrategyDesc;
    }

    /**
     * Set 策略描述，可选，最大 512 字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyDesc 策略描述，可选，最大 512 字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyDesc(String StrategyDesc) {
        this.StrategyDesc = StrategyDesc;
    }

    /**
     * Get 策略ID 
     * @return StrategyId 策略ID
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略ID
     * @param StrategyId 策略ID
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 该脱敏策略当前绑定的敏感标签列表。使用场景：表详情弹窗回显“此策略关联了哪些敏感标签”，前端可 hover 展示。数据源：catalog-manager 域 meta_label_mask_policy_rel JOIN meta_biz_label，按 policy_id 反查。未关联任何敏感标签时为空数组。前置条件：仅当所在 ColumnInfo.DataMaskStrategyInfo 非空时才有查询意义。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 该脱敏策略当前绑定的敏感标签列表。使用场景：表详情弹窗回显“此策略关联了哪些敏感标签”，前端可 hover 展示。数据源：catalog-manager 域 meta_label_mask_policy_rel JOIN meta_biz_label，按 policy_id 反查。未关联任何敏感标签时为空数组。前置条件：仅当所在 ColumnInfo.DataMaskStrategyInfo 非空时才有查询意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataMaskLabelInfo [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 该脱敏策略当前绑定的敏感标签列表。使用场景：表详情弹窗回显“此策略关联了哪些敏感标签”，前端可 hover 展示。数据源：catalog-manager 域 meta_label_mask_policy_rel JOIN meta_biz_label，按 policy_id 反查。未关联任何敏感标签时为空数组。前置条件：仅当所在 ColumnInfo.DataMaskStrategyInfo 非空时才有查询意义。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 该脱敏策略当前绑定的敏感标签列表。使用场景：表详情弹窗回显“此策略关联了哪些敏感标签”，前端可 hover 展示。数据源：catalog-manager 域 meta_label_mask_policy_rel JOIN meta_biz_label，按 policy_id 反查。未关联任何敏感标签时为空数组。前置条件：仅当所在 ColumnInfo.DataMaskStrategyInfo 非空时才有查询意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(DataMaskLabelInfo [] Labels) {
        this.Labels = Labels;
    }

    public DataMaskStrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataMaskStrategyInfo(DataMaskStrategyInfo source) {
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.Groups != null) {
            this.Groups = new DataMaskGroup[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new DataMaskGroup(source.Groups[i]);
            }
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.StrategyDesc != null) {
            this.StrategyDesc = new String(source.StrategyDesc);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.Labels != null) {
            this.Labels = new DataMaskLabelInfo[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new DataMaskLabelInfo(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyDesc", this.StrategyDesc);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

