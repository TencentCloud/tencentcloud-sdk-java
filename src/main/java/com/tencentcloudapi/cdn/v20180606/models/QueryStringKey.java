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

public class QueryStringKey extends AbstractModel {

    /**
    * CacheKey是否由QueryString组成配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reorder")
    @Expose
    private String Reorder;

    /**
    * 使用/排除部分url参数，取值有：
includeAll：包含所有
excludeAll：排除所有
includeCustom：自定义包含
excludeCustom：自定义排除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 使用/排除的url参数数组，';' 分割
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get CacheKey是否由QueryString组成配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch CacheKey是否由QueryString组成配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set CacheKey是否由QueryString组成配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch CacheKey是否由QueryString组成配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reorder 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReorder() {
        return this.Reorder;
    }

    /**
     * Set 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reorder 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReorder(String Reorder) {
        this.Reorder = Reorder;
    }

    /**
     * Get 使用/排除部分url参数，取值有：
includeAll：包含所有
excludeAll：排除所有
includeCustom：自定义包含
excludeCustom：自定义排除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 使用/排除部分url参数，取值有：
includeAll：包含所有
excludeAll：排除所有
includeCustom：自定义包含
excludeCustom：自定义排除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 使用/排除部分url参数，取值有：
includeAll：包含所有
excludeAll：排除所有
includeCustom：自定义包含
excludeCustom：自定义排除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 使用/排除部分url参数，取值有：
includeAll：包含所有
excludeAll：排除所有
includeCustom：自定义包含
excludeCustom：自定义排除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 使用/排除的url参数数组，';' 分割
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 使用/排除的url参数数组，';' 分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 使用/排除的url参数数组，';' 分割
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 使用/排除的url参数数组，';' 分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public QueryStringKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryStringKey(QueryStringKey source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Reorder != null) {
            this.Reorder = new String(source.Reorder);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Reorder", this.Reorder);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

