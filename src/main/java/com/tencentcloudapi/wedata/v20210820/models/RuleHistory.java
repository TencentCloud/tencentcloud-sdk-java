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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleHistory extends AbstractModel{

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 变更时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlterTime")
    @Expose
    private String AlterTime;

    /**
    * 变更内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlterContent")
    @Expose
    private String AlterContent;

    /**
    * 操作账号UId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUserId")
    @Expose
    private Long OperatorUserId;

    /**
    * 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 变更时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlterTime 变更时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlterTime() {
        return this.AlterTime;
    }

    /**
     * Set 变更时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlterTime 变更时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlterTime(String AlterTime) {
        this.AlterTime = AlterTime;
    }

    /**
     * Get 变更内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlterContent 变更内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlterContent() {
        return this.AlterContent;
    }

    /**
     * Set 变更内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlterContent 变更内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlterContent(String AlterContent) {
        this.AlterContent = AlterContent;
    }

    /**
     * Get 操作账号UId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUserId 操作账号UId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperatorUserId() {
        return this.OperatorUserId;
    }

    /**
     * Set 操作账号UId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUserId 操作账号UId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUserId(Long OperatorUserId) {
        this.OperatorUserId = OperatorUserId;
    }

    /**
     * Get 操作人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorName 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorName 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    public RuleHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleHistory(RuleHistory source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.AlterTime != null) {
            this.AlterTime = new String(source.AlterTime);
        }
        if (source.AlterContent != null) {
            this.AlterContent = new String(source.AlterContent);
        }
        if (source.OperatorUserId != null) {
            this.OperatorUserId = new Long(source.OperatorUserId);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AlterTime", this.AlterTime);
        this.setParamSimple(map, prefix + "AlterContent", this.AlterContent);
        this.setParamSimple(map, prefix + "OperatorUserId", this.OperatorUserId);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);

    }
}

