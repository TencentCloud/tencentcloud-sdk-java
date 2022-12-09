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

public class DescribeSecurityRuleIdResponse extends AbstractModel{

    /**
    * 托管规则类型的规则列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WafGroupRules")
    @Expose
    private WafGroupRule [] WafGroupRules;

    /**
    * 自定义规则、速率限制、Bot规则的规则列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityRules")
    @Expose
    private SecurityRule [] SecurityRules;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 托管规则类型的规则列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WafGroupRules 托管规则类型的规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WafGroupRule [] getWafGroupRules() {
        return this.WafGroupRules;
    }

    /**
     * Set 托管规则类型的规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WafGroupRules 托管规则类型的规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWafGroupRules(WafGroupRule [] WafGroupRules) {
        this.WafGroupRules = WafGroupRules;
    }

    /**
     * Get 自定义规则、速率限制、Bot规则的规则列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityRules 自定义规则、速率限制、Bot规则的规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityRule [] getSecurityRules() {
        return this.SecurityRules;
    }

    /**
     * Set 自定义规则、速率限制、Bot规则的规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityRules 自定义规则、速率限制、Bot规则的规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityRules(SecurityRule [] SecurityRules) {
        this.SecurityRules = SecurityRules;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecurityRuleIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityRuleIdResponse(DescribeSecurityRuleIdResponse source) {
        if (source.WafGroupRules != null) {
            this.WafGroupRules = new WafGroupRule[source.WafGroupRules.length];
            for (int i = 0; i < source.WafGroupRules.length; i++) {
                this.WafGroupRules[i] = new WafGroupRule(source.WafGroupRules[i]);
            }
        }
        if (source.SecurityRules != null) {
            this.SecurityRules = new SecurityRule[source.SecurityRules.length];
            for (int i = 0; i < source.SecurityRules.length; i++) {
                this.SecurityRules[i] = new SecurityRule(source.SecurityRules[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WafGroupRules.", this.WafGroupRules);
        this.setParamArrayObj(map, prefix + "SecurityRules.", this.SecurityRules);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

