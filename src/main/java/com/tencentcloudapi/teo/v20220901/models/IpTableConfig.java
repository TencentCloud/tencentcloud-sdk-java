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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpTableConfig extends AbstractModel{

    /**
    * 开关，取值有：
<li>on：开启；</li>
<li>off：关闭；</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 基础管控规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpTableRules")
    @Expose
    private IpTableRule [] IpTableRules;

    /**
     * Get 开关，取值有：
<li>on：开启；</li>
<li>off：关闭；</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关，取值有：
<li>on：开启；</li>
<li>off：关闭；</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 基础管控规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpTableRules 基础管控规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpTableRule [] getIpTableRules() {
        return this.IpTableRules;
    }

    /**
     * Set 基础管控规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpTableRules 基础管控规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpTableRules(IpTableRule [] IpTableRules) {
        this.IpTableRules = IpTableRules;
    }

    public IpTableConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpTableConfig(IpTableConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.IpTableRules != null) {
            this.IpTableRules = new IpTableRule[source.IpTableRules.length];
            for (int i = 0; i < source.IpTableRules.length; i++) {
                this.IpTableRules[i] = new IpTableRule(source.IpTableRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "IpTableRules.", this.IpTableRules);

    }
}

