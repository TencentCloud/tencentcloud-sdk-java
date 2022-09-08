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
    * 快照定期备份在一星期哪一天
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
    * 是否激活定期快照功能
    */
    @SerializedName("IsActivated")
    @Expose
    private Long IsActivated;

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
     * Get 快照定期备份在一星期哪一天 
     * @return DayOfWeek 快照定期备份在一星期哪一天
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set 快照定期备份在一星期哪一天
     * @param DayOfWeek 快照定期备份在一星期哪一天
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
     * Get 是否激活定期快照功能 
     * @return IsActivated 是否激活定期快照功能
     */
    public Long getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set 是否激活定期快照功能
     * @param IsActivated 是否激活定期快照功能
     */
    public void setIsActivated(Long IsActivated) {
        this.IsActivated = IsActivated;
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

    }
}

