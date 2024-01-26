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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAuditStatus extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 审计状态。ON-表示审计已开启，OFF-表示审计关闭。
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * 日志保留时长。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 高频存储时长。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * 低频存储时长。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LowLogExpireDay")
    @Expose
    private Long LowLogExpireDay;

    /**
    * 日志存储量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingAmount")
    @Expose
    private Float BillingAmount;

    /**
    * 高频存储量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighRealStorage")
    @Expose
    private Float HighRealStorage;

    /**
    * 低频存储量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LowRealStorage")
    @Expose
    private Float LowRealStorage;

    /**
    * 是否为全审计。true-表示全审计。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
    * 审计开通时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * 实例相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInfo")
    @Expose
    private AuditInstanceInfo InstanceInfo;

    /**
    * 总存储量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealStorage")
    @Expose
    private Float RealStorage;

    /**
    * 实例所应用的规则模板。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 审计状态。ON-表示审计已开启，OFF-表示审计关闭。 
     * @return AuditStatus 审计状态。ON-表示审计已开启，OFF-表示审计关闭。
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 审计状态。ON-表示审计已开启，OFF-表示审计关闭。
     * @param AuditStatus 审计状态。ON-表示审计已开启，OFF-表示审计关闭。
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 日志保留时长。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogExpireDay 日志保留时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 日志保留时长。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogExpireDay 日志保留时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 高频存储时长。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighLogExpireDay 高频存储时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set 高频存储时长。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighLogExpireDay 高频存储时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get 低频存储时长。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LowLogExpireDay 低频存储时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLowLogExpireDay() {
        return this.LowLogExpireDay;
    }

    /**
     * Set 低频存储时长。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LowLogExpireDay 低频存储时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLowLogExpireDay(Long LowLogExpireDay) {
        this.LowLogExpireDay = LowLogExpireDay;
    }

    /**
     * Get 日志存储量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingAmount 日志存储量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getBillingAmount() {
        return this.BillingAmount;
    }

    /**
     * Set 日志存储量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingAmount 日志存储量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingAmount(Float BillingAmount) {
        this.BillingAmount = BillingAmount;
    }

    /**
     * Get 高频存储量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighRealStorage 高频存储量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getHighRealStorage() {
        return this.HighRealStorage;
    }

    /**
     * Set 高频存储量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighRealStorage 高频存储量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighRealStorage(Float HighRealStorage) {
        this.HighRealStorage = HighRealStorage;
    }

    /**
     * Get 低频存储量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LowRealStorage 低频存储量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLowRealStorage() {
        return this.LowRealStorage;
    }

    /**
     * Set 低频存储量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LowRealStorage 低频存储量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLowRealStorage(Float LowRealStorage) {
        this.LowRealStorage = LowRealStorage;
    }

    /**
     * Get 是否为全审计。true-表示全审计。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditAll 是否为全审计。true-表示全审计。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set 是否为全审计。true-表示全审计。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditAll 是否为全审计。true-表示全审计。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    /**
     * Get 审计开通时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateAt 审计开通时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 审计开通时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateAt 审计开通时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 实例相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInfo 实例相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuditInstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set 实例相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInfo 实例相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInfo(AuditInstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get 总存储量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealStorage 总存储量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRealStorage() {
        return this.RealStorage;
    }

    /**
     * Set 总存储量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealStorage 总存储量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealStorage(Float RealStorage) {
        this.RealStorage = RealStorage;
    }

    /**
     * Get 实例所应用的规则模板。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTemplateIds 实例所应用的规则模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set 实例所应用的规则模板。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTemplateIds 实例所应用的规则模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    public InstanceAuditStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAuditStatus(InstanceAuditStatus source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
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
        if (source.AuditAll != null) {
            this.AuditAll = new Boolean(source.AuditAll);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new AuditInstanceInfo(source.InstanceInfo);
        }
        if (source.RealStorage != null) {
            this.RealStorage = new Float(source.RealStorage);
        }
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);
        this.setParamSimple(map, prefix + "LowLogExpireDay", this.LowLogExpireDay);
        this.setParamSimple(map, prefix + "BillingAmount", this.BillingAmount);
        this.setParamSimple(map, prefix + "HighRealStorage", this.HighRealStorage);
        this.setParamSimple(map, prefix + "LowRealStorage", this.LowRealStorage);
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "RealStorage", this.RealStorage);
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);

    }
}

