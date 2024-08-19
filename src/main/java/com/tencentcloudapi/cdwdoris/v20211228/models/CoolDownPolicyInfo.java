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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoolDownPolicyInfo extends AbstractModel {

    /**
    * 策略名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * cooldown_ttl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CooldownDatetime")
    @Expose
    private String CooldownDatetime;

    /**
    * cooldown_datetime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CooldownTtl")
    @Expose
    private String CooldownTtl;

    /**
     * Get 策略名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get cooldown_ttl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CooldownDatetime cooldown_ttl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCooldownDatetime() {
        return this.CooldownDatetime;
    }

    /**
     * Set cooldown_ttl
注意：此字段可能返回 null，表示取不到有效值。
     * @param CooldownDatetime cooldown_ttl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCooldownDatetime(String CooldownDatetime) {
        this.CooldownDatetime = CooldownDatetime;
    }

    /**
     * Get cooldown_datetime
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CooldownTtl cooldown_datetime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCooldownTtl() {
        return this.CooldownTtl;
    }

    /**
     * Set cooldown_datetime
注意：此字段可能返回 null，表示取不到有效值。
     * @param CooldownTtl cooldown_datetime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCooldownTtl(String CooldownTtl) {
        this.CooldownTtl = CooldownTtl;
    }

    public CoolDownPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoolDownPolicyInfo(CoolDownPolicyInfo source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.CooldownDatetime != null) {
            this.CooldownDatetime = new String(source.CooldownDatetime);
        }
        if (source.CooldownTtl != null) {
            this.CooldownTtl = new String(source.CooldownTtl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "CooldownDatetime", this.CooldownDatetime);
        this.setParamSimple(map, prefix + "CooldownTtl", this.CooldownTtl);

    }
}

