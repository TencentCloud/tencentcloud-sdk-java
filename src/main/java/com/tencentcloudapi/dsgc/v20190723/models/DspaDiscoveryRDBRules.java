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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryRDBRules extends AbstractModel{

    /**
    * 规则状态；0 不启用, 1 启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchOperator")
    @Expose
    private String MatchOperator;

    /**
    * 字段名包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaRule")
    @Expose
    private DspaDiscoveryDataRules MetaRule;

    /**
    * 内容包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentRule")
    @Expose
    private DspaDiscoveryDataRules ContentRule;

    /**
     * Get 规则状态；0 不启用, 1 启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 规则状态；0 不启用, 1 启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态；0 不启用, 1 启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 规则状态；0 不启用, 1 启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchOperator 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchOperator() {
        return this.MatchOperator;
    }

    /**
     * Set 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchOperator 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchOperator(String MatchOperator) {
        this.MatchOperator = MatchOperator;
    }

    /**
     * Get 字段名包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaRule 字段名包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspaDiscoveryDataRules getMetaRule() {
        return this.MetaRule;
    }

    /**
     * Set 字段名包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaRule 字段名包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaRule(DspaDiscoveryDataRules MetaRule) {
        this.MetaRule = MetaRule;
    }

    /**
     * Get 内容包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentRule 内容包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspaDiscoveryDataRules getContentRule() {
        return this.ContentRule;
    }

    /**
     * Set 内容包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentRule 内容包含规则，最大支持选择9项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentRule(DspaDiscoveryDataRules ContentRule) {
        this.ContentRule = ContentRule;
    }

    public DspaDiscoveryRDBRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryRDBRules(DspaDiscoveryRDBRules source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MatchOperator != null) {
            this.MatchOperator = new String(source.MatchOperator);
        }
        if (source.MetaRule != null) {
            this.MetaRule = new DspaDiscoveryDataRules(source.MetaRule);
        }
        if (source.ContentRule != null) {
            this.ContentRule = new DspaDiscoveryDataRules(source.ContentRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MatchOperator", this.MatchOperator);
        this.setParamObj(map, prefix + "MetaRule.", this.MetaRule);
        this.setParamObj(map, prefix + "ContentRule.", this.ContentRule);

    }
}

