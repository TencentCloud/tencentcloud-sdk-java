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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaneRuleTag extends AbstractModel{

    /**
    * 标签ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * 标签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 标签操作符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagOperator")
    @Expose
    private String TagOperator;

    /**
    * 标签值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaneRuleId")
    @Expose
    private String LaneRuleId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 标签ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * Get 标签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagName 标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 标签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagName 标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 标签操作符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagOperator 标签操作符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagOperator() {
        return this.TagOperator;
    }

    /**
     * Set 标签操作符
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagOperator 标签操作符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagOperator(String TagOperator) {
        this.TagOperator = TagOperator;
    }

    /**
     * Get 标签值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagValue 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagValue 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaneRuleId 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaneRuleId() {
        return this.LaneRuleId;
    }

    /**
     * Set 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaneRuleId 泳道规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaneRuleId(String LaneRuleId) {
        this.LaneRuleId = LaneRuleId;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "TagOperator", this.TagOperator);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "LaneRuleId", this.LaneRuleId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

