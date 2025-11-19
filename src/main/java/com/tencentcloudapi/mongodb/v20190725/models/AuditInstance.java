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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstance extends AbstractModel {

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 审计状态。
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * 是否存在审计任务，0：无任务，1：创建中，2：关闭中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditTask")
    @Expose
    private Long AuditTask;

    /**
    * 审计日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 高频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * 低频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LowLogExpireDay")
    @Expose
    private Long LowLogExpireDay;

    /**
    * 费用信息。
    */
    @SerializedName("BillingAmount")
    @Expose
    private Float BillingAmount;

    /**
    * 高频存储容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighRealStorage")
    @Expose
    private Float HighRealStorage;

    /**
    * 低频存储容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LowRealStorage")
    @Expose
    private Float LowRealStorage;

    /**
    * 实例详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceInfo InstanceInfo;

    /**
    * 性能分析
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PerformancesAnalyse")
    @Expose
    private Long PerformancesAnalyse;

    /**
    * true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
    * 实例审计最近一次的开通时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * 实例绑定的规则模版ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * 是否开启投递：ON，OFF
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deliver")
    @Expose
    private String Deliver;

    /**
    * 日志投递信息
    */
    @SerializedName("DeliverSummary")
    @Expose
    private DeliverSummary [] DeliverSummary;

    /**
    * 旧规则
    */
    @SerializedName("OldRule")
    @Expose
    private Boolean OldRule;

    /**
    * 实际存储容量
    */
    @SerializedName("RealStorage")
    @Expose
    private Float RealStorage;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 审计状态。 
     * @return AuditStatus 审计状态。
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 审计状态。
     * @param AuditStatus 审计状态。
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 是否存在审计任务，0：无任务，1：创建中，2：关闭中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditTask 是否存在审计任务，0：无任务，1：创建中，2：关闭中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuditTask() {
        return this.AuditTask;
    }

    /**
     * Set 是否存在审计任务，0：无任务，1：创建中，2：关闭中
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditTask 是否存在审计任务，0：无任务，1：创建中，2：关闭中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditTask(Long AuditTask) {
        this.AuditTask = AuditTask;
    }

    /**
     * Get 审计日志过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogExpireDay 审计日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 审计日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogExpireDay 审计日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 高频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighLogExpireDay 高频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set 高频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighLogExpireDay 高频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get 低频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LowLogExpireDay 低频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLowLogExpireDay() {
        return this.LowLogExpireDay;
    }

    /**
     * Set 低频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LowLogExpireDay 低频日志过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLowLogExpireDay(Long LowLogExpireDay) {
        this.LowLogExpireDay = LowLogExpireDay;
    }

    /**
     * Get 费用信息。 
     * @return BillingAmount 费用信息。
     */
    public Float getBillingAmount() {
        return this.BillingAmount;
    }

    /**
     * Set 费用信息。
     * @param BillingAmount 费用信息。
     */
    public void setBillingAmount(Float BillingAmount) {
        this.BillingAmount = BillingAmount;
    }

    /**
     * Get 高频存储容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighRealStorage 高频存储容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getHighRealStorage() {
        return this.HighRealStorage;
    }

    /**
     * Set 高频存储容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighRealStorage 高频存储容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighRealStorage(Float HighRealStorage) {
        this.HighRealStorage = HighRealStorage;
    }

    /**
     * Get 低频存储容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LowRealStorage 低频存储容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLowRealStorage() {
        return this.LowRealStorage;
    }

    /**
     * Set 低频存储容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param LowRealStorage 低频存储容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLowRealStorage(Float LowRealStorage) {
        this.LowRealStorage = LowRealStorage;
    }

    /**
     * Get 实例详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInfo 实例详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set 实例详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInfo 实例详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInfo(InstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get 性能分析
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PerformancesAnalyse 性能分析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPerformancesAnalyse() {
        return this.PerformancesAnalyse;
    }

    /**
     * Set 性能分析
注意：此字段可能返回 null，表示取不到有效值。
     * @param PerformancesAnalyse 性能分析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPerformancesAnalyse(Long PerformancesAnalyse) {
        this.PerformancesAnalyse = PerformancesAnalyse;
    }

    /**
     * Get true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditAll true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditAll true表示全审计，false表示规则审计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    /**
     * Get 实例审计最近一次的开通时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateAt 实例审计最近一次的开通时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 实例审计最近一次的开通时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateAt 实例审计最近一次的开通时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 实例绑定的规则模版ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTemplateIds 实例绑定的规则模版ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set 实例绑定的规则模版ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTemplateIds 实例绑定的规则模版ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get 是否开启投递：ON，OFF
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deliver 是否开启投递：ON，OFF
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliver() {
        return this.Deliver;
    }

    /**
     * Set 是否开启投递：ON，OFF
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deliver 是否开启投递：ON，OFF
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliver(String Deliver) {
        this.Deliver = Deliver;
    }

    /**
     * Get 日志投递信息 
     * @return DeliverSummary 日志投递信息
     */
    public DeliverSummary [] getDeliverSummary() {
        return this.DeliverSummary;
    }

    /**
     * Set 日志投递信息
     * @param DeliverSummary 日志投递信息
     */
    public void setDeliverSummary(DeliverSummary [] DeliverSummary) {
        this.DeliverSummary = DeliverSummary;
    }

    /**
     * Get 旧规则 
     * @return OldRule 旧规则
     */
    public Boolean getOldRule() {
        return this.OldRule;
    }

    /**
     * Set 旧规则
     * @param OldRule 旧规则
     */
    public void setOldRule(Boolean OldRule) {
        this.OldRule = OldRule;
    }

    /**
     * Get 实际存储容量 
     * @return RealStorage 实际存储容量
     */
    public Float getRealStorage() {
        return this.RealStorage;
    }

    /**
     * Set 实际存储容量
     * @param RealStorage 实际存储容量
     */
    public void setRealStorage(Float RealStorage) {
        this.RealStorage = RealStorage;
    }

    public AuditInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstance(AuditInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
        }
        if (source.AuditTask != null) {
            this.AuditTask = new Long(source.AuditTask);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
        if (source.LowLogExpireDay != null) {
            this.LowLogExpireDay = new Long(source.LowLogExpireDay);
        }
        if (source.BillingAmount != null) {
            this.BillingAmount = new Float(source.BillingAmount);
        }
        if (source.HighRealStorage != null) {
            this.HighRealStorage = new Float(source.HighRealStorage);
        }
        if (source.LowRealStorage != null) {
            this.LowRealStorage = new Float(source.LowRealStorage);
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new InstanceInfo(source.InstanceInfo);
        }
        if (source.PerformancesAnalyse != null) {
            this.PerformancesAnalyse = new Long(source.PerformancesAnalyse);
        }
        if (source.AuditAll != null) {
            this.AuditAll = new Boolean(source.AuditAll);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
        if (source.Deliver != null) {
            this.Deliver = new String(source.Deliver);
        }
        if (source.DeliverSummary != null) {
            this.DeliverSummary = new DeliverSummary[source.DeliverSummary.length];
            for (int i = 0; i < source.DeliverSummary.length; i++) {
                this.DeliverSummary[i] = new DeliverSummary(source.DeliverSummary[i]);
            }
        }
        if (source.OldRule != null) {
            this.OldRule = new Boolean(source.OldRule);
        }
        if (source.RealStorage != null) {
            this.RealStorage = new Float(source.RealStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "AuditTask", this.AuditTask);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);
        this.setParamSimple(map, prefix + "LowLogExpireDay", this.LowLogExpireDay);
        this.setParamSimple(map, prefix + "BillingAmount", this.BillingAmount);
        this.setParamSimple(map, prefix + "HighRealStorage", this.HighRealStorage);
        this.setParamSimple(map, prefix + "LowRealStorage", this.LowRealStorage);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "PerformancesAnalyse", this.PerformancesAnalyse);
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);
        this.setParamSimple(map, prefix + "Deliver", this.Deliver);
        this.setParamArrayObj(map, prefix + "DeliverSummary.", this.DeliverSummary);
        this.setParamSimple(map, prefix + "OldRule", this.OldRule);
        this.setParamSimple(map, prefix + "RealStorage", this.RealStorage);

    }
}

