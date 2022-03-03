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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditPolicy extends AbstractModel{

    /**
    * 审计策略 ID。
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 审计策略的状态。可能返回的值为：
"creating" - 创建中;
"running" - 运行中;
"paused" - 暂停中;
"failed" - 创建失败。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数据库实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 审计策略创建时间。格式为 : "2019-03-20 17:09:13"。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 审计策略最后修改时间。格式为 : "2019-03-20 17:09:13"。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 审计策略名称。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 审计规则 ID。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 数据库实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 审计策略 ID。 
     * @return PolicyId 审计策略 ID。
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 审计策略 ID。
     * @param PolicyId 审计策略 ID。
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 审计策略的状态。可能返回的值为：
"creating" - 创建中;
"running" - 运行中;
"paused" - 暂停中;
"failed" - 创建失败。 
     * @return Status 审计策略的状态。可能返回的值为：
"creating" - 创建中;
"running" - 运行中;
"paused" - 暂停中;
"failed" - 创建失败。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 审计策略的状态。可能返回的值为：
"creating" - 创建中;
"running" - 运行中;
"paused" - 暂停中;
"failed" - 创建失败。
     * @param Status 审计策略的状态。可能返回的值为：
"creating" - 创建中;
"running" - 运行中;
"paused" - 暂停中;
"failed" - 创建失败。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数据库实例 ID。 
     * @return InstanceId 数据库实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库实例 ID。
     * @param InstanceId 数据库实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 审计策略创建时间。格式为 : "2019-03-20 17:09:13"。 
     * @return CreateTime 审计策略创建时间。格式为 : "2019-03-20 17:09:13"。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 审计策略创建时间。格式为 : "2019-03-20 17:09:13"。
     * @param CreateTime 审计策略创建时间。格式为 : "2019-03-20 17:09:13"。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 审计策略最后修改时间。格式为 : "2019-03-20 17:09:13"。 
     * @return ModifyTime 审计策略最后修改时间。格式为 : "2019-03-20 17:09:13"。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 审计策略最后修改时间。格式为 : "2019-03-20 17:09:13"。
     * @param ModifyTime 审计策略最后修改时间。格式为 : "2019-03-20 17:09:13"。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 审计策略名称。 
     * @return PolicyName 审计策略名称。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 审计策略名称。
     * @param PolicyName 审计策略名称。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 审计规则 ID。 
     * @return RuleId 审计规则 ID。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 审计规则 ID。
     * @param RuleId 审计规则 ID。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 数据库实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 数据库实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 数据库实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 数据库实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public AuditPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditPolicy(AuditPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

