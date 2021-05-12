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

public class UnitRuleTag extends AbstractModel{

    /**
    * 标签类型 : U(用户标签)
    */
    @SerializedName("TagType")
    @Expose
    private String TagType;

    /**
    * 标签名
    */
    @SerializedName("TagField")
    @Expose
    private String TagField;

    /**
    * 操作符:IN/NOT_IN/EQUAL/NOT_EQUAL/REGEX
    */
    @SerializedName("TagOperator")
    @Expose
    private String TagOperator;

    /**
    * 标签值
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 单元化规则项ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitRuleItemId")
    @Expose
    private String UnitRuleItemId;

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 标签类型 : U(用户标签) 
     * @return TagType 标签类型 : U(用户标签)
     */
    public String getTagType() {
        return this.TagType;
    }

    /**
     * Set 标签类型 : U(用户标签)
     * @param TagType 标签类型 : U(用户标签)
     */
    public void setTagType(String TagType) {
        this.TagType = TagType;
    }

    /**
     * Get 标签名 
     * @return TagField 标签名
     */
    public String getTagField() {
        return this.TagField;
    }

    /**
     * Set 标签名
     * @param TagField 标签名
     */
    public void setTagField(String TagField) {
        this.TagField = TagField;
    }

    /**
     * Get 操作符:IN/NOT_IN/EQUAL/NOT_EQUAL/REGEX 
     * @return TagOperator 操作符:IN/NOT_IN/EQUAL/NOT_EQUAL/REGEX
     */
    public String getTagOperator() {
        return this.TagOperator;
    }

    /**
     * Set 操作符:IN/NOT_IN/EQUAL/NOT_EQUAL/REGEX
     * @param TagOperator 操作符:IN/NOT_IN/EQUAL/NOT_EQUAL/REGEX
     */
    public void setTagOperator(String TagOperator) {
        this.TagOperator = TagOperator;
    }

    /**
     * Get 标签值 
     * @return TagValue 标签值
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签值
     * @param TagValue 标签值
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 单元化规则项ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitRuleItemId 单元化规则项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnitRuleItemId() {
        return this.UnitRuleItemId;
    }

    /**
     * Set 单元化规则项ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitRuleItemId 单元化规则项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitRuleItemId(String UnitRuleItemId) {
        this.UnitRuleItemId = UnitRuleItemId;
    }

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public UnitRuleTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnitRuleTag(UnitRuleTag source) {
        if (source.TagType != null) {
            this.TagType = new String(source.TagType);
        }
        if (source.TagField != null) {
            this.TagField = new String(source.TagField);
        }
        if (source.TagOperator != null) {
            this.TagOperator = new String(source.TagOperator);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.UnitRuleItemId != null) {
            this.UnitRuleItemId = new String(source.UnitRuleItemId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagType", this.TagType);
        this.setParamSimple(map, prefix + "TagField", this.TagField);
        this.setParamSimple(map, prefix + "TagOperator", this.TagOperator);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "UnitRuleItemId", this.UnitRuleItemId);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

