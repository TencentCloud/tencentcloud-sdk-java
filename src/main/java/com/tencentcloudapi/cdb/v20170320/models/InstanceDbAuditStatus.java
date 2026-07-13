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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDbAuditStatus extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>审计状态。ON-表示审计已开启，OFF-表示审计关闭</p>
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * <p>任务状态。0-无任务；1-审计开启中，2-审计关闭中。</p>
    */
    @SerializedName("AuditTask")
    @Expose
    private Long AuditTask;

    /**
    * <p>日志保留时长。支持值包括：<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>高频存储时长。支持值包括：<br>3 - 3天；<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p>
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * <p>低频存储时长。单位：天，等于日志保存时长减去高频存储时长。</p>
    */
    @SerializedName("LowLogExpireDay")
    @Expose
    private Long LowLogExpireDay;

    /**
    * <p>日志存储量(单位：GB)。</p>
    */
    @SerializedName("BillingAmount")
    @Expose
    private Float BillingAmount;

    /**
    * <p>高频存储量(单位：GB)。</p>
    */
    @SerializedName("HighRealStorage")
    @Expose
    private Float HighRealStorage;

    /**
    * <p>低频存储量(单位：GB)。</p>
    */
    @SerializedName("LowRealStorage")
    @Expose
    private Float LowRealStorage;

    /**
    * <p>是否为全审计（true-表示全审计）</p>
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
    * <p>审计开通时间。</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>实例相关信息</p>
    */
    @SerializedName("InstanceInfo")
    @Expose
    private AuditInstanceInfo InstanceInfo;

    /**
    * <p>总存储量(单位：GB)。</p>
    */
    @SerializedName("RealStorage")
    @Expose
    private Float RealStorage;

    /**
    * <p>是否包含审计策略</p>
    */
    @SerializedName("OldRule")
    @Expose
    private Boolean OldRule;

    /**
    * <p>实例所应用的规则模板。</p>
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * <p>限免状态</p>
    */
    @SerializedName("TrialStatus")
    @Expose
    private String TrialStatus;

    /**
    * <p>限免开启时间</p>
    */
    @SerializedName("TrialStartTime")
    @Expose
    private Long TrialStartTime;

    /**
    * <p>限免持续时间</p>
    */
    @SerializedName("TrialDuration")
    @Expose
    private Long TrialDuration;

    /**
    * <p>限免关闭时间</p>
    */
    @SerializedName("TrialCloseTime")
    @Expose
    private Long TrialCloseTime;

    /**
    * <p>限免期查询日志时长</p>
    */
    @SerializedName("TrialDescribeLogHours")
    @Expose
    private Long TrialDescribeLogHours;

    /**
    * <p>投递信息</p>
    */
    @SerializedName("DeliverSummary")
    @Expose
    private DeliverSummary [] DeliverSummary;

    /**
    * <p>是否开启了投递，ON：开启，OFF：关闭</p>
    */
    @SerializedName("Deliver")
    @Expose
    private String Deliver;

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>审计状态。ON-表示审计已开启，OFF-表示审计关闭</p> 
     * @return AuditStatus <p>审计状态。ON-表示审计已开启，OFF-表示审计关闭</p>
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set <p>审计状态。ON-表示审计已开启，OFF-表示审计关闭</p>
     * @param AuditStatus <p>审计状态。ON-表示审计已开启，OFF-表示审计关闭</p>
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get <p>任务状态。0-无任务；1-审计开启中，2-审计关闭中。</p> 
     * @return AuditTask <p>任务状态。0-无任务；1-审计开启中，2-审计关闭中。</p>
     */
    public Long getAuditTask() {
        return this.AuditTask;
    }

    /**
     * Set <p>任务状态。0-无任务；1-审计开启中，2-审计关闭中。</p>
     * @param AuditTask <p>任务状态。0-无任务；1-审计开启中，2-审计关闭中。</p>
     */
    public void setAuditTask(Long AuditTask) {
        this.AuditTask = AuditTask;
    }

    /**
     * Get <p>日志保留时长。支持值包括：<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p> 
     * @return LogExpireDay <p>日志保留时长。支持值包括：<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>日志保留时长。支持值包括：<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p>
     * @param LogExpireDay <p>日志保留时长。支持值包括：<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>高频存储时长。支持值包括：<br>3 - 3天；<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p> 
     * @return HighLogExpireDay <p>高频存储时长。支持值包括：<br>3 - 3天；<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p>
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set <p>高频存储时长。支持值包括：<br>3 - 3天；<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p>
     * @param HighLogExpireDay <p>高频存储时长。支持值包括：<br>3 - 3天；<br>7 - 一周；<br>30 - 一个月；<br>90 - 三个月；<br>180 - 六个月；<br>365 - 一年；<br>1095 - 三年；<br>1825 - 五年。</p>
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get <p>低频存储时长。单位：天，等于日志保存时长减去高频存储时长。</p> 
     * @return LowLogExpireDay <p>低频存储时长。单位：天，等于日志保存时长减去高频存储时长。</p>
     */
    public Long getLowLogExpireDay() {
        return this.LowLogExpireDay;
    }

    /**
     * Set <p>低频存储时长。单位：天，等于日志保存时长减去高频存储时长。</p>
     * @param LowLogExpireDay <p>低频存储时长。单位：天，等于日志保存时长减去高频存储时长。</p>
     */
    public void setLowLogExpireDay(Long LowLogExpireDay) {
        this.LowLogExpireDay = LowLogExpireDay;
    }

    /**
     * Get <p>日志存储量(单位：GB)。</p> 
     * @return BillingAmount <p>日志存储量(单位：GB)。</p>
     */
    public Float getBillingAmount() {
        return this.BillingAmount;
    }

    /**
     * Set <p>日志存储量(单位：GB)。</p>
     * @param BillingAmount <p>日志存储量(单位：GB)。</p>
     */
    public void setBillingAmount(Float BillingAmount) {
        this.BillingAmount = BillingAmount;
    }

    /**
     * Get <p>高频存储量(单位：GB)。</p> 
     * @return HighRealStorage <p>高频存储量(单位：GB)。</p>
     */
    public Float getHighRealStorage() {
        return this.HighRealStorage;
    }

    /**
     * Set <p>高频存储量(单位：GB)。</p>
     * @param HighRealStorage <p>高频存储量(单位：GB)。</p>
     */
    public void setHighRealStorage(Float HighRealStorage) {
        this.HighRealStorage = HighRealStorage;
    }

    /**
     * Get <p>低频存储量(单位：GB)。</p> 
     * @return LowRealStorage <p>低频存储量(单位：GB)。</p>
     */
    public Float getLowRealStorage() {
        return this.LowRealStorage;
    }

    /**
     * Set <p>低频存储量(单位：GB)。</p>
     * @param LowRealStorage <p>低频存储量(单位：GB)。</p>
     */
    public void setLowRealStorage(Float LowRealStorage) {
        this.LowRealStorage = LowRealStorage;
    }

    /**
     * Get <p>是否为全审计（true-表示全审计）</p> 
     * @return AuditAll <p>是否为全审计（true-表示全审计）</p>
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set <p>是否为全审计（true-表示全审计）</p>
     * @param AuditAll <p>是否为全审计（true-表示全审计）</p>
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    /**
     * Get <p>审计开通时间。</p> 
     * @return CreateAt <p>审计开通时间。</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>审计开通时间。</p>
     * @param CreateAt <p>审计开通时间。</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>实例相关信息</p> 
     * @return InstanceInfo <p>实例相关信息</p>
     */
    public AuditInstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set <p>实例相关信息</p>
     * @param InstanceInfo <p>实例相关信息</p>
     */
    public void setInstanceInfo(AuditInstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get <p>总存储量(单位：GB)。</p> 
     * @return RealStorage <p>总存储量(单位：GB)。</p>
     */
    public Float getRealStorage() {
        return this.RealStorage;
    }

    /**
     * Set <p>总存储量(单位：GB)。</p>
     * @param RealStorage <p>总存储量(单位：GB)。</p>
     */
    public void setRealStorage(Float RealStorage) {
        this.RealStorage = RealStorage;
    }

    /**
     * Get <p>是否包含审计策略</p> 
     * @return OldRule <p>是否包含审计策略</p>
     */
    public Boolean getOldRule() {
        return this.OldRule;
    }

    /**
     * Set <p>是否包含审计策略</p>
     * @param OldRule <p>是否包含审计策略</p>
     */
    public void setOldRule(Boolean OldRule) {
        this.OldRule = OldRule;
    }

    /**
     * Get <p>实例所应用的规则模板。</p> 
     * @return RuleTemplateIds <p>实例所应用的规则模板。</p>
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set <p>实例所应用的规则模板。</p>
     * @param RuleTemplateIds <p>实例所应用的规则模板。</p>
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get <p>限免状态</p> 
     * @return TrialStatus <p>限免状态</p>
     */
    public String getTrialStatus() {
        return this.TrialStatus;
    }

    /**
     * Set <p>限免状态</p>
     * @param TrialStatus <p>限免状态</p>
     */
    public void setTrialStatus(String TrialStatus) {
        this.TrialStatus = TrialStatus;
    }

    /**
     * Get <p>限免开启时间</p> 
     * @return TrialStartTime <p>限免开启时间</p>
     */
    public Long getTrialStartTime() {
        return this.TrialStartTime;
    }

    /**
     * Set <p>限免开启时间</p>
     * @param TrialStartTime <p>限免开启时间</p>
     */
    public void setTrialStartTime(Long TrialStartTime) {
        this.TrialStartTime = TrialStartTime;
    }

    /**
     * Get <p>限免持续时间</p> 
     * @return TrialDuration <p>限免持续时间</p>
     */
    public Long getTrialDuration() {
        return this.TrialDuration;
    }

    /**
     * Set <p>限免持续时间</p>
     * @param TrialDuration <p>限免持续时间</p>
     */
    public void setTrialDuration(Long TrialDuration) {
        this.TrialDuration = TrialDuration;
    }

    /**
     * Get <p>限免关闭时间</p> 
     * @return TrialCloseTime <p>限免关闭时间</p>
     */
    public Long getTrialCloseTime() {
        return this.TrialCloseTime;
    }

    /**
     * Set <p>限免关闭时间</p>
     * @param TrialCloseTime <p>限免关闭时间</p>
     */
    public void setTrialCloseTime(Long TrialCloseTime) {
        this.TrialCloseTime = TrialCloseTime;
    }

    /**
     * Get <p>限免期查询日志时长</p> 
     * @return TrialDescribeLogHours <p>限免期查询日志时长</p>
     */
    public Long getTrialDescribeLogHours() {
        return this.TrialDescribeLogHours;
    }

    /**
     * Set <p>限免期查询日志时长</p>
     * @param TrialDescribeLogHours <p>限免期查询日志时长</p>
     */
    public void setTrialDescribeLogHours(Long TrialDescribeLogHours) {
        this.TrialDescribeLogHours = TrialDescribeLogHours;
    }

    /**
     * Get <p>投递信息</p> 
     * @return DeliverSummary <p>投递信息</p>
     */
    public DeliverSummary [] getDeliverSummary() {
        return this.DeliverSummary;
    }

    /**
     * Set <p>投递信息</p>
     * @param DeliverSummary <p>投递信息</p>
     */
    public void setDeliverSummary(DeliverSummary [] DeliverSummary) {
        this.DeliverSummary = DeliverSummary;
    }

    /**
     * Get <p>是否开启了投递，ON：开启，OFF：关闭</p> 
     * @return Deliver <p>是否开启了投递，ON：开启，OFF：关闭</p>
     */
    public String getDeliver() {
        return this.Deliver;
    }

    /**
     * Set <p>是否开启了投递，ON：开启，OFF：关闭</p>
     * @param Deliver <p>是否开启了投递，ON：开启，OFF：关闭</p>
     */
    public void setDeliver(String Deliver) {
        this.Deliver = Deliver;
    }

    public InstanceDbAuditStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDbAuditStatus(InstanceDbAuditStatus source) {
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
        if (source.OldRule != null) {
            this.OldRule = new Boolean(source.OldRule);
        }
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
        if (source.TrialStatus != null) {
            this.TrialStatus = new String(source.TrialStatus);
        }
        if (source.TrialStartTime != null) {
            this.TrialStartTime = new Long(source.TrialStartTime);
        }
        if (source.TrialDuration != null) {
            this.TrialDuration = new Long(source.TrialDuration);
        }
        if (source.TrialCloseTime != null) {
            this.TrialCloseTime = new Long(source.TrialCloseTime);
        }
        if (source.TrialDescribeLogHours != null) {
            this.TrialDescribeLogHours = new Long(source.TrialDescribeLogHours);
        }
        if (source.DeliverSummary != null) {
            this.DeliverSummary = new DeliverSummary[source.DeliverSummary.length];
            for (int i = 0; i < source.DeliverSummary.length; i++) {
                this.DeliverSummary[i] = new DeliverSummary(source.DeliverSummary[i]);
            }
        }
        if (source.Deliver != null) {
            this.Deliver = new String(source.Deliver);
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
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "RealStorage", this.RealStorage);
        this.setParamSimple(map, prefix + "OldRule", this.OldRule);
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);
        this.setParamSimple(map, prefix + "TrialStatus", this.TrialStatus);
        this.setParamSimple(map, prefix + "TrialStartTime", this.TrialStartTime);
        this.setParamSimple(map, prefix + "TrialDuration", this.TrialDuration);
        this.setParamSimple(map, prefix + "TrialCloseTime", this.TrialCloseTime);
        this.setParamSimple(map, prefix + "TrialDescribeLogHours", this.TrialDescribeLogHours);
        this.setParamArrayObj(map, prefix + "DeliverSummary.", this.DeliverSummary);
        this.setParamSimple(map, prefix + "Deliver", this.Deliver);

    }
}

