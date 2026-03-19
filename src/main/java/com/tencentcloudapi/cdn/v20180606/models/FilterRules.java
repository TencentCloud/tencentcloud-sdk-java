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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterRules extends AbstractModel {

    /**
    * <p>封禁类型<br>forbidden - 封禁</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * <p>封禁规则类型<br>all - 全部请求<br>file - 指定后缀的文件请求</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>封禁规则路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get <p>封禁类型<br>forbidden - 封禁</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterType <p>封禁类型<br>forbidden - 封禁</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set <p>封禁类型<br>forbidden - 封禁</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterType <p>封禁类型<br>forbidden - 封禁</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get <p>封禁规则类型<br>all - 全部请求<br>file - 指定后缀的文件请求</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType <p>封禁规则类型<br>all - 全部请求<br>file - 指定后缀的文件请求</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>封禁规则类型<br>all - 全部请求<br>file - 指定后缀的文件请求</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType <p>封禁规则类型<br>all - 全部请求<br>file - 指定后缀的文件请求</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>封禁规则路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RulePaths <p>封禁规则路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set <p>封禁规则路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RulePaths <p>封禁规则路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    public FilterRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterRules(FilterRules source) {
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}

