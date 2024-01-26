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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomWhiteRule extends AbstractModel {

    /**
    * 访问源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * 访问目的
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstIP")
    @Expose
    private String DstIP;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdsRuleName")
    @Expose
    private String IdsRuleName;

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdsRuleId")
    @Expose
    private String IdsRuleId;

    /**
     * Get 访问源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcIP 访问源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set 访问源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcIP 访问源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get 访问目的
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstIP 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstIP() {
        return this.DstIP;
    }

    /**
     * Set 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstIP 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstIP(String DstIP) {
        this.DstIP = DstIP;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdsRuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdsRuleName() {
        return this.IdsRuleName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdsRuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdsRuleName(String IdsRuleName) {
        this.IdsRuleName = IdsRuleName;
    }

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdsRuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdsRuleId() {
        return this.IdsRuleId;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdsRuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdsRuleId(String IdsRuleId) {
        this.IdsRuleId = IdsRuleId;
    }

    public CustomWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomWhiteRule(CustomWhiteRule source) {
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.DstIP != null) {
            this.DstIP = new String(source.DstIP);
        }
        if (source.IdsRuleName != null) {
            this.IdsRuleName = new String(source.IdsRuleName);
        }
        if (source.IdsRuleId != null) {
            this.IdsRuleId = new String(source.IdsRuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "DstIP", this.DstIP);
        this.setParamSimple(map, prefix + "IdsRuleName", this.IdsRuleName);
        this.setParamSimple(map, prefix + "IdsRuleId", this.IdsRuleId);

    }
}

