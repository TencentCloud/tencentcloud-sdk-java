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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PasswordComplexity extends AbstractModel {

    /**
    * <p>是否开启密码复杂度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>大写和小写字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MixedCaseCount")
    @Expose
    private Long MixedCaseCount;

    /**
    * <p>数字字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberCount")
    @Expose
    private Long NumberCount;

    /**
    * <p>特殊字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecialCharCount")
    @Expose
    private Long SpecialCharCount;

    /**
    * <p>密码的最小长度</p><p>取值范围：[8, 64]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
     * Get <p>是否开启密码复杂度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable <p>是否开启密码复杂度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启密码复杂度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable <p>是否开启密码复杂度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>大写和小写字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MixedCaseCount <p>大写和小写字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMixedCaseCount() {
        return this.MixedCaseCount;
    }

    /**
     * Set <p>大写和小写字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MixedCaseCount <p>大写和小写字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMixedCaseCount(Long MixedCaseCount) {
        this.MixedCaseCount = MixedCaseCount;
    }

    /**
     * Get <p>数字字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberCount <p>数字字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumberCount() {
        return this.NumberCount;
    }

    /**
     * Set <p>数字字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberCount <p>数字字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberCount(Long NumberCount) {
        this.NumberCount = NumberCount;
    }

    /**
     * Get <p>特殊字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecialCharCount <p>特殊字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSpecialCharCount() {
        return this.SpecialCharCount;
    }

    /**
     * Set <p>特殊字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecialCharCount <p>特殊字符的最小长度</p><p>取值范围：[1, 16]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecialCharCount(Long SpecialCharCount) {
        this.SpecialCharCount = SpecialCharCount;
    }

    /**
     * Get <p>密码的最小长度</p><p>取值范围：[8, 64]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Length <p>密码的最小长度</p><p>取值范围：[8, 64]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set <p>密码的最小长度</p><p>取值范围：[8, 64]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Length <p>密码的最小长度</p><p>取值范围：[8, 64]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    public PasswordComplexity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PasswordComplexity(PasswordComplexity source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.MixedCaseCount != null) {
            this.MixedCaseCount = new Long(source.MixedCaseCount);
        }
        if (source.NumberCount != null) {
            this.NumberCount = new Long(source.NumberCount);
        }
        if (source.SpecialCharCount != null) {
            this.SpecialCharCount = new Long(source.SpecialCharCount);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "MixedCaseCount", this.MixedCaseCount);
        this.setParamSimple(map, prefix + "NumberCount", this.NumberCount);
        this.setParamSimple(map, prefix + "SpecialCharCount", this.SpecialCharCount);
        this.setParamSimple(map, prefix + "Length", this.Length);

    }
}

