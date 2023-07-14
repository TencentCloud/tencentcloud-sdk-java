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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAutoSnapshotPolicyRequest extends AbstractModel{

    /**
    * 快照策略ID
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * 快照策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 快照定期备份，按照星期一到星期日。 1代表星期一，7代表星期日
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * 快照定期备份在一天的哪一小时
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * 快照保留日期
    */
    @SerializedName("AliveDays")
    @Expose
    private Long AliveDays;

    /**
    * 是否激活定期快照功能；1代表激活，0代表未激活
    */
    @SerializedName("IsActivated")
    @Expose
    private Long IsActivated;

    /**
    * 定期快照在每月的第几天创建快照，该参数与DayOfWeek互斥
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * 间隔天数定期执行快照，该参数与DayOfWeek,DayOfMonth 互斥
    */
    @SerializedName("IntervalDays")
    @Expose
    private Long IntervalDays;

    /**
     * Get 快照策略ID 
     * @return AutoSnapshotPolicyId 快照策略ID
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set 快照策略ID
     * @param AutoSnapshotPolicyId 快照策略ID
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get 快照策略名称 
     * @return PolicyName 快照策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 快照策略名称
     * @param PolicyName 快照策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 快照定期备份，按照星期一到星期日。 1代表星期一，7代表星期日 
     * @return DayOfWeek 快照定期备份，按照星期一到星期日。 1代表星期一，7代表星期日
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set 快照定期备份，按照星期一到星期日。 1代表星期一，7代表星期日
     * @param DayOfWeek 快照定期备份，按照星期一到星期日。 1代表星期一，7代表星期日
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get 快照定期备份在一天的哪一小时 
     * @return Hour 快照定期备份在一天的哪一小时
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set 快照定期备份在一天的哪一小时
     * @param Hour 快照定期备份在一天的哪一小时
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 快照保留日期 
     * @return AliveDays 快照保留日期
     */
    public Long getAliveDays() {
        return this.AliveDays;
    }

    /**
     * Set 快照保留日期
     * @param AliveDays 快照保留日期
     */
    public void setAliveDays(Long AliveDays) {
        this.AliveDays = AliveDays;
    }

    /**
     * Get 是否激活定期快照功能；1代表激活，0代表未激活 
     * @return IsActivated 是否激活定期快照功能；1代表激活，0代表未激活
     */
    public Long getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set 是否激活定期快照功能；1代表激活，0代表未激活
     * @param IsActivated 是否激活定期快照功能；1代表激活，0代表未激活
     */
    public void setIsActivated(Long IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get 定期快照在每月的第几天创建快照，该参数与DayOfWeek互斥 
     * @return DayOfMonth 定期快照在每月的第几天创建快照，该参数与DayOfWeek互斥
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set 定期快照在每月的第几天创建快照，该参数与DayOfWeek互斥
     * @param DayOfMonth 定期快照在每月的第几天创建快照，该参数与DayOfWeek互斥
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get 间隔天数定期执行快照，该参数与DayOfWeek,DayOfMonth 互斥 
     * @return IntervalDays 间隔天数定期执行快照，该参数与DayOfWeek,DayOfMonth 互斥
     */
    public Long getIntervalDays() {
        return this.IntervalDays;
    }

    /**
     * Set 间隔天数定期执行快照，该参数与DayOfWeek,DayOfMonth 互斥
     * @param IntervalDays 间隔天数定期执行快照，该参数与DayOfWeek,DayOfMonth 互斥
     */
    public void setIntervalDays(Long IntervalDays) {
        this.IntervalDays = IntervalDays;
    }

    public UpdateAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAutoSnapshotPolicyRequest(UpdateAutoSnapshotPolicyRequest source) {
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.AliveDays != null) {
            this.AliveDays = new Long(source.AliveDays);
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Long(source.IsActivated);
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new String(source.DayOfMonth);
        }
        if (source.IntervalDays != null) {
            this.IntervalDays = new Long(source.IntervalDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "AliveDays", this.AliveDays);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "IntervalDays", this.IntervalDays);

    }
}

