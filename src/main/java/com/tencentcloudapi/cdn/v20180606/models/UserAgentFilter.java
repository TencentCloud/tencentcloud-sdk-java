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

public class UserAgentFilter extends AbstractModel {

    /**
    * UserAgent黑白名单配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * UA黑白名单生效规则列表，不能超过10条规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterRules")
    @Expose
    private UserAgentFilterRule [] FilterRules;

    /**
     * Get UserAgent黑白名单配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch UserAgent黑白名单配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set UserAgent黑白名单配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch UserAgent黑白名单配置开关，取值有：
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get UA黑白名单生效规则列表，不能超过10条规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterRules UA黑白名单生效规则列表，不能超过10条规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserAgentFilterRule [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set UA黑白名单生效规则列表，不能超过10条规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterRules UA黑白名单生效规则列表，不能超过10条规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterRules(UserAgentFilterRule [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    public UserAgentFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserAgentFilter(UserAgentFilter source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FilterRules != null) {
            this.FilterRules = new UserAgentFilterRule[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new UserAgentFilterRule(source.FilterRules[i]);
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

