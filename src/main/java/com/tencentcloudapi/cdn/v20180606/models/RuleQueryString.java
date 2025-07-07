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

public class RuleQueryString extends AbstractModel {

    /**
    * 路径保留参数配置开关，取值有：
on：开启，CacheKey由QueryString组成
off：关闭，CacheKey不由QueryString组成

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * includeCustom 包含部分url参数
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
     * Get 路径保留参数配置开关，取值有：
on：开启，CacheKey由QueryString组成
off：关闭，CacheKey不由QueryString组成

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 路径保留参数配置开关，取值有：
on：开启，CacheKey由QueryString组成
off：关闭，CacheKey不由QueryString组成

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 路径保留参数配置开关，取值有：
on：开启，CacheKey由QueryString组成
off：关闭，CacheKey不由QueryString组成

注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 路径保留参数配置开关，取值有：
on：开启，CacheKey由QueryString组成
off：关闭，CacheKey不由QueryString组成

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get includeCustom 包含部分url参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action includeCustom 包含部分url参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set includeCustom 包含部分url参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action includeCustom 包含部分url参数
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

    public RuleQueryString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleQueryString(RuleQueryString source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
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
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

