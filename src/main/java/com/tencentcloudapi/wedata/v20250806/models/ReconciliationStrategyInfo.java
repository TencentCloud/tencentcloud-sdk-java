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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconciliationStrategyInfo extends AbstractModel {

    /**
    * 离线告警规则类型
reconciliationFailure： 离线对账失败告警
reconciliationOvertime： 离线对账任务运行超时告警(需配置超时时间)
reconciliationMismatch： 离线对账不一致条数告警(需配置不一致条数阀值)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 对账不一致条数阀值， RuleType=reconciliationMismatch对账不一致条数类型，需要配置该字段，无默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MismatchCount")
    @Expose
    private Long MismatchCount;

    /**
    * 对账任务运行超时阀值： 小时， 默认为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hour")
    @Expose
    private Long Hour;

    /**
    * 对账任务运行超时阀值： 分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
     * Get 离线告警规则类型
reconciliationFailure： 离线对账失败告警
reconciliationOvertime： 离线对账任务运行超时告警(需配置超时时间)
reconciliationMismatch： 离线对账不一致条数告警(需配置不一致条数阀值)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 离线告警规则类型
reconciliationFailure： 离线对账失败告警
reconciliationOvertime： 离线对账任务运行超时告警(需配置超时时间)
reconciliationMismatch： 离线对账不一致条数告警(需配置不一致条数阀值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 离线告警规则类型
reconciliationFailure： 离线对账失败告警
reconciliationOvertime： 离线对账任务运行超时告警(需配置超时时间)
reconciliationMismatch： 离线对账不一致条数告警(需配置不一致条数阀值)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 离线告警规则类型
reconciliationFailure： 离线对账失败告警
reconciliationOvertime： 离线对账任务运行超时告警(需配置超时时间)
reconciliationMismatch： 离线对账不一致条数告警(需配置不一致条数阀值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 对账不一致条数阀值， RuleType=reconciliationMismatch对账不一致条数类型，需要配置该字段，无默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MismatchCount 对账不一致条数阀值， RuleType=reconciliationMismatch对账不一致条数类型，需要配置该字段，无默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMismatchCount() {
        return this.MismatchCount;
    }

    /**
     * Set 对账不一致条数阀值， RuleType=reconciliationMismatch对账不一致条数类型，需要配置该字段，无默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MismatchCount 对账不一致条数阀值， RuleType=reconciliationMismatch对账不一致条数类型，需要配置该字段，无默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMismatchCount(Long MismatchCount) {
        this.MismatchCount = MismatchCount;
    }

    /**
     * Get 对账任务运行超时阀值： 小时， 默认为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hour 对账任务运行超时阀值： 小时， 默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHour() {
        return this.Hour;
    }

    /**
     * Set 对账任务运行超时阀值： 小时， 默认为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hour 对账任务运行超时阀值： 小时， 默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHour(Long Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 对账任务运行超时阀值： 分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Min 对账任务运行超时阀值： 分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set 对账任务运行超时阀值： 分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Min 对账任务运行超时阀值： 分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    public ReconciliationStrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconciliationStrategyInfo(ReconciliationStrategyInfo source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.MismatchCount != null) {
            this.MismatchCount = new Long(source.MismatchCount);
        }
        if (source.Hour != null) {
            this.Hour = new Long(source.Hour);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "MismatchCount", this.MismatchCount);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "Min", this.Min);

    }
}

