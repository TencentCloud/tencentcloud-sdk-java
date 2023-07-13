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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstance extends AbstractModel{

    /**
    * 审计状态，已开通审计为：YES，未开通审计为：ON。
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * 审计日志大小，为兼容老版本用。
    */
    @SerializedName("BillingAmount")
    @Expose
    private Long BillingAmount;

    /**
    * 计费确认状态，0-未确认；1-已确认。
    */
    @SerializedName("BillingConfirmed")
    @Expose
    private Long BillingConfirmed;

    /**
    * 低频存储时长。
    */
    @SerializedName("ColdLogExpireDay")
    @Expose
    private Long ColdLogExpireDay;

    /**
    * 低频日志存储量单位MB。
    */
    @SerializedName("ColdLogSize")
    @Expose
    private Long ColdLogSize;

    /**
    * 高频日志存储天数。
    */
    @SerializedName("HotLogExpireDay")
    @Expose
    private Long HotLogExpireDay;

    /**
    * 高频日志存储量，单位MB。
    */
    @SerializedName("HotLogSize")
    @Expose
    private Long HotLogSize;

    /**
    * 实例Id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志保存总天数，为高频存储时长+低频存储时长。
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 实例创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例详细信息。
    */
    @SerializedName("InstanceInfo")
    @Expose
    private AuditInstanceInfo InstanceInfo;

    /**
     * Get 审计状态，已开通审计为：YES，未开通审计为：ON。 
     * @return AuditStatus 审计状态，已开通审计为：YES，未开通审计为：ON。
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 审计状态，已开通审计为：YES，未开通审计为：ON。
     * @param AuditStatus 审计状态，已开通审计为：YES，未开通审计为：ON。
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 审计日志大小，为兼容老版本用。 
     * @return BillingAmount 审计日志大小，为兼容老版本用。
     */
    public Long getBillingAmount() {
        return this.BillingAmount;
    }

    /**
     * Set 审计日志大小，为兼容老版本用。
     * @param BillingAmount 审计日志大小，为兼容老版本用。
     */
    public void setBillingAmount(Long BillingAmount) {
        this.BillingAmount = BillingAmount;
    }

    /**
     * Get 计费确认状态，0-未确认；1-已确认。 
     * @return BillingConfirmed 计费确认状态，0-未确认；1-已确认。
     */
    public Long getBillingConfirmed() {
        return this.BillingConfirmed;
    }

    /**
     * Set 计费确认状态，0-未确认；1-已确认。
     * @param BillingConfirmed 计费确认状态，0-未确认；1-已确认。
     */
    public void setBillingConfirmed(Long BillingConfirmed) {
        this.BillingConfirmed = BillingConfirmed;
    }

    /**
     * Get 低频存储时长。 
     * @return ColdLogExpireDay 低频存储时长。
     */
    public Long getColdLogExpireDay() {
        return this.ColdLogExpireDay;
    }

    /**
     * Set 低频存储时长。
     * @param ColdLogExpireDay 低频存储时长。
     */
    public void setColdLogExpireDay(Long ColdLogExpireDay) {
        this.ColdLogExpireDay = ColdLogExpireDay;
    }

    /**
     * Get 低频日志存储量单位MB。 
     * @return ColdLogSize 低频日志存储量单位MB。
     */
    public Long getColdLogSize() {
        return this.ColdLogSize;
    }

    /**
     * Set 低频日志存储量单位MB。
     * @param ColdLogSize 低频日志存储量单位MB。
     */
    public void setColdLogSize(Long ColdLogSize) {
        this.ColdLogSize = ColdLogSize;
    }

    /**
     * Get 高频日志存储天数。 
     * @return HotLogExpireDay 高频日志存储天数。
     */
    public Long getHotLogExpireDay() {
        return this.HotLogExpireDay;
    }

    /**
     * Set 高频日志存储天数。
     * @param HotLogExpireDay 高频日志存储天数。
     */
    public void setHotLogExpireDay(Long HotLogExpireDay) {
        this.HotLogExpireDay = HotLogExpireDay;
    }

    /**
     * Get 高频日志存储量，单位MB。 
     * @return HotLogSize 高频日志存储量，单位MB。
     */
    public Long getHotLogSize() {
        return this.HotLogSize;
    }

    /**
     * Set 高频日志存储量，单位MB。
     * @param HotLogSize 高频日志存储量，单位MB。
     */
    public void setHotLogSize(Long HotLogSize) {
        this.HotLogSize = HotLogSize;
    }

    /**
     * Get 实例Id。 
     * @return InstanceId 实例Id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id。
     * @param InstanceId 实例Id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志保存总天数，为高频存储时长+低频存储时长。 
     * @return LogExpireDay 日志保存总天数，为高频存储时长+低频存储时长。
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 日志保存总天数，为高频存储时长+低频存储时长。
     * @param LogExpireDay 日志保存总天数，为高频存储时长+低频存储时长。
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 实例创建时间。 
     * @return CreateTime 实例创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间。
     * @param CreateTime 实例创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例详细信息。 
     * @return InstanceInfo 实例详细信息。
     */
    public AuditInstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set 实例详细信息。
     * @param InstanceInfo 实例详细信息。
     */
    public void setInstanceInfo(AuditInstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    public AuditInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstance(AuditInstance source) {
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
        }
        if (source.BillingAmount != null) {
            this.BillingAmount = new Long(source.BillingAmount);
        }
        if (source.BillingConfirmed != null) {
            this.BillingConfirmed = new Long(source.BillingConfirmed);
        }
        if (source.ColdLogExpireDay != null) {
            this.ColdLogExpireDay = new Long(source.ColdLogExpireDay);
        }
        if (source.ColdLogSize != null) {
            this.ColdLogSize = new Long(source.ColdLogSize);
        }
        if (source.HotLogExpireDay != null) {
            this.HotLogExpireDay = new Long(source.HotLogExpireDay);
        }
        if (source.HotLogSize != null) {
            this.HotLogSize = new Long(source.HotLogSize);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new AuditInstanceInfo(source.InstanceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "BillingAmount", this.BillingAmount);
        this.setParamSimple(map, prefix + "BillingConfirmed", this.BillingConfirmed);
        this.setParamSimple(map, prefix + "ColdLogExpireDay", this.ColdLogExpireDay);
        this.setParamSimple(map, prefix + "ColdLogSize", this.ColdLogSize);
        this.setParamSimple(map, prefix + "HotLogExpireDay", this.HotLogExpireDay);
        this.setParamSimple(map, prefix + "HotLogSize", this.HotLogSize);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);

    }
}

