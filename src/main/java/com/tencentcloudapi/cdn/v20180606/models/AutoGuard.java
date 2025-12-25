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

public class AutoGuard extends AbstractModel {

    /**
    * 流量防盗刷配置开关，取值有： on：开启 off：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 流量防盗刷配置规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterRules")
    @Expose
    private FilterRules [] FilterRules;

    /**
     * Get 流量防盗刷配置开关，取值有： on：开启 off：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 流量防盗刷配置开关，取值有： on：开启 off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 流量防盗刷配置开关，取值有： on：开启 off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 流量防盗刷配置开关，取值有： on：开启 off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 流量防盗刷配置规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterRules 流量防盗刷配置规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterRules [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set 流量防盗刷配置规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterRules 流量防盗刷配置规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterRules(FilterRules [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    public AutoGuard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoGuard(AutoGuard source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FilterRules != null) {
            this.FilterRules = new FilterRules[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new FilterRules(source.FilterRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);

    }
}

